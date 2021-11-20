package lr8;
import java.util.*;
public class LR8 {

    public static void main(String[] args) {
        List_cow list_cow = new List_cow();
        Food food = new Food();
        food.Add("Силос"); food.Add("Комбикорм"); food.Add("Солома"); food.Add("Свёкла");
        try
        {
            list_cow.add(food);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}