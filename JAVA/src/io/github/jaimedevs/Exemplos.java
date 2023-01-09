package io.github.jaimedevs;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Exemplos {
	public static void main(String[] args) {
		
		//Representa um predicado (fun��o de valor booleano) de um argumento.
		Predicate<Integer> isPar = (a) -> a % 2 == 0;
		System.out.println(isPar.test(20));
		
		//Representa uma opera��o que aceita um �nico argumento de entrada e n�o retorna nenhum resultado.
		Consumer<String> imprimir = valor -> System.out.println("Imprime algo " + valor);
		imprimir.accept("ou algum valor informado");
		
		//Representa um fornecedor de resultados.
		Supplier<List<String>> umaLista = () -> Arrays.asList("a","b","c");		
		System.out.println(umaLista.get());
		
		//Representa uma opera��o em um �nico operando que produz um resultado do mesmo tipo de seu operando.
		UnaryOperator<Integer> aoQuadrado = a -> a * a;
		System.out.println(aoQuadrado.apply(2));
		
		//Representa uma opera��o sobre dois operandos do mesmo tipo, produzindo um resultado do mesmo tipo dos operandos.
		BinaryOperator<Integer> media = (a, b) -> (a + b) / 2;
		System.out.println(media.apply(7, 7));
		
		//Represents a function that accepts one argument and produces a result.
		Function<Integer, String> conceito = n -> n >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(media.andThen(conceito).apply(7, 7));
		
		//Representa uma fun��o que aceita dois argumentos e produz um resultado.
		BiFunction<Double, Double, String> resultado = 
				(a, b) -> ((a + b) / 2) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado.apply(7.5, 7.0));
		
		
	}
}
