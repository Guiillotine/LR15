package lr8;
class Director extends Worker implements IWorker {
    public Director()
	{
	}
    public Director(String name, String surname, int age, char sex, int oklad, int pooscher)
	{
                super(name, surname, age, sex, oklad); 
                this.pooscher = pooscher;
	}
    public void Print()
	{
		System.out.printf("\n Имя: " + name + "\n Фамилия: " + surname + "\n Возраст: " + age + "\n Пол: " + sex + "\n Оклад: " + oklad + "\n Районный коэффициент: " + rayKoef + " \n Премия: " + prem + "\n Поощерительные по результатам работы: " + pooscher);
	}
    public int ZarPlat()
    {
    return(oklad + oklad * rayKoef / 100 + oklad * prem / 100 + oklad * pooscher / 100);
    }

    private int rayKoef = 15;
    private int prem = 20; 
    private int pooscher;  
}
