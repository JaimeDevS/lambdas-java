# Lambdas Com Java
As interfaces funcionais fornecem tipos de destino para expressões lambda e referências de método.

![Java](https://github.com/JaimeMS/JaimeMS/blob/main/img/java.JPG)

## Pacote java.util.function 

- [Documentação](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)

#### Predicate
```
//Representa um predicado (função de valor booleano) de um argumento.
Predicate<Integer> isPar = (a) -> a % 2 == 0;
System.out.println(isPar.test(20));
```
#### Consumer
```
//Representa uma operação que aceita um único argumento de entrada e não retorna nenhum resultado.
Consumer<String> imprimir = valor -> System.out.println("Imprime algo " + valor);
imprimir.accept("ou algum valor informado");
```
#### Supplier
```
//Representa um fornecedor de resultados.
Supplier<List<String>> umaLista = () -> Arrays.asList("a","b","c");		
System.out.println(umaLista.get());
```
#### UnaryOperator
```
//Representa uma operação em um único operando que produz um resultado do mesmo tipo de seu operando.
UnaryOperator<Integer> aoQuadrado = a -> a * a;
System.out.println(aoQuadrado.apply(2));
```
#### BinaryOperator
```
//Representa uma operação sobre dois operandos do mesmo tipo, produzindo um resultado do mesmo tipo dos operandos.
BinaryOperator<Integer> media = (a, b) -> (a + b) / 2;
System.out.println(media.apply(7, 7));
```
#### Function
```
//Representa uma função que aceita um argumento e produz um resultado.
Function<Integer, String> conceito = n -> n >= 7 ? "Aprovado" : "Reprovado";
System.out.println(media.andThen(conceito).apply(7, 7));
```

#### BiFunction
```
//Representa uma função que aceita dois argumentos e produz um resultado.
BiFunction<Double, Double, String> resultado = 
    (a, b) -> ((a + b) / 2) >= 7 ? "Aprovado" : "Reprovado";
System.out.println(resultado.apply(7.5, 7.0));
```
