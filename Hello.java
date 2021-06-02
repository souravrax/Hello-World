import java.util.*;
import java.io.IOException;

class HelloWorld{

    public static void main(String ...arStrings) {
        
        System.out.println("Enter your name : ");
        String name = System.console().readLine();
        System.out.println("Your name is : " + name);
        System.out.print("Enter your age : ");
        int age = System.in.read();
        System.out.println("Your age is : " + age);

    }
}