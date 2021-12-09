
package lr8;

class Worker implements IWorker  {
public Worker()
	{
	}
public Worker(String name, String surname, int age, char sex, int oklad)
	{
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.sex = sex;
		this.oklad = oklad;
	}
public void Print()
	{
		System.out.printf("\n Имя: " + name + "\n Фамилия: " + surname + "\n Возраст: " + age + "\n Пол: " + sex + "\n Оклад: " + oklad);
	}
public int ZarPlat()
{
    return oklad;
}
protected String name;
protected String surname;
protected int age;
protected char sex;
protected int oklad; 
}
