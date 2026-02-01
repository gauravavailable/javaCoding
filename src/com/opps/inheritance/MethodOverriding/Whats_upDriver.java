package com.opps.inheritance.MethodOverriding;

class Whats_1{
    Whats_1 sent(){
        System.out.println("Single-Tick");
        return new Whats_1();
    }
}

class Whats_2 extends Whats_1 {
    @Override
    protected Whats_1 sent() {
        System.out.println("Double-Tick");
        return new Whats_1();
    }

    public void VoiceMsg() {
        System.out.println("Voice-Note");
    }

    public void VideoCall() {
        System.out.println("Normal Video-Call");
    }
}

class Whats_3 extends Whats_2{
    @Override
    public Whats_2 sent(){
        super.sent();
        System.out.println("Blue-Tick");
        return new Whats_2();
    }
    @Override
    public void VideoCall(){
        super.VideoCall();
        System.out.println("Filter-VideoCall");
    }
}


public class Whats_upDriver {
    public static void main(String[] args) {
        Whats_3 w3 = new Whats_3();
        w3.sent();
        w3.VoiceMsg();
        w3.VideoCall();
    }
}
