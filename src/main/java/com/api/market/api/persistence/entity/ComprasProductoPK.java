package com.api.market.api.persistence.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ComprasProductoPK implements Serializable {

    @Column(name = "id_compra")
    private String idCompra;

    @Column(name = "id_producto")
    private Integer idProducto;
}
