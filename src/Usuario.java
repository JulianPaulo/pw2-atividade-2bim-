public class Usuario {
    private String codigo;
    private String nome;
    private Double senha;
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

    public Double getSenha() {
        return senha;
    }

    public void setSenha(Double senha) {
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

    void usuario(String nome){
        if(nome != null)
            this.codigo = "pintoDoGrau";
            this.tentativasDeAcesso = 1;
            this.status = StatusUsuarioEnum.ATIVO;
            System.out.println("Senha Padrão: " + codigo);
            System.out.println("Status: " + status);

    }

}
