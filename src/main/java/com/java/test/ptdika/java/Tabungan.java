package com.java.test.ptdika.java;

public class Tabungan {
	
	String nama;
	int id;
	double saldo;
	
	public Tabungan(String intNama, int intId, double intSaldo) {
		nama = intNama;
		id = intId;
		saldo = intSaldo;
	}
	
	public Tabungan(String intNama, int intId) {
		nama = intNama;
		id = intId;
		saldo = 0;
	}
	
	public void cekSaldo() {
		System.out.println("Saldo anda saat ini adalah " + saldo);
	}
	

	public double setor(double amt) {
		saldo = saldo + amt;
		System.out.println(amt + " deposited");
		return saldo;
	}

	public double tarik(double amt) {
		if (saldo < amt) {
			System.out.println("Penarikan tidak dapat dilakukan karena saldo anda tidak cukup");
		} else {
			saldo = saldo - amt;
			System.out.println(amt + " withdrawn");
		}
		return saldo;
	}
	
	
}
