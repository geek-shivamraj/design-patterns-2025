package com.geek.design.patterns.creational.builder.example1.builders;

import com.geek.design.patterns.creational.builder.example1.Computer;

public interface Builder {
    void buildCPU(String cpu);
    void buildRAM(String ram);
    void buildStorage(String storage);
    Computer getResult();
}
