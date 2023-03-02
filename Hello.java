import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
// javax is a library that serves GUI in JAVA
import javax.swing.*;
import java.util.Scanner;

/**
 * This class would print a hello world message by creating a class with a
 * single print method
 * 
 * @author Lina Ahlem Boualam
 * @version 2023/02/23
 */
public class Hello {
    /**
     * The method prints to the console the message Hello World
     * 
     * @retrun returns True when the message is printed successfully.
     */
    public boolean print() {
        System.out.println("Hello World");
        return true;
    }

    /*
     * function that creates the GUI
     */
    public void GUI() {
        // loading the counter
        int counter = 0;
        try (FileReader reader = new FileReader("counter.txt")) {
            counter = reader.read();
        } catch (IOException e) {
            // Ignore the exception and use the default value of 0
        }

        //incrementing it
        
        counter += 1;
        // creating the frame and label
        JFrame frame = new JFrame("HELLO WORLD GUI");
        JLabel label = new JLabel("Hello World " + counter, SwingConstants.CENTER);
        
        // saving after incrementing
        saveCounter(counter);

        // adding the label to the frame
        frame.add(label);

        // adjusting the frame
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /*
     * saving the counter in the file
     */
    private void saveCounter(int counter) {
        try (FileWriter writer = new FileWriter("counter.txt")) {
          writer.write(counter);
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
    /*
     * procedure to ask user if he wants the GUI
     */
    public void Choice() {
        // initialize program class
        Hello myHello = new Hello();

        // initialize Scanner
        Scanner scan = new Scanner(System.in);

        // parameter for choice
        int choice;

        // menu
        System.out.print(
                "1. Command Line Interface (CLI)\n2. Graphical User Interface (GUI)\n3. Exit\nEnter an option: ");
        choice = scan.nextInt();

        switch (choice) {
            case 1:
                myHello.print();
                System.out.println("\n");
                break;
            case 2:
                myHello.GUI();
                System.out.println("\n");
                break;
            default:
                break;
        }
    }

    /**
     * This is the main method to be invoked when launching the program
     * 
     * @param args are the command line arguments
     */
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.Choice();
    }
}
