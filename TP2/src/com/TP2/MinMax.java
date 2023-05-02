package com.TP2;

public class MinMax {
	static int min=999;
	static int max=0;
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			if(Integer.parseInt(args[i]) < min) {
			min=Integer.parseInt(args[i]);
			}
			if(Integer.parseInt(args[i]) > max) {
			max=Integer.parseInt(args[i]);
			}

		}
			System.out.print(min +"\n"+max);
	}

}
