package Gun40.Ornek4;

public abstract class AdanaKebap implements Food{

    public AdanaKebap() {
    }

    private void marinade() {System.out.println("Et 1 gün marine edildi");}

    private void grill() {System.out.println("Köz ateşinde pişirildi");}

    @Override
    public String toString() {
        return "AdanaKebap{}";
    }
}
