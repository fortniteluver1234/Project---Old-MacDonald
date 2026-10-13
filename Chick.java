public class Chick implements Animal {
     private String oneType;
    private String oneSound;
     private String twoSound;
    public Chick (String type, String sound) {
    oneType = type;
    oneSound = sound;
    twoSound = sound;
    }
    public Chick(String type, String sound1, String sound2) {
       oneType = type;
    oneSound = sound1;
    twoSound = sound2;
    }
    public String getType() {
        return oneType;
    }
    public String getSound() {
       if (Math.random() < 0.5) {
            return oneSound;
        } else {
            return twoSound;
        }
    }
}


