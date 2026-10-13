    public class Farm {
    private Animal[] a = new Animal[3];

    public Farm() {
        a[0] = new NamedCow("cow", "Bob", "moo");
        a[1] = new Chick("chick", "chirp");
        a[2] = new Pig("pig", "oink");
    }

    public void animalSounds() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getType() + " goes " + a[i].getSound());
        }
    

    System.out.println("The cow is known as " + ((NamedCow) a[0]).getName());
    }

    public static void main(String[] args) {
        Farm myFarm = new Farm();
        myFarm.animalSounds();
    }
}


