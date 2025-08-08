
public class Book{
    private final String title;
    private final String author;
    private boolean isIssued;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook(){
        if(!isIssued){
            isIssued = true;
            System.out.println("Book isssued: "+title);
        } else{
            System.out.println("Book already issued: "+title);
        }
    }

    public void returnBook(){
        if(isIssued){
            isIssued = true;
            System.out.println("Book returned: "+title);
        } else{
            System.out.println("Book was not issued: "+title);
        }
    }

    @Override
    public String toString(){
        return title+" by "+author+(isIssued ? " [Issued] " : " [Available]");
    }
}