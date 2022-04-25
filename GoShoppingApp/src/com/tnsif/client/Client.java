package com.tnsif.client;
import com.tnsif.application.GSNormalAcc;
import com.tnsif.application.GSPrimeAcc;
import com.tnsif.application.GSShopFactory;

public class Client
{
	public static void main(String[] args)
	{
		//step a
		GSShopFactory gssfactory=new GSShopFactory();
		gssfactory.getNewPrimeAccount(810,"shubhangi",1999,true);
		gssfactory.getNewNormalAccount(111, "Tns",138,20);
		
		//step b
		GSPrimeAcc gsprime=new GSPrimeAcc(810, "shubhangi", 1999, true);
		gsprime.getAccNo();
		gsprime.getAccNm();
		gsprime.getCharges();
		gsprime.bookProduct(1999);
		gsprime.toString();
		
		GSNormalAcc gsnormal=new GSNormalAcc(111, "Tns",138, 20);
		gsnormal.getAccNo();
		gsnormal.getAccNm();
		gsnormal.getCharges();
		gsnormal.getDeliverycharges();
		gsnormal.bookProduct(138);
		gsnormal.toString();
		
	}


	

}