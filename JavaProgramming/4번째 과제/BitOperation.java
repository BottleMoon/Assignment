public class BitOperation {
    public static void main(String[] args){
        if(!args[0].equalsIgnoreCase("ashift")&&!args[0].equalsIgnoreCase("lshift")&&!args[0].equalsIgnoreCase("and")&&!args[0].equalsIgnoreCase("or")&&!args[0].equalsIgnoreCase("xor")){
            System.out.println("operator error !!!");
            System.exit(1);
        }
        else if(args[0].equalsIgnoreCase("lshift")){
            if(!(args.length == 4) || !args[1].equalsIgnoreCase("r") || !isInt(args[2]) || !isInt(args[3])){
                System.out.println("operand missing !!!");
                System.exit(1);
            }
        }
        else if(args[0].equalsIgnoreCase("ashift")){
            if(!(args.length == 4) || (!args[1].equalsIgnoreCase("r")&&!args[1].equalsIgnoreCase("l")) || !isInt(args[2]) || !isInt(args[3] )){
                System.out.println("operand missing !!!");
                System.exit(1);
            }
        }
        else if(args[0].equalsIgnoreCase("and")||args[0].equalsIgnoreCase("or")||args[0].equalsIgnoreCase("xor")){
            if(!(args.length == 3) || !isInt(args[1]) || !isInt(args[2])){
                System.out.println("operand missing !!!");
                System.exit(1);
            }
        }//인자 에러.
        System.out.println(Byte.MAX_VALUE);
        classification(args);

    }
    static void classification(String[] s){
        if(s[0].equalsIgnoreCase("ashift")) {
            if (s[1].equalsIgnoreCase("R")) {
                if ((Long.parseLong(s[2]) <= Byte.MAX_VALUE)&&(Long.parseLong(s[2])>= Byte.MIN_VALUE)) {
                    System.out.println(change(s[2]) + ">>" + s[3] + "=>" + change(Integer.toString(Byte.parseByte(s[2]) >> Integer.parseInt(s[3])))  + "(" + (Byte.parseByte(s[2])>> Integer.parseInt(s[3])) + ")");
                } else if ((Long.parseLong(s[2]) <= Short.MAX_VALUE)&&(Long.parseLong(s[2])>= Short.MIN_VALUE)) {
                    System.out.println(change(s[2]) + ">>" + s[3] + "=>" + change(Integer.toString(Short.parseShort(s[2])  >> Integer.parseInt(s[3]))) + "(" + (Short.parseShort(s[2])  >> Integer.parseInt(s[3])) + ")");
                } else if((Long.parseLong(s[2]) <= Integer.MAX_VALUE)&&(Long.parseLong(s[2])>= Integer.MIN_VALUE)){
                    System.out.println(change(s[2]) + ">>" + s[3] + "=>" + change(Integer.toString(Integer.parseInt(s[2]) >> Integer.parseInt(s[3]))) + "(" + (Integer.parseInt(s[2]) >> Integer.parseInt(s[3])) + ")");
                } else{
                    System.out.println(change(s[2]) + ">>" + s[3] + "=>" + change(Long.toString(Long.parseLong(s[2]) >> Long.parseLong(s[3]))) + "(" + (Long.parseLong(s[2]) >>> Long.parseLong(s[3])) + ")");
                }
            } else {
                if ((Long.parseLong(s[2]) <= Byte.MAX_VALUE)&&(Long.parseLong(s[2])>= Byte.MIN_VALUE)) {
                    System.out.println(change(s[2]) + "<<" + s[3] + "=>" + change(Integer.toString(Byte.parseByte(s[2]) << Integer.parseInt(s[3])))  + "(" + (Byte.parseByte(s[2])<< Integer.parseInt(s[3])) + ")");
                } else if ((Long.parseLong(s[2]) <= Short.MAX_VALUE)&&(Long.parseLong(s[2])>= Short.MIN_VALUE)) {
                    System.out.println(change(s[2]) + "<<" + s[3] + "=>" + change(Integer.toString(Short.parseShort(s[2])  << Integer.parseInt(s[3]))) + "(" + (Short.parseShort(s[2])  << Integer.parseInt(s[3])) + ")");
                } else if((Long.parseLong(s[2]) <= Integer.MAX_VALUE)&&(Long.parseLong(s[2])>= Integer.MIN_VALUE)){
                    System.out.println(change(s[2]) + "<<" + s[3] + "=>" + change(Integer.toString(Integer.parseInt(s[2]) << Integer.parseInt(s[3]))) + "(" + (Integer.parseInt(s[2])<< Integer.parseInt(s[3])) + ")");
                } else{
                    System.out.println(change(s[2]) + "<<" + s[3] + "=>" + change(Long.toString(Long.parseLong(s[2]) << Long.parseLong(s[3]))) + "(" + (Long.parseLong(s[2]) << Long.parseLong(s[3])) + ")");
                }
            }
        }
        else if(s[0].equalsIgnoreCase("lshift")) {
            if ((Long.parseLong(s[2]) <= Byte.MAX_VALUE)&&(Long.parseLong(s[2])>= Byte.MIN_VALUE)) {
                System.out.println(change(s[2]) + ">>>" + s[3] + "=>" + change(Integer.toString((Byte.parseByte(s[2]) << 24) >>> Integer.parseInt(s[3]) >> 24)) + "(" + (((Byte.parseByte(s[2]) << 24) >>> Integer.parseInt(s[3])) >> 24) + ")");
            } else if((Long.parseLong(s[2]) <= Short.MAX_VALUE)&&(Long.parseLong(s[2])>= Short.MIN_VALUE)) {
                System.out.println(change(s[2]) + ">>>" + s[3] + "=>" + change(Integer.toString((Short.parseShort(s[2]) << 16) >>> Integer.parseInt(s[3]) >> 16)) + "(" + (((Short.parseShort(s[2]) << 16) >>> Integer.parseInt(s[3])) >> 16) + ")");
            } else if((Long.parseLong(s[2]) <= Integer.MAX_VALUE)&&(Long.parseLong(s[2])>= Integer.MIN_VALUE)){
                System.out.println(change(s[2]) + ">>>" + s[3] + "=>" + change(Integer.toString(Integer.parseInt(s[2]) >>> Integer.parseInt(s[3]))) + "(" + (Integer.parseInt(s[2]) >>> Integer.parseInt(s[3])) + ")");
            } else{
                System.out.println(change(s[2]) + ">>>" + s[3] + "=>" + change(Long.toString(Long.parseLong(s[2]) >>> Long.parseLong(s[3]))) + "(" + (Long.parseLong(s[2]) >>> Long.parseLong(s[3])) + ")");
            }
        }
        else if(s[0].equalsIgnoreCase("and")){
            if ((Long.parseLong(s[1]) <= Byte.MAX_VALUE)&&(Long.parseLong(s[1])>= Byte.MIN_VALUE)) {
                System.out.println(change(s[1]) + "&" + change(s[2]) + "=>" + change(Integer.toString(Byte.parseByte(s[1]) & Integer.parseInt(s[2])))  + "(" + (Byte.parseByte(s[1]) & Integer.parseInt(s[2])) + ")");
            } else if ((Long.parseLong(s[1]) <= Short.MAX_VALUE)&&(Long.parseLong(s[1])>= Short.MIN_VALUE)) {
                System.out.println(change(s[1]) + "&" + change(s[2]) + "=>" + change(Integer.toString(Short.parseShort(s[1])  & Integer.parseInt(s[2]))) + "(" + (Short.parseShort(s[1])  & Integer.parseInt(s[2])) + ")");
            } else if((Long.parseLong(s[1]) <= Integer.MAX_VALUE)&&(Long.parseLong(s[1])>= Integer.MIN_VALUE)){
                System.out.println(change(s[1]) + "&" + change(s[2]) + "=>" + change(Integer.toString(Integer.parseInt(s[1]) & Integer.parseInt(s[2]))) + "(" + (Integer.parseInt(s[1])&Integer.parseInt(s[2])) + ")");
            } else{
                System.out.println(change(s[1]) + "&" + change(s[2]) + "=>" + change(Long.toString(Long.parseLong(s[1]) & Long.parseLong(s[2]))) + "(" + (Long.parseLong(s[1]) & Long.parseLong(s[2])) + ")");
            }

        }
        else if(s[0].equalsIgnoreCase("or")) {
            if ((Long.parseLong(s[1]) <= Byte.MAX_VALUE)&&(Long.parseLong(s[1])>= Byte.MIN_VALUE)) {
            System.out.println(change(s[1]) + "|" + change(s[2]) + "=>" + change(Integer.toString(Byte.parseByte(s[1]) | Integer.parseInt(s[2])))  + "(" + (Byte.parseByte(s[1])|Integer.parseInt(s[2])) + ")");
        } else if ((Long.parseLong(s[1]) <= Short.MAX_VALUE)&&(Long.parseLong(s[1])>= Short.MIN_VALUE)) {
            System.out.println(change(s[1]) + "|" + change(s[2]) + "=>" + change(Integer.toString(Short.parseShort(s[1])  | Integer.parseInt(s[2]))) + "(" + (Short.parseShort(s[1])  | Integer.parseInt(s[2])) + ")");
        } else if((Long.parseLong(s[1]) <= Integer.MAX_VALUE)&&(Long.parseLong(s[1])>= Integer.MIN_VALUE)){
            System.out.println(change(s[1]) + "|" + change(s[2]) + "=>" + change(Integer.toString(Integer.parseInt(s[1]) | Integer.parseInt(s[2]))) + "(" + (Integer.parseInt(s[1])|Integer.parseInt(s[2])) + ")");
        } else{
            System.out.println(change(s[1]) + "|" + change(s[2]) + "=>" + change(Long.toString(Long.parseLong(s[1]) | Long.parseLong(s[2]))) + "(" + (Long.parseLong(s[1]) | Long.parseLong(s[2])) + ")");
        }

        }
        else if(s[0].equalsIgnoreCase("xor")) {
            if ((Long.parseLong(s[1]) <= Byte.MAX_VALUE)&&(Long.parseLong(s[1])>= Byte.MIN_VALUE)) {
                System.out.println(change(s[1]) + "+" + change(s[2]) + "=>" + change(Integer.toString(Byte.parseByte(s[1]) + Integer.parseInt(s[2])))  + "(" + (Byte.parseByte(s[1])+Integer.parseInt(s[2])) + ")");
            } else if ((Long.parseLong(s[1]) <= Short.MAX_VALUE)&&(Long.parseLong(s[1])>= Short.MIN_VALUE)) {
                System.out.println(change(s[1]) + "+" + change(s[2]) + "=>" + change(Integer.toString(Short.parseShort(s[1])  + Integer.parseInt(s[2]))) + "(" + (Short.parseShort(s[1])  + Integer.parseInt(s[2])) + ")");
            } else if((Long.parseLong(s[1]) <= Integer.MAX_VALUE)&&(Long.parseLong(s[1])>= Integer.MIN_VALUE)){
                System.out.println(change(s[1]) + "+" + change(s[2]) + "=>" + change(Integer.toString(Integer.parseInt(s[1]) + Integer.parseInt(s[2]))) + "(" + (Integer.parseInt(s[1])+Integer.parseInt(s[2])) + ")");
            } else{
                System.out.println(change(s[1]) + "+" + change(s[2]) + "=>" + change(Long.toString(Long.parseLong(s[1]) + Long.parseLong(s[2]))) + "(" + (Long.parseLong(s[1]) + Long.parseLong(s[2])) + ")");
            }

        }

    }


    static String change(String s){
        String result = "";
        int size =Byte.SIZE;
        if((Long.parseLong(s) <= Byte.MAX_VALUE)&&(Long.parseLong(s)>= Byte.MIN_VALUE)){
            size = Byte.SIZE;
            for (int i = 0; i < size ; i++){
                if( ((Byte.parseByte(s)>>size-i-1) & 1) ==1)
                    result += "1";
                else
                    result += "0";
            }
        }
        else if((Long.parseLong(s) <= Short.MAX_VALUE)&&(Long.parseLong(s)>= Short.MIN_VALUE)){
            size = Short.SIZE;
            for (int i = 0; i < size ; i++){
                if( ((Short.parseShort(s)>>size-i-1) & 1) ==1)
                    result += "1";
                else
                    result += "0";
            }
        }
        else if((Long.parseLong(s) <= Integer.MAX_VALUE)&&(Long.parseLong(s)>= Integer.MIN_VALUE)){
            size = Integer.SIZE;
            for (int i = 0; i < size ; i++){
                if( ((Integer.parseInt(s)>>size-i-1) & 1) ==1)
                    result += "1";
                else
                    result += "0";
            }
        }
        else{
            size = Long.SIZE;
            for (int i = 0; i < size ; i++){
                if( ((Long.parseLong(s)>>size-i-1) & 1) ==1)
                    result += "1";
                else
                    result += "0";
            }
        }
        return result;
    }

    static boolean isInt(String s) {  //String이 숫자형태인지 체크.
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}