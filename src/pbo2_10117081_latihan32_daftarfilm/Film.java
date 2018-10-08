/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan32_daftarfilm;

/**
 *
 * @author Geo Syah Alkautsar
 * Deskripsi Kelas : Kelas tambahan berisi nama, genre, rating, dan durasi
 * untuk program utama
 */
public class Film {
    
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(String parFilmName, String parFilmGenre, 
            double parFilmRating, int parFilmDuration) {
        System.out.println("Judul Film : " + parFilmName);
        System.out.println("Genre Film : " + parFilmGenre);
        System.out.println("Rating Film : " + parFilmRating);
        System.out.println("Duration Film : " + parFilmDuration + " Menit");
        System.out.println("");
    }
}
