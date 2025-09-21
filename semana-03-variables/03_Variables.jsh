int duplicar(int a){
    var foo = a * 2;
    return foo;
}
duplicar(3)
duplicar(9)
int mod(int p, int q){
    var d = p / q;
    var r = d * q;
    var m = p - r;
    return m;
}
mod(3, 2)
mod(4, 2)
int diferenciaDeCuadrados(int a, int b){
    var cuadradoDeA = a * a;
    var cuadradoDeB = b * b;
    var diferenciaDeCuadrados = cuadradoDeA - cuadradoDeB;
    return diferenciaDeCuadrados;
}
diferenciaDeCuadrados(3, 4)
diferenciaDeCuadrados(2, 2)
double distancia(double x1, double y1, double x2, double y2){
    var primerPunto = (x2 - x1) * (x2 - x1);
    var segundoPunto = (y2 - y1) * (y2 - y1);
    var distancia = primerPunto + segundoPunto;
    return Math.sqrt(distancia);
}
distancia(0.0, 0.0, 1.0, 1.0)
distancia(0.0, 3.0, 4.0, 0.0)
double distanciaDos(double x1, double y1, double x2, double y2){
    var diferenciaX = (x2 - x1);
    var diferenciaY = (y2 - y1);
    var distancia = (diferenciaX * diferenciaX) + (diferenciaY * diferenciaY);
    return Math.sqrt(distancia);
}
distanciaDos(0.0, 0.0, 1.0, 1.0)
distanciaDos(0.0, 3.0, 4.0, 0.0)
double distanciaMejorada(double x1, double y1, double x2, double y2){
    var deltaX = (x2 - x1);
    var deltaY = (y2 - y1);
    var distancia = (deltaX * deltaX) + (deltaY * deltaY);
    return Math.sqrt(distancia);
}
distanciaMejorada(0.0, 0.0, 1.0, 1.0)
distanciaMejorada(0.0, 3.0, 4.0, 0.0)
double distanciaMejoradaDos(double x1, double y1, double x2, double y2){
    var deltaX = (x2 - x1);
    var deltaY = (y2 - y1);
    return Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
}
distanciaMejoradaDos(0.0, 0.0, 1.0, 1.0)
distanciaMejoradaDos(0.0, 3.0, 4.0, 0.0)
double fahrenheitACelcius(double tempFah){
    var celsius = (tempFah - 32) * 5 / 9;
    return celsius;
}
fahrenheitACelcius(60.0)
fahrenheitACelcius(32.0)
fahrenheitACelcius(86.45)
double gravedadSuperficial(double masa, double radio){ // Formula: G * masa / radio2
    double gravedad = 6.67430E-11;
    double numerador = gravedad * masa;
    double radioAlCuadrado = radio * radio;
    double fuerza = numerador / radioAlCuadrado;
    return fuerza;
}
gravedadSuperficial(5.972E24, 6.378E6)
gravedadSuperficial(6.421e23, 3.3972e6)
double gravedadSuperficialDeLaTierra(){ // Masa=5.972e24 y Radio=6.378e6
    double gravedad = 6.67430E-11;
    double masaTierra = 5.972e24;
    double radioTierra = 6.378e6;
    double numerador = gravedad * masaTierra;
    double radioAlCuadrado = radioTierra * radioTierra;
    double fuerza = numerador / radioAlCuadrado;
    return fuerza;
}
gravedadSuperficialDeLaTierra()
double gravedadSuperficialDeLaTierraDos(){ // Masa=5.972e24 y Radio=6.378e6
    double masaTierra = 5.972e24;
    double radioTierra = 6.378e6;
    double fuerza = gravedadSuperficial(masaTierra, radioTierra);
    return fuerza;
}
gravedadSuperficialDeLaTierraDos()
double gravedadSuperficialDeMarte(){ // Masa=6.421e23 y Radio=3.3972e6
    double masaMarte = 6.421e23;
    double radioMarte = 3.3972e6;
    double fuerza = gravedadSuperficial(masaMarte, radioMarte);
    return fuerza;
}
double pesoEnMarte(double pesoEnTierra){
    double pesoPersona = (gravedadSuperficialDeMarte() / gravedadSuperficialDeLaTierraDos()) * pesoEnTierra;
    return pesoPersona;
}
pesoEnMarte(80.0)
pesoEnMarte(65.0)
esTriangulo(3.0, 4.0, 5.0)
esTriangulo(17.0, 10.0, 7.0)
int numMayor(int a, int b){ // mi funcion para encontrar numero mayor
    return (a > b) ? a : b;
}
double numMayor(double a, double b){ // mi funcion para encontrar numero mayor
    return (a > b) ? a : b;
}
esTriangulo(3.0, 4.0, 5.0)
esTriangulo(17.0, 10.0, 7.0)
boolean esTriangulo(double a, double b, double c){
    double ladoMasLargo = numMayor(numMayor(a, b), c); // En lugar de mi funcion, inicialmente utilice Math.max()
    double sumaOtrosDosLados = a + b + c - ladoMasLargo; // Pero quise codificar la mía.
    return sumaOtrosDosLados > ladoMasLargo;
}
double ladoTriangulo(double a, double b, double gamma){
    return c;
}
double leyCosenos(double a, double b, double gamma){
    double gammaRadianes = Math.toRadians(gamma); // Convertir gamma de gardos a radianes
    //Calculaemos a2 + b2
    double a2 = Math.pow(a, 2.0);
    double b2 = Math.pow(b, 2.0);
    // Calculemos 2*a*b*cos(gamma)
    double CosGamma = 2.0 * a * b * Math.cos(gammaRadianes);
    // Aplicamos la fórmula
    double c = Math.sqrt(a2 + b2 - CosGamma); 
    return c;
}
leyCosenos(3.0, 4.0, 90.0)
leyCosenos(11.0, 11.0, 60.0)
promedio(11, 16)
promedio(2, 3)
double promedio(int edadMenor, int edadMayor){
    var sumaEdades = edadMenor + edadMayor;
    var promedio = sumaEdades / 2.0;
    return promedio;
}
promedio(11, 16)
promedio(2, 3)