/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostgresWS;
import java.util.ArrayList;
import javax.ws.rs.core.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces; 
import com.google.gson.*;
import javax.ws.rs.PathParam;
/**
 *
 * @author supranimbus01
 */
@Path("/PostgresWS")
public class PostgresWSService {
    
    public PostgresWSService()
    {
        
    }
    @GET
    @Path("JSONEmployees")
    //@Produces(MediaType.APPLICATION_JSON)
    @Produces("application/json")
    public String JSONEmployees()
    {
        String emp=null;
        ArrayList<Employee> EmployeeList = new ArrayList<>();
        try
        {
            EmployeeList=new PostgresWSAccess().getCourses();
            Gson gson = new Gson();
            emp=gson.toJson(EmployeeList);
        }
        catch (Exception e)
        {
        } 
        return emp;
    }
    @GET
    @Path("XMLEmployees")
    @Produces(MediaType.APPLICATION_XML)
    public ArrayList<Employee> XMLEmployees()
    {
        ArrayList<Employee> EmployeeList = new ArrayList<>();
        try
        {
            EmployeeList=new PostgresWSAccess().getCourses();
        }
        catch (Exception e)
        {
        } 
        return EmployeeList; 
    }
    
    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        ArrayList<Employee> EmployeeList = new ArrayList<>();
        try
        {
            EmployeeList=new PostgresWSAccess().getCourses();
        }
        catch (Exception e)
        {
        } 
        return String.valueOf(EmployeeList.size());
    }
   
    
    
}
    
