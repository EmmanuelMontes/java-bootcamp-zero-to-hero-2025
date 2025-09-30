miDocumentacion()
miDocumentacion()
empiezaConMinuscula("manzana")
empiezaConMinuscula("Manzana")
pluralizar(2, "codigo")
pluralizar(3, "codigo")
pluralizar(2, "codigo")
esVocal('r')
esVocal('a')
esVocal('e')
esVocal('i')
esVocal('o')
esVocal('u')
esVocal('f')
titleCase("java")
titleCase("Java")
titleCase("JAVA")
terminaEnS("jueves")
terminaEnS("miercoles")
terminaEnS("sabado")
terminaEnS("Domingo")
terminaEnS("viernes")
terminaEnS("Animals")
terminaEnS("Programmer")
esPalindromo("oso")
esPalindromo("oo")
esPalindromo("yr")
esPalindromo("ab")
esPalindromo("ee")
esPalindromo("Aa")
esExterno("/definetely-internal")
esExterno("https://www.java.com")
esExterno("http://www.dont-go.com")
esExterno("ftp://10.25.110.2/")
extension("debug.sh")
extension("/path/debug.sh")
extension("/the.dot/file.java")
extension("no-extension")
dominio("https://www.java.com/en/")
dominio("https://jcp.org")
domingoDePascua(2024)
domingoDePascua(2025)
domingoDePascua(2026)
domingoDePascua(1961)
hexString(0, 0, 0)
hexString(255, 255, 255)
hexString(12, 15, 77)
correoElectronicoValido("abc@me.com")
correoElectronicoValido("abc@me.")
correoElectronicoValido("abc@mecom")
correoElectronicoValido("abc@me@com")
correoElectronicoValido("@me.com")
correoElectronicoValido("a.bc@me.com")
correoElectronicoValido("abc@me.co.m")
correoElectronicoValido("a@c@me.com")
elipsificar("Java is fun", 4)
elipsificar("Java is fun", 6)
elipsificar("Java is fun", 11)
elipsificar("Java is fun",20)
elipsificar("Java is fun, trust me!", 20)
elipsificar("Java is fun, trust me!", 2)
elipsificar("Java is fun, trust me!", 8)
elipsificar("Java is fun, trust me!", 10)
elipsificar("Java is fun", 4)
elipsificarDos("Java is fun", 4)
elipsificarDos("Java is fun", 6)
elipsificarDos("Java is fun", 11)
elipsificarDos("Java is fun", 20)
void miDocumentacion() {
    System.out.println("Bootcamp: Java Zero to Hero");
    System.out.println("Autor: Emmanuel Montes Lugo");
    System.out.println("Contacto: emmanuelmontes.edu@gmail.com");
    System.out.println("Fecha: 27-09-2025");
    System.out.println("Tema: Ejercicios practicos de String y StringBuilder");
    System.out.println("Version de Java: 24.0.2");
}
miDocumentacion()
miDocumentacion()
boolean empiezaConMinuscula(String s) { //E4.1
    var primerCaracter = s.charAt(0);
    return Character.isLowerCase(primerCaracter);
}
empiezaConMinuscula("manzana")
empiezaConMinuscula("Manzana")
String pluralizar(int conteo, String s) { //E4.2 Faltaba incluir el String en la salida.
    return (conteo < 2) ? s: s.format("%d %ss", conteo, s);
}
pluralizar(2, "codigo")
pluralizar(3, "codigo")
pluralizar(2, "codigo")
boolean esVocal(char letra) { //E4.3 Faltaban las comillas dobles para la cadena de vocales.
    var letraMinuscula = Character.toLowerCase(letra);
    return "aeiou".contains(Character.toString(letraMinuscula));
}
esVocal('r')
esVocal('a')
esVocal('e')
esVocal('i')
esVocal('o')
esVocal('u')
esVocal('f')
String titleCase(String texto) { //E4.4 Completar funcion.
    var primeraLetra = texto.substring(0, 1);
    var restoDelTexto = texto.substring(1);
    return String.format("%S%s", primeraLetra, restoDelTexto.toLowerCase());
}
titleCase("java")
titleCase("Java")
titleCase("JAVA")
boolean terminaEnS(String texto) { //E4.5 Completar la funcion.
    var ultimoCaracter = texto.substring(texto.length() - 1);
    return ultimoCaracter.equals("s") || ultimoCaracter.equals("S");
}
terminaEnS("jueves")
terminaEnS("miercoles")
terminaEnS("sabado")
terminaEnS("Domingo")
terminaEnS("viernes")
terminaEnS("Animals")
terminaEnS("Programmer")
boolean esPalindromo(String expresion) { // E4.6 Desarrollo de función esPalindromo()
    var longitudDos = expresion.length() == 2;
    var primerLetra = longitudDos ? Character.toLowerCase(expresion.charAt(0)) : ' ';
    var segundaLetra = longitudDos ? Character.toLowerCase(expresion.charAt(1)) : ' ';
    return longitudDos ? (primerLetra == segundaLetra) : false;
}
esPalindromo("oso")
esPalindromo("oo")
esPalindromo("yr")
esPalindromo("ab")
esPalindromo("ee")
esPalindromo("Aa")
boolean esExterno(String enlace) { // E4.7 desarrollo de la funcion esExterno()
    return enlace.startsWith("http://") || enlace.startsWith("https://");
}
esExterno("/definetely-internal")
esExterno("https://www.java.com")
esExterno("http://www.dont-go.com")
esExterno("ftp://10.25.110.2/")
String extension(String ruta) { // E4.8 Desarrollo de la función extension()
    var punto = ruta.lastIndexOf(".");
    var barra = ruta.lastIndexOf("/");
    return (punto > barra) ? ruta.substring(punto + 1) : "Archivo sin extensión.";
}
extension("debug.sh")
extension("/path/debug.sh")
extension("/the.dot/file.java")
extension("no-extension")
dominio("https://www.java.com/en/")
String dominio(String url) { // E4.9 Desarrollo de la función dominio()
    var inicioUrl = "https://".length(); // Marcar el punto de inciio del dominio.
    var finUrl = url.indexOf("/", inicioUrl); // utilizando la posición de inicio, ahora bsucamos la posicion del primer "/"
    return (finUrl != -1) ? url.substring(inicioUrl, finUrl) : url.substring(inicioUrl); // Si fin no es -1  es decir existe una "/" devuelve la subcadena desde el inicio hasta el fin.
    // De lo contrario devuelve desde el inciio hasta el final de la URL.
}
dominio("https://www.java.com/en/")
dominio("https://jcp.org")
String domingoDePascua(int anio) { // E4.10 Desarrollo de la función domingoDePascua()
    var a = anio % 19;
    var b = anio / 100;
    var c = anio % 100;
    var d = b / 4;
    var e = b % 4;
    var g = ((8 * b) + 13) / 25;
    var h = ((19 * a) + b - d - g + 15) % 30;
    var i = c / 4;
    var k = c % 4;
    var l = (32 + (2 * e) + (2 * i) - h - k) % 7;
    var m = (a + (11 * h) + (19 * l)) / 433;
    var n = (h + l - (7 * m) + 90) / 25;
    var p = (h + l - (7 * m) + (33 * n) + 19) % 32;
    

    // Agregar ceros si es necesario.
    var mes = n < 10 ? "0" + n : "" + n;
    var dia = p < 10 ? "0" + p : "" + p;
    
    return anio + "/" + mes + "/" + dia;
}
domingoDePascua(2024)
domingoDePascua(2025)
domingoDePascua(2026)
domingoDePascua(1961)
String hexString(int r, int g, int b) { // E4.11 Desarrollo de la funcion hexString()
    // Conversión de valor de dos digitos a hexadecimal en mayusculas y rellenando con ceros de hacer falta.
    return String.format("%02X%02X%02X", r, g, b);
}
hexString(0, 0, 0)
hexString(255, 255, 255)
hexString(12, 15, 77)
boolean correoElectronicoValido(String correo) { // E4.12 Desarrollo de a funcion correoElectronicoValido()
    var a = correo.indexOf("@");
    var b = correo.lastIndexOf("@");
    var punto = correo.indexOf(".", a + 1);
    var puntoFinal = correo.lastIndexOf(".");
    
    //Validamos el correo electrónico en el return.
    return a > 0 &&
           a == b &&
           punto > a + 0 &&
           puntoFinal > a + 1 &&
           puntoFinal < correo.length() - 1;
}
correoElectronicoValido("abc@me.com")
correoElectronicoValido("abc@me.")
correoElectronicoValido("abc@mecom")
correoElectronicoValido("abc@me@com")
correoElectronicoValido("@me.com")
correoElectronicoValido("a.bc@me.com")
correoElectronicoValido("abc@me.co.m")
correoElectronicoValido("a@c@me.com")
String elipsificar(String titulo, int longitud) { // E4.13 Desarrollo de la funcion elipsificar()
    var espacio = titulo.indexOf(' ', longitud); // Buscamos el primer espacio.
    
    // validacion de espacios para cortar.
    return (espacio == -1 || titulo.length() <= longitud) ? titulo : titulo.substring(0, espacio) + "...";
}
elipsificar("Java is fun", 4)
elipsificar("Java is fun", 6)
elipsificar("Java is fun", 11)
elipsificar("Java is fun",20)
elipsificar("Java is fun, trust me!", 20)
elipsificar("Java is fun, trust me!", 2)
elipsificar("Java is fun, trust me!", 8)
elipsificar("Java is fun, trust me!", 10)
elipsificarDos("Java is fun", 20)
String elipsificarDos(String titulo, int longitud) { // Ultimo ejercicio realizado con StringBuilder.
    StringBuilder sb = new StringBuilder(titulo);
    var corte = sb.indexOf(" ", longitud);
    return (corte != -1 && corte < sb.length() ? sb.substring(0, corte) + "..." : sb.length() > longitud ? sb.substring(0, longitud) + "..." : sb.toString());
}