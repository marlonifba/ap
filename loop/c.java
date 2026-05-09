void main(){
    int soma=0;
    for(int i=1;i<=500;i++){

        if(i%2==0){
            soma+=i;
        }else{
            soma+=0;
        }
    }

    System.out.println("A soma dos números pares é: " + soma);
}