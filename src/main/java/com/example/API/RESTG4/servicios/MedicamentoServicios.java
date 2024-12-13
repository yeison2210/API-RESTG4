package com.example.API.RESTG4.servicios;

import com.example.API.RESTG4.modelos.Enfermedad;
import com.example.API.RESTG4.modelos.Medicamento;
import com.example.API.RESTG4.modelos.Paciente;
import com.example.API.RESTG4.repositorios.IRepositorioMedicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoServicios {

    @Autowired
    IRepositorioMedicamento iRepositorioMedicamento;

    public Medicamento registroMedicamento(Medicamento datosMedicamentos) throws Exception{

        try {

            //guardar en la base de datos del paciente
            return iRepositorioMedicamento.save(datosMedicamentos);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }

    public List<Medicamento> buscarMedicamento() throws Exception{
        try {
            return iRepositorioMedicamento.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
