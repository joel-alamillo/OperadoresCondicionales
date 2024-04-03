//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class OperadoresCondicionales {
    public static void main(String[] args) {
        //operaciones condicionales and or
        var a = 11;
        var valorMinimo = 0;
        var valorMaximo = 10;

        //comprobacion si esta entre el rango 0 y 10
        var resultado = a >= valorMinimo && a <= valorMaximo;

        if (resultado){
            System.out.println("Esta dentro del rango 1 al 10");
        }else{
            System.out.println("Esta fuera del rango");
        }

        var vacaciones = true;
        var diaDescanso = false;

        if(vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego de su hijo");
        }else{
            System.out.println("El padre esta ocupado");
        }


    }
}