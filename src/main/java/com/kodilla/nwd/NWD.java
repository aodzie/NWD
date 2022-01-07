package com.kodilla.nwd;
import java.util.*;
import java.lang.*;
import java.io.*;

public class NWD {
    public static void main(String[] args) {
        int a=2;
        int b=5;

        while (a != b){
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        System.out.println("Największy wspólny dzielnik (NWD) to: "+a);
    }
}
