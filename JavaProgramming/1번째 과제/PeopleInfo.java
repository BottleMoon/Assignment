import java.util.Scanner;
public class PeopleInfo{
	public static void main(String[] args) {
		Data s = new Data();
		Scanner in = new Scanner(System.in);
		System.out.println("���� �׸��� �Է��Ͽ� �ֽʽÿ�");
		System.out.println("�̸� : ");
		s.name = in.next();
		System.out.println("���� : ");
		s.year = in.nextInt();
		System.out.println("�ּ�");
		System.out.println("�� : ");
		s.addressSi = in.next();
		System.out.println("�� : ");
		s.addressGoo = in.next();
		System.out.println("�� : ");
		s.addressDong = in.next();
		System.out.println("���б� : ");
		s.universityName = in.next();
		System.out.println("�а� : ");
		s.departmentName = in.next();
		System.out.println("���г⵵ : ");
		s.admissionYear = in.nextInt();
		
		System.out.println(s.name + "(��," + (2019-s.year) + "��) �л��� "+ s.universityName +" "+s.departmentName+"�� "+ (2019-s.admissionYear+1)+"�г����� �������̴�. \""+ s.addressSi +" "+ s.addressGoo +" "+ s.addressDong+"\"�� �������̴�.");
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