package com.example.API.RESTG4.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name="signoVitales")
public class SignoVital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre; // 50 caracteres y solo letras
    private String valor;
    private LocalDate fechaMedida; //

    @ManyToOne
    @JoinColumn(name = "fk_paciente", referencedColumnName = "id")
    private Paciente paciente;

    public SignoVital() {
    }

    public SignoVital(long id, String nombre, String valor, LocalDate fechaMedida, Paciente paciente) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.fechaMedida = fechaMedida;
        this.paciente = paciente;
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public LocalDate getFechaMedida() {
        return fechaMedida;
    }

    public void setFechaMedida(LocalDate fechaMedida) {
        this.fechaMedida = fechaMedida;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
