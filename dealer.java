import java.util.*;
public class dealer {
    int RTO=113990,Insurance=47300,TCS_charges=11000,Additional_Accessories=15000,tot_cost,discount=0,prices;
    String disc;
    Scanner sc=new Scanner(System.in);
    void cal_cost(int price){
        this.prices=price;
        String insu,addi;
        System.out.print("Do you need Insurance:");
        insu=sc.nextLine();
        System.out.print("Do you need Additional Accessories:");
        addi=sc.nextLine();
        check(insu,addi);
        if((insu.equals("yes"))||(addi.equals("yes"))){
            System.out.print("Dealer discount:");
            disc=sc.nextLine();
            check_disc(disc);
            tot_cost=prices+RTO+TCS_charges+Insurance+Additional_Accessories-discount;
            System.out.println("Total cost  "+tot_cost);
            }
        else{
            System.out.println("any one of the additional features has to be added to get Discount");
            tot_cost=prices+RTO+TCS_charges;
            System.out.println("Total Cost  "+tot_cost);
        }
    }
    void check(String insu,String addi){
        if(insu.equals("no")){
            this.Insurance=0;
        }
        if(addi.equals("no")){
            this.Additional_Accessories=0;
        }
    }
    void check_disc(String disc){
        while(true){
            if(disc.contains("%")){
                this.discount=prices*(Integer.parseInt(disc.substring(0,disc.length()-1)))/100;
            }else{
                this.discount=Integer.parseInt(disc);
            }
            if(this.discount>30000){
                System.out.println("discount should not exceed 30000");
                System.out.print("Dealer discount:");
                disc=sc.nextLine();
            }
            else{
                break;
            }
        }
    }
}
