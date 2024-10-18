import java.util.ArrayList;

public class ToDoList {

    ArrayList<String> toDo = new ArrayList<>();

    public void addToDo(String item) {

        toDo.add(item);
    }

    public void removeToDo(String item) {
        toDo.remove(item);
    }

    public void showToDoList() {

        System.out.println("************");

        int a = 1;
        for (String list : toDo) {
            System.out.println();
            System.out.println((a++) + "-) " + list);

        }

    }

}