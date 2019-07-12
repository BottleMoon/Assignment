import java.util.Scanner;
public class PeopleInfo{
	public static void main(String[] args) {
		Data s = new Data();
		Scanner in = new Scanner(System.in);
		System.out.println("다음 항목을 입력하여 주십시오");
		System.out.println("이름 : ");
		s.name = in.next();
		System.out.println("생년 : ");
		s.year = in.nextInt();
		System.out.println("주소");
		System.out.println("시 : ");
		s.addressSi = in.next();
		System.out.println("구 : ");
		s.addressGoo = in.next();
		System.out.println("동 : ");
		s.addressDong = in.next();
		System.out.println("대학교 : ");
		s.universityName = in.next();
		System.out.println("학과 : ");
		s.departmentName = in.next();
		System.out.println("입학년도 : ");
		s.admissionYear = in.nextInt();
		
		System.out.println(s.name + "(만," + (2019-s.year) + "세) 학생은 "+ s.universityName +" "+s.departmentName+"에 "+ (2019-s.admissionYear+1)+"학년으로 재학중이다. \""+ s.addressSi +" "+ s.addressGoo +" "+ s.addressDong+"\"에 거주중이다.");
	}
}

class Data{
	String name;
	int year;
	String addressSi;
	String addressGoo;
	String addressDong;
	String universityName;
	String departmentName;
	int admissionYear;
}