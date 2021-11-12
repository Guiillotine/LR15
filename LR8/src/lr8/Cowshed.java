package lr8;
import java.util.*;
public class Cowshed {
    public Cowshed()
        {
            KolVoCowshed++;
        }
    public Cowshed(int zanyatMest[])
	{
	System.out.println("\n *Запуск конструктора c одним параметром класса Cowshed*\n");
	for (int i = 0; i < 10; i++) if ((zanyatMest[i] == 0)||(zanyatMest[i] == 1)) this.zanyatMest[i] = zanyatMest[i];
        else if (zanyatMest[i] < 0) this.zanyatMest[i] = 0;
        else if (zanyatMest[i] > 0) this.zanyatMest[i] = 1;
	length = 500;
	width = 500;
	height = 3;
	KolVoCowshed++;
	}
        public void Set(int length, int width, int height)
        {
            this.length = length;
            this.width = width;
            this.height = height;
        }

        public void Print()
        {
            System.out.println("\n Длина коровника: " + length + "\n Ширина коровника: " + width + "\n Высота коровника: " + height);
        }

        public static int GetKolVo()
        {
            return KolVoCowshed;
        }
        public void PrintZanyatMest()
	{
		System.out.println("\n 1 - место занято коровой\n 0 - место свободно\n Наполненность коровника следующая:\n");
		for (int i = 0; i < 10; i++)  System.out.print(" " + zanyatMest[i]); System.out.println("\n ");
	}
        private static int KolVoCowshed;
        private int length;
        private int width;
        private int height;
        private int[] zanyatMest = new int[10];
    
}
