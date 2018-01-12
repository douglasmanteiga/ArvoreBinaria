package arvorebinaria;

/**
 *
 * @author Douglas
 */
public class ArvoreBinaria {
    
    private BinaryTre raiz;
    
    public static void main(String[] args) {
        
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(5);
        arvore.inserir(4);
        arvore.inserir(9);
        arvore.inserir(1);
    }
    
    public void inserir(int valor) {
        if (raiz == null) {
            raiz = new BinaryTre(valor);
        } else {
            BinaryTre novo = new BinaryTre(valor);
            inserir(raiz, novo);
        }
        
        System.out.println(soma());
    }
    
    public void inserir(BinaryTre arvore, BinaryTre novo) {
        if (novo.valor > arvore.valor) {
            if (arvore.right == null) {
                arvore.right = novo;
            } else {
                inserir(arvore.right, novo);
            }
        } else {
            if (arvore.left == null) {
                arvore.left = novo;
            } else {
                inserir(arvore.left, novo);
            }
        }
    }
    
    public int soma() {
        return raiz == null ? 0 : raiz.soma();
    }
}
    


