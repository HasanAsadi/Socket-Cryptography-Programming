/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiffiHelman;

import java.math.BigInteger;
import java.security.PublicKey;
import java.util.function.BiConsumer;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author Hasan Asadi
 */
public class DiffiHelman {

    private BigInteger a,p,g,publicKey;
    
    public DiffiHelman(String x) {
        this.a=new BigInteger(x);
        //g<p and a<p
        this.p=new BigInteger("405623"); //17
        this.g=new BigInteger("11"); //6
        
    }
    
    public BigInteger generatePublicKey(){
        BigInteger b=g.modPow(a, p);
        if(b!=BigInteger.ZERO)
            return b;
        else 
            return BigInteger.ZERO;
    }
    public BigInteger generateSharedKey(String publicKey){
        //server shared key=(clientPublicKey^ServerPrivateKey)mod p
        this.publicKey=new BigInteger(publicKey);
        return this.publicKey.modPow(a,p);
    }
    
}
