package encapsulation;

public class Encpsu {
private int num;
private String name;
private double digit;

public int getNum() {
	return num;
}
public String getName() {
	return name;
}
public double getDigit() {
	return digit;
}

public void setValue(int num) {
	this.num=num;
}
public void setValue(String name) {
	this.name=name;
}
public void setValue(double digit) {
	this.digit=digit;
}
public Encpsu(int num, String name,double digit) {
	this.num=num;
	this.name=name;
	this.digit=digit;
}
}
