package com.day17.InterfaceAssignment;
public class WebPage implements Searchable {
    String content;
    public WebPage(String c){ content=c; }
    public boolean search(String keyword){ return content.contains(keyword); }
}
