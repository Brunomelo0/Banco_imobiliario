package com.example.banco;

public class Banco {
    
    private float saldo;
	
	public Banco(float saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(float valor){
		this.saldo = saldo + valor;
	}
	public void sacar(float valor){
		this.saldo = saldo - valor;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}

