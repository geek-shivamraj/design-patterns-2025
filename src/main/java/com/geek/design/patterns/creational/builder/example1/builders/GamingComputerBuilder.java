package com.geek.design.patterns.creational.builder.example1.builders;

import com.geek.design.patterns.creational.builder.example1.Computer;

public class GamingComputerBuilder implements Builder{

    private final Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void buildRAM(String ram) {
        computer.setRam(ram);
    }

    @Override
    public void buildStorage(String storage) {
        computer.setStorage(storage);
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
