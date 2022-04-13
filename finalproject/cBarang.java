package finalproject;
public class cBarang {
    private String nama;
    private int harga;

    cBarang (String nama, int harga){
     this.nama = nama; this.harga = harga;
     System.out.println("Menu  "+nama+"  Dibuat");
    }

    public void setNama(String nama){
        this.nama= nama;
    }

    public void setHarga (int harga){
        this.harga = harga;
    }
    public String getNama(){
        return nama;
    }

    public int getHarga(){
        return harga;
    }
    public String ToString(){
        return "Menu : "+nama+" ("+harga+")";
    }
}