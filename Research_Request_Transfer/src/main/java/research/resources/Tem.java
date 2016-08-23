package research.resources;

import com.mongodb.DB;
import research.db.DBConnection;
import research.db.DBHandler;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.net.UnknownHostException;

/**
 * Created by nuwantha on 8/23/16.
 */
@Path("/tem")
@Produces(MediaType.TEXT_PLAIN)
public class Tem {
    @GET
    public String getProfiles(){
        try {

            DB connection = DBConnection.getDBConnection().getConnection();
           return DBHandler.setData(connection,"formatting_specification");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "yes";
    }

}
