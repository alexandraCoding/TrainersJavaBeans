/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainersbean.controllers;

import com.mycompany.trainersbean.models.Trainer;
import com.mycompany.trainersbean.services.TrainerService;
import org.springframework.stereotype.Controller;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author alexa
 */
 @Controller
  @RequestMapping(value={"/"})
public class TrainerController {
     
     TrainerService ss=new TrainerService();
     
   @RequestMapping(value="",method= RequestMethod.GET)
   public String getTrainers(ModelMap model){
       model.addAttribute("trainers",ss.getTrainers());
       return "trainers";
   }
 
 
 @RequestMapping(value="/{id}",method= RequestMethod.GET)
   public String getTrainerById(ModelMap model,@PathVariable String id){
       model.addAttribute("trainers",ss.getTrainerById(Integer.parseInt(id)));
       return "index";
   }
   
   @RequestMapping(value = "/insert", method = RequestMethod.GET)
      public String insertTrainers(ModelMap model){
          Trainer t= new Trainer();
          model.addAttribute("trainer",t);
      
      return "insert";} 
   
   
 @RequestMapping(value = "/insert", method = RequestMethod.POST)
      public String insertTrainer(@ModelAttribute("trainer")Trainer trainer, ModelMap model) {
          TrainerService ss = new TrainerService();
         
            ss.insertTrainer(trainer);
            
      return "redirect:/";
      }
 
   @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
 public String updateTrainer(ModelMap model, @PathVariable int id){
 Trainer t= ss.getTrainerById(id);
 model.addAttribute("trainer",t);
 model.addAttribute("message", "Update trainer");
 model.addAttribute("id","This is the id from the path:" +id);
 return "updatef";
 }
 
  @RequestMapping(value = "/updatef", method = RequestMethod.POST)
   public String updated(@ModelAttribute ("trainer") Trainer t,
    BindingResult result, ModelMap model){
   if (result.hasErrors()){
     return "error";}
     model.addAttribute("update",ss.updateTrainer(t));
      return "redirect:/";
 }
 
  
 




@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
      public String deleteTrainer(ModelMap model, @PathVariable String id){
         
          TrainerService ss = new TrainerService();
            ss.deleteTrainer(Integer.parseInt(id));
        
      
      return "redirect:/";} 


 }