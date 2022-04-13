package finalproject;
import java.util.Scanner;

class FinalProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih = 0;
        int b = 0, c = 0;
        int jmlhmenumkn = 5, maksmenumkn = 10;
        String nmenumkn, ubahmakan, tubahmkn, hpsmkn, bulan;
        int hmenumkn, thmkn, tanggal;
        int jmlhmenumnm = 5, maksmenumnm = 10;
        String nmenumnm, ubahmnm, tubahmnm, hpsmnm;
        int hmenumnm, thmnm;
        cNota transaksi = new cNota(6);
        cPembeli pembeli = new cPembeli("");

        cMakanan menumkn[] = new cMakanan[10];
        menumkn[0] = new cMakanan("Roti Durian", 5000);
        menumkn[1] = new cMakanan("Pisang Goreng", 7000);
        menumkn[2] = new cMakanan("Mie Instan", 8000);
        menumkn[3] = new cMakanan("Pecel Khas Nganjuk", 9000);
        menumkn[4] = new cMakanan("Cireng Mozarela", 13000);

        cMinuman menumnm[] = new cMinuman[10];
        menumnm[0] = new cMinuman("Teh Hangat ", 5000);
        menumnm[1] = new cMinuman("Air Putih", 2000);
        menumnm[2] = new cMinuman("Kopi Hitam pekat", 8000);
        menumnm[3] = new cMinuman("Kopy susu Brown Sugar", 10000);
        menumnm[4] = new cMinuman("Susu", 7000);

        do {
            System.out.println("Warung Corner Side");
            System.out.println("1. Pembeli");
            System.out.println("2. Barang");
            System.out.println("3. Transaksi");
            System.out.println("4. Selesai");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch (pilih){
                case 1 :
                    // sub menu pembeli
                    System.out.println("Nama pembeli = ");
                    String np = sc.next();
                    pembeli.setNamaPembeli(np);
                    break;
                case 2 :
                    // sub menu barang
                    do {
                        System.out.println("");
                        System.out.println("Menu");
                        System.out.println("1. Master Barang");
                        System.out.println("2. Transaksi Penjualan");
                        System.out.println("3. Master Member");
                        System.out.println("4. Selesai");
                        System.out.print("Pilih: ");
                        pilih = sc.nextInt();
                        switch (pilih){
                            case 1:
                                do {
                                    System.out.println("");
                                    System.out.println("Menu Master Barang");
                                    System.out.println("1. Tambah Barang");
                                    System.out.println("2. Ubah Barang");
                                    System.out.println("3. Hapus Barang");
                                    System.out.println("4. Lihat Barang");
                                    System.out.println("5. Kembali");
                                    System.out.print("Pilih: ");
                                    pilih = sc.nextInt();
                                    switch (pilih){
                                        case 1:
                                            System.out.println("");
                                            System.out.print("Masukan Nama Jenis Makanan: ");
                                            nmenumkn = sc.next();
                                            System.out.print("Masukan Harga Makanan: ");
                                            hmenumkn = sc.nextInt();
                                            int i = -1;
                                            do {
                                                i++;
                                            }while (menumkn[i] != null);
                                            System.out.println("");
                                            System.out.println(
                                                    "Tambahkan " + nmenumkn + " [" + hmenumkn + "]?");
                                            System.out.println("1. Tambah");
                                            System.out.println("2. Batal");
                                            System.out.print("Pilih: ");
                                            pilih = sc.nextInt();
                                            if (pilih == 1){
                                                menumkn[i] = new cMakanan(nmenumkn, hmenumkn);
                                                System.out.println("Penambahan Sukses!");
                                            }
                                            break;
                                        case 2:
                                            System.out.println("");
                                            System.out.print("Masukan Nama Jenis Minuman: ");
                                            nmenumnm = sc.next();
                                            System.out.print("Masukan Harga Minuman: ");
                                            hmenumnm = sc.nextInt();
                                            int j = -1;
                                            do {
                                                jmlhmenumnm++;
                                            }while (menumnm[j] != null);
                                            System.out.println("");
                                            System.out.println(
                                                    "Tambahkan " + nmenumnm + " [" + hmenumnm + "]?");
                                            System.out.println("1. Tambah");
                                            System.out.println("2. Batal");
                                            System.out.print("Pilih: ");
                                            pilih = sc.nextInt();
                                            if (pilih == 1){
                                                menumnm[j] = new cMinuman(nmenumnm, hmenumnm);
                                                System.out.println("Penambahan Sukses!");
                                            }
                                            break;
                                    }
                                }while (pilih != 3);
                                break;
                            case 2 :
                                do {
                                    System.out.println("");
                                    System.out.println("Menu Ubah Barang");
                                    System.out.println("1. Ubah Makanan Yang Telah Dipilih");
                                    System.out.println("2. Ubah Minuman Yang Telah Dipilih");
                                    System.out.println("3. Kembali");
                                    System.out.print("Pilih: ");
                                    pilih= sc.nextInt();
                                    switch (pilih){
                                        case 1:
                                            System.out.println("");
                                            System.out
                                                    .print("Masukan Nama Jenis Makanan Yang Akan Diubah: ");
                                            ubahmakan = sc.next();
                                            System.out.print("Ubah Nama Jenis Paku Menjadi: ");
                                            tubahmkn = sc.next();
                                            System.out.print("Ubah Harga Paku Menjadi: ");
                                            thmkn = sc.nextInt();
                                            System.out.println("");
                                            System.out.println("Ubah Paku " + ubahmakan + " Menjadi "
                                                    + tubahmkn + "Dengan Harga Rp." + thmkn + "?");
                                            System.out.println("1. Ubah");
                                            System.out.println("2. Batal");
                                            System.out.print("Pilih: ");
                                            pilih = sc.nextInt();
                                            if (pilih == 1){
                                                for (int i = 0; i < menumkn.length; i++) {
                                                    if (menumkn[i] != null && ubahmakan.equalsIgnoreCase(menumkn[i].getNama())) {
                                                        menumkn[i].setNama(tubahmkn);
                                                        menumkn[i].setHarga(thmkn);
                                                        System.out.println("Pengubahan Sukses!");
                                                    }
                                                }
                                            }
                                            break;
                                        case 2:
                                            System.out.println("");
                                            System.out.print("Masukan Nama Jenis Minuman Yang Akan Diubah: ");
                                            ubahmnm = sc.next();
                                            System.out.print("Ubah Nama Jenis Minuman Menjadi: ");
                                            tubahmnm = sc.next();
                                            System.out.print("Ubah Harga Minuman Menjadi: ");
                                            thmnm = sc.nextInt();
                                            System.out.println("");
                                            System.out.println("Ubah Cat " + ubahmnm + " Menjadi " + tubahmnm + "?");
                                            System.out.println("1. Ubah");
                                            System.out.println("2. Batal");
                                            System.out.print("Pilih: ");
                                            pilih = sc.nextInt();
                                            if (pilih == 1) {
                                                for (int i = 0; i < menumnm.length; i++) {
                                                    if (menumnm[i] != null && ubahmnm
                                                            .equalsIgnoreCase(menumnm[i].getNama())) {
                                                        menumnm[i].setNama(tubahmnm);
                                                        menumnm[i].setHarga(thmnm);
                                                        System.out.println("Pengubahan Sukses!");
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                }while (pilih != 3);
                                break;
                            case 3:
                                do {
                                    System.out.println("");
                                    System.out.println("Menu Hapus Barang");
                                    System.out.println("1. Hapus Jenis Makanan");
                                    System.out.println("2. Hapus Jenis Minuman");
                                    System.out.println("3. Kembali");
                                    System.out.print("Pilih: ");
                                    pilih = sc.nextInt();
                                    switch (pilih){
                                        case 1:
                                            System.out.println("");
                                            System.out.print("Masukan Jenis Makanan Yang Akan Dihapus: ");
                                            hpsmkn = sc.next();
                                            System.out.println("Hapus Makanan " + hpsmkn + "?");
                                            System.out.println("1. Hapus");
                                            System.out.println("2. Batal");
                                            System.out.print("Pilih: ");
                                            pilih = sc.nextInt();
                                            if (pilih == 1) {
                                                for (int i = 0; i < menumkn.length; i++) {
                                                    if (menumkn[i] != null
                                                            && hpsmkn.equalsIgnoreCase(menumkn[i].getNama())
                                                            && menumkn[i + 1] != null) {
                                                        menumkn[i] = null;
                                                        for (int j = i; j < menumkn.length; j++) {
                                                            if (j == menumkn.length - 1) {
                                                                menumkn[j] = null;
                                                            } else {
                                                                menumkn[j] = menumkn[j + 1];
                                                            }
                                                        }
                                                    }
                                                }
                                                System.out.println("Penghapusan Berhasil!");
                                            }
                                            break;
                                        case 2:
                                            System.out.println("");
                                            System.out.print("Masukan Jenis minuman Yang Akan Dihapus: ");
                                            hpsmnm = sc.next();
                                            System.out.println("Hapus Cat " + hpsmnm + "?");
                                            System.out.println("1. Hapus");
                                            System.out.println("2. Batal");
                                            System.out.print("Pilih: ");
                                            pilih = sc.nextInt();
                                            if (pilih == 1){
                                                for (int i = 0; i < menumnm.length; i++) {
                                                    if (menumnm[i] != null
                                                            && hpsmnm.equalsIgnoreCase(menumnm[i].getNama())
                                                            && menumnm[i + 1] != null) {
                                                        menumnm[i] = null;
                                                        for (int j = i; j < menumnm.length; j++) {
                                                            if (j == menumnm.length - 1) {
                                                                menumnm[j] = null;
                                                            } else {
                                                                menumnm[j] = menumnm[j + 1];
                                                            }
                                                        }
                                                    }
                                                }
                                                System.out.println("Penghapusan Berhasil!");
                                            }
                                            break;
                                    }
                                }while (pilih != 3);
                                break;
                            case 4:
                                do {
                                    System.out.println("");
                                    System.out.println("Menu Lihat Barang");
                                    System.out.println("1. Lihat Jenis Makanan");
                                    System.out.println("2. Lihat Jenis Minuman");
                                    System.out.println("3. Kembali");
                                    System.out.print("Pilih: ");
                                    pilih = sc.nextInt();
                                    switch (pilih){
                                        case 1:
                                            System.out.println("");
                                            System.out.println("Daftar Jenis Makanan");
                                            int j = 0;
                                            for (int i = 0; i < menumkn.length; i++) {
                                                if (menumkn[i] != null) {
                                                    System.out.println((i + 1) + ". " + menumkn[i].getNama()
                                                            + " [" + menumkn[i].getHarga() + "] ");
                                                    j++;
                                                }
                                            }
                                            break;
                                        case 2:
                                            System.out.println("");
                                            System.out.println("Daftar Jenis Minuman");
                                            j = 0;
                                            for (int i = 0; i < menumnm.length; i++) {
                                                if (menumnm[i] != null) {
                                                    System.out.println((i + 1) + ". " + menumnm[i].getNama()
                                                            + " [" + menumnm[i].getHarga() + "] ");
                                                    j++;
                                                }
                                            }
                                            break;
                                    }
                                }while (pilih != 3);
                                break;
                        }
                    }while (pilih != 5);
                    break;
                case 3:
                    do {
                        System.out.println("  Pembelian");
                        System.out.println("  1. Isi Pembeli");
                        System.out.println("  2. Tambah Makanan");
                        System.out.println("  3. Hapus Makanan");
                        System.out.println("  4. Lihat Makanan");
                        System.out.println("  5. Tambah Minuman");
                        System.out.println("  6. Hapus Minuman");
                        System.out.println("  7. Lihat Minuman");
                        System.out.println("  8. Pembelian Selesai dan Hasil Transaksi");
                        System.out.print(" Pilih = ");
                        pilih = sc.nextInt();
                        switch (pilih){
                            case 1:
                                // pembelian
                                transaksi.isiPembeli(pembeli);
                                break;
                            case 2:
                                // Tambah Makanan
                                System.out.println("  Menu = ");
                                String mn = sc.next();
                                boolean ada = false;
                                for (int i = 0; i < 10; i++) {
                                    if (mn.equalsIgnoreCase(menumkn[i].getNama())) {
                                        ada = true;
                                        transaksi.tambahMakanan(menumkn[i]);
                                        break;
                                    }
                                }
                                if (ada == false) {
                                    System.out.print("  Menu tidak ada!");
                                }
                                break;
                            case 3:
                                // Menghapus Makanan
                                System.out.println("  Menu dihapus");
                                String h = sc.next();
                                transaksi.hapusMakanan(h);
                                break;
                            case 4:
                                // Melihat Makanan
                                transaksi.lihatMakanan();
                                break;
                            case 5:
                                // Tambah Minuman
                                System.out.print("  Menu = ");
                                String mint = sc.next();
                                boolean ada2 = false;
                                for (int i = 0; i < 10; i++) {
                                    if (mint.equalsIgnoreCase(menumnm[i].getNama())) {
                                        ada2 = true;
                                        transaksi.tambahMinuman(menumnm[i]);
                                        break;
                                    }
                                }
                                if (ada2 == false) {
                                    System.out.print("  Menu tidak ada!");
                                }
                                break;
                            case 6:
                                // Menghapus Minuman
                                System.out.println("  Menu dihapus");
                                String ha = sc.next();
                                transaksi.hapusMinuman(ha);
                                break;
                            case 7:
                                // Melihat Minuman
                                transaksi.lihatMinuman();
                                break;
                            case 8:
                                                         System.out.println(""); 
                                System.out.print("Bulan Transaksi: "); 
                                bulan = sc.next(); 
                                System.out.print("Tanggal Transaksi: "); 
                                tanggal = sc.nextInt(); 
                                System.out.println("");
                                System.out.println("=============================");
                                System.out.println("Indomaret"); 
                                System.out.println("Waktu Transaksi: " + tanggal + "," +bulan); 
                                System.out.println("Transaksi Atas Nama: " + pembeli.getNama());
                                System.out.println("");
                                transaksi.lihatMakanan();
                                transaksi.lihatMinuman();
                                                
                 }
                 }while(pilih!=8);

                case 4:
                    System.out.print("Terima Kasih ...");
            }
        } while (pilih != 5);
    }
}
