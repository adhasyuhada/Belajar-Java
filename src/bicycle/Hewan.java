class Hewan {
	String jalan;
	String lari;
	String makan;
	String tidur;

	public String berjalan(String jalan){
		this.jalan = jalan;
		return jalan;
	}

	public String berlari(String lari){
		this.lari = lari;
		return lari;
	}

	public String memakan(String makan){
		this.makan = makan;
		return makan;
	}

	public String caratidur(String tidur){
		this.tidur = tidur;
		return tidur;
	}

	void cetakHewan(){
		System.out.println("berjalan : " + jalan + " berlari : " + lari + "cara makan : " + makan
			+ "cara tidur : "+ tidur);
	}
}