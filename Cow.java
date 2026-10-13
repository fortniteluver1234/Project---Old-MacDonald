public class Cow implements Animal {
     private String oneType;
    private String oneSound;
    public Cow (String type, String sound) {
    oneType = type;
    oneSound = sound;
    }
    public String getType() {
        return oneType;
    }
    public String getSound() {
        return oneSound;
}
}
