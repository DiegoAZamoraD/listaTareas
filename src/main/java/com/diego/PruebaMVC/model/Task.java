
package com.diego.PruebaMVC.model;


public class Task {

    //Atributos que representan la descripcion de la tarea
    private String description;
    
    // constructor
    public Task(String description){
        this.description = description;
    }
    
    //metodos accesores

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
