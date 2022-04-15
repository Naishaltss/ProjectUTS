package finalproject;
public class cNota {
    private cPembeli pembeli;
    private cMakanan makanan[];
    private cMinuman minuman [];
    private int jmlhmenumkn, maksmenumkn, jmlhmenumnm, maksmenumnm, total, hrg, satuaj, makann, minumn, brg, transaksi, bl;
    public int banyak[]= new int[5];
    
    cNota(int maks){
     maksmenumkn =maks;
         maksmenumnm =maks;
         makanan = new cMakanan[ maksmenumkn];
         minuman = new cMinuman[maksmenumnm];
         jmlhmenumkn=0; jmlhmenumnm=0; total=0;
       
    }
      public void isiPembeli(cPembeli pbl){
       pembeli = new cPembeli(pbl.getNama());
       System.out.println("Isi pembeli berhasil ...");

}
   public void tambahMakanan(cMakanan m){
       if(jmlhmenumkn>=maksmenumkn){
           System.out.println("Keranjang sudah penuh!");
       }
              else{
           makanan[jmlhmenumkn] = m;
           jmlhmenumkn++;
           System.out.println("Penambahan Sukses ..");
       }
   }
   public void lihatMakanan(){
       System.out.println(pembeli.ToString());
       System.out.println("Daftar Makanan");
       if(jmlhmenumkn<=0){
           System.out.println("Keranjang kosong!");
       }
       else {
           for (int i = 0; i < jmlhmenumkn; i++){
               System.out.println((i+1)+"."+makanan[i].ToString());
           }
       }
   }
   public void hapusMakanan(String hapus){
       if(jmlhmenumkn<=0){
           System.out.println("Keranjang kosong!");
       }
       
       else {
           //temukan yang akan dihapus
           //lakukan penghapusan
           boolean ada = false;
           for (int i = 0; i < jmlhmenumkn; i++) {
               if(hapus.equalsIgnoreCase(makanan[i].getNama())){
                   ada = true;
                   makanan[i] = null;
                   //penggeseran elemen array yang dibelakang --> maju
                   for (int j = i; j < jmlhmenumkn; j++) {
                       if(j==jmlhmenumkn-1){
                           makanan[j] = null;
                       }
                       else{
                           makanan[j] = makanan[j+1]; //geser maju
                       }
                   }
         jmlhmenumkn--;
                   System.out.println("Penghapusan Sukses ..");
                   break;
               }
           }
           if(ada==false){
               System.out.println("Makanan tidak ada!");
           }
       }
   }
   public void tambahMinuman(cMinuman mi){
       if(jmlhmenumnm>=maksmenumnm){
           System.out.println("Keranjang sudah penuh!");
       }
       else{
           minuman[jmlhmenumnm] = new cMinuman(mi.getNama(), mi.getHarga());
           jmlhmenumnm++;
           System.out.println("Penambahan Sukses ..");
       }
         }
   public void lihatMinuman(){
       System.out.println(pembeli.ToString());
       System.out.println("Daftar Minuman");
       if(jmlhmenumnm<=0){
           System.out.println("Keranjang kosong!");
       }
       else{
           for (int i = 0; i < jmlhmenumnm; i++){
               System.out.println((i+1)+"."+minuman[i].ToString());
           }
       }
   }
   public void hapusMinuman(String hapus){
       if(jmlhmenumnm<=0){
           System.out.println("Keranjang kosong!");
       }
       else{
           boolean ada = false;
           for (int i = 0; i < jmlhmenumnm; i++){
               if(hapus.equalsIgnoreCase(minuman[i].getNama())){
                   ada = true;
                   minuman[i] = null;
                   for (int j = i; j < jmlhmenumnm; j++) {
                       if(j==jmlhmenumnm-1){
                           minuman[j] = null;
                       }
                       else{
                         minuman[j] = minuman[j+1];  
                       }
                   }
                   jmlhmenumnm--;
                   System.out.println("Penghapusan Sukses ..");
                   break;
               }
           }
       }
   }
   public int HitungMakanan(int h, int b){
        banyak[makann] = b; 
        makann++;  
        satuaj = h * b; 
        total = total + satuaj; 
        return total; 
   }
   public int HitungMinuman(int h, int b){
        banyak[minumn] = b; 
        minumn++;  
        satuaj = hrg * brg; 
        total = total + satuaj; 
        return total; 
   }
   public int HitungTotal(){
        return total; 
    }
   public void SelesaiTransaksiMakanan(){
        for (int i = 0; i < maksmenumkn; i++) {
            if(makanan[i] != null){
                jmlhmenumkn = 0; 
                satuaj = 0; 
                makann = 0;
                total = 0; 
                makanan[i] = null; 
            }
        }
   }
   public void SelesaiTransaksiMinuman(){
        for (int i = 0; i < maksmenumnm; i++) {
            if(minuman[i] != null){
                jmlhmenumnm = 0; 
                satuaj = 0; 
                minumn = 0;
                total = 0; 
                minuman[i] = null; 
            }
        }
    }
}


   

   
