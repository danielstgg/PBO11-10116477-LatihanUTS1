/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11_10116477_latihanuts2;

/**
 *
 * @author Fransiskus Xaverius Daniel S
 */
public class GajiPegawai {
private String nama,alamat;
private int Tunjangan,uangTransport,gajiPokok,totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getalamat() {
        return alamat;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public int getTunjangan() {
        return Tunjangan;
    }

    public void setTunjangan(int Tunjangan) {
        this.Tunjangan = Tunjangan;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }

public int totalGaji(int Tunjangan,int uangTransport,int gajiPokok){
this.totalGaji = Tunjangan+uangTransport+gajiPokok;
return totalGaji;
    }
}