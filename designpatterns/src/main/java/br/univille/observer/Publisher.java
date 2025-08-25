package br.univille.observer;

import java.util.ArrayList;

public class Publisher {
//    private Subscriber [] subscribers =
//        new Subscriber[10];

private ArrayList<Subscriber> subscribers =
        new ArrayList<Subscriber>();

    private String mainState;

    public String getMainState() {
        return mainState;
    }

    public void setMainState(String mainState) {
        this.mainState = mainState;
    }

    public void Subscriber (Subscriber assinante){
        subscribers.add(assinante);
    }
    public void notifyAllSubscribers(){
        for (Subscriber Umassinante : subscribers){
            Umassinante.update(mainState);
        }
    }
}


