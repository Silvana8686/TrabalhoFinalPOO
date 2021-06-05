package Model;

import javax.swing.JOptionPane;

public class Cavalo extends Animal{
public  String velocidade;  


public Cavalo(){
    
    }

public Cavalo (String nome, int id,String tomouVacina, String velocidade){
     
     this.nome =nome;
     this.id = id;
     this.tomouVacina = tomouVacina;
     this.velocidade = velocidade;
      
}

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    
    @Override
    public void cadastrar() {
       String texto = "Nome: " + this.nome + "\n Cadastrado" ;
        JOptionPane.showMessageDialog(null, texto );
    }

    @Override
    public void Remover() {
        String texto = "Nome: " + this.nome + "\n Removido" ;
        JOptionPane.showMessageDialog(null, texto );
    }
   
    
    @Override
    public String Informacoes(){
         return "{'Id': '" + id + "'Nome': '" + nome+ " 'Vacinado': '" + this.getTomouVacina() + "' , 'Peso': " +peso+ "'Kg'" +" , 'Velocidade  do Animal': " + velocidade + " }";
    
    }
}
