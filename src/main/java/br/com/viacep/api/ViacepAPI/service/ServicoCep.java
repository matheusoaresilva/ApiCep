package br.com.viacep.api.ViacepAPI.service;

import br.com.viacep.api.ViacepAPI.Utils.Util;
import br.com.viacep.api.ViacepAPI.model.Endereco;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServicoCep {

    static String webService = "http://viacep.com.br/ws/";
    static Integer codSucess = 200;

    public static Endereco buscaEndereco(String cep) throws Exception {
        String urlWeb = webService + cep + "/json";

        try{
            URL url = new URL(urlWeb);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            if (connection.getResponseCode() != codSucess)
                throw new RuntimeException("HTTP error code: " + connection.getResponseCode());

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String jsonToString = Util.convertJsonToString(reader);

            Gson gson = new Gson();
            Endereco endereco = gson.fromJson(jsonToString, Endereco.class);

            return endereco;

        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }

}
