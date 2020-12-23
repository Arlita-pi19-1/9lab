public class Auto {
    private String firm; //создаем закрытый член нашего класса с названием фирмы автомобиля
    private int maxSpeed; // закрытый член класса, содержащий максимальную скорость
    private int gosNomer;
    public void setFirm(String firma){ //открытая функция (метод класса) для задания
        firm=firma; //значения фирмы автомобиля
    }
    public void setMaxSpeed(int speed){ //открытая функция (метод класса) для задания
        maxSpeed=speed; //значения максимальной скорости автомобиля
    }
    public void setGosNomer(int nomer){
        gosNomer=nomer;
    }
    public int getGosNomer(){
        return gosNomer;
    }
    public int getMaxSpeed(){ //открытая функция (метод класса) для вывода значения
        return maxSpeed; //максимальной скорости
    }
    public String getFirm(){ //открытая функция (метод класса) для вывода значения
        return firm; //заданной фирмы
    }
    public Auto(){ // конструктор класса (без параметров)
        firm="Без названия";
        maxSpeed=0;
        gosNomer=0;
    }
    public Auto(String firma, int speed, int nomer){ //конструктор класса (с параметрами)
        firm=firma;
        maxSpeed=speed;
        gosNomer=nomer;
    }

}
