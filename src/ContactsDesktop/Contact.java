package ContactsDesktop;

/**
 * Created by Wesley on 2/14/17.

 */
public class Contact {
    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", this.name, this.phone, this.email);
    }

}
