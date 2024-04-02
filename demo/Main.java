package demo;

public class Main {
    public static void main(String[] args) {
        Director director1 = Director.getInstance("Duc");
        System.out.println(director1);
        Director director2 = Director.getInstance("Huy");
        System.out.println(director2);
    }
}
