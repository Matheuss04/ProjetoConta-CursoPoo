package contacorrente;
 
public class ContaCorrente {

    
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setnumConta(1111);
        p1.setDono("jubileu");
        p1.abrirConta("cc");
        
        
        Conta p2 = new Conta();
        p2.setnumConta(2222);
        p2.setDono("Creusa");
        p2.abrirConta("cp");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(100);
        
        p1.sacar(150);
        p1.fecharConta();
        

        
        p1.estadoatual();
        p2.estadoatual();

        
        
        
        
    }
   
    
    
}
