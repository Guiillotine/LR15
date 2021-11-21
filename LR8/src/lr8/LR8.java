package lr8;
import java.util.*;
public class LR8 {

    public static void main(String[] args) {
        List_cow list_cow = new List_cow();
        Food food = new Food();
        food.Add("Силос"); food.Add("Комбикорм"); food.Add("Солома"); food.Add("Свёкла");
        for (int i = 0; i < 2; i++)
        try
        {
            list_cow.add(food);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        list_cow.PrintArrKorovnik();
        System.out.println("\n Информация о корове, находящейся в стоиле во 2 ряду на 3 месте:\n");
        list_cow.GetCow(2,3).print_cow();
    }
}