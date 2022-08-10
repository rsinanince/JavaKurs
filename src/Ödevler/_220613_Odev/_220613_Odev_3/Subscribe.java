package Ödevler._220613_Odev._220613_Odev_3;

public class Subscribe {

    private String name;
    private boolean doYouWannaSubscribe;
    private String whichMember;

    public Subscribe(String name, boolean doYouWannaSubscribe, String whichMember) {
        setName(name);
        setDoYouWannaSubscribe(doYouWannaSubscribe);
        setWhichMember(whichMember);
    }

    public Subscribe() {
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public boolean isDoYouWannaSubscribe() {
        return doYouWannaSubscribe;
    }

    public void setDoYouWannaSubscribe(boolean doYouWannaSubscribe) {
        this.doYouWannaSubscribe = doYouWannaSubscribe;
        if (doYouWannaSubscribe==true)
            if (whichMember=="Gold") System.out.println("40usd");
            if (whichMember=="Silver") System.out.println("20usd");
            if (whichMember=="Bronze") System.out.println("10usd");
        else System.out.println("thxx");
    }

//
//
//


    public String getWhichMember() {  return whichMember;  }

    public void setWhichMember(String whichMember) {
        this.whichMember = whichMember;  }



    @Override
    public String toString() {
        return "Subscribe{" +
                "name='" + name + '\'' +
                ", doYouWannaSubscribe=" + doYouWannaSubscribe +
                ", whichMember='" + whichMember + '\'' +" "+ super.toString()+
                '}';
    }
}
