public class TestFarm {
    public static void main(String[] args) {
        Chick h = new Chick("chick", "cheep", "cluck");
        for (int i = 0; i < 5; i++) {
            System.out.println(h.getType() + " goes " + h.getSound());
        }
    }
}
