package com.esprit;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private int id;
    private String nom;
    private List<Vehicule> vehicules;

    public Station() {
        this.vehicules = new ArrayList<>();
    }

    public Station(int id, String nom, List<Vehicule> vehicules) {
        this.id = id;
        this.nom = nom;
        this.vehicules = vehicules;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }

    public void ajouterVehicule(Vehicule vehicule) throws AjoutVoitureException {
        if (vehicules.size() >= 10) {
            throw new AjoutVoitureException("La station ne peut pas traiter plus de 10 véhicules en même temps.");
        }
        if (vehicules.contains(vehicule)) {
            throw new AjoutVoitureException("Le véhicule est déjà en cours de traitement.");
        }
        vehicules.add(vehicule);
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", vehicules=" + vehicules +
                '}';
    }

    public long NbrVoitureEssence() {
        return vehicules.stream()
                .filter(v -> v instanceof Voiture && "essence".equalsIgnoreCase(v.getTypeDeCarburant()))
                .count();
    }

    public long NbrVoitureNoire() {
        return vehicules.stream()
                .filter(v -> v instanceof Voiture && "noire".equalsIgnoreCase(((Voiture) v).getCouleur()))
                .count();
    }
}