package lista1.questao11;

public class Exemplar {

    private int numeroTombo;
    private String titulo;
    private String autoria;
    private int QtdEmprestimos;
    private boolean habilitacao;

    public Exemplar(int numeroTombo, String titulo, String autoria, boolean habilitacao) {
        this.numeroTombo = numeroTombo;
        this.titulo = titulo;
        this.autoria = autoria;
        this.QtdEmprestimos = 0;
        this.habilitacao = habilitacao;
    }
    public int getNumeroTombo(){
        return numeroTombo;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutoria() {
        return autoria;
    }
    public int getQtdEmprestimos(){
        return QtdEmprestimos;
    }

    public void habilitarEmprestimo() {
        habilitacao = true;
        System.out.println("Emprestimo habilitado");
    }
    public void desabilitarEmprestimo() {
        habilitacao = false;
        System.out.println("Emprestimo desabilitado");
    }

    public void adicionarEmprestimo() {
        if(habilitacao == true) {
            QtdEmprestimos++;
            System.out.println("Emprestimo adicionado com sucesso");
        } else {
            System.out.println("Emprestimo não habilitado");
        }
    }
}