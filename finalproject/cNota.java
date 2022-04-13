package finalproject;
public class cNota {
    private cBarang barang;  
    private cPembeli pembeli;
    private cMakanan makanan[];
    private cMinuman minuman [];
    private int jmlhmenumkn, maksmenumkn, jmlhmenumnm, maksmenumnm, total;
    
    cNota(int maks){
         maksmenumkn =maks;
         makanan = new cMakanan[ maksmenumkn];
         jmlhmenumkn=0; total=0;
    }
    public void isiPembeli(cPembeli p){
     pembeli = new cPembeli (p.getNama()); 
     System.out.println("isi Pembeli sukses");
    }
    public void tambahMakanan(cMakanan m){
        if(jmlhmenumkn>=maksmenumkn){
            System.out.println("Pembelian melebihi BATAS MAKSIMUM!! ");
        }
        
        else{
            
            
            makanan [jmlhmenumkn] = new cMakanan(m.getNama(), m.getHarga());
             // nge set harga makanan itu kedalam satu variable array
            System.out.println("Penambahan Menu Makanan dan Minuman Berhasil");
        }
    }
    public void lihatMakanan(){
        System.out.println(pembeli.ToString());
        System.out.println("Daftar Makanan Yang dibeli");
        if (jmlhmenumkn>0){
           for (int i = 0; i < jmlhmenumkn; i++){
               //nanti ditampilin disni dari yang udah diset di tambah makanan looping
                System.out.println((i+1)+"."+barang.ToString());
            }
        }
        else{
            
             System.out.println("Belum Memesan Apapun");
        }
        
        //harga yang udah di set tadi itu di dijumlahin untuk total transaksinya
 //       System.out.println("Total Akhir Harga Makanan : " + total );
        
    }
public void hapusMakanan(String hapus){
    if(jmlhmenumkn<=0){
        System.out.println("Belum Memesan Apapun");
      
    }
    else {
        boolean ada=false;
        for(int i = 0; i<jmlhmenumkn; i++){
            if(hapus.equalsIgnoreCase(makanan[i].getNama())){
                ada=true; 
                makanan [i]=null;
                for (int j=i;j <jmlhmenumkn; j++){
                    if(j==jmlhmenumkn-1){
                        makanan[j]=null;
                    }
                    else{
                        makanan[j]=makanan[j+1];  
                    }
                } 
               jmlhmenumkn--;
               System.out.println("Makanan Dikurangi");
               break;
            }
        }
        if (ada==false){
            System.out.println("Makanan Sedang Tidak Tersedia!!");
        }}}
    
   public void tambahMinuman (cMinuman mn){
        if(jmlhmenumnm>=maksmenumnm){
            System.out.println("Pembelian melebihi BATAS MAKSIMUM!! ");
        }
        else{
            minuman [jmlhmenumnm] = new cMinuman(mn.getNama(), mn.getHarga());
            System.out.println("Penambahan Menu Minuman dan Minuman Berhasil");
        }
   }
    public void lihatMinuman(){
        System.out.println(pembeli.ToString());
        System.out.println("Daftar Minuman Yang dibeli");
        if (jmlhmenumnm<=0){
            System.out.println("Belum Memesan Apapun");
        }
        else{
            for (int i = 0; i < jmlhmenumnm; i++){
                System.out.println((i+1)+"."+barang.ToString());
            }
        }
    }
public void hapusMinuman(String hapus){
    if(jmlhmenumnm<=0){
        System.out.println("Belum Memesan Apapun");
      
    }
    else {
        boolean ada=false;
        for(int i = 0; i<jmlhmenumnm; i++){
            if(hapus.equalsIgnoreCase(minuman[i].getNama())){
                ada=true; 
                minuman [i]=null;
                for (int j=i;j <jmlhmenumnm; j++){
                    if(j==jmlhmenumnm-1){
                        minuman[j]=null;
                    }
                    else{
                        minuman[j]=minuman[j+1];  
                    }
                } 
               jmlhmenumnm--;
               System.out.println("Minuman Dikurangi");
               break;
            }
        }
        if (ada==false){
            System.out.println("Minuman Sedang Tidak Tersedia!!");
        }
    }

}
}
