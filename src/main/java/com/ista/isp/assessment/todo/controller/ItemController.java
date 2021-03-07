package com.ista.isp.assessment.todo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMethod;

import com.ista.isp.assessment.todo.item.Item;
import com.ista.isp.assessment.todo.repo.ItemRepository;

@CrossOrigin("*")
@RestController
@RequestMapping
public class ItemController {

	private final ItemRepository repo;
	
	public ItemController(ItemRepository repo)
	{
		this.repo = repo;
	}
	@GetMapping
	public List<Item> all(){
		return repo.findAll();
	}
	@PostMapping("")	
	public Item newItem(@RequestBody Item newItem) {
		if(newItem.getID() != null) {
	      repo.deleteById(newItem.getID());
	      return newItem;
	    }else {
	      return repo.save(newItem);
	    }
	}
	
	@Modifying
	public Item updateItem(@RequestBody Item newItem) { // Not working
		boolean newStatus = newItem.isDone();
		Item myItem =  repo.getOne(newItem.getID());
		myItem.setDone(newStatus);
		return repo.save(myItem);
	}
}
