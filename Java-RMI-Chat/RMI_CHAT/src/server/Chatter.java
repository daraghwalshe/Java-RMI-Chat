package server;

import client.ChatClient3IF;


/**
 * A class used by the server program to keep
 * details of connected clients ordered
 * @author Daragh Walshe 	B00064428
 * RMI Assignment 2		 	April 2015
 *
 */
public class Chatter {

	public String name;
	public ChatClient3IF client;
	
	//constructor
	public Chatter(String name, ChatClient3IF client){
		this.name = name;
		this.client = client;
	}

	
	//getters and setters
	public String getName(){
		return name;
	}
	public ChatClient3IF getClient(){
		return client;
	}
	
	
}
