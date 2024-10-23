package com.example.inicial1.entities;

import com.example.inicial1.entities.Base;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Table(name="Humano")
@Audited
public class Humano extends Base {
    @Column(name="esMutante")
    private Boolean esMutante;

    public Boolean esMutante(String[] dna){



    }



}
