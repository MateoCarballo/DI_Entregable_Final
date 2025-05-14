/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
@Table(name = "vehiculo")
@AllArgsConstructor
@RequiredArgsConstructor

public class Vehiculo {

    public enum TiposVehiculo {
        COCHE, MOTO, FURGONETA
    }

    public enum TiposMotorizacion {
        GASOLINA, DIESEL, ELECTRICO, HIBRIDO_LIGERO, HIBRIDO_ENCHUFABLE
    }

    public enum TiposColor {
        BLACK,
        WHITE,
        RED,
        GREEN,
        BLUE,
        YELLOW,
        CYAN,
        MAGENTA,
        GRAY,
        LIGHT_GRAY,
        DARK_GRAY,
        ORANGE,
        PINK,
        BROWN,
        PURPLE,
        VIOLET,
        INDIGO,
        TURQUOISE,
        GOLD,
        SILVER,
        BEIGE,
        MAROON,
        NAVY,
        TEAL,
        OLIVE,
        LIME,
        SALMON,
        CORAL,
        CHOCOLATE,
        PLUM,
        KHAKI,
        CRIMSON,
        AQUA,
        MINT
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private TiposVehiculo tipo;

    @NonNull
    private String marca;

    @NonNull
    private String modelo;

    @NonNull
    private TiposMotorizacion motorizacion;

    private int anoFabricacion;

    private long kilometraje;

    @NonNull
    private TiposColor color;

    private int puertas;

    private boolean conetividadMovil;

    private boolean conduccionAutonoma;

    //Persona que so lo vende al concesionario
    @ManyToOne
    @JoinColumn(name = "id") // nombre de la tabla que contiene el id
    private Vendedor vendedor;
}

/**
 * Para incluir en la nueva entidad de "compra"
 *
 * @ManyToOne
 * @JoinColumn(name = "vendedor_id") // nombre de la tabla que contiene el id
 * con el que se enlaza que seria clave foranea private Vendedor vendedor;
 *
 * @ManyToOne
 * @JoinColumn(name = "comprador_id") // nombre de la tabla que contiene el id
 * con el que se enlaza que seria clave foranea private Comprador comprador;
 *
 *
 * private LocalDate fechaCompra;
 *
 */
