package Pedi_Hospitalar.crm.repository;

import Pedi_Hospitalar.crm.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Você pode adicionar métodos personalizados aqui, se quiser
}
