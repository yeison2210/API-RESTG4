package com.example.API.RESTG4.servicios;

import com.example.API.RESTG4.modelos.Medico;
import com.example.API.RESTG4.modelos.Paciente;
import com.example.API.RESTG4.repositorios.IRepositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServicios {

    @Autowired
    IRepositorioMedico iRepositorioMedico;

    public Medico registroMedico(Medico datosMedicos) throws Exception{

        try {

            //guardar en la base de datos del paciente
            return iRepositorioMedico.save(datosMedicos);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }

    public  List<Medico> buscarMedicos() throws  Exception{
        try {
            return iRepositorioMedico.findAll();
        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }
}
