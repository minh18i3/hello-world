import java.util.Scanner;

public class Employee {
	String MaNV;
	float hesoluong;
	float ngaycong;
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String MaNV) {
		this.MaNV = MaNV;
	}
	public float getHesoluong() {
		return hesoluong;
	}
	public void setHesoluong(float hesoluong) {
		this.hesoluong = hesoluong;
	}
	public float getNgaycong() {
		return ngaycong;
	}
	public void setNgaycong(float ngaycong) {
		this.ngaycong = ngaycong;
	}
	public void Nhap() {
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap MaNV");
		this.MaNV = key.nextLine();
		System.out.println("Nhap he so luong");
		this.hesoluong = Float.parseFloat(key.nextLine());
		System.out.println("Nhap ngay cong");
		this.ngaycong = Float.parseFloat(key.nextLine());		
	}
	public float TinhLuong() {
		float luong;
		if(this.ngaycong>26) luong = this.hesoluong*1500000;
		else luong = this.hesoluong*1400000;
		return luong;
	}
	public void In() {
		System.out.println(this.getMaNV()+" "+"co luong la" + " "+ this.TinhLuong());
	}
}