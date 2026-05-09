void main() {

    int num = Integer.parseInt(IO.readln("Informe um número: "));

    if (num < 0) {
        System.out.println("Nenhum valor válido foi informado.");
        return;
    }

    int maior = num;
    int menor = num;

    do {
        num = Integer.parseInt(IO.readln("Informe um número: "));

        if (num >= 0) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

    } while (num >= 0);

    System.out.println("Maior valor: " + maior);
    System.out.println("Menor valor: " + menor);
}
