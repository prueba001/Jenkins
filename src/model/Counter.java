
package model;
import com.mongodb.BasicDBObject;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteResult;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ParallelScanOptions;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Counter {

    public void updateCounter() throws UnknownHostException {
        
        // connect to the remote database server
        MongoClient mongoClient = new MongoClient("ec2-54-69-49-201.us-west-2.compute.amazonaws.com",27017);

        // get database  
        DB db = mongoClient.getDB("test");
        
        //get collection
        DBCollection collection = db.getCollection("register");
        

        //update counter
        BasicDBObject newDocument = 
		new BasicDBObject().append("$inc", 
		new BasicDBObject().append("quantity", 1));
 
		collection.update(new BasicDBObject().append("name", "counter"), newDocument);
       
    }
   
}
