import java.util.*;

public class DiccionarioCute {
    public static void main(String[] args) {
        // 1. Diccionario con cositas adorables (HashMap)
        HashMap<String, String> cuteDict = new HashMap<>();

        cuteDict.put("gatito", "kitten");
        cuteDict.put("arcoiris", "rainbow");
        cuteDict.put("pastelito", "cupcake");
        cuteDict.put("brillo", "sparkle");
        cuteDict.put("nube", "cloud");
        cuteDict.put("conejito", "bunny");
        cuteDict.put("corazón", "heart");
        cuteDict.put("estrella", "star");
        cuteDict.put("fresa", "strawberry");
        cuteDict.put("abrazo", "hug");
        cuteDict.put("dulce", "candy");
        cuteDict.put("flor", "flower");
        cuteDict.put("cachorro", "puppy");
        cuteDict.put("miel", "honey");
        cuteDict.put("burbuja", "bubble");
        cuteDict.put("mariposa", "butterfly");
        cuteDict.put("sonrisa", "smile");
        cuteDict.put("magia", "magic");
        cuteDict.put("osito", "teddy bear");
        cuteDict.put("hada", "fairy");

        List<String> palabrasEsp = new ArrayList<>(cuteDict.keySet());
        Collections.shuffle(palabrasEsp); // ¡Mezclamos para más diversión!

        Scanner reader = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        System.out.println("✨ ¡Holi! ¡Bienvenida/o al Desafío de Diccionario en inglés! ✨");
        System.out.println("¡Demuestra tu magia traduciendo estas 5 palabritas al inglés! 🌈💖\n");

        for (int i = 0; i < 5; i++) {
            String palabra = palabrasEsp.get(i);
            String traduccionOk = cuteDict.get(palabra);

            System.out.print("⭐ Pregunta " + (i + 1) + ": ¿Cómo se dice \"" + palabra + "\" en inglés? -> ");
            String respuesta = reader.nextLine().trim().toLowerCase();

            if (respuesta.equals(traduccionOk)) {
                System.out.println("¡SÍII! ¡Eres brillante! ✨🦄");
                correctas++;
            } else {
                System.out.println("¡Oh no, pequeño error! Pero no te rindas, era: \"" + traduccionOk + "\" 🌸");
                incorrectas++;
            }
            System.out.println();
        }

        // Final lleno de energía
        System.out.println("------------------------------------------");
        System.out.println("¡YAAAAAY! ¡Terminamos el juego! 🎉");
        System.out.println("🌟 Aciertos mágicos: " + correctas);
        System.out.println("☁️ Errores pequeñitos: " + incorrectas);

        if (correctas == 5) {
            System.out.println("\n¡WOW! ¡Eres una superestrella total! ¡Puntuación perfecta! 🎀👑✨");
        } else {
            System.out.println("\n¡Lo hiciste súper bien! ¡Sigue brillando y practicando! 💖🍰");
        }

        reader.close();
    }
}