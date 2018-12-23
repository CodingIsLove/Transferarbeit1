public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObject singleton = SingleObject.getInstance();

        //Should print Hello World
        singleton.showMessage();
    }
}
