package net.v.prac.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class AddReq {

    @XmlElement(name = "x", namespace = CommonConst.CALC_NAMESPACE)
    private int x;

    @XmlElement(name = "y", namespace = CommonConst.CALC_NAMESPACE)
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "AddReq{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
