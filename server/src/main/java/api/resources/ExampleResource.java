package api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;
import java.util.ArrayList;

import api.Person;

@Path("people")
public class ExampleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPeople() {

      List<Person> people = new ArrayList<Person>();

      Person homerPerson = new Person("9123456", "Homer", 41);
      Person bartPerson = new Person("36974455", "Bart", 8);
      Person lisaPerson = new Person("23667924", "Lisa", 7);

      people.add(homerPerson);
      people.add(bartPerson);
      people.add(lisaPerson);

      return people;
    }
}
