package com.example.sections;

import com.example.policia.IObserver;

public interface IObservable {
    public void addObserver(IObserver iObserver);
    public void notifyObserver();
}
