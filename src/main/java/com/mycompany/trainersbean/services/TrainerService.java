/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainersbean.services;

import com.mycompany.trainersbean.dao.TrainerDao;
import com.mycompany.trainersbean.models.Trainer;
import java.util.List;

/**
 *
 * @author alexa
 */
public class TrainerService {

    TrainerDao tdao = new TrainerDao();

    public List<Trainer> getTrainers() {
        return tdao.getTrainers();
    }

    public Trainer getTrainerById(int id) {
        return tdao.getTrainerById(id);
    }

    public boolean insertTrainer(Trainer t) {
        return tdao.insertTrainer(t);}



   public boolean updateTrainer(Trainer t ) {
        return tdao.updateTrainer(t);
}
   public boolean deleteTrainer(int id) {
        return tdao.deleteTrainer(id);}

}