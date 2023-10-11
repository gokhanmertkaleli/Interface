package Interface;

public class Otobüs implements Arac{
		
		String Model,Marka,YakıtTürü;
		boolean HizSinirlayici;
		int Yas; 
		
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
	
	public boolean HizSinirlayici()
	{
		return HizSinirlayici;
		
	}
	
	
	
	
	public boolean isHizSinirlayici() {
		return HizSinirlayici;
	}

	public void setHizSinirlayici(boolean hizSinirlayici) {
		HizSinirlayici = hizSinirlayici;
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

	@Override
	public void OzellikleriGöster() {
		System.err.println("--------------------------------------------------------------------------------");
		System.out.println("Marka: " + Marka+" | "+"Model: "+Model+" | "+"Yaş: "+Yas+" | "+
				"Yakıt Türü: "+YakıtTürü+" | "+"Hız Sınırlayıcı Var Mı :"+(HizSinirlayici? "Evet":"Hayır"));
		System.err.println("--------------------------------------------------------------------------------");
	}
	
	
}
