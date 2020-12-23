public class Compet {
    private String name;
    private int score;

    public Compet() {
        name = "";
        score = 0;
    }
    public Compet(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName(){
        return name;
    }
    public void setName(String namer){
        name=namer;
    }

    public int getScore(){
        return score;
    }
    public void setScore(int point){
        score=point;
    }


}
