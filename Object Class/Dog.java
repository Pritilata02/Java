public class Dog {

  static int eyes = 2;
  static int leg = 4;
  int tail = 1;
  int nose = 1;
  String name;
  String gender;

  static void run() {
    System.out.println("Running....");
  }

  void bark() {
    System.out.println("Barking....");
  }

  void swim() {
    System.out.println("Swiming....");
  }

  void getDetails() {
    System.out.println("Name: " + name);
    System.out.println("Eyes: " + eyes);
    System.out.println("Legs: " + leg);
    System.out.println("Nose: " + nose);
    System.out.println("Tail: " + tail);
    System.out.println(("Gender: " + gender));

  }

  Dog(String gender) {
    Dog.count++;
    this.gender = gender;
  }

  static int count = 0;

  Dog() {
    Dog.count++;
  }

  static void getCount()
  {
    System.out.println(" Dog Class created : " + count);
  }

  public static void main(String[] args) {

    Dog coco = new Dog("Male");
    Dog rizo = new Dog();

    Dog misi, loko, buzi;
    misi = new Dog();
    loko = new Dog();
    buzi = new Dog();

    // coco.gender = "Male";
    rizo.gender = "Male";
    misi.gender = "Female";
    loko.gender = "Male";
    buzi.gender = "Female";

    coco.name = "Coco";
    rizo.name = "Rizo";
    misi.name = "Misi";
    loko.name = "Loko";
    buzi.name = "Buzi";

    coco.getDetails();
    rizo.getDetails();
    rizo.swim();
    misi.getDetails();
    misi.bark();
    loko.getDetails();
    buzi.getDetails();

    Dog.getCount();

  }

}
