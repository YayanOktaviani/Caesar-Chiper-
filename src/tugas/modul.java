/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Yayan
 */
public class modul {
    
   public static String encryption (String encryptionString, int encryptionCode){
        StringBuilder decryptionString = new StringBuilder();
        for (int i = 0; i < encryptionString.length(); i++ ){
            char c = encryptionString.charAt(i);
            c = (char) (c + encryptionCode % 26);
            decryptionString.append(c);
        }
        return decryptionString.toString();
    }

    public static String decryption (String decryptionString, int decryptionCode){
        StringBuilder encryptionString = new StringBuilder();
        for (int i = 0; i < decryptionString.length(); i++ ){
            char c = decryptionString.charAt(i);
            c = (char) (c - decryptionCode % 26);
            encryptionString.append(c);
        }
        return encryptionString.toString();
    }  
}
