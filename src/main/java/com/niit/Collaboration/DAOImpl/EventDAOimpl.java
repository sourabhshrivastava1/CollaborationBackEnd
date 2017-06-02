package com.niit.Collaboration.DAOImpl;

import java.util.List;

import javax.management.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.niit.Collaboration.DAO.EventDAO;

import antlr.debug.Event;

@Repository("eventDAO")
@Transactional
public class EventDAOimpl implements EventDAO {

	private static Logger log = LoggerFactory.getLogger("EventDAOImpl");

	
	private SessionFactory sessionFactory;

	public EventDAOimpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean saveOrupdate(Event event) {
		log.debug("Starting of the Save Method");

		try {
			sessionFactory.getCurrentSession().saveOrUpdate(event);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			log.debug("Starting of the Save Method");
			return false;
		}

	}

	public boolean deleteById(String id) {

		try {
			sessionFactory.getCurrentSession().delete(getEventById(id));
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}

	}
	
	/*public boolean deleteByName(String name) {
		try {
			sessionFactory.getCurrentSession().delete(getChatByName(name));
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
	}*/

	/*public boolean deletebyChat(Chat chat) {
		try {
			sessionFactory.getCurrentSession().delete(chat);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
	}*/

	public List<Event> list() {
		
		return sessionFactory.getCurrentSession().createQuery("from Event").list();
		
		
		
	}

	public Event getEventById(String id) {
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery("from Event where id=?");

		return (Event) ((org.hibernate.Query) query).setString(0, id).uniqueResult();
	}

	public Event getEventByName(String name) {
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery("from Event where name=?");

		return (Event) ((org.hibernate.Query) query).setString(0, name).uniqueResult();

	}

	
	

	

}