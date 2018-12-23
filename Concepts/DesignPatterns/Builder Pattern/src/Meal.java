import java.util.ArrayList;

public class Meal {

    private ArrayList<Item> items = new ArrayList<>();

    public Meal(){};

    public void addItem(Item item){items.add(item); }

    public float getCosts(){
        float total = 0;

        for(Item item: items){
            total += item.price();
        }
        return  total;
    }

    public void showItems(){
        System.out.println("----------------------------------");
        System.out.println("        You ordered: ");

        for(Item item: items){
            System.out.print(item.name() + ": ");
            System.out.print(item.price()+"\n");
        }
        System.out.println("----------------------------------");
    }

}
