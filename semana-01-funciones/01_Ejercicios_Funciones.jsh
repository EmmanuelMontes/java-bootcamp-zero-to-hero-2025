String err1(){ // Primer ejercicio
    return "¿Donde esta el error?";
}
err1()
String err2(){ // Segundo ejercicio
return "String o string";
}
err2()
String err3(String who){ // Tercer ejercicio
    return String.format("%s, cuál es el error?", who);
}
err3("Ya sé")
String err4(){ // Cuarto ejercicio
    return "Este es un error sutil";
}
err4()
String err5() { // Quinto ejercicio
    return "Este es un poco menos sutil";
}
err5()
String err6() { // Sexto ejercicio
    return "¡Hola Error!";
}
err6()
String err7(String quien) { // Séptimo ejercicio
    return String.format("%s ¿Un poco mañoso, no?", quien);
}
err7("El error")
String adivinaLaPelicula(String emoji1, String emoji2, String emoji3) { // Octavo ejercicio "Emojis"
    return String.format("[%s, %s, %s]", emoji1, emoji2, emoji3);
}
adivinaLaPelicula("❄", "🚢", "💏")
String konnichiwa(String dare) { // Noveno ejercicio "Saludo Japonés"
    return String.format("Hola en Japonés %s", dare);
}
konnichiwa("Emmanuel")
String separador() { //Décimo ejercicio "Separador"
    return "<<<>>>";
}
separador()
String vocales() { // Undécimo ejercicio "Vocales"
    return "aeiou";
}
vocales()
String tituloAdornado(String palabra) { // Doceavo ejercicio
    return String.format("<<< %s >>>", palabra);
}
tituloAdornado("Java")
tituloAdornado(">>> <<<")
tituloAdornado("A + B")
String adornar(String frase) { // Treceavo ejercicio corregido
    return String.format("<=%s=>", frase);
}
adornar("Java")
adornar("Mundo")
String concatenar(String s1, String s2) { //Decimo cuarto ejercicio corregido
    return String.format("[%s + %s]", s1, s2);
}
concatenar("Hola", "Mundo")
concatenar("A", "Z")