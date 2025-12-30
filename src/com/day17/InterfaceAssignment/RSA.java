package com.day17.InterfaceAssignment;
public class RSA implements Encryptable {
    public String encrypt(String data){ return "RSA:"+data; }
    public String decrypt(String encryptedData){ return encryptedData.replace("RSA:",""); }
}
