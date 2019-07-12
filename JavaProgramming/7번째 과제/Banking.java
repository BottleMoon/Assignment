import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class Banking {

    public static void main(String[] args) throws IOException {
        Customer[] tmp = new Customer[1000], cust;
        Account[] tmpa = new Account[2000], account;
        File f = new File(args[1]);
        File a_f = new File(args[0]);
        Scanner in = new Scanner(a_f);
        String str;
        int i = 0;
        String[] acc;

        while (in.hasNext()) {
            tmpa[i++] = new Account(in.next(), in.next(), in.next(), in.nextLong(), null);
        }
        in.close();
        account = Arrays.copyOf(tmpa, i);
        tmpa = null;

        i = 0;
        in = new Scanner(f);
        while (in.hasNextLine()) {
            tmp[i] = new Customer(in.next(), in.next(), in.next().charAt(0), in.next(), in.next());
            str = in.nextLine();
            acc = str.trim().split("\\s+");
            tmp[i].accounts = acc;
            tmp[i].setOwner(account, tmp[i].accounts[0]);

            i++;
        }
        in.close();
        cust = Arrays.copyOf(tmp, i);
        tmp = null;

        /*for (int j = 0; j < cust.length; j++)
            System.out.println(cust[j]);

        System.out.println("\n--------------------\n");


        for (int j = 0; j < account.length; j++)
            System.out.println(account[j]);*/           //출력
        String dummy = "";
        String[] s;

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            BufferedReader a_br = new BufferedReader(new InputStreamReader(new FileInputStream(a_f)));
            String line;


            if (args[2].equals("customer")) {
                if (args[3].equals("0")) {
                    for (int j = 0; j < cust.length; j++)
                        System.out.println(cust[j]);
                } else {
                    for (int j = 0; j < cust.length; j++) {
                        if (cust[j].ssNo.equals(args[3])) System.out.println(cust[j]);
                    }
                }
            }
            else if (args[2].equals("change_address")) {
                while(true) {
                    line = br.readLine();
                    if(line.contains(args[3])){
                        s = line.split("\\s+");
                        dummy += s[0]+" "+s[1]+" "+s[2]+" "+s[3]+" "+args[4];
                        for(int j = 5; j < s.length ; j ++){
                            dummy += " "+s[j];
                        }
                        dummy +="\r\n";
                        break;
                    }
                    dummy += (line + "\r\n");
                }
                while((line = br.readLine())!=null) {
                    dummy += (line + "\r\n" );
                }
                FileWriter fw = new FileWriter(args[1]);
                fw.write(dummy);
                //bw.close();
                fw.close();
                br.close();
                System.out.println("주민등록번호가 "+args[3]+"인 고객의 주소를 "+args[4]+"로 변경");

            }
            else if (args[2].equals("change_phoneno")) {
                while(true) {
                    line = br.readLine();
                    if(line.contains(args[3])){
                        System.out.println(line+"0000000000000000");
                        s = line.split("\\s+");
                        dummy += s[0]+" "+s[1]+" "+s[2]+" "+args[4];
                        for(int j = 4; j < s.length ; j ++){
                            dummy += " "+s[j];
                        }
                        dummy +="\r\n";
                        break;
                    }
                    dummy += (line + "\r\n");
                }
                while((line = br.readLine())!=null) {
                    dummy += (line + "\r\n" );
                }
                FileWriter fw = new FileWriter(args[1]);
                fw.write(dummy);
                //bw.close();
                fw.close();
                br.close();
                System.out.println("주민등록번호가 "+args[3]+"인 고객의 전화번호를 "+args[4]+"로 변경");
            }
            else if (args[2].equals("account")) {
                if (args[3].equals("0")) {
                    for (int j = 0; j < account.length; j++) System.out.println(account[j]);
                } else {
                    for (int j = 0; j < account.length; j++) {
                        if (account[j].no.equals(args[3])) System.out.println(account[j]);

                    }
                }
            }
            else if (args[2].equals("transfer")) {
                for (int j = 0; j < account.length; j++) {
                    if (account[j].no.equals(args[3])) {
                        if (account[j].balance < Long.parseLong(args[5])) {
                            System.out.println("잔액 부족");
                            System.exit(1);
                        }
                    }
                }
                while (true) {
                    line = a_br.readLine();
                    if (line.contains(args[3])) {
                        s = line.split("\\s+");
                        dummy += s[0] + " " + s[1] + " " + s[2] + " " + (Long.parseLong(s[3]) - Long.parseLong(args[5])) + "\r\n";
                        break;
                    }
                    dummy += (line + "\r\n");
                }
                while ((line = a_br.readLine()) != null) {
                    dummy += (line + "\r\n");
                }
                FileWriter fw = new FileWriter(args[0]);
                fw.write(dummy);
                //bw.close();
                fw.close();
                a_br.close();

                a_br = new BufferedReader(new InputStreamReader(new FileInputStream(a_f)));
                dummy = "";
                while (true) {
                    line = a_br.readLine();
                    if (line.contains(args[4])) {
                        s = line.split("\\s+");
                        dummy += s[0] + " " + s[1] + " " + s[2] + " " + (Long.parseLong(s[3]) + Long.parseLong(args[5])) + "\r\n";
                        break;
                    }
                    dummy += (line + "\r\n");
                }
                while ((line = a_br.readLine()) != null) {
                    dummy += (line + "\r\n");
                }
                fw = new FileWriter(args[0]);
                fw.write(dummy);
                //bw.close();
                fw.close();
                a_br.close();

                System.out.println("통장 " + args[3] + "의 잔액에서" + args[5] + "만큼을 통장" + args[4] + "으로 이체");
            }
            else if (args[2].equals("withdraw")) {
                for (int j = 0; j < account.length; j++) {
                    if (account[j].no.equals(args[2])) {
                        if (account[j].balance < Long.parseLong(args[4])) {
                            System.out.println("잔액 부족");
                            System.exit(1);
                        }
                    }
                }
                while (true) {
                    line = a_br.readLine();
                    if (line.contains(args[3])) {
                        s = line.split("\\s+");
                        dummy += s[0] + " " + s[1] + " " + s[2] + " " + (Long.parseLong(s[3])-Long.parseLong(args[4])) + "\r\n";
                        break;
                    }
                    dummy += (line + "\r\n");
                }
                while ((line = a_br.readLine()) != null) {
                    dummy += (line + "\r\n");
                }
                FileWriter fw = new FileWriter(args[0]);
                fw.write(dummy);
                //bw.close();
                fw.close();
                a_br.close();
                System.out.println("통장 " + args[2] + "에 " + args[4] + "만큼 출금");


            }
            else if (args[2].equals("deposit")) {
                while (true) {
                    line = a_br.readLine();
                    if (line.contains(args[3])) {
                        s = line.split("\\s+");
                        dummy += s[0] + " " + s[1] + " " + s[2] + " " + (Long.parseLong(s[3])+Long.parseLong(args[4])) + "\r\n";
                        break;
                    }
                    dummy += (line + "\r\n");
                }
                while ((line = a_br.readLine()) != null) {
                    dummy += (line + "\r\n");
                }
                FileWriter fw = new FileWriter(args[0]);
                fw.write(dummy);
                //bw.close();
                fw.close();
                a_br.close();
                System.out.println("통장 " + args[2] + "에 " + args[4] + "만큼 입금");

            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}