package Gun39.Ornek1;

public abstract class BinekOto {

    private String marka;
    private int uretimYili;
    private int vitesSayisi;

    // implement edilmek zorunda (abstarct yazmak zorundayız. interface de mecbur değiliz)
    public abstract String getMarka();

    //ister override yapılabilir,
    //istenirse yapılmayabilir. //bunlarda abstract yazmak şart değil yani.
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesSayisi() {
        return vitesSayisi;
    }

    public void setVitesSayisi(int vitesSayisi) {
        this.vitesSayisi = vitesSayisi;
    }
}
