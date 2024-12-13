package com.example.API.RESTG4.servicios;

import com.example.API.RESTG4.modelos.Paciente;
import com.example.API.RESTG4.modelos.SignoVital;
import com.example.API.RESTG4.repositorios.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignoVitalServicios {

    @Autowired
    IRepositorioSignoVital iRepositorioSignoVital;

    public SignoVital registroSignoVital(SignoVital datosSignoVitales) throws Exception{

        try {
            return iRepositorioSignoVital.save(datosSignoVitales);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<SignoVital> buscarSignoVital() throws Exception{
        try {
            return iRepositorioSignoVital.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
