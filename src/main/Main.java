package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Book[] arr = new Book[n];
        if (n == 0) {
            System.out.println("N/A");
        } else {
            s.nextLine().trim();
            for (int i = 0; i < n; i++) {
                String book_name = s.nextLine().trim();
                String author_name = s.nextLine().trim();
                String isbn_no = s.nextLine().trim();
                arr[i] = new Book(book_name, author_name, isbn_no);
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }

}
