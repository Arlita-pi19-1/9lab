import java.util.Scanner;

public class Personal extends Compet {
    private String fio;
    private int m;

    public Personal() {
        super();
        fio = "";
        m = 0;
    }

    public Personal(String name, int score, String fio, int m) {
        super(name, score);
        this.fio = fio;
        this.m = m;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setInfo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вид соревнования: ");
        String name = in.next();
        setName(name);
        System.out.print("Введите сумму балла: ");
        int score = in.nextInt();
        setScore(score);
        System.out.print("Введите ФИО: ");
        fio = in.next();
        System.out.print("Введите место: ");
        m = in.nextInt();

    }

    @Override
    public String toString() {
        return
                "Личное соревнование = '" + getName() + '\'' +
                        ", балл = '" + getScore() + '\'' +
                        ", ФИО = '" + fio + '\'' +
                        ", место = " + m;
    }
}
