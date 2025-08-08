import java.util.Scanner;


public class Main{
    private static Scanner sc = new Scanner(System.in);
    private static Library library = new Library();
    public static void main(String[] args) {        

        library.addBook(new Book("Java Programming", "James Gosling"));
        library.addBook(new Book("Python Crash Course", "Eric Mattes"));
        library.addBook(new Book("C++ Primer", "Stanley Lippan"));

        library.addUser(new User("Alice",1));
        library.addUser(new User("Bob",2));

        while(true){
            System.out.println("\n==== Library Menu ====");
            System.out.println("1. Show all books");
            System.out.println("2. Issue a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1 -> library.showAllBooks();
                case 2 -> issueBook();
                case 3 -> returnBook();
                case 4 -> { 
                    System.out.println("Exiting Library System");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
    private static void issueBook(){
        System.out.println("Enter book title to issue: ");
        String title = sc.nextLine();
        System.out.println("Enter user ID: ");
        int userId = sc.nextInt(); 
        sc.nextLine();
        library.issueBook(title, userId);       
    }

    private static void returnBook(){
        System.out.println("Enter book title to return: ");
        String title = sc.nextLine();
        System.out.println("Enter user ID: ");
        int userId = sc.nextInt();
        sc.nextLine();
        library.returnBook(title, userId);      
    }
}
