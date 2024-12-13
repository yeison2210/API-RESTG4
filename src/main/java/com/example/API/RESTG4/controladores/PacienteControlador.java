package com.example.API.RESTG4.controladores;

import com.example.API.RESTG4.modelos.Paciente;
import com.example.API.RESTG4.servicios.PacienteServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paciente")
public class PacienteControlador {

    @Autowired
    PacienteServicios pacienteServicio;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Paciente datos){
        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(pacienteServicio.registarPaciente(datos));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> buscarTodo(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(pacienteServicio.buscarPacientes());

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
