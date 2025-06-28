package com.design_patterns.creational.factory.models;

import com.design_patterns.creational.factory.type.Computer;
import lombok.ToString;

@ToString
public class SuperComputer implements Computer {
        private String ram;
        private String hdd;
        private String processor;

        public SuperComputer(String ram, String hdd, String processor) {
                this.ram = ram;
                this.hdd = hdd;
                this.processor = processor;
        }

        @Override
        public String getRam() {
                return ram;
        }

        @Override
        public String getHDD() {
                return hdd;
        }

        @Override
        public String getProcessor() {
                return processor;
        }
}
