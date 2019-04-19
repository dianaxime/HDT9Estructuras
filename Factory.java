/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hdt9;

/**
 *
 * @author DIANA
 * @param <Key>
 * @param <Value>
 */
public class Factory<Key, Value> {
    public BSTBalance<String,String> getTree(String tipo){
        if ("Splay".equals(tipo)){
            return new SplayTree<>();
        }
        else if ("RBT".equals(tipo)){
            return new RBT<>();
        }
        return null;
    }
}
