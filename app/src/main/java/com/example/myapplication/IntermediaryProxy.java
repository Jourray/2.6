package com.example.myapplication;

public class IntermediaryProxy implements IRentHouse {
    private IRentHouse iRentHouse;

    public IntermediaryProxy(IRentHouse rentHouse) {
        this.iRentHouse = rentHouse;

    }
    @Override
    public void sentHouse() {
            iRentHouse.sentHouse();
    }

}
