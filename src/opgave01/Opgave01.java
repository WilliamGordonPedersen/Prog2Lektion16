package opgave01;

import opgave01.models.LinkedList;

public class Opgave01 {
    public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<>();
        List.add("hello");
        List.add("World");

        List.remove("World");
        List.add("hej");
    }
}
