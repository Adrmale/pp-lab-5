import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        
        Person[] people = new Person[5];

        
        final int b = 10;

        try {
            
            people[0] = new Person("Jack Grealish", 26);
            people[1] = new Person("Leroy Sane", 24);
            people[2] = new Person("Jude Bellingham", 21);
            people[3] = new Person("Anthony Davies", 25);
            people[4] = new Person("Erling Halland", 20);

            
            for (Person person : people) {
                int value = MathUtils.add(person.getAge(), b);
                System.out.println("wartosc tej osoby " + person.getName() + ": " + value);

               
                EmailMessenger emailMessenger = new EmailMessenger();

                
                emailMessenger.sendMessage("wartosc tej osoby " + person.getName() + " to: " + value);
            }
        } catch (InvalidAgeException e) {
            System.out.println("nieznany wiek: " + e.getMessage());
        }
    }
}
