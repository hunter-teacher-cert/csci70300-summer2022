public class TreeDriver{
  public static void main(String[]args){

    //1. Test out single value trees. They are the base case and
    //should be tested first!
    //2. Uncomment the 'Trees with children' section
    //3. Uncomment the 'Multi level trees' so you can work with more complex examples..


    //1. Single value trees
    ExpressionTree one = new ExpressionTree(1.0);
    ExpressionTree two = new ExpressionTree(2.0);
    ExpressionTree three = new ExpressionTree(3.0);
    ExpressionTree four = new ExpressionTree(4.0);
    ExpressionTree five = new ExpressionTree(5.0);
    ExpressionTree ten = new ExpressionTree(10.0);


    //Check your toString for single value trees.
    System.out.println("Should print 1.0 2.0 3.0 4.0 5.0 10.0 on separate lines");
    System.out.println(one);
    System.out.println(two);
    System.out.println(three);
    System.out.println(four);
    System.out.println(five);
    System.out.println(ten);

    //check your evaluate:

    System.out.println("Should print true 6 times");
    System.out.println(one.evaluate()==1.0);
    System.out.println(two.evaluate()==2.0);
    System.out.println(three.evaluate()==3.0);
    System.out.println(four.evaluate()==4.0);
    System.out.println(five.evaluate()==5.0);
    System.out.println(ten.evaluate()==10.0);


    //2. Trees with children
    //These need to be evaluated:
    /**
    ExpressionTree a = new ExpressionTree('+',one,one);//2.0  "(1.0 + 1.0)"
    ExpressionTree b = new ExpressionTree('-',five,ten);//-5.0 "(5.0 - 10.0)"
    ExpressionTree c = new ExpressionTree('*',three,four);//12.0 "(3.0 * 4.0)"
    ExpressionTree d = new ExpressionTree('/',one,two);//0.5 "(1.0 / 2.0)"
    System.out.println("Should print out the same thing as the comments in the source code:");
    System.out.println(a.toString() + " is equal to " + a.evaluate());
    System.out.println(b.toString() + " is equal to " + b.evaluate());
    System.out.println(c.toString() + " is equal to " + c.evaluate());
    System.out.println(d.toString() + " is equal to " + d.evaluate());
    */
    /** output:
    (1.0+1.0) is equal to 2.0
    (5.0-10.0) is equal to -5.0
    (3.0*4.0) is equal to 12.0
    (1.0/2.0) is equal to 0.5
    */


    //3. Multi level trees which need to be evaluated:
    /**
    ExpressionTree e = new ExpressionTree('/',c,two);
    ExpressionTree f = new ExpressionTree('-',c,ten);
    ExpressionTree g = new ExpressionTree('+',b,c);
    ExpressionTree h = new ExpressionTree('*',a,d);
    ExpressionTree i = new ExpressionTree('+',h,one);
    System.out.println("Should print out the same thing as the comments in the source code:");
    System.out.println(e.toString() + " is equal to " + e.evaluate());
    System.out.println(f.toString() + " is equal to " + f.evaluate());
    System.out.println(g.toString() + " is equal to " + g.evaluate());
    System.out.println(h.toString() + " is equal to " + h.evaluate());
    System.out.println(i.toString() + " is equal to " + i.evaluate());
    */
    /** output:
    ((3.0*4.0)/2.0) is equal to 6.0
    ((3.0*4.0)-10.0) is equal to 2.0
    ((5.0-10.0)+(3.0*4.0)) is equal to 7.0
    ((1.0+1.0)*(1.0/2.0)) is equal to 1.0
    (((1.0+1.0)*(1.0/2.0))+1.0) is equal to 2.0
    */

  }
}
