package co.edu.uniquindio.tienda.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String cedula;

    @Getter
    private String nombre;

    private String email, telefono;

}
