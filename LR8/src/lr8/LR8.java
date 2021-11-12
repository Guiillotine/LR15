package lr8;
import java.util.*;
public class LR8 {

    public static void main(String[] args) {
        
   Scanner inp = new Scanner(System.in);    
   int a[] = new int[10]; 
    for (int i = 0; i < 10; i++) 
    {
         System.out.println(" Место № " + (i + 1) + "\n Введите 1, чтобы обозначить, что место занято коровой\n 0 - если место свободно : "); 
         a[i] = inp.nextInt();
    }
    Cowshed cowshed = new Cowshed(a);
    cowshed.PrintZanyatMest();     
    }
}