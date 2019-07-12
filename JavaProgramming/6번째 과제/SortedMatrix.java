import java.io.File;
        import java.io.IOException;
        import java.util.Scanner;

public class SortedMatrix {
    public static void main(String[] args) throws IOException{
        File f = new File(args[0]);
        Scanner in = new Scanner(f);
        Scanner in2 = new Scanner(f);

        int count= 0;
        int count2 = 0;
        int count3 = 0;
        int i= 0;
        String c = "";
        while(in.hasNext()){
            String s = in.nextLine();
            Scanner s1 = new Scanner(s);
            while(s1.hasNext()) {
                s1.nextInt();
                count2++;
            }
            if( i < count2) i = count2;
            c += count2+ " ";
            count2 = 0;
            count ++ ;
        }
        Scanner d = new Scanner(c);
        while(d.hasNext()){
            d.nextInt();
            count3 ++;
        }
        Scanner d1 = new Scanner(c);
        int [] e = new int[count3];


        int [][] data = new int[count][i];
        int [] tmp = new int [i];
        i = 0;
        int j=0;
        String s = "";
        while(d1.hasNext()){
            e[i] = d1.nextInt();
            i ++;
        }
        i = 0;


        while(in2.hasNext()){
            s = in2.nextLine();
            Scanner s1 = new Scanner(s);
            while(s1.hasNext()){
                data[i][j] = s1.nextInt();
                j++;
            }
            j = 0;
            sorti(data[i],e[i]);

            i++ ;
        }
        i = 0; j = 0;
        boolean swapped = true;
        j = 1;
        while(true) {
            for(i=0;i < count-1;i++) {
                if(data[i][0] > data[i+1][0]) {
                    swapb(i, i+1, data,e);
                    swapped = true;
                }
            }
            if(!swapped) break;
            swapped = false;
            j++;
        }
        for(int x = 0 ; x<count; x ++){
            for(int y = 0; y < e[x] ; y ++){
                System.out.print(data[x][y] + "\t");
            }
            System.out.println();
        }
    }
    static int[] sorti(int[] c, int e){
        boolean swapped = true;
        int j = 1;
        while(true) {
            for(int i=0;i < e-j;i++) {
                if(c[i] > c[i+1]) {
                    swapi(i, i+1, c);
                    swapped = true;
                }
            }
            if(!swapped) break;
            swapped = false;
            j++;
        }
        return c;
    }
    static void swapi(int i, int j, int[] data) {
        int		tmp;

        tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
    static void swapb(int i, int j, int[][] data, int[] e) {
        int[]		tmp;
        int temp;

        tmp = data[i];
        temp = e[i];
        data[i] = data[j];
        e[i] = e[j];
        data[j] = tmp;
        e[j] = temp;
    }

}


