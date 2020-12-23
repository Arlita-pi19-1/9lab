import java.util.ArrayList;

public class Champion {
    private ArrayList<Compet> compets = new ArrayList<>();

    public Champion() {
    }

    public Champion(ArrayList<Compet> compets) {
        this.compets = compets;
    }

    public void addCompet(Compet compet) {
        compets.add(compet);
}
    public Boolean findCompet(Compet compet) {
        return compets.contains(compet);
    }

    public void removeCompet(Compet compet) {
        compets.remove(compet);
    }
    public int getCommantCount() {
        int count = 0;
        for (Compet compet : compets) {
            if (compet instanceof Command) {
                count++;
            }
        }
        return count;
    }

    public int getPersonalCount() {
        int count = 0;
        for (Compet compet : compets) {
            if (compet instanceof Personal) {
                count++;
            }
        }
        return count;
    }

    public void printChampion() {
        System.out.println("Чемпион: ");
        for (Compet compet : compets) {
            System.out.println("\t" + compet.toString());

}}}

