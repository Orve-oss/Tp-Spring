package iai.glsia.tp_hr.service;

import iai.glsia.tp_hr.entity.Employe;
import iai.glsia.tp_hr.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeService implements IEmployeService{

    @Autowired //pour l'injection des dépendances
    private EmployeRepository employeRepository;
    @Override
    public List<Employe> showAllEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public Employe saveEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe getOneEmploye(int id) {
        return employeRepository.findById(id).get();
    }

    @Override
    public void deleteEmploye(int id) {
        employeRepository.deleteById(id);
    }

    public List<Employe> findBySexe(String sexe){
        return employeRepository.findBySexe(sexe);
    }

}
