package lr8;
import java.util.*;
public class Cowshed {
    public Cowshed()
        {
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
        private static int KolVoCowshed = 0;
        private int length = 500;
        private int width = 500;
        private int height = 3;
    
}
