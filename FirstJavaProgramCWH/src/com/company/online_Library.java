package com.company;
class library{
    String []books;
    int no_of_books;
    library(){
        this.books = new String[100];
        no_of_books=0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" Has been added");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are: ");
        for(String book:this.books){
            if(book == null)
            {
                continue;
            }
            System.out.println("-> "+book);

        }

    }

    void issuedBook(String b)
    {
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(b)) {
                System.out.println(b+ " has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println(b+" doesn't exist");
    }

    void returnBooks(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i]==null){
                this.books[i]=book;
                System.out. println("Book returned Successfully!");
                break;

            }
        }
            System.out.println("Library is full");

    }


}
public class online_Library {
    public static void main(String[] args) {
        library lib = new library();
        lib.addBook("Think and Grow Rich");
        lib.addBook("Bhagvat Gita");
        lib.addBook("Leadership Traits");
        lib.addBook("All out");
        lib.addBook("The Alcemist");

        lib.issuedBook("All out");
        lib.showAvailableBooks();
        lib.returnBooks("All out");
        lib.showAvailableBooks();
    }
}
