import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee[] emp = new Employee[100];
		int n;
		Scanner key = new Scanner(System.in);
		System.out.println("nhap so nhan vien");
		n=key.nextInt();
		for (int i=0;i<n;i++){
			emp[i] = new Employee();
			emp[i].Nhap();
			emp[i].In();	
		}
	}
}