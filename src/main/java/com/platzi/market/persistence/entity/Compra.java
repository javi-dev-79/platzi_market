package com.platzi.market.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compras")
public class Compra {

    @Id
    @Column(name = "id_compra")
    private Integer idCompra;
}
