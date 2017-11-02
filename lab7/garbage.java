class data
{int a;
int b;
data(int a,int b)
{this.a=a;
this.b=b;
}
protected void finalize()
{	System.out.println("discarded object attributes\n a="+a+"\tb="+b);

}

}
class garbage
{public static void main(String[] args) {
	data o=new data(12,20);
	data p=new data(178,256);
	o=p;
	System.gc();
	System.out.println("present object attributes\n a="+o.a+"\tb="+o.b);
}

}