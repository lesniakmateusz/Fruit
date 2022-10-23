import java.text.Format;

public class Main {
    public static void main(String[] args) {



        Fruit strawberry = new Strawberry();
        Fruit pinapple = new Pinapple();
        Fruit apple = new Apple();


        Fruit [] fruits = {strawberry,pinapple,apple};

        for (Fruit fruit : fruits){
            System.out.println(fruit.getName());
        }
    }
}