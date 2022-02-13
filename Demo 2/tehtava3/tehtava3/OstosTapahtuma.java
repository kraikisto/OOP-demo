package tehtava3;

class OstosTapahtuma {
	private int asiakasId;
	private double summa;
	private int pankkikortinNro;
	
	public OstosTapahtuma(int asiakasId, double summa, int pankkikortinNro) {
		this.asiakasId = asiakasId;
		this.summa = summa;
		this.pankkikortinNro = pankkikortinNro;
	}

	public int getAsiakasId() {
		return asiakasId;
	}

	public void setAsiakasId(int asiakasId) {
		this.asiakasId = asiakasId;
	}

	public double getSumma() {
		return summa;
	}

	public void setSumma(double summa) {
		this.summa = summa;
	}

	public int getPankkikortinNro() {
		return pankkikortinNro;
	}

	public void setPankkikortinNro(int pankkikortinNro) {
		this.pankkikortinNro = pankkikortinNro;
	}
	
	//n‰m‰ tallennettaisiin sitten j‰rjestelm‰‰n jota ei t‰ss‰ teht‰v‰ss‰ ole luotu
}