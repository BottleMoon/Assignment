import java.util.Scanner;

public class LineAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int count= 0, x= 0, roof =0 , sum= 0, num = 0;
        int bst = 0;
        double avg = 0;
        String str;

        while (in.hasNextLine()) {
            roof++;
            count = 0;
            sum = 0;
            str = in.nextLine();
            Scanner strin = new Scanner(str);

            while(strin.hasNext()) {
                x = strin.nextInt();
                sum += x;
                count++;
            }
            if (bst < sum) {
                bst = sum;
                num = roof;
            }
            avg = (double)sum/count;
            System.out.println(roof + ": " + avg + "\t(" + count + "개)");
        }
        System.out.println("평균 최고 : " + num + "번줄 ("+ avg +")");
    }
}
