/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostgresWS;
import java.io.Serializable;
import javax.xml.bind.annotation.*;

/**
 *
 * @author supranimbus01
*/
@XmlRootElement(name="Employee")
public class Employee implements Serializable {
    private int id,age;
    private String name;
    private String address;
     
    public Employee()
    {
        
    }
    public Employee(int id, String name,int age,String address)
    {
        super();
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;   
    }
    public int getId()
    {
        return id;
    }
    @XmlElement
    public void setId(int id)
    {
        this.id=id;
    }
    public String getName()
    {
        return name;   
    }
    @XmlElement
    public void setName(String name)
    {
        this.name=name;
    }
    
    public int getAge()
    {
        return age;
    }
    @XmlElement
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getAddress()
    {
        return address;
    }
    @XmlElement
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String toString()
    {
        return "Employee: [ id:"+id+",name:"+name+",Age:"+age+",address:"+address+"]";
    }
    
}
