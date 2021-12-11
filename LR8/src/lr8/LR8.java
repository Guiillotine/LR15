package lr8;
import java.util.*;
public class LR8 {
    
    
    public static int findUsingIterator(int it, ArrayList BuildingList) 
    {
        Iterator ib = BuildingList.iterator();
        for (; it < BuildingList.size(); it++) 
        { 
          Building tmp = (Building)BuildingList.get(it);  
          if (tmp.Getheight() >= 3 && tmp.Getheight() <= 6) return it;
        } 
        return -1;
    } 

    public static void main(String[] args) {       
    
      ArrayList BuildingList=new ArrayList();    
      Iterator ib = BuildingList.iterator();    
      Garage garage1 = new Garage(15, 15, 2, 1, 10), garage2 = new Garage(20, 25, 3, 1, 20), garage3 = new Garage(20, 15, 3, 1, 15);
      Building building1 = new Building(50, 50, 6, 2), building2 = new Building(30, 45, 9, 3);
      BuildingList.add(garage1); BuildingList.add(building1);
      BuildingList.add(garage2); BuildingList.add(building2); BuildingList.add(garage3);
      System.out.printf("\n ПОИСК ЗДАНИЙ ПО С ВЫСОТОЙ ОТ 3 ДО 6 М.\n\n ПОЛНЫЙ СПИСОК ЗДАНИЙ:\n");
      for (int i = 0; i < BuildingList.size(); i++) 
      { 
        Building tmp = new Building();  
        tmp = (Building)BuildingList.get(i);
        tmp.Print();
        System.out.printf("\n"); 
      }
       System.out.printf("\n ПО ЗАПРОСУ НАЙДЕНО:\n");    
      for(int i = 0; i < BuildingList.size(); i++) 
      {
          int a;
          a = findUsingIterator(i,BuildingList);
          if (a != -1)
          {
          Building tmp = (Building)BuildingList.get(a);
          tmp.Print();
          i = a;
          }      
      }
      
      /*Collections.sort(BuildingList); 
      System.out.printf("\n СПИСОК ЗДАНИЙ ПОСЛЕ СОРТИРОВКИ:\n");
      for (int i = 0; i < BuildingList.size(); i++) 
      { 
        Building tmp = (Building)BuildingList.get(i);  
        tmp.Print();
        System.out.printf("\n"); 
      }*/
      
              
    System.out.printf("\n");
    /*Food food = new Food();
    food.Add("Силос"); food.Add("Комбикорм"); food.Add("Солома"); food.Add("Свёкла");*/
    }
}