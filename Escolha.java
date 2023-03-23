public class Escolha {
    private String texto;
    private Capitulo proximo;

    public Escolha(String texto, Capitulo proximo){
        this.texto = texto;
        this.proximo = proximo;
    }
public String gettexto(){
    return this.texto;
}
public Capitulo getproximo(){
    return this.proximo;
}
}
