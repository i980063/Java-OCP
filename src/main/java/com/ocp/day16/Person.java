package com.ocp.day16;

public class Person {
    private String name;
    private Double h;
    private Double w;

    public Person() {
    }

    public Person(String name, Double h, Double w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

@Override
    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            Person p = (Person)obj;
            if(name.equals(p.name) && 
               h.doubleValue() == p.h.doubleValue() && 
               w.doubleValue() == p.w.doubleValue()) {
                return true;
            }
        }
        return false; 
    }
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", h=" + h + ", w=" + w + '}';
    }
    
}
