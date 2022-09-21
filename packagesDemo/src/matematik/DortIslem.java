package matematik;

public class DortIslem {
    private int islemTipi;
    private int sayi1;
    private int sayi2;

    public DortIslem(int _islemTipi,int _sayi1,int _sayi2){
        islemTipi = _islemTipi;
        sayi1 = _sayi1;
        sayi2 = _sayi2;
    }

    public int islemYap(){
        if(islemTipi == 1)
            return topla();
        if(islemTipi == 2)
            return carp();
        return 0;
    }

    private int topla(){
        return sayi1+sayi2;
    }

    private int carp(){
        return sayi1*sayi2;
    }
}
