# Projeto de Busca de Endereço por CEP
Este projeto é uma aplicação desenvolvida em Java Puro que tem como objetivo buscar informações de endereço a partir do CEP informado pelo usuário. A API utilizada é a [ViaCEP](https://viacep.com.br/) e a conversão de dados em formato JSON para Java é feita através da biblioteca GSON. 

## Funcionamento
Ao iniciar a aplicação, o usuário é solicitado a digitar o CEP desejado. Esse CEP é utilizado para montar a URL da API, que é acessada e os dados retornados são convertidos para um objeto Java usando a biblioteca GSON. 
Os dados retornados incluem informações como logradouro, bairro, cidade e estado. Eles são então exibidos na tela para o usuário.

## Bibliotecas Utilizadas
- [GSON](https://github.com/google/gson) para conversão de dados JSON para Java
- [Apache HttpComponents](https://hc.apache.org/) para requisições HTTP

Esse projeto esta disponível para ser utilizado, modificado, caso deseje adicionar funcionalidades, corrigir bugs ou personalizar de acordo com suas necessidades.
Espero que este projeto possa ser útil e inspirador para quem deseja trabalhar com Java Puro e API. 
