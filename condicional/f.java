void main() {
    String nome = IO.readln("Digite o seu nome: ");
    int sexo = Integer.parseInt(IO.readln("Informe seu sexo, digite 1 para Masculino e 2 para Feminino: "));

    if (sexo == 1) {
        IO.println("Seja bem-vindo llmo. " + nome);
    } else if (sexo == 2) {
        IO.println("Seja bem vinda llma Sra. " + nome);
    } else {
        IO.println(
                "Não foi possível identificar o sexo informado, O Número informado é inválido \n Digite 1 para sexo masculino ou 2 para o sexo Feminino");
    }
}