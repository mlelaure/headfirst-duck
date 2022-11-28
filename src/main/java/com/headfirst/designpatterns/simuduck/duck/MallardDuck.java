/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.headfirst.designpatterns.simuduck.duck;

import com.headfirst.designpatterns.simuduck.FlyBehavior.FlyWithWings;
import com.headfirst.designpatterns.simuduck.QuackBehavior.Quack;

/**
 *
 * @author mlelaure
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
    
}
