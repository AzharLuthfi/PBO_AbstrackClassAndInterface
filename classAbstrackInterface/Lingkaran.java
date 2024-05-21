package classAbstrackInterface;

public class Lingkaran extends Bentuk{
	public Lingkaran(int jari2) {
		super(jari2);
	}
	
	

	@Override
	public double luas() {
		// TODO Auto-generated method stub
		return PHI*jari2*jari2;
	}
}
