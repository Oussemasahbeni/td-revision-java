package com.esprit;

public class Vehicule {
    private int id;
    private String marque;
    private String typeDeCarburant;

    public Vehicule(int id, String marque, String typeDeCarburant) {
        this.id = id;
        this.marque = marque;
        this.typeDeCarburant = typeDeCarburant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getTypeDeCarburant() {
        return typeDeCarburant;
    }

    public void setTypeDeCarburant(String typeDeCarburant) {
        this.typeDeCarburant = typeDeCarburant;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", typeDeCarburant='" + typeDeCarburant + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicule vehicule = (Vehicule) o;

        if (id != vehicule.id) return false;
        return marque != null ? marque.equals(vehicule.marque) : vehicule.marque == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (marque != null ? marque.hashCode() : 0);
        return result;
    }
}