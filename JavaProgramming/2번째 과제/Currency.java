import java.util.Scanner;
public class Currency {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] money = new String[2];
        CurrencyInfo c = new CurrencyInfo(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]), args[3]);
        double avg= 0, sum = 0;

        int count = 0, x= 0;
        while(in.hasNextLine()){

            money[x] = in.next();
            if (x == 1){
                sum += c.currency(Double.parseDouble(money[0]), money[1]);
                count ++;
                System.out.print(c.currency(Double.parseDouble(money[0]), money[1]));
                c.print(args[3]);
            }
            x++;
            x = x%2;
        }
        System.out.print("합계 : " + sum);c.print(args[3]);
        System.out.print("평균 : " + sum / count); c.print(args[3]);
    }
}

class CurrencyInfo{
        double dollar=1, euro=1, yen=1 , won = 1;




    CurrencyInfo(double x, double y, double z, String m){
        if(m.equals("won")) {
            dollar = x;
            euro = y;
            yen = z;
        }
        else if(m.equals("euro")){
            dollar = x;
            yen = y;
            won = z;
        }

        else if(m.equals("dollar")){
            euro = x;
            yen = y;
            won = z;
        }

        else{
            dollar = x;
            euro = y;
            won = z;
        }

    }
    double currency(double x, String m){
        if(m.equals("won")) {
            return x * this.won;
        }
        else if(m.equals("euro")){
            return x * this.euro;
        }
        else if(m.equals("dollar")){
            return x * this.dollar;
        }
        else{
            return x * this.yen;
        }
    }
    void print(String s){
        if(s.equals("won")) {
           System.out.println("원");
        }
        else if(s.equals("euro")){
            System.out.println("유로");
        }
        else if(s.equals("dollar")){
            System.out.println("달러");
        }
        else{
            System.out.println("엔");
        }
    }
}