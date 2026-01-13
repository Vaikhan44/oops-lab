class Employee{
    private String name;
    private String lastname;
    private double salary=0;
    Employee(){
        super();
    }
    void setname(String name){
        this.name = name;
    }
    void setlastname(String lastname){
        this.lastname = lastname;
    }
    void setsalary(double salary){
        this.salary = salary;
    }

    String getname(){
        return name;
    }
    String getlastname(){
        return lastname;
    }
    double getsalary(){
        return salary;
    }
}

public class EmployeeTest {
    public static void main(String []args){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.setname("lewis");
        e1.setlastname("hamilton");
        e1.setsalary(300000);

        e2.setname("oscar");
        e2.setlastname("piastri");
        e2.setsalary(100000);

        System.out.println("e1 objext yearly salary is "+ e1.getsalary()*12);
        System.out.println("e2 objext yearly salary is "+ e2.getsalary()*12);

        e1.setsalary(300000 * 0.1 + 300000);
         e1.setsalary(200000 * 0.1 + 200000);

         System.out.println(" NEW e1 objext yearly salary is "+ e1.getsalary()*12);
        System.out.println(" NEw e2 objext yearly salary is "+ e2.getsalary()*12);

    }
    
}
