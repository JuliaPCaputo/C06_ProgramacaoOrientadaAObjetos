package br.inatel.cdg;

public class Conta {
    private Cliente[] clientes;
    private int numero;
    private float saldo;
    private float limite;

    public Conta() {
        setClientes(new Cliente[3]);
    }

    public void sacar(float quantia) {
        if (saldo < quantia) {
            System.out.println("Saldo insuficiente.");
        }
        else {
            this.saldo -= quantia;
            System.out.println("Saque realizado!");
        }
    }

    public void deposita(float quantia) {
        this.saldo += quantia;
    }

    // Getters e setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public float getLimite(){
        return this.limite;
    }

    public void setLimite(float limite){
        this.limite = limite;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
}
