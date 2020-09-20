//Klash me thn leitourgikotita ths kruptografhshs
package model;

import java.security.*;
import java.security.cert.*;
import java.security.interfaces.*;
import java.security.spec.*;
import javax.crypto.*;
import javax.crypto.interfaces.*;
import javax.crypto.spec.*;
import java.io.*;


public class Encryptor {
    
 private String type=null;   //type (des,aes,3des)
 private int keyLength;
 private byte[] sKey;

 public Encryptor(String type){
     this.type=type;  
 }
 
 public Encryptor(String type,int keyLength){
     this.type=type; 
     this.keyLength=keyLength;
 }
 
 public String EncryptText(String text){
     String encText = null;
     char[] toCode;
     byte[] toCode2;
     byte[] coded;
     char[] coded2;
     
     try{
     
     KeyGenerator keygen = KeyGenerator.getInstance(type);
     SecretKey key = keygen.generateKey();
     Cipher cipher = Cipher.getInstance(type);
     cipher.init(Cipher.ENCRYPT_MODE, key);
     
     sKey=key.getEncoded();
     
     toCode = text.toCharArray();
     toCode2 = new byte[toCode.length];
     coded = new byte[toCode.length];
     
     for(int i=0;i<toCode.length;i++){
		 toCode2[i] = (byte)toCode[i];
     }
	
     coded = cipher.doFinal(toCode2);
     coded2 = new char[coded.length];
     
     for(int i=0;i<coded.length;i++){
        coded2[i] = (char)coded[i];
     }
     
     encText=new String(coded2);
     
     }
     catch(Exception e){
       encText=e.toString();
     }
     
     return encText;
     
 }
 
 
    public String getType() {
        return type;
    }

    public byte[] getsKey() {
        return sKey;
    }
 
 
 
 
    
}
