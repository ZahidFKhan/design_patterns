package com.designpattern.creational.factory;

import com.designpattern.creational.factory.models.Laptop;
import com.designpattern.creational.factory.models.Server;
import com.designpattern.creational.factory.options.ComputerType;
import com.designpattern.creational.factory.type.Computer;

public class ComputerClient {
        public ComputerClient() {
        }

        public static void main(String[] args) {
                /*Without Factory, the problem is if we change constructor of laptop.
                 * we have to change it all places. and it is very tightly coupled.
                 * */
                Computer laptop = new Laptop("4Gb", "512GB", "i3");
                Computer server = new Server("4Gb", "512GB", "i3");

                System.out.println(laptop);
                System.out.println(server);


                Computer lappy1 = ComputerFactory.getInstance(ComputerType.LAPTOP, "4Gb", "512GB", "i3");
                Computer server1 = ComputerFactory.getInstance(ComputerType.SERVER, "4Gb", "512GB", "i3");
                Computer superComputer = ComputerFactory.getInstance(ComputerType.SUPER_COMPUTER, "4Gb", "512GB", "i3");

                System.out.println(lappy1);
                System.out.println(server1);
                System.out.println(superComputer);
        }
}
