abstract class Animal {
     private String name;
 
     Animal(String name) {
        this.name = name;
     }
 
     public String getName() {
         return name;
     }
}
 
class Dog extends Animal {
     private String breed;
     Dog(String breed) {
        super(""); //this is a must
         this.breed = breed;
     }
 
     Dog(String name, String breed) {
         super(name); // this is a must
         this.breed = breed;
     }
 
     public String getBreed() {
         return breed;
     }
}
 
class TestConstructor {
     public static void main(String[] args) {
         Dog dog1 = new Dog("Beagle");
         Dog dog2 = new Dog("Bubbly", "Poodle");
         System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" + 
                             dog2.getName() + ":" + dog2.getBreed());
     }
}