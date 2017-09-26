/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
package newpackage;
public class PublicModifier {
    public int a=2;
    public int b=5;
    public int c=9;
    
    public void kali(){
        int d = a*b*c;
        System.out.println("Hasil kali = "+d );
    }
    public void tambah(){
        int d = a+b+c;
        System.out.println("Hasil tambah = "+d );
    }
    public void kurang(){
        int d = a-b-c;
        System.out.println("Hasil kurang = "+d );
    }
    public void bagi(){
        int d = a/b/c;
        System.out.println("Hasil bagi = "+d );
    }  
    public void rata2(){
        int d = (a+b+c)/3;
        System.out.println("Hasil rata-rata = "+d );
    }    
}
