import java.util.*;

class Dmart{
  public static void main(String args[])
  {
    Scanner scn= new Scanner(System.in);
    System.out.println("                        D- Mart                     ");
    Date d1 = new Date();
    String name = scn.nextLine();
    System.out.println("Customer Name :"         +name +"                  Date :" + d1);
    
    
    System.out.println("Gender M/F :");
    char gender = scn.next().charAt(0);
    if (gender=='f'||gender=='F'){
    String gift =  "Cadeberry";
    System.out.println("Gift :-"+gift);
    }else if (gender=='m'||gender=='M'){
    String gift = "Wallet";
    System.out.println("Gift :-"+gift);
    }else {
    System.out.println("Enter valid Gender");
    }
    
    System.out.println("Item 1 :");
    String i1= scn.next();
    int c1 = 10;
    System.out.println("Price :"+c1);
    System.out.println("Quantity :");
    int q1 = scn.nextInt();
    int t_cost1 = c1*q1;
    System.out.println("Total Cost :" + t_cost1);
    double dis1 =t_cost1*0.05;
    double t_dis1 = t_cost1-dis1;
    
    if (q1>4){
    System.out.println("After Discount :" + t_dis1 );
    }
    
    System.out.println("Item 2 :");
    String i2= scn.next();
    int c2 = 20;
    System.out.println("Price :"+c2);
    System.out.println("Quantity :");
    int q2 = scn.nextInt();
    int t_cost2 = c2*q2;
    System.out.println("Total Cost :" + t_cost2);
    
    System.out.println("Item 3 :");
    String i3= scn.next();
    int c3 = 30;
    System.out.println("Price :"+c3);
    System.out.println("Quantity :");
    int q3 = scn.nextInt();
    int t_cost3 = c3*q3;
    System.out.println("Total Cost :" + t_cost3);
    
    System.out.println("Item 4 :");
    String i4= scn.next();
    int c4 = 40;
    System.out.println("Price :"+c4);
    System.out.println("Quantity :");
    int q4 = scn.nextInt();
    int t_cost4 = c4*q4;
    System.out.println("Total Cost :" + t_cost4);
    
    System.out.println("Item 5 :");
    String i5= scn.next();
    int c5 = 50;
    System.out.println("Price :"+c5);
    System.out.println("Quantity :");
    int q5 = scn.nextInt();
    int t_cost5 = c5*q5;
    System.out.println("Total Cost :" + t_cost5);
    double dis5 =t_cost5*0.1;
    double t_dis5 = t_cost5-dis5;
    System.out.println("After Discount :" + t_dis5);
    
    System.out.println("Item 6 :");
    String i6= scn.next();
    int c6 = 60;
    System.out.println("Price :"+c6);
    System.out.println("Quantity :");
    int q6 = scn.nextInt();
    int t_cost6 = c6*q6;
    System.out.println("Total Cost :" + t_cost6);
    
    System.out.println("Item 7 :");
    String i7= scn.next();
    int c7 = 70;
    System.out.println("Price :"+c7);
    System.out.println("Quantity :");
    int q7 = scn.nextInt();
    int t_cost7 = c7*q7;
    System.out.println("Total Cost :" + t_cost7);
    
    System.out.println("Item 8 :");
    String i8= scn.next();
    int c8 = 80;
    System.out.println("Price :"+c8);
    System.out.println("Quantity :");
    int q8 = scn.nextInt();
    int t_cost8 = c8*q8;
    System.out.println("Total Cost :" + t_cost8);
    
    System.out.println("Item 9 :");
    String i9= scn.next();
    int c9 = 90;
    System.out.println("Price :"+c9);
    System.out.println("Quantity :");
    int q9 = scn.nextInt();
    int t_cost9 = c9*q9;
    System.out.println("Total Cost :" + t_cost9);
    
    System.out.println("Item 10 :");
    String i10= scn.next();
    int c10 = 100;
    System.out.println("Price :"+c10);
    System.out.println("Quantity :");
    int q10 = scn.nextInt();
    int t_cost10 = c10*q10;
    System.out.println("Total Cost :" + t_cost10);
    
    double dis10 =t_cost10*0.15;
    double t_dis10 = t_cost10-dis10;
    System.out.println("After Discount :" + t_dis10);
    
    
    System.out.println("Do you wnat a carry bag? (yes/no) :");
    char bag = scn.next().charAt(0);
    int c_bag = 10;
    
    
    double ap = t_cost1 +t_cost2 +t_cost3 +t_cost4 +t_cost5 +t_cost6 +t_cost7 +t_cost8 +t_cost9+t_cost10 ;
    
    double dp = t_dis1+t_cost2 +t_cost3 +t_cost4+ t_dis5 +t_cost6 +t_cost7 +t_cost8 +t_cost9+t_dis10 ;
    
    
    //actual Price GST
    double ap_gst = ap*0.1;
    double t_ap_gst = ap_gst+ap;
    
    // Discounted Price gst
    double dp_gst = dp*0.1;
    double t_dp_gst = dp_gst+ap;
    
    if (t_dp_gst>3000){
        double bill1 = t_dp_gst*0.15;
        double t_bill1 = t_dp_gst-bill1;
    }else if (t_dp_gst<=2500&&t_dp_gst>=2000){
            double bill2 = t_dp_gst*0.1;
            double t_bill2 = t_dp_gst-bill2;
    }
      
    
    
    System.out.println("                                     D-Mart");
    System.out.println("Customer Name :"+name+"                                   Date:"+d1);
    System.out.println("Gender :" + gender);
    System.out.println(" -----------------------------------------------------------------------");
    System.out.println("Item Name\tQuantity\tPrice\tTotal Cost\tAfter Discount");
    System.out.printf("%-15s %-15d %-15d %-15d %-15.2f\n",i1,q1,c1,t_cost1,t_dis1 );
    System.out.printf("%-15s %-15d %-15d %-15d %-15d\n",i2,q2,c2,t_cost2,t_cost2 );
    System.out.printf("%-15s %-15d %-15d %-15d %-15d\n",i3,q3,c3,t_cost3,t_cost3 );
    System.out.printf("%-15s %-15d %-15d %-15d %-15d\n",i4,q4,c4,t_cost4,t_cost4 );
    System.out.printf("%-15s %-15d %-15d %-15d %-15.2f\n",i5,q5,c5,t_cost5,t_dis5 );
    System.out.printf("%-15s %-15d %-15d %-15d %-15d\n",i6,q6,c6,t_cost6,t_cost6 );
    System.out.printf("%-15s %-15d %-15d %-15d %-15d\n",i7,q7,c7,t_cost7,t_cost7 );
    System.out.printf("%-15s %-15d %-15d %-15d %-15d\n",i8,q8,c8,t_cost8,t_cost8 );
    System.out.printf("%-15s %-15d %-15d %-15d %-15d\n",i9,q9,c9,t_cost9,t_cost9 );
    System.out.printf("%-15s %-15d %-15d %-15d %-15.2f\n",i10,q10,c10,t_cost10,t_dis10 );
    System.out.println(" -----------------------------------------------------------------------");
    System.out.printf("\t\t\t\t\t\tA.p\t\tD.p\n");
     System.out.printf(" \t\t\t\t\t\t%.2f\t\t%.2f\n",ap,dp);
    
      System.out.println();    
    if(gender=='f'||gender=='F'){
          System.out.println("Gift:-cadeburry");
    }
      else if(gender=='m'||gender=='M'){
          System.out.println("Gift:-lather ");
    }
        else{System.out.println("press valid Choice");
    }
          if(bag=='y'||bag=='Y'){
          System.out.printf("carry beg:-yes\t\t\t\t\t%-15d\t\t%-15d\n",c_bag,c_bag);
    }
       else if(bag=='n'||bag=='N'){
            System.out.println("Carry beg:-no");}
        else{}
    //System.out.printf(\t\t\t\t\t%-15d%-15d\n,c_bag,c_bag);
    System.out.printf("GST(10%%):\t\t\t\t\t%-15.2f\t%-15.2f\n",ap_gst,dp_gst);
    
    System.out.printf("\t\t\t\t\t\t%.2f\n",t_ap_gst,t_dp_gst);
    System.out.println
    ("----------------------------------------------------------------------------------");
    
    if(t_dp_gst>3000){
        double bill1 = t_dp_gst*0.15;
        double t_bill1 = t_dp_gst-bill1;
        System.out.printf("YOU GET (15%%) DISCOUNT :\t\t\t\t\t%.2f\n",bill1);
        System.out.printf("Total Amount :\t\t\t\t\t\t\t%.2f\n",t_bill1);
    }else if (t_dp_gst<=2500&&t_dp_gst>=2000){
            double bill2 = t_dp_gst*0.1;
            double t_bill2 = t_dp_gst-bill2;
            System.out.printf("YOU GET (10%%) DISCOUNT :\t\t\t\t\t%.2f\n",bill2);
          System.out.printf("Total Amount :\t\t\t\t\t\t\t\t%.2f\n",t_bill2);
    }
      System.out.println("----------------------------------------------------------------------------------");
    System.out.println("                              Thankyou      ");
       System.out.println("                             To visit     ");
       System.out.println("                               Dmart     ");
        System.out.println("----------------------------------------------------------------------------------");
  }  
  
}
  