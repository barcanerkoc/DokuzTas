package DokuzTas;

/*Oyuna göre değişecek*/
public class Hareket {
    private int sutun;
    private int yeniSutun;
	private int satir;
	private int yeniSatir;

    public Hareket(int sutun, int yeniSutun, int satir, int yeniSatir){
        this.sutun = sutun;
        this.yeniSutun = yeniSutun;
        this.satir = satir;
        this.yeniSatir = yeniSatir;
    }

    public int getirSutun(){
        return sutun;
    }
	
	public int getirYeniSutun(){
        return yeniSutun;
    }
	
	public int getirSatir(){
        return satir;
    }
	
	public int getirYeniSatir(){
        return yeniSatir;
    }
	
}
