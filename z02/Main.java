package fikt.inki.oop.z02;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
        try {
            BufferedReader object =  new BufferedReader(new InputStreamReader(System.in));
            String zbor = object.readLine();

            Recnik object1 = new Recnik();
            object1.zborovi();
            object1.prebaruvanje(zbor);
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }

}


