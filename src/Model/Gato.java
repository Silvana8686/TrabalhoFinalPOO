package Model;


public class Gato extends Animal{
public String cores;  


public Gato(){
    
    }


public Gato (String nome, int id,String tomouVacina, String cores){
     
     this.nome =nome;
     this.id = id;
     this.tomouVacina = tomouVacina;
     this.cores = cores;
      
}


    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }
    

    @Override
    public void cadastrar() {
        
    }

    @Override
    public void Remover() {
        
    }
    
    
    @Override
    public String Informacoes(){
    return "{'Id': '" + id + "'Nome': '" + nome+ " 'Vacinado': '" + this.getTomouVacina() + "' , 'Peso': " +peso+ "'Kg'" +" , 'As cores': " + cores + " }";
    
    }

   
    
}

