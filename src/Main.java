public class Main {
    public static void main(String[] args) {
     Animal animal=new Animal();
     Shark shark = new Shark();
     Turtle turtle=new Turtle();
     Eagle eagle=new Eagle();

     Animal[]animals={shark,turtle,eagle};
for (Animal i :animals)
        System.out.println(i.toString()+ " : "+i.method());




    }
}