/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostgresWS;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
/**
 *
 * @author supranimbus01
 */
public class PostgresWSAccess {
    
    Connection connection = null;
    
public ArrayList<Employee> getCourses() throws Exception
{
    ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
    try
    {
        Class.forName("org.postgresql.Driver").newInstance();
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/nimbus","postgres", "supranimbus");
        PreparedStatement stmt = connection.prepareStatement("SELECT * FROM employee");
        ResultSet rs = stmt.executeQuery();
        while(rs.next())
        {
            Employee emp=new Employee();
            emp.setId(rs.getInt("id"));
            emp.setName(rs.getString("name"));
            emp.setAge(rs.getInt("age"));
            emp.setAddress(rs.getString("address"));
            EmployeeList.add(emp);
        }
    }
    catch (Exception e)
    {
        throw e;
    }

    return EmployeeList;
}
    
}
