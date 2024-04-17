package day07.inherit;

public class Computer extends Calculator{

    @Override  // 부모 Calculator 기능 가져옴 !
    public double calcAreaCircle(int r) {
        //return super.calcAreaCircle(r);
        return r * r * Math.PI;
    }
}
