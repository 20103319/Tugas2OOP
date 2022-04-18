
package volumebalok;

/**
 *
 * @author Marhaini Hidayati_20103319
 */
public class HitVolBalok {
    protected double pj, lb, tg, vol;
    
    protected HitVolBalok(double Pj, double Lb, double Tg){
        
        this.setPanjang(Pj);
        this.setLebar(Lb);
        this.setTinggi(Tg);
        
    }
    
   protected void setPanjang(double Pj){
        
        this.pj=Pj;
        
    }
    
    protected void setLebar(double Lb){
        
        this.lb=Lb;
        
    }
    
    protected void setTinggi (double Tg){
        
        this.tg=Tg;
        
    }
    
    protected double HV(){
        
        this.vol= this.pj * this.lb * this.tg; 
        return this.vol;
        
    }
    
    protected void tapvol(){
        
        this.HV();
        System.out.println("Hitung Volume Balok");
        System.out.println("======================");
        System.out.println("Nilai Panjang = "+this.pj+"cm²");
        System.out.println("Nilai Lebar = "+this.lb+"cm²");
        System.out.println("Nilai Tinggi = "+this.tg+"cm²");
        System.out.println("Nilai Volume Balok = "+this.vol+"cm³");
        
    }
    
}
    
    
}
