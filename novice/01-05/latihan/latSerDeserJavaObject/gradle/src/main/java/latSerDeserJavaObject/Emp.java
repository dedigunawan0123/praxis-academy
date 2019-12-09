/**
 * Ini adalah class Emp. Merupakan class untuk latihan Serialisasi dan Deserialisasi
 * Java Object, dengan nama object adalah Emp.
 * @author Dedi Gunawan
 * date : 9 Dec 2019
 */

package main.java.latSerDeserJavaObject;

import java.io.*; 
  
class Emp implements Serializable { 
private static final long serialversionUID = 
                                 129348938L; 
    transient int a; 
    static int b; 
    String name; 
    int age; 
  
    // Default constructor 
public Emp(String name, int age, int a, int b) 
    { 
        this.name = name; 
        this.age = age; 
        this.a = a; 
        this.b = b; 
    } 
  
} 