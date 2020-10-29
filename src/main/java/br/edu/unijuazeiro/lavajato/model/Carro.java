package br.edu.unijuazeiro.lavajato.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Carro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_carro")
    @SequenceGenerator(sequenceName = "seq_carro", allocationSize = 1, initialValue = 1, name = "gen_carro")
    private Integer codigo;

    private String nome;
    
    private String marca;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(nullable = false)
    private Cliente cliente;
}
