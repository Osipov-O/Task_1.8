package com.company;

public class Main {

    public static void main(String[] args) {
	double a=5;
	double b=8;
	double c=10;
	double d=4;
	double ab_min, cd_min;
	if ( a <= b ) ab_min = a;
	else ab_min = b;
	if ( c <= d ) cd_min = c;
	else  cd_min = d;
	if (ab_min >= cd_min) System.out.println(ab_min);
	else System.out.println(cd_min);

    }
    }

