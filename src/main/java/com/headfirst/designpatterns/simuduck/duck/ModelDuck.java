/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.headfirst.designpatterns.simuduck.duck;

import com.headfirst.designpatterns.simuduck.FlyBehavior.FlyNoWay;
import com.headfirst.designpatterns.simuduck.QuackBehavior.Quack;

/**
 *
 * @author mlelaure
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    
    public void display() {
        System.out.println("I'm a model duck");
    }
    
}
