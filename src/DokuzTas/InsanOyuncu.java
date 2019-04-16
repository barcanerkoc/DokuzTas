package DokuzTas;

import java.util.Scanner;

/*Oyuna göre değişecek*/
public class InsanOyuncu extends Oyuncu {

    public InsanOyuncu(String ad){
        super(ad, Renk.SARI, "YOU BEAT ME");
    }

    public int oyna(Tahta tahta){
        int sutun, satir;
        System.out.println("Kocum oyna bir sutun:");
        Scanner s = new Scanner(System.in);
		satir = s.nextInt();
        sutun = s.nextInt();
		
        while (checkValidity(satir, sutun) || tahta.sutunDoluMu(sutun)){
            System.out.println("Kocum yanlis oynadin. Bir daha oyna:");
            sutun = s.nextInt();
        }
        return sutun;
    }
	
	private boolean checkValidity(int satir, int sutun){
		
		if(satir < 0 || satir > 6 || sutun < 0 || sutun > 6){
			return false;
		}
		
		if(satir < 3){
			
			if(sutun == (0 + satir % 3) || sutun == 3 || sutun == (6 - satir % 3)){
				return true;
			}
			
		}else if(satir > 3){
			
			if(sutun == (6 - satir) || sutun == 3 || sutun == satir){
				return true;
			}
			
		}else{
			
			if(sutun != 3){
				return true;
			}
			
		}
		
		return false;
		
	}

}
