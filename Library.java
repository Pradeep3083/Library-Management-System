
import java.util.ArrayList;
import java.util.List;



public class Library{
    private final List<Book> books;
    private final List<User> users;

    public Library(){
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: "+book.getTitle());
    }

    public void addUser(User user){
        users.add(user);
        System.out.println("User added: "+user.getName());
    }

    public void issueBook(String title, int userId){
        Book bookToIssue = findBook(title);
        User user = findUser(userId);

        if(bookToIssue != null && user != null){
            if(!bookToIssue.isIssued()){
                bookToIssue.issueBook();
                System.out.println(user.getName()+" has borrowed the book: "+title);
            } else{
                System.out.println("Sorry, the book is already issued.");
            }
        } else{
            System.out.println("Book or user not found");
        }
    }

    public void returnBook(String title, int userId){
        Book bookToReturn = findBook(title);
        User user = findUser(userId);

        if(bookToReturn != null && user != null){
            if(bookToReturn.isIssued()){
                bookToReturn.returnBook();
                System.out.println(user.getName()+" has  returned the book: "+title);
            } else{
                System.out.println("The book was not issued");
            }
        } else{
            System.out.println("Book or user not found");
        }
    }

    public void showAllBooks(){
        System.out.println("\n--- Book List ---");
        for(Book b : books){
            System.out.println(b);
        }
    }

    public Book findBook(String title){
        for(Book b : books){
            if(b.getTitle().equalsIgnoreCase(title)){
                return b;
            }
        }
        return null;
    }

    public User findUser(int userId){
        for(User u : users){
            if(u.getUserId() == userId){
                return u;
            }
        }
        return null;
    }
}