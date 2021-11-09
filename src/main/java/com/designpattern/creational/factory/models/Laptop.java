package com.designpattern.creational.factory.models;

import com.designpattern.creational.factory.type.Computer;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Laptop implements Computer {
        String ram;
        String hdd;
        String processor;

        public Laptop(String ram, String hdd, String processor) {
                this.ram = ram;
                this.hdd = hdd;
                this.processor = processor;
        }

        @Override
        public String getRam() {
                return this.ram;
        }

        @Override
        public String getHDD() {
                return this.hdd;
        }

        @Override
        public String getProcessor() {
                return this.processor;
        }
}
