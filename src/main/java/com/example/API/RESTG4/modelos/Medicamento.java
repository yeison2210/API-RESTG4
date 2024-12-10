package com.example.API.RESTG4.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name="medicamentos")
public class Medicamento {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String presentacion;
    private String dosis;
    private String laboratorio;
    private LocalDate fechaCaducidad;
    private String contraindiciaciones;
    private  String registroINVINA;
    private  boolean tieneCopago;

    @ManyToOne
    @JoinColumn(name = "fk_paciente", referencedColumnName = "id")
    private Paciente paciente;

    public Medicamento() {
    }

    public Medicamento(long id, String nombre, String presentacion, String dosis, String laboratorio, LocalDate fechaCaducidad, String contraindiciaciones, String registroINVINA, boolean tieneCopago) {
        this.id = id;
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.dosis = dosis;
        this.laboratorio = laboratorio;
        this.fechaCaducidad = fechaCaducidad;
        this.contraindiciaciones = contraindiciaciones;
        this.registroINVINA = registroINVINA;
        this.tieneCopago = tieneCopago;
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

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getContraindiciaciones() {
        return contraindiciaciones;
    }

    public void setContraindiciaciones(String contraindiciaciones) {
        this.contraindiciaciones = contraindiciaciones;
    }

    public String getRegistroINVINA() {
        return registroINVINA;
    }

    public void setRegistroINVINA(String registroINVINA) {
        this.registroINVINA = registroINVINA;
    }

    public boolean isTieneCopago() {
        return tieneCopago;
    }

    public void setTieneCopago(boolean tieneCopago) {
        this.tieneCopago = tieneCopago;
    }
}
