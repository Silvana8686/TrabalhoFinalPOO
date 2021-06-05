package Model;

public abstract class Animal{
    
 public String nome;
 public double peso;
 public int id;
 String tomouVacina;
    
 public abstract void cadastrar();
 public abstract void Remover();
 
 
  public Animal(){
    
    }
 
 public Animal(String nome, int id,String tomouVacina){
     super();
     this.nome =nome;
     this.id = id;
     this.tomouVacina = tomouVacina;
     
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTomouVacina() {
        return tomouVacina;
    }

    public void setTomouVacina(String tomouVacina) {
        this.tomouVacina = tomouVacina;
    }

  public String Informacoes(){
        return null;
    
    }

}