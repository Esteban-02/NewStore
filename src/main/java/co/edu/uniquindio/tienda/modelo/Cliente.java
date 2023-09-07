package co.edu.uniquindio.tienda.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cliente extends Persona implements Serializable {

    private String telefono;

    @OneToMany(mappedBy = "cliente")
    private List<Transaccion> transacciones;
}
