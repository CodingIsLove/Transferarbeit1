public class SingleObject {

    // must be static to be accesses from outside
    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    // must be static. This is the only possibility to get the instance
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World");
    }
}
