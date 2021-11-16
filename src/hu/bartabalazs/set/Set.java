package hu.bartabalazs.set;

import java.util.ArrayList;
import java.util.List;

public class Set<T> { //T típusú elemek fogadására alkalmas
    private List<T> elements;

    public Set()
    {
        this.elements = new ArrayList<>();
    }

    public void add(T elemement)
    {
        if(!this.elements.contains(elemement)){
            this.elements.add(elemement);
        }
    }

    public boolean remove(T element)
    {
        boolean isRemoved = false;
        if(this.elements.contains(element)){
            this.elements.remove(element);
            isRemoved = true;
        }
        return isRemoved;
    }

    public int getSize(){
        return this.elements.size();
    }

    public void clear(){
        this.elements.clear();
    }

    public boolean isElement(T element){
        int i = 0;
        while (i < this.elements.size() && this.elements.get(i) != element)
        {
            i++;
        }

        return  i<this.elements.size();
    }

    public boolean isEmpty(){
        return this.elements.size() == 0;
    }

    public boolean isEquals(Set<T> otherSet){
        return this.getSize() == otherSet.getSize() && this.isPartOff(otherSet);
    }

    public boolean isPartOff(Set<T> otherSet){
        boolean isBigger = this.getSize() <= otherSet.getSize();
        boolean isPartof = false;
        if(!isBigger){
            int i = 0;
            while (i < this.getSize() && otherSet.isElement(this.elements.get(i)))
            {
                i++;
            }
            isPartof = i == this.getSize();
        }
        return isPartof;
    }

    public Set<T> unio(Set<T> otherSet)
    {
        Set<T> unioSet = new Set<>();
        for (T element: this.elements) {
            unioSet.add(element);
        }
        for (T element: otherSet.elements) {
            unioSet.add(element);
        }
        return unioSet;
    }

    public Set<T> intersect(Set<T> otherSet){
        Set<T> intersectSet = new Set<>();
        for (T element:this.elements) {
            for (T otherElement: otherSet.elements) {
                if(element == otherElement){
                    intersectSet.add(element);
                }
            }
        }
        return intersectSet;
    }
}
