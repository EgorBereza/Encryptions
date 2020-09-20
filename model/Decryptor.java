//Klash me thn leitourgikotita ths apokruptografhshs
package model;
import java.security.*;
import java.security.cert.*;
import java.security.interfaces.*;
import java.security.spec.*;
import javax.crypto.*;
import javax.crypto.interfaces.*;
import javax.crypto.spec.*;
import java.io.*;

public class Decryptor {
 
 private String type=null;
 private int keyLength;
 private byte[] sKey;
 
 public Decryptor(String type,byte[] sKey){
     this.type=type; 
     this.sKey=sKey;
 }
 
  public String DecryptText(String text){
      String deText = null;
      byte[] codedBytes;
      char[] codedChars;
      byte[] decoded;
      char[] decoded2;
      
     try{
         
         codedChars=text.toCharArray();
         codedBytes = new byte[codedChars.length];
         
         for(int i=0;i<codedChars.length;i++){
		 codedBytes[i] = (byte)codedChars[i];
         }
         
        Cipher desCipher = Cipher.getInstance(type); 
        SecretKey key = new SecretKeySpec(sKey,type);
        desCipher.init(Cipher.DECRYPT_MODE,key);
        
        decoded = desCipher.doFinal(codedBytes);
        decoded2= new char[decoded.length];
        
        for(int i=0;i<decoded.length;i++){
        decoded2[i] = (char)decoded[i];
        }
        
        deText=new String(decoded2);
         
     }
     catch(Exception e){
       deText =e.toString();
     }
      
      
      return deText;
      
  }
 
}
