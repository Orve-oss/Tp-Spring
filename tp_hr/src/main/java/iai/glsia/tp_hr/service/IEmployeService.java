package iai.glsia.tp_hr.service;

import iai.glsia.tp_hr.entity.Employe;

import java.util.List;

public interface IEmployeService {

    public List<Employe> showAllEmployes();
    public Employe saveEmploye(Employe employe);
    public Employe getOneEmploye(int id);
    public void deleteEmploye(int id);
}
