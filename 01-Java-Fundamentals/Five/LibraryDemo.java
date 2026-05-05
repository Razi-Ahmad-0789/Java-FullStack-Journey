package Five;

import java.util.List;
//throw and throws

class InvalidMemberException extends Exception{
    public InvalidMemberException(String message){
        super(message);
    }
}
class BookUnavailableException extends Exception{
    public BookUnavailableException(String message){
        super(message);
    }
}
class Library{
     int NoAvailableBooks=3;
    public void borrowBook(String memberName,int bookRequestedCount)throws Exception{
        if(bookRequestedCount>NoAvailableBooks)
            throw new BookUnavailableException("Not enough books available");

        if(bookRequestedCount<0)
            throw new Exception("You must request at least one book");

        if(memberName==null || memberName.isEmpty())
        throw new InvalidMemberException("Invalid MemberShip");
    }
 }
public class LibraryDemo {
    public static void main(String[] args) {
        Library library=new Library();
        try {
            library.borrowBook("John",1);
            library.borrowBook("null",1);
        }catch (BookUnavailableException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
            System.out.println("Exception Occurred: "+e.getMessage());
        }
    }
}


//public void borrowRequested(int booksRequested){
//    try {
//        int[]books={101,102,103};
//        System.out.println("Book Requested:"+books[booksRequested]);
//    }catch (ArrayIndexOutOfBoundsException e){
//        System.out.println("Exception Occurred, you requested a book that does not exist!");
//    }catch (NullPointerException e){
//        System.out.println("NullPointerException");
//    }finally {
//        System.out.println("FINALLY BLOCK");
//    }
//}



//public void borrowRequested(int booksRequestedCount){
//    try {
//        if(booksRequestedCount>NoAvailableBooks){
//            throw new Exception("Not enough books available");
//        }
//    }catch (ArrayIndexOutOfBoundsException e){
//        System.out.println("Exception Occurred, you requested a book that does not exist!");
//    }catch (NullPointerException e){
//        System.out.println("NullPointerException");
//    } catch (Exception e) {
//        throw new RuntimeException(e);
//    } finally {
//        System.out.println("FINALLY BLOCK");
//    }
//}
