package basic_oop.poliphormisom;

public class Lockscreen {
    private String password;
    private Integer pin;

    public Lockscreen(String password, Integer pin) {
        this.password = password;
        this.pin = pin;
    }

    public Lockscreen(String password) {
        this.password = password;
    }

    public Lockscreen(Integer pin) {
        this.pin = pin;
    }

    public void unlock(String providedPassword) {
        if (providedPassword == password) {
            System.out.println("Phone Unlocked with password.");
        } else System.out.println("Wrong password");
    }

    public void unlock(Integer pin) {
        if (this.pin == pin) {
            System.out.println("Phone Unlocked with pin.");
        } else System.out.println("Wrong password");
    }


}
