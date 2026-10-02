
/// Dada una lista de cadenas, crea una nueva lista que contenga las cadenas en mayúsculas.
void ej1() {
        /* FORMA 1 (remplazando la lista original)
        List<String> strings = Arrays.asList("uno", "dos", "tres", "cuatro");
        strings.replaceAll(String::toUpperCase);

        System.out.println(strings);
         */
    List<String> strings = Arrays.asList("uno", "dos", "tres", "cuatro");

    List<String> upperCase = strings.stream()
            .map(String::toUpperCase)
            .toList();

    System.out.println("EJERCICIO 1: " + upperCase);
}

/// Dada una lista de números, calcula la suma de todos los elementos.
// https://www.baeldung.com/java-stream-sum
void ej2() {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5);

    int suma = numbers.stream()
            .mapToInt(Integer::intValue)
            .sum();

    System.out.println("EJERCICIO 2: " + suma);
}

/// Dada una lista de números, encuentra el máximo y el mínimo
void ej3() {
    List<Integer> numbers = Arrays.asList(5,3,9,2,8);

    int max = numbers.stream()
            .mapToInt(v->v)
            .max().orElseThrow(NoSuchElementException::new);

    int min = numbers.stream()
            .mapToInt(v->v)
            .min().orElseThrow(NoSuchElementException::new);

    System.out.println("EJERCICIO 3: max = " + max + ", min = " + min);
}

/// Dada una lista de cadenas, elimina las cadenas duplicadas y obtén una lista sin duplicados
void ej4() {
    List<String> strings = Arrays.asList("a", "b", "a", "c", "b");

    List<String> sinDuplicados = strings.stream()
            .distinct()
            .toList();

    System.out.println("EJERCICIO 4: " + sinDuplicados);
}

/// Dada una lista de cadenas, cuenta cuántas de ellas contienen la letra "a".
void ej5() {
    List<String> strings = Arrays.asList("manzana", "banana", "pera", "uva", "sandía");

    long nPalabrasA = strings.stream()
            .filter(p -> p.contains("a"))
            .count();

    System.out.println("EJERCICIO 5: " + nPalabrasA);
}

/// Dada una lista de cadenas, crea una cadena que contenga todas las cadenas concatenadas.
void ej6() {
    List<String> strings = Arrays.asList("Hola", "a", "todos", "en", "Java");

    String cadenaConcatenada = strings.stream()
            .collect(Collectors.joining());

    // También se podría: String cadenaConcatenada = String.join("", strings);

    System.out.println("EJERCICIO 6: " + cadenaConcatenada);
}

/// Dada una lista de cadenas, ordénalas en orden alfabético.
void ej7() {
    List<String> strings = Arrays.asList("zorro", "perro", "gato", "elefante", "ratón");

    List<String> stringsSorted = strings.stream()
            .sorted()
            .toList();

    System.out.println("EJERCICIO 7: " + stringsSorted);
}

/// Dada una lista de números, crea dos listas separadas: una para los números pares y otra para los números impares.
void ej8() {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    List<Integer> pares = numbers.stream()
            .filter(n -> n%2==0)
            .toList();

    List<Integer> impares = numbers.stream()
            .filter(n -> n%2==1)
            .toList();

    System.out.println("EJERCICIO 8: pares -> " + pares + " | impares -> " + impares );
}

/// Dada una lista de objetos (por ejemplo, personas con nombres y edades), filtra los objetos que sean mayores de 18 años
void ej9() {
    List<Person> people = Arrays.asList(new Person("Alice", 25),
            new Person("Bob", 17),
            new Person("Charlie", 30));

    List<Person> people18 = people.stream()
            .filter(p -> p.getAge() >= 18)
            .toList();

    System.out.println("EJERCICIO 9: " + people18);
}

void main() {
    ej1();
    ej2();
    ej3();
    ej4();
    ej5();
    ej6();
    ej7();
    ej8();
    ej9();
}
