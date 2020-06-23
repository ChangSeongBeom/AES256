package com.autoever.cipher;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;

public class AES256 {

	public static void main(String[] args) throws InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		// TODO Auto-generated method stub
		String id = "hackerljm";
	    String custrnmNo = "1234";
	    String custNm = "Á¤¹¬Å×½ºÆ®";
		
	    
	    AES256Cipher a256 = AES256Cipher.getInstance();
	    
	    String enId = a256.AES_Encode(id);
        String enYyyymmdd = a256.AES_Encode(custrnmNo);
        String enCustNm = a256.AES_Encode(custNm);

        String desId = a256.AES_Decode(enId);
        String desYyyymmdd = a256.AES_Decode(enYyyymmdd);
        String desCustNm = a256.AES_Decode(enCustNm);
        
        System.out.println(enYyyymmdd);

        
	}

}

