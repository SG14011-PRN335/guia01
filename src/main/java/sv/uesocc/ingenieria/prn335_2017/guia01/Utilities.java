/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.ingenieria.prn335_2017.guia01;

/**
 *
 * @author usuario
 */
public class Utilities {
    public static void main(String[] args) {
        System.out.println(getResume("When you were here before Couldn't look you in the eye You're just like an angel(RadioHead)"));
        String texto = "juan carlos santos";
        System.out.println(capitalizar(texto));
        System.out.print(contarCoincidencias("java o c, java", "java"));

    }
    /**
     * Metodo getResume limita el texto del post a 30 caractes
     */
    public static String getResume(String texto) {
        char caracter = ' ';
        String frase = "";
        int contador = 30;
        for (int i = 0; i < contador; i++) { //Limita el tamaño de la cadena de texto
            caracter = texto.charAt(i);//Ubica la pocision de la cadena
            //String axu = String.valueOf(caracter);
            //if (!axu.equals(" ")) { //coge la letra, si no es un espacio
                frase += caracter; //concatena el texto 
            //} else { //si es un espacio, agrega un espacio al contador
             //   frase += " ";//se concatena al texto un espacio
               // contador += 1;//aumenta el contador, por cada espacio existente
           // }
        }
        return frase; //Devuelve la cadena
    }
    
    /**
     * Metodo capitalizar, recibe el texto, cambia por incial mayuscula la primer letra de cada palabra 
     * y quita los dobles espacios
     */
    public static String capitalizar(String texto) {
        char[] caracteres = texto.toCharArray();
        
        for (int i = 0; i < texto.length(); i++) {// Recorre la cadena de texto
            caracteres[0] = Character.toUpperCase(caracteres[0]);//Convierte la primer letra en mayuscula
            if (caracteres[i] == ' ') {//Busca si hay espacio 
                caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);//Convierte la primer letra en mayuscula
            }
        }
        texto = String.valueOf(caracteres);//convierte en un String
        texto = (texto.replace("  ", " "));//reemplaza espacio doble por uno
        return texto;//retorna la cadena de texo
    }
    /**
     * Metodo contarCoincidencias, Muestra la cantidad de veces que se repite una palabra
     */
    public static int contarCoincidencias(String frase, String texto) { 
        int contador = 0;// Contador del numero de palabras

        while (frase.indexOf(texto) > -1) { //busca el primer caracter de la cadena
            frase = frase.substring(frase.indexOf(texto) + texto.length(), frase.length()); //devuelve una cadena de texto con el caracter indicado
            contador++;//agrega la cantidad de palabras ingresadas
        }
        return contador;//retorna la cantidad de palabras encontradas
    }   
    
}
