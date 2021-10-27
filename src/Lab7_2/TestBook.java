package Lab7_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestBook {
    static List<MainBook> bookList = new ArrayList<> ();

    public static void main (String[] args) {
        boolean isContinue = true;
        int retryCounter = 0;

        while (isContinue) {
            if (retryCounter == 3) {
                System.out.println ("See you next time !");
                isContinue = false;
                break;
            }
            System.out.println ("\t\tMenu");
            System.out.println ("1. Add new Book");
            System.out.println ("2. Retrieve the book[ISBN]");
            System.out.println ("0. Exit !");

            Scanner newScanner = new Scanner (System.in);
            int userChoose = newScanner.nextInt ();
            switch (userChoose) {
                case 0:
                    System.out.println ("\t-----Bye-----");
                    isContinue = false;
                    break;
                case 1:
                    addBook ();
                    break;
                case 2:
                    retrieveBook ();
                    break;
                default:
                    System.out.println ("Wrong option !!!");
                    retryCounter++;
            }

        }
    }

    private static void addBook () {
        Scanner scanneraddBook = new Scanner (System.in);
        System.out.print ("Book ISBN : ");
        String ISBN = scanneraddBook.nextLine ();
        System.out.print ("Book title: ");
        String bookTile = scanneraddBook.nextLine ();
        System.out.print ("Book's author name: ");
        String authorName = scanneraddBook.nextLine ();
        MainBook book = new MainBook (ISBN, bookTile, authorName);
        bookList.add (book);
    }

    private static void retrieveBook () {
        if (bookList.isEmpty ()) {
            System.out.println ("Book list is empty.");
            return;
        }
        Scanner scannerRetrieve = new Scanner (System.in);
        System.out.print ("Book ISBN : ");
        String ISBN = scannerRetrieve.nextLine ();

        MainBook returnedBook = null;

        for (MainBook mainBook : bookList) {
            if (mainBook.getISBN ().equals (ISBN))
                returnedBook = mainBook;
            break;
        }

        if (returnedBook != null) {
            System.out.println (returnedBook);
        } else {
            System.out.println ("Book not found !");

        }
    }

}
