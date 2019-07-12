import java.io.*;
import java.util.*;

public class University2{

    public static void main(String[] args) throws IOException {
        final String s = args[2];
        if(args.length >3) {
            System.out.println("Argument Error !!");
            System.exit(1);
        }

        Scanner in = new Scanner(new File(args[0]));
        in.useDelimiter("\\|");
        Vector<Person> vf = new Vector<>();

        while(in.hasNextLine()) {
            String ca,no,name,birth,phone,address;
            Person p;
            ca = in.next();
            no = in.next();
            name = in.next();
            birth = in.next();
            phone = in.next();
            address = in.next();
            in.nextLine();
            p = new Person();
            switch (ca){
                case "학부" : p = new Under();break;
                case "석사" : p = new MS();break;
                case "박사" : p = new PhD();break;
                case "조교" : p = new Assistant();break;
                case "교수" : p = new Professor();break;
            }
            p.setPerson(ca,no,name,birth,phone,address);
            vf.add(p);
        }
        in.close();
        Person[] p=vf.toArray(new Person[1]);
        if(args[1].equals("print")) {
            if (args[2].equals("all")) {
                for (Person i : p) {
                    System.out.println(i);
                }
            } else if (args[2].equals("student")) {
                for (Person i : p) {
                    if (i instanceof Student) {
                        System.out.println(i);
                    }
                }
            } else if (args[2].equals("staff")) {
                for (Person i : p) {
                    if (i instanceof Employee) {
                        System.out.println(i);
                    }
                }
            } else {
                for (Person i : p) {
                    if (i.sSNo.equals(args[1])) {
                        System.out.println(i);
                    }
                }
            }
        }
        if(args[1].equals("sort")) {
            Sort sort = new Sort();
            if (args[2].equals("ssno")) {
                sort.sortBySSNo(p);
            } else if (args[2].equals("name")) {
                sort.sortByName(p);
            } else if (args[2].equals("birthdate")) {
                sort.sortByBirthdate(p);
            } else if (args[2].equals("address")) {
                sort.sortByAddress(p);
            }
            for(Person i : p){
                System.out.println(i);
            }
        }


      /*for (int i=0;i<p.length;i++)
         System.out.println(p[i].getInfo(comm));*/
    }
}
class Person implements Comparable<Person>{
    String cate,sSNo,name,birth,phone,address;

    void setPerson(String cate,String sSNo,String name,String birth,String phone,String address){
        this.cate=cate;
        this.sSNo=sSNo;
        this.name=name;
        this.birth=birth;
        this.phone=phone;
        this.address=address;
    }

    public String toString() {
        return (String.format("[%s][%s][%s][%s][%s][%s]",cate,sSNo,name,birth,phone,address));
    }

    String getInfo(String c) {
        String tmp ="";

        switch(c) {
            case "name": tmp = name; break;
            case "address": tmp = address; break;
        }
        return (tmp);
    }

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.name);
    }
    public int compareToAddress(Person person){
        return address.compareTo(person.address);
    }
}
class Student extends Person{
    String admissionYear;
    String department;
    Student(){
        Rand r =new Rand();
        switch (r.rand(0,4)){
            case 0 : department = "컴퓨터공학"; break;
            case 1 : department = "소프트웨어공학"; break;
            case 2 : department = "메카트로닉공학"; break;
            case 3 : department = "정보통신공학"; break;
            case 4 : department = "건축공학"; break;
        }
    }


    void setPerson(String cate, String sSNo, String name, String birth, String phone, String address) {
        super.setPerson(cate, sSNo, name, birth, phone, address);
        this.admissionYear = String.format("20%s",-81+(Integer.parseInt(sSNo.split("-")[0])/10000));
    }

    public String toString(){
        return super.toString()+(String.format("[%s년 입학][%s]",admissionYear,department));
    }
}
class Under extends Student {
    String grade;
    String club;

    Under() {
        Rand r = new Rand();

        grade = String.format("%d학년", r.rand(1,4));
        switch (r.rand(0, 4)) {
            case 0:
                club = "";
                break;
            case 1:
                club = "[기타동아리]";
                break;
            case 2:
                club = "[농구동아리]";
                break;
            case 3:
                club = "[축구동아리]";
                break;
            case 4:
                club = "[투자동아리]";
                break;
        }
    }

