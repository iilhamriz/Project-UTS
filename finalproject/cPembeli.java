package finalproject;
public class cPembeli {
 private String nama;

    cPembeli(String np){
        nama=np; 
        System.out.println("Object pengunjung dengan nama " +nama+ " dibuat...");
    }
    public void setNamaPembeli(String np){
        nama=np;
    }
    public String getNama(){
        return nama;
    }
    public String ToString(){
        return "Pembeli : " +nama;
    }
   
}    

