package testng;

import org.testng.annotations.Test;

public class Testnggrouping {




@Test(groups= {"smoke"})
public void test1()
{
	System.out.println("test1");
}


@Test(groups= {"smoke","sanity"})
public void test2()
{
	System.out.println("test2");
}



@Test(groups= {"sanity"})
public void test3()
{
	System.out.println("test3");	
}


@Test(groups= {"sanity"})
public void test4()
{
	System.out.println("test4");	
}


@Test(groups= {"smoke"})
public void test5()
{
	System.out.println("test5j8");	
}











}
