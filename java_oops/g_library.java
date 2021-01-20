package java_oops;

class Library{
    private String [] availBooks = {"Science", "Chemistry", "Physics", "Biology", "Math"};
    private String [] issuedBooks = {"empty", "empty", "empty", "empty", "empty"};
    private int ib = 0;

    void listBooks(){
        for (String books: availBooks)
        {
            System.out.print(books + " ");
        }
    }

    void issueBooks(String book)
    {
        int index=0;
        for (String books: availBooks)
        {
            if(book == books)
            {
                System.out.println(books + " Book Available at " + index);
                break;
            }
            index++;
            if(index==5)
            {
                System.out.println("Wrong Book Name!");
                return;
            }
        }

        issuedBooks[ib] = availBooks[index];
        availBooks[index] = "empty";
        
        System.out.println(issuedBooks[ib] + " Book issue Successfully! in issuedBooks at "+ib);
        ib++;
    }

    void returnBook(String book)
    {
        int index = 0;
        for(String books: availBooks)
        {
            if(books == "empty")
            {
                availBooks[index] = book;
                ib--;
                issuedBooks[ib] = "empty";
                System.out.println(issuedBooks[ib] + " Book Returned Successfully." );
                break;
            }
            index++;
            if(index==5)
            {
                System.out.println("Wrong book returned!");
                return;
            }
        }
    }
}

public class g_library {
    public static void main(String[] args) {
        Library obj = new Library();
        obj.listBooks();
        obj.issueBooks("Science");
        obj.listBooks();
        obj.returnBook("Science");
        obj.listBooks();
    }
}
