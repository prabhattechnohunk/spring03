package org.example;

import org.springframework.stereotype.Service;

@Service(value="prabhatSocket")
public class Socket { // name of bean created will be socket
    private String spower;
    private String price;

    //these are getters and setters
    public String getSpower() {
        return spower;
    }

    public void setSpower(String spower) {
        this.spower = spower;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Socket{" +
                "spower='" + spower + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
