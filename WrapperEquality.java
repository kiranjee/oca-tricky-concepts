package com.example;

class WrapperEquality {
  
  public static void main(String[] args) {
    
    short s1 = 9;
    Short s2 = 9;
    int i1 = 9;
    Integer i2=9;
    
    System.out.println(s1==i1);
    System.out.println(s2==i1);
    System.out.println(s1==i2);
    //System.out.println(s2==i2);
    
  }
  
}
