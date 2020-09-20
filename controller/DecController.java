//Klash gia diaxireish ths apokruptografhshs
package controller;



import model.Decryptor;



public class DecController {
    
    private Decryptor myDec;
    
    public DecController(String type,String sStringKey){
        char[] sCharKey=sStringKey.toCharArray();
        byte[] sByteKey=new byte[sCharKey.length];
        
        for(int i=0;i<sByteKey.length;i++){
		 sByteKey[i] = (byte)sCharKey[i];
	}
        
        this.myDec=new Decryptor(type,sByteKey);
    }
    
    
 //   public DecController(String type,byte[] sKey){
     
 //       this.myDec=new Decryptor(type,sKey);
 //   }
    
    
    public String Decrypt(String path,String text){
        String decText=myDec.DecryptText(text);
        return decText;
    }
    
    
    
    
}
