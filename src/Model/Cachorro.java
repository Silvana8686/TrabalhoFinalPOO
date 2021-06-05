package Model;


public class Cachorro extends Animal {
public String tipoPelo; 


 public Cachorro(){
    
    }
 

public Cachorro (String nome, int id,String tomouVacina, double peso, String tipoPelo){
   
     this.nome =nome;
     this.id = id;
     this.peso = peso;
     this.tomouVacina = tomouVacina;
     this.tipoPelo = tipoPelo;
      
}

   
    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }
    

    @Override
    public void cadastrar() {
        
    }

    @Override
    public void Remover() {
        
    }
    
    
    @Override
    public String Informacoes(){
        return "{'Id': '" + id + "'Nome': '" + nome+ " 'Vacinado': '" + this.getTomouVacina() + "' , 'Peso': " +peso+ "'Kg'" +" , 'Pelagem': " + tipoPelo + " }";
    
    }

   
}
