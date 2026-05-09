void main() {
    int num1 = Integer.parseInt(IO.readln("Digite a primeira nota:"));
    int num2 = Integer.parseInt(IO.readln("Digite a segunda nota:"));
    int num3 = Integer.parseInt(IO.readln("Digite a terceira nota:"));

    int media = (num1 + num2 + num3) / 3;

    System.out.printf("A média é: %d", media);
}
