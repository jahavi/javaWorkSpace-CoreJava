package com.day17.InterfaceAssignment;
public class Document implements Searchable {
    String text;
    public Document(String t){ this.text=t; }
    public boolean search(String keyword){ return text.contains(keyword); }
}
