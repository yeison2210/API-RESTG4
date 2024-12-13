package com.example.API.RESTG4.controladores;

import com.example.API.RESTG4.modelos.Paciente;
import com.example.API.RESTG4.modelos.SignoVital;
import com.example.API.RESTG4.servicios.PacienteServicio;
import com.example.API.RESTG4.servicios.SignoVitalServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/signovital")

public class SignoVitalControlador {

    @Autowired
    SignoVitalServicios signoVitalServicios;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody SignoVital datos){
        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(signoVitalServicios.registroSignoVital(datos));
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
                    .body(signoVitalServicios.buscarSignoVital());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
