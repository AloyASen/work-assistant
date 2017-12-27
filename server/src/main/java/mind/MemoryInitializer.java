/*
this is the file file which lets all the visitors with requirement to 
gather the required information for the analysis from the remote end 

rem:: this is only a connector project 
*/

import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  

class MemoryInitializer  {
	
	public MemoryInitializer (){
		//this is the constructor
		// Creating a Mongo client 
      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
   
      // Creating Credentials 
      MongoCredential credential; 
      credential = MongoCredential.createCredential("sampleUser", "myDb", 
         "password".toCharArray()); 
      System.out.println("Connected to the database successfully");  
      
      // Accessing the database 
      MongoDatabase database = mongo.getDatabase("hockey"); 
      System.out.println("Credentials ::"+ credential);   
	}
}
