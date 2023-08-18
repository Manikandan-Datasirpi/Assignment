import java.util.*;
import java.util.Collections;
class  Employee implements Comparable<Employee> {
    int id;
    String Name;

    public Employee(int id, String Name) {
        this.id = id;
        this.Name = Name;
    }

    public int compareTo(Employee emp) {
        return Integer.compare(this.id, emp.id);
    }

    public String toString() {
        return "Employee-id: "+id+" Employee-Name: "+Name;
    }
}
class Employee2  implements Comparator<Employee> 
{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Integer.compare(emp1.id, emp2.id);
    }
}
public class Comp {
    public static void main(String[] args) {

    List<Employee> emp= new ArrayList<>(); 
    emp.add(new Employee(1001,"Manikandan"));
    emp.add(new Employee(1002,"Muthu"));
    Collections.sort(emp);
    for(Employee emly:emp)
    {
        System.out.println(emly);
    }

    Collections.sort(emp, new Employee2());
    for(Employee emly:emp)
    {
        System.out.println(emly);
    }
    }
}
