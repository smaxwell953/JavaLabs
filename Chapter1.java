// Welcome.java: This application program prints Welcome to Java!
public class Welcome{
     public static void main(String[] args) {
        System.out.println("Welcome to Java!");
     }
}

// First.java: This application program prints My first program!
public class First{
     public static void main(String[] args) {
        System.out.println("My first program");
     }
}

//main -> Main: Runtime error
//Error: Main method not found in class First, please define the main method as:
//   public static void main(String[] args)
//or a JavaFX application class must extend javafx.application.Application

//Welcome.java -> welcome.java: Interpreter searches for welcome.class and doesn't find it, so it can't compile.

//Welcome -> Welcome.class: Interpreter searches for Welcome.class.class