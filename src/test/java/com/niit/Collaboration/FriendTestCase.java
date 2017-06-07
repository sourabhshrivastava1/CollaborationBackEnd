package com.niit.Collaboration;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Collaboration.DAO.FriendDAO;
import com.niit.Collaboration.model.Friend;

public class FriendTestCase {

	
	@Autowired  static AnnotationConfigApplicationContext context;
	
	@Autowired  static Friend friend;
	
	@Autowired  static FriendDAO  friendDAO;
	
	
	
	@BeforeClass
	public static  void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		friend = (Friend) context.getBean("friend");
		
		friendDAO = (FriendDAO) context.getBean("friendDAO");
		 
	}
	
	//@Test
	
	/*public void validateCredentialsTestCase()
	{
		
	boolean flag =	  friendDAO.isValidCredentials("manish", "manish");
	
	Assert.assertEquals("validateCredentialsTestCase", true , flag);;
	;;;;;;;;
	;;;;;;;;;
		
	}
	*/
	
	@Test
	public void createFriendTestCase()
	{
		friend.setId(5);
		friend.setFriendID("Gaurav");
		friend.setIsOnline("Y");
		friend.setStatus("Y");
		friend.setUserid("Aashi");
		
	       boolean flag =	friendDAO.save(friend);
	       
	       assertEquals("createFriendTestCase ",true, flag);
	}
	
/*	
	@Test
	public void updateFriendTestCase()
	{

		friend.setId(1);
		friend.setFriendID("003");
		friend.setIsOnline("O");
		friend.setStatus("c");
		friend.setUserid(null);
	       boolean flag =	friendDAO.update(friend);
	       
	       assertEquals("createFriendTestCase ",true, flag);
	}
	
	
	@Test
	public void getFriendTestCase()
	{
		friend =  friendDAO.get("002", "sourabh");
		
		assertEquals("getFriendTestCase", null, friend);
		
		
		
	}*/
	
	
	/*@Test
	public void getAllFriendsTestCase()
	{
		List<Friend> friends=  friendDAO.list();
		
		//select count(*) from c_friend_detail
		assertEquals("getAllFriendsTestCase", 1, friends.size());
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
