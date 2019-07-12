import java.util.Arrays;

public class SetOperation {

    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Arguments Missing !!");
            System.exit(1);
        }

        char[]	set_a;
        char[]	set_b;

        set_a = getSet(args[0]);
        set_b = getSet(args[1]);

        System.out.println("Set A : "+toString(set_a));
        System.out.println("Set B : "+toString(set_b));
        System.out.println("Mixed : "+toString(getMixed(set_a, set_b)));

        Arrays.sort(set_a);
        Arrays.sort(set_b);

        System.out.println("Sorted Set A : "+toString(set_a));
        System.out.println("Sorted Set B : "+toString(set_b));
    }

    static char[] getSet(String s) {
        char[]	tmp = new char[s.length()];

        for(int i=0;i < s.length();i++) {
            tmp[i] = s.charAt(i);
        }

        return(tmp);
    }

    static String toString(char[] s) {
        String tmp="";

        for(int i=0;i < s.length-1;i++) {
            tmp += s[i];
        }

        return(tmp + s[s.length-1]);
    }

    static char[] getMixed(char[] a, char[] b) {
        char[]	r = new char[a.length+b.length];
        int		ai=0, bi=0;

        for(int i=0;i < r.length;i++) {
            if(bi >= b.length) {
                r[i] = a[ai++]; continue;
            }
            if(ai == a.length) {
                r[i] = b[bi++]; continue;
            }
            r[i] = (i%2 == 0) ? a[ai++] : b[bi++];
        }

        return(r);
    }
    static String union(String s1, String s2){
        String result = s1;
        int s1leth = s1.length();
        int s2leth = s2.length();
        char[] c1 = getSet(s1);
        char[] c2 = getSet(s2);
        for(int i = 0 ; i < s1leth; i++){
            for(int j = 0 ; j < s2leth; j++){
                if(c1[i] == c2[j]){
                    for(int k = j ; k < s2leth-1; k++) c2[k] = c2[k+1];
                    s2leth--;
                    j--;
                }
            }
        }
        for(int i = 0 ; i < s2leth ; i++) {
            result += c2[i];
        }

        return result;
    }
    static String intersect(String s1, String s2){
        String result = "";
        char[] c1 = getSet(s1);
        char[] c2 = getSet(s2);
        for(int i = 0 ; i < s1.length(); i ++ ){
             for(int j = 0 ; j < s2.length(); j++){
                 if(c1[i] == c2[j]){
                     result += c1[i];
                 }
             }
        }
        return result;
    }
    static String minus(String s1, String s2){
        String result = "";
        int s2leth = s1.length();
        int s1leth = s2.length();
        char[] c1 = getSet(s1);
        char[] c2 = getSet(s2);
        for(int i = 0 ; i < s1leth; i++){
            for(int j = 0 ; j < s2leth; j++){
                if(c1[i] == c2[j]){
                    for(int k = j ; k < s2leth-1; k++) c2[k] = c2[k+1];
                    s2leth--;
                    j--;
                }
            }
        }
        if(s2leth == 0) return "0";
        char[] c = new char[s2leth];
        for(int i = 0 ; i < s2leth ; i++) {
            result += c2[i];
        }

        return result;
    }
    static int inclusion(String s1, String s2){
        char[] c1 = sort(getSet(s1));
        char[] c2 = sort(getSet(s2));
        int count = 0;
        if(s1.length() > s2.length()){
            for(int i = 0; i < s2.length(); i++){
                for(int j = 0 ; j< s1.length(); j++){
                    if(c2[i] == c1[j]) count ++;
                }
            }
            if(count == s2.length()) return 1;
            else return  0;
        }
        else{
            for(int i = 0; i < s1.length(); i++){
                for(int j = 0 ; j< s2.length(); j++){
                    if(c1[i] == c2[j]) count ++;
                }
            }
            if(count == s1.length()) return 2;
            else return  0;
        }
    }
    static boolean same(String s1, String s2){
        char[] c1 = sort(getSet(s1));
        char[] c2 = sort(getSet(s2));

        if(toString(c1).equals(toString(c2))) return true;
        else return false;
    }
    static char[] sort(char[] c){
    boolean swapped = true;
    int j = 1;
        while(true) {
        for(int i=0;i < c.length-j;i++) {
            if(c[i] > c[i+1]) {
                swap(i, i+1, c);
                swapped = true;
            }
        }
        if(!swapped) break;
        swapped = false;
        j++;
    }
        return c;
}
    static void swap(int i, int j, char[] data) {
        char		tmp;

        tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}