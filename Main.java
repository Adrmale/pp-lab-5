import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        
        int result = MathUtils.add(4, 30);
        System.out.println("Wynik dodawania to: " + result);

        EmailMessenger emailMessenger = new EmailMessenger();

        emailMessenger.sendMessage("Wynik dodawania to: " + result);
    }
}
