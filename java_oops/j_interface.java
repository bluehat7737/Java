package java_oops;

interface biCycle{
    void speedUp();
    void applyBrake();
}

interface hornBicycle{
    void hornK3gO();
    void hornmhn();
}

class AvonCycle implements biCycle, hornBicycle{
    @Override
    public void speedUp(){
        System.out.println("Speeding UP...");
    }
    public void applyBrake(){
        System.out.println("Applying Brakes...");
    }
    public void hornK3gO(){
        System.out.println("Kabhi kushi kabhi gam...pe..pe..po..po...");
    }
    public void hornmhn(){
        System.out.println("Mai hoo na...pe..pe..po..po...");
    }
}

public class j_interface {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.speedUp();
        ac.hornK3gO();
        ac.hornmhn();
        ac.applyBrake();

        // biCycle b = new AvonCycle();
    }
}
