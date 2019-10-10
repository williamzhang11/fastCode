package com.xiu.fastCode.multhread.buildingh2o;

public class Solution1 {

	public static void main(String[] args) throws InterruptedException {

		final H2O h2o = new H2O();
        String input = "OOHHHH";
        char[] inputChar = input.toCharArray();
        for (int i = 0; i < inputChar.length; i++)
        {
            if (inputChar[i] == 'H')
            {
                Thread threadA = new Thread() {
                    
                    @Override
                    public void run()
                    {
                        try
                        {
                            h2o.hydrogen(new Runnable() {
                                
                                public void run()
                                {
                                    System.out.print("H");
                                }
                            });
                        }
                        catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                    }
                };
                threadA.start();
            }
            else
            {
                Thread threadA = new Thread() {
                    
                    @Override
                    public void run()
                    {
                        try
                        {
                            h2o.oxygen(new Runnable() {
                                
                                public void run()
                                {
                                    System.out.print("O");
                                }
                            });
                        }
                        catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                    }
                };
                threadA.start();
            }
        }

	}
}
