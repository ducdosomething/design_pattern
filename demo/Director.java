package demo;

/**
 * Director
 */
public class Director {

    private static Director instance;
    private String name;

    private Director(String name) {
        this.name = name;
    }

    public static Director getInstance(String name) {
        if (instance == null) {
            synchronized ((Director.class)) {
                if (instance == null) {
                    instance = new Director(name);
                }
            }
        }

        return instance;
    }

    @Override
    public String toString() {
        return "Director [name=" + name + "]";
    }

}