package Ödevler._220610_Odev;

public class User {

    private int id;
    private String username;
    private String passwword;
    boolean active;
    boolean signedIn;

    public enum userRole{
        ADMIN, OGRENCI, CALISAN, HOCA
    }


    public User(int id, String username, String passwword, boolean active, boolean signedIn) {
        setId(id);
        setUsername(username);
        setPasswword(passwword);
        setActive(active);
        setSignedIn(signedIn);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswword() {
        return passwword;
    }

    public void setPasswword(String passwword) {
        this.passwword = passwword;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwword='" + passwword + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}
