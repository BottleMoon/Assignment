public class Calculation {
    public static void main(String[] args){
        if(args.length != 3 && args.length != 5) error();
        else {
            if (args.length == 5) {
                if (!isInt(args[0]) || !isInt(args[2]) || !isInt(args[4]) || !signCheck(args[1]) || !signCheck(args[3]))
                    error();
            } else if (args.length == 3) {
                if (!isInt(args[0]) || !isInt(args[2]) || !signCheck(args[1])) error();
            }
        }
        Calcul c = new Calcul();


        if (args.length == 3){
            if(args[1].equals("/"))
                System.out.println(args[0] + args[1] + args[2] + " = " + c.priority(args));
            else
                System.out.println(args[0] + args[1] + args[2] + " = " + (int)c.priority(args));
        }
        else{
            if(args[1].equals("/")||args[3].equals("/"))
                System.out.println(args[0] + args[1] + args[2] + args[3] + args[4] + " = " + c.priority(args));
            else
                System.out.println(args[0] + args[1] + args[2] + args[3] + args[4] + " = " + (int)c.priority(args));
        }

    }

    public static boolean isInt(String s){  //String이 숫자형태인지 체크.
        try {
            Integer.parseInt(s);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    public static void error(){
        System.out.println("수식 오류");
        System.exit(1);
    }
    public static boolean signCheck(String s){
        if(s.equals("x")||s.equals("/")||s.equals("-")||s.equals("+")) return true;
        else return false;
    }

}

class Calcul{
    double priority(String[] s){
    double result= 0;
    if(s.length == 3) result = calculation(s[0], s[1], s[2]);
    else{
        if((s[1].equals("+") || s[1].equals("-"))&&(s[3].equals("x")||s[3].equals("/"))){
            result = calculation(s[0], s[1],Double.toString(calculation(s[2],s[3],s[4])));
        }
        else result = calculation(Double.toString(calculation(s[0],s[1],s[2])), s[3], s[4]);
    }

    return result;
    }

    double calculation(String s,String y,String z){
        if(y.equals("x")) return Double.parseDouble(s) * Double.parseDouble(z);
        else if(y.equals("+")) return Double.parseDouble(s) + Double.parseDouble(z);
        else if(y.equals("-")) return Double.parseDouble(s) - Double.parseDouble(z);
        else {
            if(Integer.parseInt(z) == 0){
                System.out.println("수식 오류");
                System.exit(1);
            }
            return Double.parseDouble(s) /Double.parseDouble(z);
        }
    }
}
