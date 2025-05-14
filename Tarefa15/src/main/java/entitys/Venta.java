/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author mateo
 */

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "venta")
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
       
    @OneToMany(mappedBy = "comprador")
    private Comprador comprador;
    
    @OneToMany(mappedBy = "empleados")
    private Empleado empleado;
    
    @NonNull
    private LocalDate fechaCompraCliente;
}
