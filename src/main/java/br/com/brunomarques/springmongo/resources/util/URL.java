package br.com.brunomarques.springmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

    private URL(){
        throw new IllegalStateException("Classe utilitária");
    }

    public static String decodeParam(String text){
        try {
            return URLDecoder.decode(text, "UTF-8");
        }catch(UnsupportedEncodingException ex){
            return "";
        }
    }
}
