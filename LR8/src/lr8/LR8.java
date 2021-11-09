package lr8;

public class LR8 {

    public static void main(String[] args) {
        Food food1 = new Food(); List_cow list_cow1 = new List_cow();
        List_cow list_cow2 = new List_cow();//Для стада коров
        Cowshed cowshed1 = new Cowshed();
        System.out.println("\n Количество коровников на ферме: " + Cowshed.GetKolVo());
        Cowshed cowshed2 = new Cowshed(); Cowshed cowshed3 = new Cowshed();
        System.out.println("\n *Добавлено два коровника*");
        System.out.println("\n Количество коровников на ферме: " + Cowshed.GetKolVo());
        
        
        
        food1.set("Свёкла"); food1.set("Kомбикорм"); food1.set("Силос");
        food1.set();   
        for (int i = 0; i < 2; i++) list_cow1.add(food1);
		list_cow1.get_print_list();
        
    }
}