package Latihan1;

class RodaEmpat extends Kendaraan {
    double Naikhargake = 8; // 8 kali

    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar * Naikhargake);
        System.out.println("Setelah di modifikasi, harga sepeda menjadi Rp." + hargaDasar);
    }
}
