public class Set {
    public static void main(String[] args){

        if(!args[0].equals("union")&&!args[0].equals("intersect")&&!args[0].equals("minus")&&!args[0].equals("inclusion")&&!args[0].equals("same")){
            System.out.println("Unknown Operation !!!");
            System.exit(1);
        }
        if(args.length != 3){
            System.out.println("Missing Operand !!!");
            System.exit(1);
        }
        SetOperation sO = new SetOperation();
        String s1 = overlepDelet(args[1]), s2 = overlepDelet(args[2]),result = "";
        char[] c1 = SetOperation.getSet(s1), c2 = SetOperation.getSet(s2);
        switch(args[0]){
                case "union":
                    result = SetOperation.union(s1,s2);
                    System.out.println(s1 +" UNION " + s2 + " = "+ result);
                    break;
                case "intersect":
                    result = SetOperation.intersect(s1,s2);
                    System.out.println(s1 +" INTERSECT " + s2 + " = "+ result);
                    break;
                case "minus" :
                    result = SetOperation.minus(s1,s2);
                    System.out.println(s1 +" MINUS " + s2 + " = "+ result);
                    break;
                case "inclusion" :
                    int x = 0;
                    x = SetOperation.inclusion(s1,s2);
                    if(x == 1) System.out.println(s1 + " >= " + s2);
                    else if(x == 2 ) System.out.println(s1 + " <= " + s2);
                    else System.out.println(s1 + " < > " + s2);
                    break;
                case "same" :
                    if(SetOperation.same(args[1],args[2])){
                        System.out.println(args[1] + " == " + args[2]);
                    }
                    else System.out.println(args[1] + " != " + args[2]);
                    break;
            }


    }
 /*   static String union(String s1, String s2){
        String result = "";
        return result;
    }
    static String intersect(String s1, String s2){
        String result = "";
        return result;
    }
    static String minus(String s1, String s2){
        String result = "";
        return result;
    }
    static String inclusion(String s1, String s2){
        String result = "";
        return result;
    }
    static String same(String s1, String s2){
        String result = "";
        return result;
        }*/
    static String overlepDelet(String s){
        String result = "";
        for(int i = 0; i<s.length(); i++ ) {
            if (!result.contains(String.valueOf(s.charAt(i)))){
                  result += String.valueOf(s.charAt(i));
             }
        }
             return result;
    }
}
