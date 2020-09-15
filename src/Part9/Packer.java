package Part9;

public class Packer {
    private Factory factory;

    public Packer() {
        this.factory = new Factory();
    }

    public PackableBox giveABoxOfThings() {
         PackableBox box = new PackableBox(100);

         int i = 0;
         while (i < 10) {
             Packables newThing = factory.produceNew();
             box.add(newThing);

             i = i + 1;
         }

         return box;
    }
}