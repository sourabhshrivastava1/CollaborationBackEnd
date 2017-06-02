package com.niit.Collaboration.DAO;

import java.util.List;

import antlr.debug.Event;



public interface EventDAO {

	public Event getEventById(String id);
	
	public Event getEventByName(String name);
	
	public boolean saveOrupdate(Event event);
	
	public boolean deleteById(String id);
	
	/*public boolean deletebyEvent(Event event);
	
	public boolean deleteByName(String name);*/
	
	public List<Event> list();
	
	
}