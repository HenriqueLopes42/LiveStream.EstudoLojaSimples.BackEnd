package com.EstudoDeCasa.Estudo.entities;

import javax.persistence.*;

@Entity
@Table(name = "compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcompra", nullable = false)
    private Integer id;

    @Column(name = "informação", nullable = false)
    private String informação;

    @Column(name = "idcliente", nullable = false)
    private Integer idcliente;

    @Column(name = "idfuncionario", nullable = false)
    private Integer idfuncionario;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo;
}
