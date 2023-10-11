package Interface;

public class Otomobil implements Arac{
		
		String Model,Marka,YakıtTürü;
		int Yas; 
		boolean ÜstüAcikMi;
		
		
		
		
		
	@Override
	public String Marka() {
		// TODO Auto-generated method stub
		return Marka;
	}

	@Override
	public String Model() {
		// TODO Auto-generated method stub
		return Model;
	}

	@Override
	public int Yas() {
		// TODO Auto-generated method stub
		return Yas;
	}

	@Override
	public String YakıtTürü() {
		// TODO Auto-generated method stub
		return YakıtTürü;
	}
	
	
	public boolean UstüAcikMi()
	{
		return ÜstüAcikMi ;
		
	}
	
	
	@Override
	public void OzellikleriGöster() {
		// TODO Auto-generated method stub
		System.err.println("--------------------------------------------------------------------------------");
		System.out.println("Marka: " + Marka+" | "+"Model: "+Model+" | "+"Yaş: "+Yas+" | "+
		"Yakıt Türü: "+YakıtTürü+" | "+"Üstü Açık Mı :"+(ÜstüAcikMi? "Evet":"Hayır"));
	}

	
	
	
	
	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getMarka() {
		return Marka;
	}

	public void setMarka(String marka) {
		Marka = marka;
	}

	public String getYakıtTürü() {
		return YakıtTürü;
	}

	public void setYakıtTürü(String yakıtTürü) {
		YakıtTürü = yakıtTürü;
	}

	public int getYas() {
		return Yas;
	}

	public void setYas(int yas) {
		Yas = yas;
	}
	
	public boolean isÜstüAcikMi() {
		return ÜstüAcikMi;
	}

	public void setÜstüAcikMi(boolean üstüAcikMi) {
		ÜstüAcikMi = üstüAcikMi;
	}

	

}
