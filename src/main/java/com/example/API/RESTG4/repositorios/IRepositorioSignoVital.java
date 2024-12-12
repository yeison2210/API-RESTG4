package com.example.API.RESTG4.repositorios;

import com.example.API.RESTG4.modelos.SignoVital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioSignoVital extends JpaRepository<SignoVital,Long> {
}
