package com.example.API.RESTG4.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="enfermedades")
public class Enfermedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String sintomas;
    private String clasificacion;
    private String gradp;
    private String probalidadVivir;

    @ManyToOne
    @JoinColumn(name = "fk_paciente", referencedColumnName = "id")
    private Paciente paciente;

    public Enfermedad() {
    }

    public Enfermedad(long id, String nombre, String sintomas, String clasificacion, String gradp, String probalidadVivir) {
        this.id = id;
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.clasificacion = clasificacion;
        this.gradp = gradp;
        this.probalidadVivir = probalidadVivir;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGradp() {
        return gradp;
    }

    public void setGradp(String gradp) {
        this.gradp = gradp;
    }

    public String getProbalidadVivir() {
        return probalidadVivir;
    }

    public void setProbalidadVivir(String probalidadVivir) {
        this.probalidadVivir = probalidadVivir;
    }
}
