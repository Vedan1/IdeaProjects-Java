package tester;

import ExceptionHandeling.PublicationExceptionHandeling;
import subclass.Book;
import subclass.Publications;
import subclass.Tape;

import java.util.*;

import static ExceptionHandeling.PublicValidationRules.validateAll;
import static ExceptionHandeling.PublicValidationRules.validateAllTapes;

public class tester {
    public static void main(String[] args) {
        System.out.println("Welcome to Publishing System: ");
        Map<String, Book> bookList = new HashMap<>();
        Map<String, Tape> TapeList = new HashMap<>();
        Map<String, Book> finalBookList = bookList;
        Map<String, Book> BookListData = new HashMap<>(){{
            Book b1 = (Book) validateAll("50Shades", 102.3,"2023-03-06",2,150, finalBookList);
            Book b2 = (Book) validateAll("RichDad", 10.0,"2016-03-09",5,100, finalBookList);
            Book b3 = (Book) validateAll("Ikigai", 125.3,"2020-10-12",3,50, finalBookList);
            put(b1.getTitle(), b1);
            put(b2.getTitle(), b2);
            put(b3.getTitle(), b3);
        }};
        Map<String, Tape> finalTapeList = TapeList;
        Map<String, Tape> TapeListData = new HashMap<>(){{
            Tape t1 = (Tape) validateAllTapes("50ShadesTapes", 102.3,"2023-03-06",2,60, finalTapeList);
            Tape t2 = (Tape) validateAllTapes("RichDadTapes", 10.0,"2016-03-09",5,120, finalTapeList);
            Tape t3 = (Tape) validateAllTapes("IkigaiTapes", 125.3,"2020-10-12",3,55, finalTapeList);
            put(t1.getTitle(), t1);
            put(t2.getTitle(), t2);
            put(t3.getTitle(), t3);
        }};
        bookList = BookListData;
        TapeList = TapeListData;
        boolean flag = false;

        try(Scanner sc = new Scanner(System.in)){
            while(!flag){
                try {
                System.out.println("Please Select Your Option");
                System.out.println("1. Publish new book\n" +
                        "2. Publish new tape\n" +
                        "3. List all book publications publish date descending order\n" +
                        "4. List top 5 publications (current Yr)\n" +
                        "5. Remove all publications which are 5 years old\n"+
                        "6. Exit");


                    switch (sc.nextInt()){
                        case 1:
                            System.out.println("Enter Details Below For Book:");
                            System.out.println(" Titletext, price, Publishdate, rating,PageCount");
                            Book b = (Book) validateAll(sc.next(), sc.nextDouble(),
                                    sc.next(), sc.nextInt(), sc.nextInt(), bookList);
                            bookList.put(b.getTitle(), b);
                            break;
                        case 2:
                            System.out.println("Enter Details Below For Tape:");
                            System.out.println(" Titletext, price, Publishdate, rating,timePlayed");
                            Tape t = (Tape) validateAllTapes(sc.next(), sc.nextDouble(),
                                    sc.next(), sc.nextInt(), sc.nextInt(), TapeList);
                            TapeList.put(t.getTitle(), t);
                            break;
                        case 3:
                            System.out.println("listing The Details of Published Books: ");
                            ArrayList<Book> bookSort = new ArrayList<>(bookList.values());
                            Comparator<Book> comp = Comparator.comparing(Publications::getDatePublising);
                            Collections.sort(bookSort, comp.reversed());
                            System.out.println("sorted List is: ");
                            bookSort.forEach(f -> System.out.println(f));
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            flag=true;
                            break;
                        case 0:
                            for (Book i : bookList.values()) {
                                System.out.println(i);
                            }
                            for (Tape j : TapeList.values()) {
                                System.out.println(j);
                            }
                            break;

                    }
                }catch (Exception e){
                   throw new PublicationExceptionHandeling("Please Check Input");
                }



            }


        } catch (Exception e ){
            System.out.println("Error Occured in 1 Iteration"+e);
        }




    }




}