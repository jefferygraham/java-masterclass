package com.company;

public class Computer {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        this.theCase.pressPowerBtn();
        drawLogo();
    }

    private void drawLogo(){
        this.monitor.drawPixelAt(1200, 50, "yellow");
    }

}
