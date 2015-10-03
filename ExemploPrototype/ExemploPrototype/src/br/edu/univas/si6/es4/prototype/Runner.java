package br.edu.univas.si6.es4.prototype;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// Criação do protótipo:
		Paciente prototipo = createPrototype();

		// Criação do primeiro paciente:
		Paciente paciente1 = prototipo.clone();
		paciente1.setNome("João");
		paciente1.setIdade(30);
		paciente1.setTelefone("1234");
		paciente1.getEnderecos().get(0).setRua("Av. A");
		paciente1.getEnderecos().get(0).setNumero(20);

		// Criação do segundo paciente:
		Paciente paciente2 = prototipo.clone();
		paciente2.setNome("Maria");
		paciente2.setIdade(25);
		paciente2.setTelefone("4321");
		paciente2.getEnderecos().get(0).setRua("Av. B");
		paciente2.getEnderecos().get(0).setNumero(15);
		Endereco segundoEnderecoPaciente2 = new Endereco();
		segundoEnderecoPaciente2.setRua("Rua C");
		segundoEnderecoPaciente2.setNumero(30);
		segundoEnderecoPaciente2.setBairro("Bairro B");
		segundoEnderecoPaciente2.setCidade("SRS");
		segundoEnderecoPaciente2.setEstado("MG");
		segundoEnderecoPaciente2.setPais("Brasil");
		paciente2.getEnderecos().add(segundoEnderecoPaciente2);
		
		// Criação do terceiro paciente:
		Paciente paciente3 = prototipo.clone();
		paciente3.setNome("Antônio");
		paciente3.setIdade(80);
		paciente3.setTelefone("9876");
		paciente3.setDdd(31);
		paciente3.getEnderecos().get(0).setRua("Rua D");
		paciente3.getEnderecos().get(0).setNumero(56);
		paciente3.getEnderecos().get(0).setCidade("BH");

		System.out.println(paciente1);
		System.out.println(paciente2);
		System.out.println(paciente3);

		System.out.println(prototipo);
	}

	private static Paciente createPrototype() {
		Endereco enderecoPrototipo = new Endereco();
		enderecoPrototipo.setBairro("Centro");
		enderecoPrototipo.setCidade("Pouso Alegre");
		enderecoPrototipo.setEstado("MG");
		enderecoPrototipo.setPais("Brasil");
		Paciente prototipo = new Paciente();
		List<Endereco> enderecosPrototipo = new ArrayList<>();
		enderecosPrototipo.add(enderecoPrototipo);
		prototipo.setEnderecos(enderecosPrototipo);
		prototipo.setDdd(35);
		return prototipo;
	}

}
