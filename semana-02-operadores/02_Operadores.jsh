int multiplicacion(int numero1, int numero2){
    return numero1 * numero2;
}
multiplicacion(9,8)
int suma(int numero1, int numero2){
    return numero1 + numero2;
}
suma(25,45)
boolean positivoMenorDe20(int numero){
    return numero > 0 && numero < 20;
}
positivoMenorDe20(56)
positivoMenorDe20(6)
truncado(123)
truncado(456)
truncado(9)
truncado(0)
int truncado(int n){
    return n / 10;
}
truncado(123)
truncado(456)
truncado(9)
truncado(0)
int ultimoDigito(int n){
    return n % 10;
}
ultimoDigito(123)
ultimoDigito(456)
ultimoDigito(9)
ultimoDigito(0)
boolean unicoDigito(int n){
    return (n >= 0) && (n < 10);
}
unicoDigito(0)
unicoDigito(1)
unicoDigito(5)
unicoDigito(9)
unicoDigito(10)
unicoDigito(88)
String signo(int n){
    return (n >= 0) ? "no-negativo" : "negativo";
}
signo(0)
signo(1)
signo(-1)
signo(-56)
signo(56)
boolean esPar(int n){
    return n % 2 == 0;
}
esPar(2)
esPar(13)
esPar(29)
esPar(30)
esPar(9856)
esPar(9857)
esPar(99999)
esPar(7457)
esPar(74876)
boolean esImpar(int n){
    return n % 2 != 0;
}
esImpar(25)
esImpar(22)
int diferenciaDeCuadrados(int a, int b){
    return (a * a) - (b * b);
}
diferenciaDeCuadrados(3, 2)
diferenciaDeCuadrados(1, 1)
double tercerAngulo(double a, double b){
    return 180 - (a + b);
}
tercerAngulo(60, 60)
tercerAngulo(45, 90)
tercerAngulo(35, 50)
validarMultiploDe7(-7)
validarMultiploDe7(-7)
validarMultiploDe7(0)
validarMultiploDe7(91)
validarMultiploDe7(9100)
boolean validarMultiploDe7(int n){
    return (n % 7 == 0) && (n > 0) && (n < 1000);
}
validarMultiploDe7(-7)
validarMultiploDe7(0)
validarMultiploDe7(91)
validarMultiploDe7(9100)
boolean validar(int inicio, int mitad, int tamano){
    return (inicio >= 0) && (inicio < mitad) && (mitad < tamano);
}
validar(0, 1, 2)
validar(1, 1, 2)
validar(2, 1, 3)
validar(0, 3, 3)
validar(1, 3, 5)
double cobro(int minutos){
    double cobroMinimo = Math.max(100.0, minutos * 10.0);
    return Math.min(cobroMinimo, 3000.0);
}
cobro(1)
cobro(10)
cobro(15)
cobro(90)
cobro(1_000)
int inicio(int resultados, int pagina){
    return (resultados * pagina) - resultados;
}
inicio(6, 1)
inicio(6, 2)
inicio(6, 3)
inicio(10, 2)