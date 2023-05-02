package com.TP2;

public class Echo2 {

	public static void main(String[] args) {
		System.out.print("Coucou ");
		for(int i=0;i<args.length;i++) {
			if(args[i].length()>=5)
			System.out.print(args[i]+" ");
		}

	}

}
