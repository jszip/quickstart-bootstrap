package localhost.quickstart;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/greeter")
public class Greeter {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> greet(List<String> people) {
        List<String> response = new ArrayList<String>(people.size());
        for (String person : people) {
            response.add("Hello " + person);
        }
        return response;
    }
}
