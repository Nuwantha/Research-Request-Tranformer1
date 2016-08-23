package research.db;

import com.mongodb.*;

import java.net.UnknownHostException;

/**
 * Created by nuwantha on 8/23/16.
 */
public class DBHandler {

    public static String setData(DB connection,String collectionName) throws UnknownHostException {

        DBCollection collection = connection.getCollection(collectionName);
        DBObject document1 = new BasicDBObject();
        document1.put("name", "Kiran");
        document1.put("age", 20);
        WriteResult insert = collection.insert(document1);
        return insert.toString();

    }
}
