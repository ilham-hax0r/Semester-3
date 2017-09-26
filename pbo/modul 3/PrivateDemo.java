/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
 /*
 * Sama package dan tidak bisa di akses dari kelas lain
 */
package newpackage;
public class PrivateDemo {
    public static void main(String[] args){
        PrivateModifier private1 = new PrivateModifier();
        
        private1.printInfo();
    }
}
