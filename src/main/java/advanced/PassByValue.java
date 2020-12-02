package advanced;

public class PassByValue {

    static class Dog{
        public String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("dog1");
        changeDogReference(dog);
        System.out.println(dog.getName());
        changeDogObject(dog);
        System.out.println(dog.getName());
    }

    public static void changeDogReference (Dog dog){
        //dog = new Dog("dog2");
        Dog dog2 = new Dog("dog2");
        dog = dog2;
    }

    public static void changeDogObject (Dog dog){
        dog.setName("dog3");
    }
}
