/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
 /*
 * Sama package dan hanya bisa di akses dari dalam kelas itu sendiri
 */
package newpackage;
public class PrivateModifier {
    private String nama;
    private int umur;
    private void printInfo(){
        System.out.println("private modifier");
    }
    public static void main(String[] args) {
        PrivateModifier priv = new PrivateModifier();
        priv.printInfo();
    }
}
