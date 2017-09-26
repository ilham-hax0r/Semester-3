/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
 /*
 * Sama package dan bisa di akses, extends untuk menyatakan ProtectedDemo adalah turunan dari ProtectedModifier
 */
package newpackage;
public class ProtectedDemo extends ProtectedModifier {
    public static void main(String[] args){
        ProtectedModifier protect = new ProtectedModifier();
        
        protect.printInfo();
        protect.sendMessage();
    }
}
