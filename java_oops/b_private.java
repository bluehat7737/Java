package java_oops;

class employee1{
    private String name;
    private float salary;

    public void setName(String n)
    {
        this.name = n;
    }

    public void setSalary(float sal)
    {
        this.salary = sal;
    }

    public String getName()
    {
        return this.name;
    }

    public float getSalary()
    {
        return this.salary;
    }
}

public class b_private {
    public static void main(String[] args) {
        employee1 obj = new employee1();
        obj.setName("Anshul");
        obj.setSalary(2.5f);

        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
    }
}
