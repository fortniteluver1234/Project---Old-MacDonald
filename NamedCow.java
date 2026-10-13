public class NamedCow extends Cow {
    private String cowName;
    public NamedCow(String type, String name, String sound) {
        super(type, sound);
        cowName = name;
    }
    public String getName() {
        return cowName;
    }
}