package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //静态代理，通过实现共同的接口来实现具体的功能
        /*IntermediaryProxy intermediaryProxy = new IntermediaryProxy(new RentHouse());
        intermediaryProxy.sentHouse();*/
        JDKDynamicProxy proxy = new JDKDynamicProxy(new Student("张三"));
        Person student = (Person) Proxy.newProxyInstance(proxy.getClass().getClassLoader(), new Class[]{Person.class}, proxy);
        student.wakeup();
        student.sleep();
        JDKDynamicProxy proxy1 = new JDKDynamicProxy(new Doctcor("李四"));
        Person student1 = (Person) Proxy.newProxyInstance(proxy.getClass().getClassLoader(), new Class[]{Person.class}, proxy1);
        student1.wakeup();
        student1.sleep();

    }
}