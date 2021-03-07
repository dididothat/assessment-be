package com.ista.isp.assessment.todo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ista.isp.assessment.todo.item.Item;
import com.ista.isp.assessment.todo.repo.ItemRepository;

@Configuration
public class DataTest implements CommandLineRunner{

	@Override
	public void run(String... args)throws Exception{
		ItemRepo.save(new Item("Dev"));
		ItemRepo.save(new Item("Be happy"));
		for(Item i: this.ItemRepo.findAll())
		{
			System.out.println(i.toString());
		}
	}
	
	@Autowired ItemRepository ItemRepo;
	   
    
  
}