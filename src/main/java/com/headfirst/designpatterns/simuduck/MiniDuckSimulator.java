/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.headfirst.designpatterns.simuduck;

import com.headfirst.designpatterns.simuduck.duck.ModelDuck;
import com.headfirst.designpatterns.simuduck.duck.MallardDuck;
import com.headfirst.designpatterns.simuduck.duck.Duck;
import com.headfirst.designpatterns.simuduck.FlyBehavior.FlyRocketPowered;

/**
 *
 * @author mlelaure
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
