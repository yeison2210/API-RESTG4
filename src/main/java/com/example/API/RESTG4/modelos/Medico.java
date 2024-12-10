package com.example.API.RESTG4.modelos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.loader.ast.spi.Loadable;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="medicos")
public class Medico {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private  String nombre; //50 calacteres y solo letras
    private  String matricula; //20 caracteres
    private String especialidad; //50 caracteres
    private Integer salario; //no puede ser negativo //minimo 8millones//maximo30millones
    private  String ips; //50 caracteres
    private String correo; //formato @sura.com.co
    private  String telefono; //10 caracteres
    private  String direccion; //100caracteres
    private boolean estadisponibleFindesemana;

    //una relacion es un nuevo atributo
    /*@OneToMany(mappedBy = "medico")
    @JsonManagedReference
    private List<Paciente> pacientes;*/

    public Medico() {}{
    }

    public Medico(long id, String nombre, String matricula, String especialidad, Integer salario, String ips, String correo, String telefono, String direccion, boolean estadisponibleFindesemana) {
        this.id = id;
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estadisponibleFindesemana = estadisponibleFindesemana;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstadisponibleFindesemana() {
        return estadisponibleFindesemana;
    }

    public void setEstadisponibleFindesemana(boolean estadisponibleFindesemana) {
        this.estadisponibleFindesemana = estadisponibleFindesemana;
    }
}
