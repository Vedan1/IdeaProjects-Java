package tester;
//Pen Management system ---
/*1. Add Pen - add onto hashmaps
2. Update Inventory - change inventory stock and update date
3. Update Discount 20% < 3M - localdate < 3 m -- Price 20% off
4. Remove Pens < 9 Months -- localdate > 9 m --delete;
5. Display Inveentory -- Displat Maps Fully (Can Impliment Certain brands(treemaps))
class pen where
enums Brands Cello , Parker, Reynolds;*/


import exceptionsPens.PenExceptionHandeling;
import penClass.Pen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//import static exceptionsPens.PenValidateionRules.addval;
import static exceptionsPens.PenValidateionRules.*;


public class tester {
    public static void main(String[] args) {

        System.out.println("Welcome to pen management: ");
        Map<Integer, Pen> penList = new HashMap<>();
//        penList.put(0,("Cello","glass",10,20.0,2023-03-02);
        boolean flag = false;
        int counter = 4;
        try(Scanner sc = new Scanner(System.in);){
            try{
                while(!flag){
                System.out.println("Select Your Option : ");
                System.out.println("1.Add Pens\n2.Update Inventory\n3.Update Discount\n" +
                        "4.Remove Unused Inventory\n5.Display Inventory\n0.TestCase ");

                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("Please Enter Required Details: ");
                        System.out.println("brand,material,stock, price, stockListingDate");
                       Pen newpen1 = validateInput("Cello","glass",10,10.0,"2023-03-02",penList);
                       Pen newpen2 = validateInput("parker","metal",20,100.0,"2015-02-02",penList);
                       Pen newpen3 = validateInput("reynolds","glass",30,20.0,"2013-03-02",penList);
                       Pen newpen4 = validateInput("cello","plastic",10,10.0,"2021-01-02",penList);
                        penList.put(0, newpen1);
                        penList.put(1, newpen2);
                        penList.put(2, newpen3);
                        penList.put(3, newpen4);
                        Pen newpen = validateInput(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.next(), penList);
                        penList.put(counter, newpen);

                        counter++;
                        break;
                    case 2:
                        int x=0;
                        for (Pen i : penList.values()) {
                            System.out.println("Sr.no "+ x+ " " +i);
                            x++;
                        }
                        System.out.println("Please Select the Inventory to Be Changed");
                        Pen newstockpen=penList.get(sc.nextInt());
                        newstockpen.setStock(sc.nextInt());
                        System.out.println("Stock Changed Sucessfully: ");
                        System.out.println(newstockpen);
                        break;
                    case 3:
                        System.out.println("The Process is Starting...\nPlease Enter The Serial No to be Changed");
                        Pen discchk = penList.get(sc.nextInt());
                        Pen chek = isDiscount(discchk);
                        break;
                    case 4:
                        System.out.println("1.Delete All Old Stock(less than 9M)\n2.Delete Specific Stock");
                        int sw = sc.nextInt();
                        if(sw==1){
                            int size = penList.size();
                            for(int i=0;i<size;i++){
                                Pen tempPen = penList.get(i);
                                if(checkDel(tempPen)){
                                    penList.remove(i);
                                    System.out.println("deleted Succesfully Sr.No"+ i);
                                }

                            }

                        } else if (sw==2) {
                            System.out.println("Enter SrNo Want to Remove");
                            int srno = sc.nextInt();
                            Pen tempPen = penList.get(srno);
                            if(checkDel(tempPen)){
                                penList.remove(srno);
                                System.out.println("deleted Succesfully Sr.No"+ srno);
                            }
                        }
                        else throw new PenExceptionHandeling("Bad Option Choice");
                        break;
                    case 5:
                        for (Pen i : penList.values()) {
                            System.out.println(i);
                        }
                        break;

                    case 0:
                        System.out.println("Exiting...");
                        flag=true;


                }
                }


            }catch (Exception e){

                System.out.println("Internal Loop Exception"+e);
            }




        }







    }



}