    public String toString() {
        return super.toString() + (String.format("[%s]%s", grade, club));
    }
}
class Graduate extends Student{
    String researchFild;
    Graduate() {
        Rand r = new Rand();
        switch (r.rand(0,9)) {
            case 0:
                researchFild = "네트워크";
                break;
            case 1:
                researchFild = "정보보안";
                break;
            case 2:
                researchFild = "컴퓨터구조";
                break;
            case 3:
                researchFild = "데이터베이스";
                break;
            case 4:
                researchFild = "인공지능";
                break;
            case 5:
                researchFild = "알고리즘";
                break;
            case 6:
                researchFild = "어셈블리";
                break;
            case 7:
                researchFild = "자료구조";
                break;
            case 8:
                researchFild = "파일처리";
                break;
            case 9:
                researchFild = "객체지향";
                break;
        }
    }
    public String toString() {
        return super.toString()+(String.format("[%s]",researchFild));
    }
}
class MS extends Graduate{
    String semester;
    MS(){
        Rand r = new Rand();
        semester = String.format("%s학기",r.rand(1,4));
    }
    public String toString() {
        return super.toString()+(String.format("[%s]",semester));
    }
}
class PhD extends  Graduate {
    String year;

    PhD() {
        Rand r = new Rand();
        year = String.format("%s년차", r.rand(1,6));

    }

    public String toString() {
        return super.toString() + (String.format("[%s]", year));
    }
}
class Employee extends Person{
    String department;
    Employee(){
        Rand r =new Rand();
        switch (r.rand(0,4)){
            case 0 : department = "컴퓨터공학"; break;
            case 1 : department = "소프트웨어공학"; break;
            case 2 : department = "메카트로닉공학"; break;
            case 3 : department = "정보통신공학"; break;
            case 4 : department = "건축공학"; break;
        }
    }
    public String toString() {
        return super.toString()+(String.format("[%s]",department));
    }


}
class Assistant extends Employee{
    String type;
    Assistant(){
        Rand r =new Rand();
        switch (r.rand(0,2)){
            case 0 : type = "전임";break;
            case 1 : type = "근로"; break;
            case 2 : type = "시간제"; break;
        }
    }
    public String toString() {
        return super.toString()+(String.format("[%s]",type));
    }
}
class Professor extends Employee{
    String fild;
    String labLocation;
    Professor() {
        Rand r = new Rand();
        switch (r.rand(0,9)) {
            case 0:
                fild = "네트워크";
                break;
            case 1:
                fild = "정보보안";
                break;
            case 2:
                fild = "컴퓨터구조";
                break;
            case 3:
                fild = "데이터베이스";
                break;
            case 4:
                fild = "인공지능";
                break;
            case 5:
                fild = "알고리즘";
                break;
            case 6:
                fild = "어셈블리";
                break;
            case 7:
                fild = "자료구조";
                break;
            case 8:
                fild = "파일처리";
                break;
            case 9:
                fild = "객체지향";
                break;
        }
        labLocation = String.format("%s호관%s호",r.rand(1,30), r.rand(101,999));
    }
    public String toString(){
        return super.toString()+(String.format("[%s][%s]",fild,labLocation));
    }
}
class Sort{
    void sortByName(Person[]person){
        Arrays.sort(person);
    }
    void sortBySSNo(Person[]person) {
        boolean swapped = true;
        while (swapped) {
            int j = 1;
            swapped =false;
            for (int i = 0; i < person.length-j; i++) {
                if (Long.parseLong(person[i].sSNo.replaceAll("-", "")) > Long.parseLong(person[i+1].sSNo.replaceAll("-", ""))) {
                    swap(person,i);
                    swapped = true;
                }
            }
            j++;
        }
    }
    void sortByBirthdate(Person[]person) {
        boolean swapped = true;
        while (swapped) {
            int j = 1;
            swapped = false;
            for (int i = 0; i < person.length - j; i++) {
                if (Integer.parseInt(person[i].birth.replaceAll("-", "")) > Integer.parseInt(person[i + 1].birth.replaceAll("-", ""))) {
                    swap(person, i);
                    swapped = true;
                }
            }
            j++;
        }
    }
    void sortByAddress(Person[] person){
        Arrays.sort(person,Person::compareToAddress);

    }
    void swap(Person[] person, int i) {
        Person tmp = person[i];
        person[i] = person[i+1];
        person [i+1] = tmp;
    }
}
class Rand {
    public int rand(int min, int max) {
        return (int) (Math.random() * 100 % (max - min) + min);
    }
}
