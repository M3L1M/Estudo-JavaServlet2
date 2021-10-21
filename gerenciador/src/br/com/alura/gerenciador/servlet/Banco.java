package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Empresa> lista=new ArrayList<>();
	
	static {
		Empresa empresa1=new Empresa();
		Empresa empresa2=new Empresa();
		empresa1.setNome("Vapo");
		empresa2.setNome("GermanGol");
		Banco.lista.add(empresa1);
		Banco.lista.add(empresa2);

	}
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		// TODO Auto-generated method stub
		return Banco.lista;
	}
}
