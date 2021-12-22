package sampleProj.javaAssignments.assignment1;

import java.util.Scanner;

public class TestCTC {
	public static void main(String[] args) 
	{
		int ctc;
		Scanner sc=new Scanner (System. in);
		System.out.println("Enter the CTC:");
		ctc=sc.nextInt();
		calculateTaxAmount(ctc);
	}

	private static void calculateTaxAmount(int ctc) {
		final int slabA_HighRange=180000;
		final int slabB_HighRange=300000;
		final int slabC_HighRange=500000;
		final int slabD_HighRange=1000000;
		double taxAmount = 0;
		if(ctc>slabD_HighRange) {
			System.out.println("CTC can not be greater than "+slabD_HighRange);
			return;
		}
		if(ctc>slabC_HighRange && ctc <= slabD_HighRange) {
			taxAmount = ((ctc-slabC_HighRange)*0.3) + ((slabC_HighRange-slabB_HighRange)*0.2) + ((slabB_HighRange-slabA_HighRange)*0.1);
		}else if(ctc>slabB_HighRange && ctc <= slabC_HighRange) {
			taxAmount = ((slabC_HighRange-slabB_HighRange)*0.2) + ((slabB_HighRange-slabA_HighRange)*0.1);
		}else if(ctc>slabA_HighRange && ctc <= slabB_HighRange) {
			taxAmount = ((slabB_HighRange-slabA_HighRange)*0.1);
		}

		System.out.println(taxAmount);

	}

}
