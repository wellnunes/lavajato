package br.edu.unijuazeiro.lavajato.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_cliente")
    @SequenceGenerator(sequenceName = "seq_cliente", allocationSize = 1, initialValue = 1, name = "gen_cliente")
    private Integer codigo;

    private String nome;

    private String cpf;

}