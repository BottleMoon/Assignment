

public class Figures {

    public static void main(String[] args){
        Rectangle CreditCard = new Rectangle("신용카드");
        Circle Pizza = new Circle("피자");
        Triangle kimbob = new Triangle("삼각김밥");

        Star cookie = new Star("쿠키");

        CreditCard.setBrand("삼성");
        CreditCard.represent();

        Pizza.setBrand("피자헛");
        Pizza.represent();

        kimbob.setBrand("CU");
        kimbob.represent();

        cookie.setBrand("파리바게트");
        cookie.represent();

        //Circle pizza2 = (Circle)Pizza.clone();
        //pizza2.represent();
    }
}

interface colorAPI{
    public String Color();
    public default void fillColor(String n){
        System.out.println("This is New Method !!");
    }
}
interface lineAPI{
    public String Line();
}
interface sizeAPI{
    public String Size();
}
interface API extends colorAPI, lineAPI, sizeAPI{
    public void setBrand(String n);
}
abstract class Figure implements Cloneable {
    String name;
    String brand;

    public abstract void represent();
    
    public Object clone() {

        Object tmp = null;
        try {
            tmp = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return tmp;
    }
}

class Rectangle extends Figure implements API {
    public Rectangle(String n) {
        name = n;
    }

    public String Color() {
        return "파랑색";
    }

    public String Line() {
        return "점선";
    }

    public String Size() {
        return "작은";
    }

    public void fillColor(String n){
        System.out.println("This is New Rectangle Method !!");
    }
    
    public void setBrand(String n) {
        brand = n;
    }

    public void represent() {
        System.out.println(brand + " " + name + "은 " + Color() + " " + Line() + " "+ Size()+" 사각형이다");
    }
}

class Circle extends Figure implements API {
    public Circle(String n) {
        name = n;
    }

    public String Color() {
        return "빨강색";
    }

    public String Line() {
        return "이중선";
    }
    public String Size() {
        return "작은";
    }

    public void setBrand(String n) {
        brand = n;
    }

    public void represent() {
        System.out.println(brand + " " + name + "은 " + Color() + " " + Line() +" "+ Size()+ " 원이다");
    }
}
class Triangle extends Figure implements API{
    public Triangle(String n) {
        name = n;
    }

    public String Color() {
        return "초록색";
    }

    public String Line() {
        return "실선";
    }
    public String Size() {
        return "매우큰";
    }
    public void setBrand(String n) {
        brand = n;
    }

    public void represent() {
        System.out.println(brand + " " + name + "은 " + Color() + " " + Line() +" "+ Size()+ " 삼각형이다");
    }

}
class Star extends Figure implements API{
    public Star(String n) {
        name = n;
    }

    public String Color() {
        return "노랑색";
    }

    public String Line() {
        return "반투명선";
    }
    public String Size() {
        return "매우작은";
    }
    public void setBrand(String n) {
        brand = n;
    }

    public void represent() {
        System.out.println(brand + " " + name + "은 " + Color() + " " + Line() + " "+ Size()+" 별모양이다");
    }

}
//과제 2개의 Circle이나 사각형 등 을 더 추가하고, coler 등 을 하나 더 추가;