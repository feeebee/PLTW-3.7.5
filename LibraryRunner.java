
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    //ArrayList <String> libraries = new ArrayList <String> ();
    /*for(int i=0; i<library.getChildrensBooks().length; i++){
        libraries.add(library.getChildrensBooks(i));
    }
    */
    String authorToFind = "L. Frank Baum";
    //ArrayList <String> childrensBooks = new ArrayList <String>();
    //library.getChildrensBooks();
    String bookToFind = "Sky Island";
    double minimumRating = 0.0;
    for (Book x: library.getChildrensBooks()){
        if(x.getAuthor().equals(authorToFind)){
            System.out.println(x.getTitle());
        }
    }
    for (Book x: library.getChildrensBooks()){
        if(x.getTitle().equals(bookToFind)){
            minimumRating = x.getRating();
            System.out.println(minimumRating);
        }
        if (x.getRating()>minimumRating){
            System.out.println(x.getTitle()+x.getAuthor());
        }
    }
  }
}