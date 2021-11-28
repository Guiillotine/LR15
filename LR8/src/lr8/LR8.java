package lr8;
import java.util.*;
public class LR8 {

    public static void main(String[] args) {
        List_cow list_cow = new List_cow();
        Food food = new Food();
        food.Add("Силос"); food.Add("Комбикорм"); food.Add("Солома"); food.Add("Свёкла");
        Building building = new Building(60, 15, 8, 2);
        Garage garage = new Garage(20, 10, 4, 1, 25);
	System.out.printf("%s",building.toString());
        System.out.printf("\n");
        System.out.printf("%s",garage.toString());
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