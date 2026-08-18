
public class ChuNhat {
	// khai báo các thuộc tính / dữ liệu của lớp / trường thông tin
	private double dai;
	private double rong;
	//------- Hàm tạo (Constructor)
	public ChuNhat() {
		dai= 10;
		rong =5;
	}
	public ChuNhat(double dai, double rong ) {
		this.dai = dai;
		this.rong =rong;
	}
	//------ các getter
	double getDai() {return dai;}
	double getRong() {return rong;}
	//------ các setter
	void setDai (double dai) {this.dai= dai;}
	void setRong (double rong) {this.dai= rong;}
	//public String toString() {
		// Tóm tắt thông tin của đối tượng
		// thánh một chuỗi, để in ra màn hình
		//string s="Hình này, có chiều dài =";
		//s=s+dai;
		//s= s + "và chiều rộng =" + rong;
		//s ="Hình này, có chiều rộng =" + dai +" và chiều rộng" +rong;
		//return s;
	//} 
}
