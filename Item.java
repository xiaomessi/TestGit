package com.fehead.collection;

import java.util.*;

public class Item implements Comparable<Item>{
    private String description;
    private int partNumber;

    //Construct an item
    public Item(String aDescription,int aPartNumber){
        description = aDescription;
        partNumber = aPartNumber;
    }

    //Gets the description of this item
    public String getDescription(){
        return description;
    }

    public String toString(){
        return "[description=" + description + ",partNumber=" + partNumber + "]";
    }

    public boolean equals(Object otherObject){
        if(this == otherObject)  return true;
        if(otherObject == null) return false;
        if(getClass() != otherObject.getClass()) return false;
        Item other = (Item) otherObject;
        return Objects.equals(description,other.description)&&partNumber == other.partNumber;
    }

    public int hashCode(){
        return Objects.hash(description,partNumber);
    }

    public int compareTo(Item other){
        int diff = Integer.compare(partNumber,other.partNumber);
        return diff !=0?diff:description.compareTo(other.description);
    }
}
