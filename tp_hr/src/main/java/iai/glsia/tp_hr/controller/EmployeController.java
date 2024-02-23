package iai.glsia.tp_hr.controller;

import iai.glsia.tp_hr.entity.Employe;
import iai.glsia.tp_hr.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @GetMapping("/employes")
    public List<Employe> showAllEmployes(){
        return employeService.showAllEmployes();
    }

    @PostMapping("/employes")
    public Employe saveEmploye(@RequestBody Employe employe){
        return employeService.saveEmploye(employe);
    }

    @GetMapping("/employes/{id}")
    public Employe getOneEmploye(@PathVariable int id){
        return employeService.getOneEmploye(id);
    }

    @DeleteMapping("/employes/{id}")
    public void deleteEmploye(@PathVariable int id){
        employeService.deleteEmploye(id);
    }

    @PutMapping("/employes/{id}")
    public  Employe updateEmploye(@RequestBody Employe employe,@PathVariable int id){
        employe.setId(id);
        return employeService.saveEmploye(employe);
    }

    @GetMapping("/employes/sexe/{sexe}")
    public List<Employe> selectBySexe(@PathVariable String sexe){
        return employeService.findBySexe(sexe);
    }

}
