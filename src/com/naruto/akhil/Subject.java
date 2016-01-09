package com.naruto.akhil;


public interface Subject {
     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void notifyObservers();
}
