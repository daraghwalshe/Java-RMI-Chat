# Java-RMI-Chat
A Chat application using java remote method invocation

### A third year college project :mortar_board: :three:  

This is a project to build a client-server chat application using java RMI technology
The directories included in this repo:  
* Java-RMI-Chat: The eclipse project directory  
	- Client: All relevant code for the client chat GUI.  
	- Server: The code for the central server.  
* Design: UML diagrams and wireframe sketch design 

### Features:  
- The appplication follows a hub and spoke topology, with the server as the hub.
- Clients logon to the system with a username
- Clients can send a normal chat message(broadcast to all clients)
- Clients can send a private message to one or more clients  
- Server maintains a user list, which is displayed in client GUI
- Online user list is updated on all clients when users join or leave the chat room  

### Instructions
- Start the server first (main method: ChatServer.java)
- Start a client (main method: ClientRMIGUI.java)
- Enter a unique username to join the chat


<hr />
<img src="https://github.com/daraghwalshe/Java-RMI-Chat/blob/master/Images/chat-1.PNG" width="400">
<HR />
<img src="https://github.com/daraghwalshe/Java-RMI-Chat/blob/master/Images/chat-2.PNG" width="400">
<hr />
<img src="https://github.com/daraghwalshe/Java-RMI-Chat/blob/master/Images/chat-3.PNG" width="400">
<HR />
<img src="https://github.com/daraghwalshe/Java-RMI-Chat/blob/master/Images/chat-4.PNG" width="400">
