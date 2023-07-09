import java.util.*;
class car_details extends dealer{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String selected;
        int p;
        String[] cars={"Polo Trendline","Polo Highline","Virtus Trendline","Virtus Highline","Taigun Trendline","Taigun Highline","Taigun Topline"};
       int[] price={870000,1009000,1105000,1308000,1489000,1542000,1771000};
        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]+"   "+price[i]+"lakh");
        }
        System.out.println("Select car model:");
        while(true){
        selected=s.nextLine();
        dealer d=new dealer();
        if(Arrays.asList(cars).contains(selected)){
            p=Arrays.asList(cars).indexOf(selected);
            d.cal_cost(price[p]);
            break;
        }
        else{
        System.out.println("Please! select available cars only..");
        }
    }
}
}