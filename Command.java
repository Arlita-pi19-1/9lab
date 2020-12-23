public class Command extends Compet {
    private String kind;
    private int place;

    public Command() {
        super();
        kind = "";
        place = 8;
    }

    public Command(String name, int score, String kind, int place) {
        super(name, score);
        this.kind=kind;
        this.place=place;

    }
    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind=kind;
    }
    public int getPlace() {
        return place;
    }
    public void setKol(int kol) {
        this.place=place;
    }
    @Override
    public String toString() {
        return
                "Коммандные соревнования = '" + getName() + '\'' +
                        ", балл = '" + getScore() + '\'' +
                        ", название комманды = '" + kind + '\'' +
                        ", место = " + place;

    }
}
