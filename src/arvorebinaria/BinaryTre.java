package arvorebinaria;

public class BinaryTre {

    int valor;
    BinaryTre left;
    BinaryTre right;
        
    public BinaryTre(int valor)
    {
        this.valor = valor;
    }
    
    public int soma() {
        return valor + (right == null ? 0 : right.soma()) + (left == null ? 0 : left.soma());
    }   
}
