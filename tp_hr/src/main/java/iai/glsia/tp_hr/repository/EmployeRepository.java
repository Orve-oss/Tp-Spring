package iai.glsia.tp_hr.repository;

import iai.glsia.tp_hr.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;


//JpaRepository<Employe, Integer> class & type de l'id(Class)
//@RepositoryRestResource // do the CRUD auto
public interface EmployeRepository extends JpaRepository<Employe, Integer> {

    //methods(without body) for selection by the SEXE,...

    //@Query(value = "",nativeQuery = true)
    public List<Employe> findBySexe(String sexe);
}
