/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainersbean.dao;

import com.mycompany.trainersbean.models.Trainer;
import static com.mycompany.trainersbean.models.Trainer_.id;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alexa
 */
public class TrainerDao {

    public List<Trainer> getTrainers() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_TrainersBean_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        List<Trainer> trainers = new ArrayList();

        try {
            trainers = em.createNamedQuery("Trainer.findAll").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
        return trainers;
    }

    public Trainer getTrainerById(int id) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_TrainersBean_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        Trainer t = new Trainer();
        try {
            t = (Trainer) em.createNamedQuery("Trainer.findById").setParameter("id", id).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
        return t;
    }

    public boolean insertTrainer(Trainer t) {
        boolean res = false;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_TrainersBean_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        try {
            em.persist(t);
            em.getTransaction().commit();
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }
        return res;
    }

    public boolean updateTrainer(Trainer t) {
        boolean res = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_TrainersBean_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        Trainer toUpdate = (Trainer) em.createNamedQuery("Trainer.findById").setParameter("id", t.getId()).getSingleResult();
        toUpdate.setFname(t.getFname());
        toUpdate.setLname(t.getLname());

        em.getTransaction().begin();
        try {
            em.persist(t);
            em.getTransaction().commit();
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }
        return res;
    }

    public boolean deleteTrainer(int id) {
        boolean res = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_TrainersBean_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
         em.getTransaction().begin();
        try {
            
          Trainer  t = em.find(Trainer.class,id);
          
            em.remove(t);
            em.getTransaction().commit();

            res = true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }
        return res;
    }

}
