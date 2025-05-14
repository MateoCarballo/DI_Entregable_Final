/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitys;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 *
 * @author mateo
 */
@Data
@Entity
@Table(name = "vendedor")
@NoArgsConstructor
@AllArgsConstructor
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NonNull
    private String nif;
    
    @NonNull
    private String nombre;
    
    @NonNull
    private String apellido1;
    
    @NonNull
    private String apellido2;
    
    @NonNull
    private String direccion;
    
    @NonNull
    private String correo;
    
    @NonNull
    private String telefono;
    
    @NonNull
    private LocalDate fechaNacimiento;
    
    //Relacion un comprador a muchos vehiculos
    @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL)
    private List<Vehiculo> listadoVehiculos;
}

