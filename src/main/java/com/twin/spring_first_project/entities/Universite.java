package com.twin.spring_first_project.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Table(name = "universite")
public class Universite {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_universite")

    private long idUniversite;
    @Column (name = "nom_universite")
    private String nomUniversite;
    @Column (name = "adresse")
    private String adresse;
    @OneToOne (mappedBy = "Universite")
    private Foyer Foyer;
}
