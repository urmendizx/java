import java.util.Map;
import java.util.HashMap;

class Nine {
    public static void main(String ...args) {
        Map<Integer, String> names = new HashMap<>();

        names.put(19, "Kevin");
        names.put(24, "Angela");
        names.put(33, "Alejo");
        names.put(42, "Doris");

        names.forEach((id, name) -> {
            System.out.println("ID: " + id + "| Nombre: " + name);
        });
    }
}