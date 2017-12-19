
package com.ifpb.jsf.client;


import com.ifpb.shared.Calculadora;
import com.ifpb.shared.ServiceLocator;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CalculadoraControlador {
    private Calculadora calculadora;
    private int a;
    private int b;
    private int soma;
    
    @PostConstruct
    public void init(){
        calculadora = new ServiceLocator().lookup("host-core","3700","java:global/core/CalculadoraSimples");
    }
    
    public String somar(){
        this.soma = calculadora.somar(a, b);
        return null;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
    
}
