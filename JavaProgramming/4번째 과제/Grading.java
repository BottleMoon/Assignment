import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Grading {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = 0;

        List<Student> students = new ArrayList<Student>();
        Student s;
        System.out.println("학번\t이름\t국어\t영어\t수학\t평균");
        double best= 0,worst = 100, hanavg= 0, engavg= 0,mathavg= 0;

        while(in.hasNext()){
            s = new Student();
            s.number = in.next();
            s.name = in.next();
            s.han = in.nextInt();
            s.eng = in.nextInt();
            s.math = in.nextInt();
            s.avg();
            System.out.println(s.toString());
            mathavg += s.math;
            hanavg += s.han;
            engavg += s.eng;
            if(s.avg > best) best = s.avg;
            if(s.avg < worst) worst = s.avg;
            students.add(s);
            count ++;
        }

        hanavg /=count;
        engavg/=count;
        mathavg/=count;

        System.out.println("과목 평균\t" + hanavg+"\t"+engavg+"\t"+mathavg);
        System.out.print("최고 평균 : ");
        for(Student i : students){
            if(i.avg == best) System.out.print(i.number+"("+i.name+") ");
        }

        System.out.print("\n최저 평균 : ");
        for(Student i : students){
            if(i.avg == worst) System.out.print(i.number+"("+i.name+") ");
        }
    }
}

class Student{
    String number;
    String name;
    int han;
    int eng;
    int math;
    double avg;

    void avg(){
        this.avg = (double)(this.han+this.eng+this.math)/3; // 주의
    }
    public String toString()
    {
        return number+"\t"+name+"\t"+han+"\t"+eng+"\t"+math+"\t"+avg;
    }
}