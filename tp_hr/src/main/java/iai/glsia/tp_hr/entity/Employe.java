package iai.glsia.tp_hr.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data //génère automatiquement les getters, setters
@Entity //la classe correspond à une table dans la BD , ici la table employe
@Table(name = "employee")//name in the bd c-a-d préciser le nom de la table dans la BD
@NoArgsConstructor //génère automatiquement un constructeur par défaut
@AllArgsConstructor //génère automatiquement un constructeur prenant en paramètre tous les champs de la classe
public class Employe {

    @Id //définir la clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) //génération automatique de la clé primaire=>autoIncrement
    private int id;
    @Column(name = "matricule") //associer le champ de la colonne à la propriétaire
    private String matricule;
    @Column(name = "nom_employe")
    private String nom;
    @Column(name = "prenom_employe")
    private String prenom;
    private LocalDate dnaissance;
    private String sexe;

}
