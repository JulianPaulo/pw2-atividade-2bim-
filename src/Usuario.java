public class Usuario {
    private String codigo;
    private String nome;
    private String senha;
    private int tentativasDeAcesso;
    private boolean primeiroAcesso;
    private String dataDeInativacao;
    private StatusUsuarioEnum status;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTentativasDeAcesso() {
        return tentativasDeAcesso;
    }

    public void setTentativasDeAcesso(int tentativasDeAcesso) {
        this.tentativasDeAcesso = tentativasDeAcesso;
    }

    public boolean isPrimeiroAcesso() {
        return primeiroAcesso;
    }

    public void setPrimeiroAcesso(boolean primeiroAcesso) {
        this.primeiroAcesso = primeiroAcesso;
    }

    public String getDataDeInativacao() {
        return dataDeInativacao;
    }

    public void setDataDeInativacao(String dataDeInativacao) {
        this.dataDeInativacao = dataDeInativacao;
    }

    public StatusUsuarioEnum getStatus() {
        return status;
    }

    public void setStatus(StatusUsuarioEnum status) {
        this.status = status;
    }

    Usuario(){
       senha = "etec#123";
    }

}