package br.edu.univas.si6.es4.prototype;

import java.util.ArrayList;
import java.util.List;

public class Paciente implements Cloneable {

	private String nome;
	private int idade;
	private String telefone;
	private int ddd;
	private List<Endereco> enderecos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	@Override
	public String toString() {
		String result = "Paciente: nome=" + nome + ", idade=" + idade
				+ ", telefone=" + telefone + ", ddd=" + ddd;
		result += "\nEndereços:";
		if(enderecos != null) {
			for(Endereco endereco: enderecos) {
				result += "\n\t" + endereco.toString();
			}
		}
		return result;
	}
	
	@Override
	public Paciente clone() {
		try {
			Paciente novo = (Paciente) super.clone();
			if(enderecos != null) {
				novo.enderecos = new ArrayList<>();
				for(Endereco endereco: enderecos) {
					Endereco novoEndereco = endereco == null ? null :
						endereco.clone();
					novo.enderecos.add(novoEndereco);
				}
			}
			return novo;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
