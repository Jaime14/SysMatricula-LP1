/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Jaime
 */
public class notas {
   private int idnotas;
   private String notamaxima;
   private String notaminima;
   private String notaaprobada;
   private String notadesaprobada;

    public notas() {
    }

    public notas(int idnotas, String notamaxima, String notaminima, String notaaprobada, String notadesaprobada) {
        this.idnotas = idnotas;
        this.notamaxima = notamaxima;
        this.notaminima = notaminima;
        this.notaaprobada = notaaprobada;
        this.notadesaprobada = notadesaprobada;
    }

    public int getIdnotas() {
        return idnotas;
    }

    public void setIdnotas(int idnotas) {
        this.idnotas = idnotas;
    }

    public String getNotamaxima() {
        return notamaxima;
    }

    public void setNotamaxima(String notamaxima) {
        this.notamaxima = notamaxima;
    }

    public String getNotaminima() {
        return notaminima;
    }

    public void setNotaminima(String notaminima) {
        this.notaminima = notaminima;
    }

    public String getNotaaprobada() {
        return notaaprobada;
    }

    public void setNotaaprobada(String notaaprobada) {
        this.notaaprobada = notaaprobada;
    }

    public String getNotadesaprobada() {
        return notadesaprobada;
    }

    public void setNotadesaprobada(String notadesaprobada) {
        this.notadesaprobada = notadesaprobada;
    }
   
   

    

   
    
    
    
}
