public class Arreglo {

    public static void sumarLista(int[] uni) {
        float suma=0;
        float promedio;
               
        
         // for (int i=0;i<uni.length;i++){  
         //   suma+=uni[i];     tambien podria haber sido asi
         
         for (int elemento:uni){
         suma+=elemento;
        }
        promedio=suma/uni.length;
        System.out.println("La suma de los elementos es "+suma); 
        System.out.println("El promedio de los elementos es "+promedio);
    }

    public static int buscarMayor(int[][] bidi) {
        int masgrande=0;
        for (int[] arreglos:bidi){
          for (int elemento:arreglos){
              if(elemento>masgrande){
                  masgrande=elemento;
              }
          }
        }
        System.out.println("El mayor es "+masgrande);
        return masgrande;
        
        }

    public static int cuentaVocales(String cadena) {
        String vocales="aeiou";
        int cantVocales=0;
        
        for (int i=0;i<cadena.length();i++){
            char a = cadena.charAt(i);
            for (int k=0;k<vocales.length();k++)
            {
                if (vocales.charAt(k)==a)
                    cantVocales++;
            }
            //if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
            //  cantVocales++;
            }
            System.out.println("La cantidad de vocales es "+cantVocales);
        return cantVocales;
    }

    public static int cuentaCaracter(String cadena, char a) {
       int cantRepet=0;
       
       for (int i=0;i<cadena.length();i++){
           char b = cadena.charAt(i);
           if (a==b)
               cantRepet++; //zaraza commit
       }
        System.out.println("La cantidad de caracteres es "+cantRepet);
                return cantRepet;
    }
}
