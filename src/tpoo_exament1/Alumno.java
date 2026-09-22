/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpoo_exament1;

/**
 *
 * @author MENDOZA-PC
 */
public class Alumno {
    private String nombre;
    private String tipoDocumento;
    private String numeroDocumento;
    private char nivelSocioeconomico;
    private String tipoBeca;

    public Alumno(String nombre, String tipoDocumento, String numeroDocumento, char nivelSocioeconomico, String tipoBeca) {
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nivelSocioeconomico = nivelSocioeconomico;
        this.tipoBeca = tipoBeca;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public char getNivelSocioeconomico() {
        return nivelSocioeconomico;
    }
    public void setNivelSocioeconomico(char nivelSocioeconomico) {
        this.nivelSocioeconomico = nivelSocioeconomico;
    }
    public String getTipoBeca() {
        return tipoBeca;
    }
    public void setTipoBeca(String tipoBeca) {
        this.tipoBeca = tipoBeca;
    }
    public boolean validarDocumento() {
        if (tipoDocumento.equalsIgnoreCase("DNI")) {
            if (numeroDocumento.length() == 8) {
                return true;
            }
        } else {
            if (tipoDocumento.equalsIgnoreCase("Carnet")) {
                if (numeroDocumento.length() == 11) {
                    return true;
                }
            }
        }
        return false;
    }
    public double calcularPension() {
        double tarifaBase = 0.0;

        if (nivelSocioeconomico == 'A') {
            tarifaBase = 1000.0;
        } else {
            if (nivelSocioeconomico == 'a') {
                tarifaBase = 1000.0;
            } else {
                if (nivelSocioeconomico == 'B') {
                    tarifaBase = 700.0;
                } else {
                    if (nivelSocioeconomico == 'b') {
                        tarifaBase = 700.0;
                    } else {
                        if (nivelSocioeconomico == 'C') {
                            tarifaBase = 400.0;
                        } else {
                            if (nivelSocioeconomico == 'c') {
                                tarifaBase = 400.0;
                            }
                        }
                    }
                }
            }
        }

        if (tipoBeca.equalsIgnoreCase("Total")) {
            return 0.0;
        } else {
            if (tipoBeca.equalsIgnoreCase("Parcial")) {
                return tarifaBase * 0.5;
            }
        }

        return tarifaBase;
    }
    public String mostrarDatos() {
        return "Alumno: " + nombre + " | Doc: " + tipoDocumento + " (" + numeroDocumento + ") | Nivel: " + nivelSocioeconomico + " | Beca: " + tipoBeca + " | Pension final: S/ " + calcularPension();
    }
}
