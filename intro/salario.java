void main(){
    double salarioInicial=Double.parseDouble(IO.readln("Digite o salário inicial:"));

    double aumento=salarioInicial*0.1;

    double salarioFinal=salarioInicial+aumento;

    System.out.printf("O salário final com aumento de 10%% é de: %.2f", salarioFinal);
}

//sempre que quiser imprimir porcentagem como texto use %% duas vezes