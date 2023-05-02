package com.TP2;
import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args) {
		int[] Tab = new int [args.length];
		int min=999;
		for(int i=0;i<args.length;i++) {
			
			// Boucle de test
			for(int j=i;j<args.length;j++) {
				//Test min
				if(Integer.parseInt(args[j]) < min)
					min=Integer.parseInt(args[j]);
			}
			Tab[i]=min;
			
		}
		for(int i=0;i<args.length;i++) {
			System.out.print(Tab[i]+" ");
		}
	}

}
