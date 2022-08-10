package Gun36.Protected.Paket1;

public class P1Hayvan {

    public String Ad;    //her package dan ulaşılabilir
    int yas;     //default sadece kendi package ından ulaşılabilir
    protected String cinsi;   //default ile aynı,
                              // ama ek olarak extend yöntemi ile
                              // başka paketlerden de ulaşılabilir.
    private String renk;   //sadece kendi class ından ulaşılabilir.


}
