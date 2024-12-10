package com.example.API.RESTG4.modelos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String nombre; //no debe tener mas de 40 caracteres //solo admito letras
    private LocalDate anioNacimiento; //este año no puede ser mayor a 2024 //no puede ser menor a 1920
    private String ciudad; //no debe de tener mas de 50 caracteres //sololetras
    private String correo; //debe tener formato@sura.com.co
    private String telefono; //debe tener 10 digitos
    private String ips; //maximo 50 caracteres
    private Boolean tienePoliza;
    private String grupoIngresos; //A,BC
    private LocalDate fechaAfilacion; //solo validas entre 1995-2024

    //las relaciones son atributos
    /*@ManyToOne
    @JoinColumn(name = "fk_medico", referencedColumnName = "id")
    @JsonManagedReference
    private Medico medico;*/

    /*@OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<Medicamento> medicamento;

    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<Enfermedad> enfermedad;

    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<SignoVital> signoVital;*/




    public Paciente() {
    }

    public Paciente(long id, String nombre, LocalDate anioNacimiento, String ciudad, String correo, String telefono, String ips, Boolean tienePoliza, String grupoIngresos, LocalDate fechaAfilacion) {
        this.id = id;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.ciudad = ciudad;
        this.correo = correo;
        this.telefono = telefono;
        this.ips = ips;
        this.tienePoliza = tienePoliza;
        this.grupoIngresos = grupoIngresos;
        this.fechaAfilacion = fechaAfilacion;
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

    public LocalDate getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(LocalDate anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public Boolean getTienePoliza() {
        return tienePoliza;
    }

    public void setTienePoliza(Boolean tienePoliza) {
        this.tienePoliza = tienePoliza;
    }

    public String getGrupoIngresos() {
        return grupoIngresos;
    }

    public void setGrupoIngresos(String grupoIngresos) {
        this.grupoIngresos = grupoIngresos;
    }

    public LocalDate getFechaAfilacion() {
        return fechaAfilacion;
    }

    public void setFechaAfilacion(LocalDate fechaAfilacion) {
        this.fechaAfilacion = fechaAfilacion;
    }
}
