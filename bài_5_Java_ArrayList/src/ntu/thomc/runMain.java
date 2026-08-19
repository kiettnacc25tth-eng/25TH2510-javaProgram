package ntu.thomc;
import java.util.ArrayList;
import java.util.Scanner;
public class runMain {

	public static void main(String[] args) {
		// khai báo biến danh sách,  chứa các số nguyên
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
		// a.Nhập 10 phần tử từ bàn phím
		Scanner banPhim = new Scanner(System.in);
	for (int i=0; i<10; i++) {
		// Nhập 1 phần tử
		// In ra một hướng dẫn cho người dùng
		System.out.print("Mời nhập phần tử thứ "+ i +": ");
		// cho User nhập, cất vào biến tạm
		Integer tam = banPhim.nextInt();
		// Thêm vào cuối danh sách
		dsSoNguyen.add(tam);
	}	
	//b. In ra danh sách vừa nhập
	System.out.print("DANH SÁCH VỪA NHẬP LÀ \n");
	for (int i=0; i<dsSoNguyen.size(); i++) {
		// Lấy giá trị Phần Tử ở vị trí i, cất vào biến tạm
		Integer tam = dsSoNguyen.get(i);
		System.out.print(tam + "");
	}
	//c. điếm số phần tử chẵn
	int soLuongPTchan=0;
	for (Integer x: dsSoNguyen) {
		if (x % 2 ==0) soLuongPTchan=soLuongPTchan+1;
	}
	System.out.println("Số phần tử chẵn là: " + soLuongPTchan);
	//d. Tính Tổng các phần tử: Thuật toán cộng dồn
	int TongAll=0;
	for (Integer x: dsSoNguyen) {
		TongAll = TongAll +x;
	}
	System.out.println("Tổng tất cả các phần tử là: " + TongAll);
	}

}
