package java_oops;

class employee2{
    private int id;
    private String name;

    public employee2(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public int getId()
    {
        return this.id;
    }
}

public class c_constructors {
    public static void main(String[] args) {
        employee2 obj = new employee2(49, "Anshul");
        System.out.println(obj.getName());
        System.out.println(obj.getId());
    }
}
