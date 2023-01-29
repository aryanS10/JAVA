import MODULE.Category;
import MODULE.MainCategory;
import MODULE.Users;
import MODULE.Books;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Books b1 = new Books("Books", "Sci-fi","Esdeath",13);
        b1.info();
        Books b2 = new Books("manga","Horror", "parasyte", 14);
        b2.info();

        ArrayList<Books> books_list = new ArrayList<>();
        books_list.add(b1);
        books_list.add(b2);

        Orders orders_list = new Orders(books_list);

        ArrayList<Orders> 01 = new ArrayList<Orders>();
        01.add(orders_list);


        Users u1 = new Users("RN","122333333","01");
    }
}