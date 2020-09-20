//Klash gia diaxireish ths kruptografhshs kai dimiourgias arxeiwn meta thn kruptografhsh
package controller;

//String filePath = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));  euresh path gia arxeio

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import model.Encryptor;


public class EncController {
   
    private Encryptor myEnc;
    
    public EncController(String type){
        this.myEnc=new Encryptor(type);
    }
    
    public String Encrypt(String path,String text){
       String encText=myEnc.EncryptText(text);
       byte [] key =myEnc.getsKey();
       char [] charKey=new char[key.length];
       
      
       
       String filePath = path.substring(0,path.lastIndexOf(File.separator));
       File encFile=new File(filePath+File.separator+"textEncrypted.txt");          //arxeio me kruptografimebo text
       File keyFile=new File(filePath+File.separator+"textKey.txt");                   //arxeio me kleidi
       
  /*      allos tropos
       try (FileOutputStream fos = new FileOutputStream(filePath+File.separator+"textKey22.txt")) {
            fos.write(key);
       }
       catch(Exception e){
           
       }
       
  */     
       try{
       BufferedWriter writer = new BufferedWriter(new FileWriter(encFile));
       writer.write(encText);
       writer.close();
       
       for(int i=0;i<charKey.length;i++){
           charKey[i]=(char)key[i];
       }
       String stringKey=new String(charKey);
       
       BufferedWriter writer2 = new BufferedWriter(new FileWriter(keyFile));
       writer2.write(stringKey);
       writer2.close();
       
       
       }
       catch(Exception e){
            encText=e.toString();
       }
       
       
               
       return encText;
    }    
}
