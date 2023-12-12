public class OperacionesMatematicas
{
    public int num1,num2,num3;

    public double numero1,numero2;
    public OperacionesMatematicas(int num1, int num2,int num3)
    {
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;

    }

    public OperacionesMatematicas(double numero1, double numero2)
    {
        this.numero1=numero1;
        this.numero2=numero2;

    }
    public int sumaValores(int num1,int num2)
    {
       System.out.println("La suma es:"+(num1+num2));
       return num1+num2;
    }

    public int sumaValores(int num1,int num2,int num3)
    {
        System.out.println("La suma es:"+(num1+num2+num3+5));
        return num1+num2+num3+5;
    }
    public double sumaValores(double numero1,double numero2)
    {
        System.out.println("La suma es:"+(numero2+numero1+2));

        return numero2+numero1+2;

    }
    public static void main(String[]args)
    {
        OperacionesMatematicas op1= new OperacionesMatematicas (10 , 20 ,5 );
        OperacionesMatematicas op2 = new OperacionesMatematicas(10.2,20.5);

        System.out.println("SUMA 1: ");
        op1.sumaValores(op1.num1,op1.num2);
        System.out.println("SUMA 2: ");
        op2.sumaValores(op2.numero1,op2.numero2);
        System.out.println("SUMA 3: ");
        op1.sumaValores(op1.num1, op1.num2, op1.num3);
    }
}

