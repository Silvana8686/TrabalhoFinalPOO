package view;

import Model.Cachorro;
import Model.Cavalo;
import Model.Gato;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class view {

    public static void main(String[] args) {
         String opcao = "s";
        

        List<Cachorro> pc = new ArrayList<>();
        List<Gato> gt = new ArrayList<>();
        List<Cavalo> cl = new ArrayList<>();
        
      
        while( ! opcao.equalsIgnoreCase( "n" )){
            String texto = "Digite sua opção para cadastrar um Animal: \n" + 
                    "1 - Cadastrar  Cachorro \n" + 
                    "2 - Remover Cachorro da Lista \n" + 
                    "3 - Listar de todos os Cachorros Cadatrados \n" + 
                    "4- Cadastrar Gato \n"+
                    "5 - Remover  Gato da Lista \n" +
                    "6 - Lista de todos os Gatos cadastrados \n" +
                    "7 - Cadastrar  Cavalo \n" + 
                    "8 - Remover Cavalo da Lista \n" + 
                    "9 - Listar de todos os Cavalos Cadatrados \n" + 
                    "n - Sair ";
            opcao =  JOptionPane.showInputDialog(texto);

            switch( opcao ){
                case "1":
                        
                    Cachorro n = new Cachorro();
                   
                    String id = JOptionPane.showInputDialog("Id do Animal");
                    id = id.replace(",", ".");
                    n.setId(Integer.valueOf( id ) );
                    
                    
                    String nome = JOptionPane.showInputDialog("Nome do Animal");
                    n.setNome(nome);
                    
                   
                    String tomouVacina = JOptionPane.showInputDialog("Animal está Vacinado?");
                    n.setTomouVacina(tomouVacina);
                    
                   
                    String peso = JOptionPane.showInputDialog("Qual o peso do Animal");
                    peso = peso.replace(",", ".");
                    n.setPeso(Double.valueOf( peso ) );
                    
                    
                     String tipoPelo = JOptionPane.showInputDialog("Tipo de pelo do Animal ====> Curto ou longo");
                    n.setTipoPelo(tipoPelo);
                    
                    
                    pc.add(n);
                    
                   
                    break;
                    
                    case "2":
                    int posn = Integer.valueOf(  JOptionPane.showInputDialog("Informe a posição que deseja remover:")  );
                    pc.remove(posn -1 );
                    break;
                    
                    
                case "3":
                    String cont = "";
                    for (Cachorro pi : pc) {
                        cont += pi.Informacoes()+ "\n";
                    }
                   JOptionPane.showMessageDialog(null, cont);
                    break;
                    
                    
                    
                    case "4":
                        
                     Gato g = new Gato();
                     
                    String idd = JOptionPane.showInputDialog("Id do Animal");
                    id = idd.replace(",", ".");
                    g.setId(Integer.valueOf( idd ) );
                    
                    
                    String nomee = JOptionPane.showInputDialog("Nome do Animal");
                    g.setNome(nomee);
                    
                   
                    String tomouVacinaa = JOptionPane.showInputDialog("Animal está Vacinado?");
                    g.setTomouVacina(tomouVacinaa);
                    
                   
                    String pesoo = JOptionPane.showInputDialog("Qual o peso do Animal");
                    peso = pesoo.replace(",", ".");
                    g.setPeso(Double.valueOf( pesoo ) );
                    
                    
                     String cores = JOptionPane.showInputDialog("Quais  cores do pelo do Animal");
                    g.setCores(cores);
                    
                    
                    gt.add(g);
                    
                    break;
                    
                    case "5":
                    int posnn = Integer.valueOf(  JOptionPane.showInputDialog("Informe a posição que deseja remover:")  );
                    gt.remove(posnn -1 );
                    break;
                    
                    
                    case "6":
                    String contt = "";
                    for (Gato pi : gt) {
                        contt += pi.Informacoes()+ "\n";
                    }
                   JOptionPane.showMessageDialog(null, contt);
                    break;
                    
                    
                    
                     case "7":
                        
                     Cavalo c = new Cavalo();
                     
                    String iddd = JOptionPane.showInputDialog("Id do Animal");
                    id = iddd.replace(",", ".");
                    c.setId(Integer.valueOf( iddd ) );
                    
                    
                    String nomeee = JOptionPane.showInputDialog("Nome do Animal");
                    c.setNome(nomeee);
                    
                   
                    String tomouVacinaaa = JOptionPane.showInputDialog("Animal está Vacinado?");
                    c.setTomouVacina(tomouVacinaaa);
                    
                   
                    String pesooo = JOptionPane.showInputDialog("Qual o peso do Animal");
                    peso = pesooo.replace(",", ".");
                    c.setPeso(Double.valueOf( pesooo ) );
                    
                    
                    String velocidade = JOptionPane.showInputDialog("Qual a Velocidade do Animal");
                    c.setVelocidade(velocidade);
                    c.cadastrar();
                     cl.add(c);
                    
                    break;
                    
                    case "8":
                        
                    int pposnn = Integer.valueOf(  JOptionPane.showInputDialog("Informe a posição que deseja remover:")  );
                   
                    gt.remove(pposnn -1 );
                   
                    break;
                    
                    
                    case "9":
                    String ccontt = "";
                    for (Cavalo pi : cl) {
                        ccontt += pi.Informacoes()+ "\n";
                    }
                   JOptionPane.showMessageDialog(null, ccontt);
                    break;
                    
                    
                case "n":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta");

            }
        }
   
    }
    
}


