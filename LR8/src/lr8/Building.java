package lr8;

public class Building {
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
	void Set(int length, int width, int height, int kolVoFloor)
	{
		this.length = length;
		this.width = width;
		this.height = height;
		this.kolVoFloor = kolVoFloor;
	}
	/*virtual void Print()
	{
		cout << "\n Длина здания: " << length << "\n Ширина здания: " << width << "\n Высота здания: " << height;
	}*/
	void Print()
	{
		System.out.println("\n Длина здания: " + length + "\n Ширина здания: " + width + "\n Высота здания: " + height + "\n Количество этажей: " + kolVoFloor);
	}
	int GetFloorS()
	{
		return length * width;
	}
protected int length;
protected int width;
protected int height;
protected int kolVoFloor;
}
