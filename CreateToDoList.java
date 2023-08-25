package Java;
import java.util.LinkedList;

public class CreateToDoList {

    public static void main(String[] args) {
     
        LinkedList<String> todoList = new LinkedList<>();

        
        todoList.add("Buy groceries");
        todoList.add("Do laundry");
        todoList.add("Clean the house");
        todoList.add("Call the doctor");
        todoList.add("Pay the bills");

       
        System.out.println(todoList);

       
        todoList.remove("Do laundry");

        
        System.out.println(todoList);
    }
}
