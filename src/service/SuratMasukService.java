package service;

import java.util.LinkedList;
import java.util.List;
import model.SuratMasuk;

/**
 *
 * @author Reza Azmi
 */
public class SuratMasukService {
    private static List<SuratMasuk> data = new LinkedList();

    public SuratMasukService() {
    }

    public void addData(SuratMasuk var1) {
        data.add(var1);
        System.out.println("data telah tersimpan");
    }

    public void updateData(SuratMasuk var1) {
        int var2 = data.indexOf(var1);
        if (var2 >= 0) {
            data.set(var2, var1);
            System.out.println("data telah diubah");
        } else {
            System.out.println("data yang ingin diubah tidak ditemukan");
        }

    }

    public void deleteData(SuratMasuk var1) {
        int var2 = data.indexOf(var1);
        if (var2 >= 0) {
            data.remove(var2);
            System.out.println("data telah terhapus");
        } else {
            System.out.println("Data yang ingin dihapus tidak ada");
        }

    }

    public List<SuratMasuk> getAllData() {
        return data;
    }
}
