package Gun30.Soru1;

public class Hesap {

    private int yatan;
    private int cekilen;
    private int bakiye;

    public void paraYatir(int gelenPara){
        this.bakiye=bakiye+gelenPara;       //this.bakiye+=gelenPara   bu şekilde kısa yazılabilir
        this.yatan=this.yatan+gelenPara;    //this.bakiye+=gelenPara
    }

    public void paraCek(int cekilenPara){
        this.bakiye=bakiye-cekilenPara;      //this.bakiye-=cekilenPara
        this.yatan=this.cekilen+cekilenPara; //this.bakiye+=cekilenPara
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + yatan +
                ", cekilen=" + cekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}
