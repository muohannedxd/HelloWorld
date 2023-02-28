/**
 * This class would print a hello world message by creating a class with a
 * single print method
 * @author Lina Ahlem Boualam
 * @version 2023/02/23
 */
public class Hello {
    /**
     * The method prints to the console the message Hello World
     * @retrun returns True when the message is printed successfully.
     */
    public boolean print(){
        System.out.println("Hello World");
        return true;
    }
    /**
     * This is the main method to be invoked when launching the program
     * @param args are the command line arguments
     */
    public static void main(String [] args){
        Hello myHello = new Hello();
        myHello.print();
    }
}
