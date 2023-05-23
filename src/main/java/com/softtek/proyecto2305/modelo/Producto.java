package com.softtek.proyecto2305.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Entity
@Table(name = "products")
@Component
public class Producto {

    @Id
    @Column(name="product_id")
    private Short idProdcutos;
    @Column(name="product_name")
    private String nombre;
    @Column(name="supplier_id")
    private Short idSupplier;
    @Column(name="category_id")
    private Short idCategoria;
    @Column(name="quantity_per_unit")
    private String cantidadUnidades;
    @Column(name="unit_price")
    private double precioUnitario;
    @Column(name="units_in_stock")
    private Short unidadesInStock;
    @Column(name="units_on_order")
    private Short unidadesOrdenadas;
    @Column(name="reorder_level")
    private Short nivelOrden;
    @Column(name="discontinued")
    private Integer discontinued;



}
