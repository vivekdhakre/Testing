package geeksforgeeks;

/**
 * Created by ahoy on 2/6/17.
 */
public class EqualsAndHashcode {

    public static void main(String[] args) {
        Geek g1 = new Geek(1, "aa");
        Geek g2 = new Geek(1, "aa");

        System.out.println("g1: " + (g1.hashCode() == g2.hashCode()));
//        System.out.println("g2: "+g2);
    }

}

class Geek {
    private int id;
    private String name;

    public Geek(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;
        if (!(obj instanceof Geek)) return false;

        Geek g = (Geek) obj;
        return g.id == id && name.compareTo(g.name) == 0;
    }

    @Override
    public int hashCode() {
        return id * 100;
    }
}
