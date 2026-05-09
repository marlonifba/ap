void main(){
    int num1=Integer.parseInt(IO.readln("Informe um número: "));


    if(num1<0){
        IO.println("O módulo do número informado é: "+ (num1*(-1)));
    }else{
        IO.println("O módulo do número informado é: "+ num1);
    }
}