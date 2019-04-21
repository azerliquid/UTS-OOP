package model;

/**
 *
 * @author Reza Azmi
 */
public class SuratMasuk {
    private String nomor;
    private String hal;
    private String tanggal_masuk;
    private String alamat;

    public SuratMasuk() {
    }

    public SuratMasuk(String var1, String var2, String var3, String var4) {
        this.nomor = var1;
        this.hal = var2;
        this.tanggal_masuk = var3;
        this.alamat = var4;
    }

    public boolean equals(Object var1) {
        SuratMasuk var2 = (SuratMasuk)var1;
        return this.nomor.equals(var2.getNomor());
    }

    public String toString() {
        String var10000 = this.nomor;
        String var10001 = this.hal;
        String var10002 = this.tanggal_masuk;
        return this.alamat;
    }

    public void setNomor(String var1) {
        this.nomor = var1;
    }

    public String getNomor() {
        return this.nomor;
    }

    public void setHal(String var1) {
        this.hal = var1;
    }

    public String getHal() {
        return this.hal;
    }

    public void setTanggal_masuk(String var1) {
        this.tanggal_masuk = var1;
    }

    public String getTanggal_masuk() {
        return this.tanggal_masuk;
    }

    public void setAlamat(String var1) {
        this.alamat = var1;
    }

    public String getAlamat() {
        return this.alamat;
    }
}