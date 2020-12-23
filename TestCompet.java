import java.util.ArrayList;
import java.util.Scanner;

public class TestCompet {
    public static void main(String[] args){
        Compet compet=new Compet();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вид соревнования: ");
        String name = in.nextLine();
        compet.setName(name);
        System.out.print("Введите сумму баллов: ");
        int score = in.nextInt();
        compet.setScore(score);
        System.out.println("Какая-та команда: " + compet.getName() + " " + compet.getScore());
        System.out.println();

        Command myCommand1 = new Command("волейбол", 15, "Ястреб", 8);
        Command myCommand2 = new Command();
        System.out.print("Введите вид соревнования: ");
        name = in.next();
        myCommand2.setName(name);
        System.out.print("Введите сумму баллов: ");
        score = in.nextInt();
        myCommand2.setScore(score);
        System.out.print("Введите название комманды: ");
        String kind = in.next();
        myCommand2.setKind(kind);
        System.out.print("Введите место: ");
        int place = in.nextInt();
        myCommand2.setKol(place);
        System.out.println();
        System.out.println("Первая комманда: " + myCommand1.toString());
        System.out.println("Вторая комманда: " + myCommand2.toString());

        Personal personal = new Personal();
        personal.setInfo();
        System.out.println(personal.toString());
}}

