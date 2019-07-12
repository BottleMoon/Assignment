public class DrawX {
    public static void main(String[] args){
        if(args.length != 1) {
            System.out.println("인자 개수가 1개가 아닙니다.");
            System.exit(1);
        }else if (!isInt(args[0])){
            System.out.println("인자가 정수 형태가 아닙니다.");
            System.exit(1);
        }

        int size = Integer.parseInt(args[0]);
        for(int i =0; i<size ; i++){
            for(int y = 0; y<size ; y ++){
                if (y == i || size-y-1 == i) System.out.print("o");
                else System.out.print("*");
            }
            System.out.println("");
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
}
