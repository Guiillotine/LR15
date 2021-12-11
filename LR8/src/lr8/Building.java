package lr8;

public class Building implements Comparable<Building> {
	public Building()
	{
		length = 50;
		width = 50;
		height = 6;
		kolVoFloor = 2;
	}
	public Building(int length, int width, int height, int kolVoFloor)
	{
		this.length = length;
		this.width = width;
		this.height = height;
		this.kolVoFloor = kolVoFloor;
	}
        
        public String toString() 
        {
                return "Длина: "+length+"  Ширина: "+width+"  Высота: "+height+"  Кол. Эт.: "+kolVoFloor;
        }

	public void Set(int length, int width, int height, int kolVoFloor)
	{
		this.length = length;
		this.width = width;
		this.height = height;
		this.kolVoFloor = kolVoFloor;
	}
	public void Print()
	{
		System.out.println("\n Длина здания: " + length + "\n Ширина здания: " + width + "\n Высота здания: " + height + "\n Количество этажей: " + kolVoFloor);
	}
	public int GetFloorS()
	{
		return length * width;
	}
        public int compareTo(Building b) // перегрузка метода сравнения
        {
                if (GetFloorS() < b.GetFloorS()) return -1;
                else return 1;
        }

protected int length;
protected int width;
protected int height;
protected int kolVoFloor;
}
