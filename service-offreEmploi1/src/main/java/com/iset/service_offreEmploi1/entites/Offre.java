package com.iset.service_offreEmploi1.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Offre {
    @Id
    @GeneratedValue
    long code;
    String intitulé;
    String specialité;
    String société;
    int nbpostes;
    String pays;

    public Offre() {

    }

    public Offre( String intitulé, String specialité, String société, int nbpostes, String pays) {

        this.intitulé = intitulé;
        this.specialité = specialité;
        this.société = société;
        this.nbpostes = nbpostes;
        this.pays = pays;
    }



}
