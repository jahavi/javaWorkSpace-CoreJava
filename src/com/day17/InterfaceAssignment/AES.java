package com.day17.InterfaceAssignment;
public class AES implements Encryptable {
    public String encrypt(String data){ return "AES:"+data; }
    public String decrypt(String encryptedData){ return encryptedData.replace("AES:",""); }
}
