package Lab7_2;

public class MainBook {
    private String ISBN;
    private String title;
    private String authorName;

    public MainBook(){

    }

    public MainBook (String ISBN, String title, String authorName){

        this.ISBN = ISBN;
        this.title = title;
        this.authorName = authorName;

    }

    public String getISBN () {
        return ISBN;
    }

    public void setISBN (String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getAuthorName () {
        return authorName;
    }

    public void setAuthorName (String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString () {
        return "MainBook{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
