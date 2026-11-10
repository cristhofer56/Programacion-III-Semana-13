public class Caja {
    static String[] productos = {"Teclado", "Mouse", "Monitor"};
    static int[] precios = {25, 10, 150};
    public static void main(String[] args) {
        int[] indices = {0, 1, 3, 2};
        String[] cantidades = {"2", "x", "1", "1"};
        int total = 0;
        int articulos = 0;
        for (int i = 0; i < indices.length; i++) {
            try {
                int s = precios[indices[i]] * Integer.parseInt(cantidades[i]);
                total += s;
                articulos++;
                System.out.println("Linea " + (i + 1) + ": $" + s);
            } catch (NumberFormatException e) {
                System.out.println("Linea " + (i + 1) + ": cantidad invalida");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Linea " + (i + 1) + ": producto inexistente");
            }
        }
        System.out.println("Total: $" + total);
    }
}