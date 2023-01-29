package br.com.viacep.api.ViacepAPI.Utils;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {

    public static String convertJsonToString(BufferedReader bufferedReader) throws IOException {
        String resposta, jsonToString = "";

        while ((resposta = bufferedReader.readLine()) !=null){
            jsonToString += resposta;
        }
        return jsonToString;
    }
}
