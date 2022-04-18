
package volumebal1;

/**
 *
 * @author Marhaini Hidayati
 */
public class HVolumebal1 {
    public double pj, lb, tg, vol;
    
    public HVolumebal1 (double Pj, double Lb, double Tg){
        
        this.setPanjang(Pj);
        this.setLebar(Lb);
        this.setTinggi(Tg);
        
    }
    
   public void setPanjang(double Pj){
        
        this.pj=Pj;
        
    }
    
    public void setLebar(double Lb){
        
        this.lb=Lb;
        
    }
    
    public void setTinggi (double Tg){
        
        this.tg=Tg;
        
    }
    
    public double HV(){
        
        this.vol= this.pj * this.lb * this.tg; 
        return this.vol;
        
    }
    
    public void tapvol(){
        
        this.HV();
        System.out.println("Hitung Volume Balok");
        System.out.println("======================");
        System.out.println("Nilai Panjang = "+this.pj+"cm²");
        System.out.println("Nilai Lebar = "+this.lb+"cm²");
        System.out.println("Nilai Tinggi = "+this.tg+"cm²");
        System.out.println("Nilai Volume Balok = "+this.vol+"cm³");
        
    }
    
}

    
