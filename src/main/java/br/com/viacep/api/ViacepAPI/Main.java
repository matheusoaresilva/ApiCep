package br.com.viacep.api.ViacepAPI;

import br.com.viacep.api.ViacepAPI.model.Endereco;
import br.com.viacep.api.ViacepAPI.service.ServicoCep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira seu CEP: ");
		String cep = sc.next();

		Endereco endereco = ServicoCep.buscaEndereco(cep);

		System.out.println("CEP: " + endereco.getCep());
		System.out.println("Logradouro: " + endereco.getLogradouro());
		System.out.println("Complemento: " + endereco.getComplemento());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Localidade: " + endereco.getLocalidade());
		System.out.println("UF: " + endereco.getUf());
		System.out.println("DDD: " + endereco.getDdd());

	}

}
