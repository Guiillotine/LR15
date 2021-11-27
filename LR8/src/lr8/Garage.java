package lr8;

public class Garage extends Building{
    	public Garage()
	{
		kolVoCars = 15;
	}
	public Garage(int length, int width, int height, int kolVoFloor, int kolVoCars)
	{
                super(length, width, height, kolVoFloor); 
                System.out.println("\n *Вызов конструктора производного класса с парамерами*");
		this.kolVoCars = kolVoCars;
	}
	public void Set(int length, int width, int height, int kolVoFloor, int kolVoCars)
	{
		super.Set(length, width, height, kolVoFloor);
		this.kolVoCars = kolVoCars;
	}
	public void Print()
	{
		System.out.println("\n Длина гаража: " + length + "\n Ширина гаража: " + width + "\n Высота гаража: " + height + "\n Количество этажей: " + kolVoFloor + "\n Количество машиномест: " + kolVoCars);
	}
private int kolVoCars;
}
