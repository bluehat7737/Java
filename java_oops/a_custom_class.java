package java_oops;

class employee{
    int salary;
    String name;

    void setSalary(int x)
    {
        salary = x;
    }

    void setName(String n){
        name = n;
    }

    int getSalary(){
        return salary;
    }

    String getName(){
        return name;
    }
}

public class a_custom_class {
    public static void main(String[] args) {
        employee emp1 = new employee();

        emp1.setName("Anshul");
        emp1.setSalary(50000);

        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());
    }
}
