/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiffiHelman;

import java.math.BigInteger;
import javax.management.openmbean.SimpleType;

/**
 *
 * @author Hasan Asadi
 */
public class TestValue {
    public static void main(String[] args) {
        DiffiHelman alice=new DiffiHelman("6");
        BigInteger PuKeyAlice=alice.generatePublicKey();
        System.out.println("Public key is: "+PuKeyAlice);
        
        DiffiHelman bob=new DiffiHelman("5");
        
        System.out.println("Shared key is: "+bob.generateSharedKey(PuKeyAlice.toString()));

    }
}
