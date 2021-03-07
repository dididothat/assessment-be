package com.ista.isp.assessment.todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.isp.assessment.todo.item.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
	//Item findbyId(long id);
	Item getOne(long id);

}
