public class testChampion {
    public static void main(String[] args) {
        Champion champion = new Champion();
        Command myCommand1 = new Command("баскетбол", 26, "Лига", 1);
        champion.addCompet(myCommand1);
        champion.addCompet(new Command("волейбол", 19, "Питбуль", 1));
        Personal myPersonal = new Personal("прыжки в длину", 200, "Иванов Иван Иванович", 1);
        champion.addCompet(myPersonal);
        champion.printChampion();
        System.out.println("Количество командных соревнований: " + champion.getCommantCount());
        System.out.println("Количество личных соревнований: " + champion.getPersonalCount());
        if (champion.findCompet(myCommand1)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        champion.removeCompet(myCommand1);
    }
}
