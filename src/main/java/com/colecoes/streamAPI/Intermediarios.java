//package com.colecoes.streamAPI;
//
//import com.colecoes.Estudante;
//import java.util.Collection;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Set;
//
//public class Intermediarios {
//
//  Collection<Estudante> entrada = obterEntrada() {
//    return Set.of(
//        new Estudante("2001", "Maria", "Computação"),
//        new Estudante("2002", "João", "Computação"),
//        new Estudante("2003", "José", "Pedagogia"),
//        new Estudante("2004", "Ana", "Computação"),
//        new Estudante("2005", "Bernardo", "Engenharia"),
//        new Estudante("2006", "Antônia", "Computação"));
//    );
//  }
//  List<String> matriculas = entrada.stream()
//      .filter(e -> "Computação".equals(e.getCurso()))
//      .sorted(Comparator.comparing(Estudante::getNome))
//      .map(Estudante::getMatricula)
//      .toList();
//
//    List<String> matriculas = entrada.stream().filter(e->)
//
//}
