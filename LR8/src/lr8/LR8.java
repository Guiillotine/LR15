package lr8;
import java.util.*;
public class LR8 {

    public static void main(String[] args) {
        Food food = new Food();
        food.Add("Силос"); food.Add("Комбикорм"); food.Add("Солома"); food.Add("Свёкла");
        Garage a = new Garage(20,10,4,1,25);
        Garage b = new Garage(15,15,4,1,20);
        System.out.printf("\n");
        System.out.printf("\n ГАРАЖ 1:"); a.Print();
        System.out.printf("\n ГАРАЖ 2:"); b.Print();
        b=(Garage)a.clone();       
        b.Set(19, 9, 4, 1,25);
        System.out.printf("\n");
        System.out.printf("\n ГАРАЖ 1:");a.Print();
        System.out.printf("\n ГАРАЖ 2:");b.Print();       
        
        System.out.printf("\n");

        
        /*for (int i = 0; i < 2; i++)
        try
        {
            list_cow.add(food);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }*/

    }
}