package java_oops;

interface camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning...");
    }
    default void Record4Kvideo(){
        greet();
        System.out.println("Recording in 4K...");
    }
}

interface wifi{
    void showNetworks();
    void connectNetwork();
}

abstract class cellPhone{
    abstract void call(int n);
    abstract void pickCall();
}

class smartPhone extends cellPhone implements camera, wifi{
    public void call(int n){
        System.out.println("Calling : " + n);
    }
    public void pickCall(){
        System.out.println("Call Picked");
    }

    public void takeSnap(){
        System.out.println("Captured...");
    }

    public void recordVideo(){
        System.out.println("Video is Recorded.");
    }

    public void showNetworks(){
        String [] networks = {"iPhone", "Android", "BlackBerry"};
        for( String network: networks){
            System.out.print(network + " ");
        }
        System.out.println();
    }

    public void connectNetwork(){
        System.out.println("Connected to a Network.");
    }
}

class mian{
    public static void main(String[] args) {
        smartPhone sp = new smartPhone();
        sp.showNetworks();
        sp.connectNetwork();
        sp.takeSnap();
        sp.recordVideo();
        sp.Record4Kvideo();
        sp.pickCall();
        sp.call(7737);
    }
}