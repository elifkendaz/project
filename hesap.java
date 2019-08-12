/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elif
 */
public class hesap {
    
    private int id;
    private String musteriadi;
    private String musterisoyadi;
    private String hesapno;
    private String hesapturu;

    public hesap(int id, String musteriadi, String musterisoyadi, String hesapno, String hesapturu) {
        this.id = id;
        this.musteriadi = musteriadi;
        this.musterisoyadi = musterisoyadi;
        this.hesapno = hesapno;
        this.hesapturu = hesapturu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMusteriadi() {
        return musteriadi;
    }

    public void setMusteriadi(String musteriadi) {
        this.musteriadi = musteriadi;
    }

    public String getMusterisoyadi() {
        return musterisoyadi;
    }

    public void setMusterisoyadi(String musterisoyadi) {
        this.musterisoyadi = musterisoyadi;
    }

    public String getHesapno() {
        return hesapno;
    }

    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
    }

    public String getHesapturu() {
        return hesapturu;
    }

    public void setHesapturu(String hesapturu) {
        this.hesapturu = hesapturu;
    }
    

}
