
import java.util.Scanner;
public class TongHaiSo {

	public static void main(String[] args) {
		// Khai báo
		double num1, num2, sum;
		// Khai báo đổi tượng Scanner
		Scanner banPhim = new Scanner(System.in);
		// in ra thông tin, mới User nhập số thứu nhất
		System.out.print("Mời nhập số thứ nhất: ");
		num1= banPhim.nextDouble();
		System.out.print("Mời nhập số thứ hai: ");
		num2= banPhim.nextDouble();
		// Tính toán
		sum = num1+num2;
		// Xuất ra
		System.out.print("Tổng của ");
		System.out.print(num1);
		System.out.print(" + ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.print(sum);
		
	}

}
