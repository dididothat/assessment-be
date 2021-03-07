package com.ista.isp.assessment.todo.item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class Item {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String itemName;
	private boolean isDone;
	
	
	public Item() {
		super();
	}
	
	public Item(String itemName) {
		this.itemName = itemName;
		this.isDone = false;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getID() {
		return id;
	}
	
	
	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		
		return "Item Info: Task " + this.itemName + " with ID " + this.getID() + " is " + (!this.isDone() ? "not done" : "done");
	}
	
	
	
	
}
