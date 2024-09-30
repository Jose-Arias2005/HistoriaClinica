package com.example.demo.Diagnostico.domain;

import com.example.demo.Cita.domain.Cita;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Diagnostico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String diagnostico;

    @ManyToOne
    @JoinColumn(name = "cita_id")
    private Cita cita;


}
