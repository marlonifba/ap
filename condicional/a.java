void main(){
    int num1=Integer.parseInt(IO.readln("Informe um número: "));
    int num2=Integer.parseInt(IO.readln("Informe mais um número: "));

    if(num1>num2){
        IO.println("Resultado da subtração: " + (num1-num2));
    }else if(num2>num1){
        IO.println("Resultado da subtração: " + (num2-num1));
    }else{
        IO.println("Os dois números informados são iguais");
    }
}