

public class kendaraan{
	String mobil;
	String motor;
	void info (String mobil){
		this.mobil=mobil;
	}
	String motor(String mtr){
		this.motor=mtr;
	return mtr;
	}
	
	public static void main(String[] args){
		kendaraan obj = new kendaraan();
		System.out.println("Nama Mobil : "+(obj.mobil="Toyota Camry"));
		System.out.println("Nama Motor : "+(obj.motor="Scoopy"));
	}
}