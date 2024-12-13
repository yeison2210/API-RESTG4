package com.example.API.RESTG4.controladores;

import com.example.API.RESTG4.modelos.Medicamento;
import com.example.API.RESTG4.modelos.Medico;
import com.example.API.RESTG4.modelos.Paciente;
import com.example.API.RESTG4.servicios.MedicamentoServicios;
import com.example.API.RESTG4.servicios.MedicoServicios;
import com.example.API.RESTG4.servicios.PacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medico")

public class MedicoControlador {


    @Autowired
    MedicoServicios medicoServicios;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Medico datos){
        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(medicoServicios.registroMedico(datos));
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
                    .body(medicoServicios.buscarMedicos());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
