public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuiler builder = new MealBuiler();
        Meal vegMeal = builder.prepareVegMeal();
        Meal nonVegMeal = builder.prepareNonVegMeal();

        //Handle the Vegi Meal
        vegMeal.showItems();
        System.out.println("The cost of the Vegi meal is: " + vegMeal.getCosts());

        System.out.println("############################################");
        System.out.println("");

        // Handle the non Vegi Meal
        nonVegMeal.showItems();
        System.out.println("The cost of the non Vegi meal is: " + nonVegMeal.getCosts());
    }


}
