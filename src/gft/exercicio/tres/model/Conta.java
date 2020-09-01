package gft.exercicio.tres.model;

public abstract class Conta {
    //DECLARANDO ATRIBUTOS
protected int num;
protected String titular;
protected Double saldo;
    //METODO CONSTRUTOR PADRÃO
  public Conta() {
	
}
   //METODOS ACESSORES E MODIFICADORES
  public int getNum() {
	return num;
}
  public void setNum(int num) {
	this.num = num;
}
  public String getTitular() {
	return titular;
}
  public void setTitular(String titular) {
	this.titular = titular;
}
   public Double getSaldo() {
	return saldo;
}
    public void setSaldo(Double saldo) {
	this.saldo = saldo;
}
   //METODO PARA RETORNAR RENDIMENTO!
    public Double rendimento() {
	
	return this.saldo;
}


}