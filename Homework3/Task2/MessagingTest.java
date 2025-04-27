package Homework3.Task2;
public class MessagingTest {
    public static void main(String[] args) {
        Message m1 = new Email();
        Message m2 = new SMS();

        System.out.println(m1.getType()); // "Email"
        System.out.println(m2.getType()); // "SMS"
        //System.out.println(m1.send()); // m1 is of static type Message, with no send() method
        if (m1 instanceof Email) {
            Email email = (Email) m1; 
            System.out.println(email.send()); // "Email sent"
        }
    }
}