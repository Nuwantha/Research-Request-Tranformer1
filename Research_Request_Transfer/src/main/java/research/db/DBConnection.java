package research.db;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
/**
 * Created by nuwantha on 8/23/16.
 */

public class DBConnection {

 ;
    private static DBConnection dbConnection;
    private final DB database;

    private DBConnection() throws ClassNotFoundException, UnknownHostException {
        // To connect to mongodb server
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        // Now connect to your databases
        database = mongoClient.getDB( "test" );
    }

    public static DBConnection getDBConnection() throws ClassNotFoundException, UnknownHostException {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    public DB getConnection() throws ClassNotFoundException, UnknownHostException {
        return database;
    }

}
