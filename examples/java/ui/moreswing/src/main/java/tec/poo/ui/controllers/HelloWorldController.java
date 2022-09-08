package tec.poo.ui.controllers;

import tec.poo.ui.models.HelloWorldModel;
import tec.poo.ui.views.HelloWorldView;

public class HelloWorldController {
    
    private HelloWorldModel helloWorldModel;
    private HelloWorldView helloWorldView;

    public HelloWorldController(HelloWorldModel helloWorldModel, HelloWorldView helloWorldView) {
        this.helloWorldModel = helloWorldModel;
        this.helloWorldView = helloWorldView;
    }

    public String GetHelloWorld() {
        return helloWorldModel.getHelloWorld();
    }

    public void UpdateHelloWorld(String helloWorldText) {
        this.helloWorldModel.setHelloWorld(helloWorldText);
    }

}