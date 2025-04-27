package Homework3.Task2;

public class Email extends Message {
    @Override
    public String getType() {
        return "Email";
    }

    public String send(){
        return "Email sent";
    }
}
