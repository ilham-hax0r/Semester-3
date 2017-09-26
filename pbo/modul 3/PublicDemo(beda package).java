/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
 /*
 * Beda package, package dalam soal praktikum.pbo.package1
 * Bisa di akses walaupun beda package karena public itu bebas di akses
 */
package praktikum.pbo.package1;
import newpackage.PublicModifier;
public class PublicDemo {
    public static void main(String[] args){
        PublicModifier public1 = new PublicModifier();
        
        public1.kali();
    }
}
