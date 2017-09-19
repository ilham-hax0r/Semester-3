/*
 * @author Ilham Wicaksono
 * @app : netbeans IDE 8.2
 */
 public class TugasRumah2 {
    double nilaiMID;
    double nilaiTugas;
    double nilaiUAS;
    double nilaiTotal;
    
    double MID(double iMid){
        return nilaiMID = iMid;
    }
    double Tugas(double iTugas){
        return nilaiTugas = iTugas;
    }
    double UAS(double iUas){
        return nilaiUAS = iUas;
    }
    void info(){
        nilaiTotal = (nilaiMID + nilaiTugas + nilaiUAS)/3;
        System.out.println("Nilai MID : "+nilaiMID+"\nNilai Tugas : "+nilaiTugas+"\nNilai UAS : "+nilaiUAS+"\nNilai Total : "+nilaiTotal );
    }
    public static void main(String[] args){
        TugasRumah2 tugas = new TugasRumah2();
        
        tugas.MID(90);
        tugas.Tugas(60);
        tugas.UAS(66);
        tugas.info();
    }   
}
