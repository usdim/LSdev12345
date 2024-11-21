package com.cataloge.com.cataloge;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Operation {

    public Operation() {
        products.add(new Product("Маршрутизатор Cisco C881-K9 ", "10/100 Мбит/с. При подключении Сisco 881 к виртуальным частным сетям используются технологии Cisco DMVPN, GET VPN или SSL VPN.", 1, 100));
        products.add(new Product("Маршрутизатор Eltex ESR-12VF", "Eltex 8 портов 1G, 1х1G (SFP), 3хFXS, 1хFXO, Firewall Perfomance 0,62 Гбит/с", 2, 1000));
        products.add(new Product("Маршрутизатор Eltex ESR-15", "Маршрутизатор Eltex 4 порта 1G, 2х1G (SFP), Firewall Perfomance 0,57 Гбит/с", 3, 1000));
        products.add(new Product("Маршрутизатор MikroTik CCR2004-16G-2S+PC", "16x Ethernet (1 Гбит/с) 2x SFP+ (10 Гбит/с)", 4, 1000));

    }

//12356


    List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }


    public Product getByid(int id) {

        for (int i = 0; i < products.size(); i++) {

            System.out.println(products.get(i).getId() == id);
            if (products.get(i).getId() == id) return products.get(i);
        }
        return null;

        // гет ай ди через цикл

    }

    public Object removeById(int id) {
        Product p = getByid(id);
        if (p != null)
            products.remove(p);


        return null;
    }
}


