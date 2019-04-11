package DokuzTas;

/*Aynen kalacak*/
public class BasitDegerlendirmeFonksiyonu implements DegerlendirmeFonksiyonu {
    private Tahta tahta;

    public BasitDegerlendirmeFonksiyonu(Tahta tahta){
        this.tahta = tahta;
    }
    public double degerlendir() {
        switch (tahta.dorduAyniDizi()){
            case SARI:return 0;
            case MAVI:return 1;
            case BOS:return 0.5;
            default:return 0.5;
        }
    }
}
