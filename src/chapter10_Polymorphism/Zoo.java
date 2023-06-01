package chapter10_Polymorphism;

public class Zoo {

    public static void main(String[] args){

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        //can pass all animal subclasses
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        //type animal doesnt have access to scratch method
        sasha = new Cat();
        sasha.makeSound();
        //cast to cat type just for this method
        ((Cat)sasha).scratch();
        feed(sasha);
    }

    public static void feed(Animal animal){
        //check if animal is instance of dog. returns boolean
        if (animal instanceof Dog){
           System.out.println("Here is your dog food.");
        } else if (animal instanceof Cat) {
            System.out.println("Here is your cat food");
        }
    }
}
