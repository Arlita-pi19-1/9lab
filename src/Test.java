import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Auto myAuto1 = new Auto(); //создаем объект типа нашего класса
        Scanner in = new Scanner(System.in); //создаем сканер для ввода данных из консоли
        System.out.print("Введите фирму: ");
        String nazv = in.next();
        myAuto1.setFirm(nazv); //задаем значение для параметра нашего класса
        System.out.print("Введите максимальную скорость: ");
        int s = in.nextInt();
        myAuto1.setMaxSpeed(s);
        System.out.println("Введите гос. номер: ");
        int g = in.nextInt();
        myAuto1.setGosNomer(g);
        System.out.println("Какой-то автомобиль: "+myAuto1.getFirm()+" "+myAuto1.getMaxSpeed()+" "+myAuto1.getGosNomer());
        System.out.println();
        Car myCar1=new Car("Ford", 200, 025,"Mustang",2,false);
        Car myCar2=new Car();
        System.out.print("Введите фирму-производитель легкового авто: ");
        nazv=in.next();
        myCar2.setFirm(nazv);
        System.out.print("Введите максимальную скорость легкового авто: ");
        s=in.nextInt();
        myCar2.setMaxSpeed(s);
        System.out.println("Введите гос. номер легкого авто: ");
        g=in.nextInt();
        myCar2.setGosNomer(g);
        System.out.print("Введите модель легкового авто: ");
        nazv=in.next();
        myCar2.setModel(nazv);
        System.out.print("Введите кол-во дверей легкового авто: ");
        s=in.nextInt();
        myCar2.setNumDoors(s);
        System.out.print("Введите признак полного привода легкового авто (true/false): ");
        Boolean f=in.nextBoolean();
        System.out.println();
        System.out.println("Первый легковой автомобиль: "+myCar1.toString());
        System.out.println("Второй легковой автомобиль: "+myCar2.toString());
        Truck myTruck=new Truck();
        myTruck.setAllInfo();
        System.out.println(myTruck.toString());

    }
}
