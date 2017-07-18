import java.util.HashMap;

/**
 * @author Vivek on 26/6/17.
 * @project Test18July
 * @package PACKAGE_NAME
 */
public class GFG {

    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put(new Key("vishal"), 20);
        map.put(new Key("sachin"), 30);
        map.put(new Key("vaibhav"), 40);

        System.out.println("Value for key sachin: " +
                map.get(new Key("sachin")) + " | " + new Key("sachin").hashCode());
        System.out.println("Value for key vaibhav: " +
                map.get(new Key("vaibhav")) + " | " + new Key("vaibhav").hashCode());


    }
}

class Key {

    private String key;

    public Key(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        int hash = (int) key.charAt(0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return key.equals(((Key) obj).key);
    }
}
