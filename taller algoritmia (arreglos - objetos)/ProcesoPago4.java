import java.util.Scanner;

public class ProcesoPago4 {
    public static void main(String[] args) {
      Scanner DD = new Scanner(System.in);

      double propina1, propina2, propina3, propina4, propina5, monto, total, subtotal, subtotal2;
      int propina, menu;

      System.out.println("Menú de Precios");
      System.out.println();
      System.out.println("elija su opción de precio según la comida seleccionada:");
      
      System.out.println();
      System.out.println("1. ajiaco bogotano: 19.800$ (propina incluida)");
      System.out.println("2. bandeja paisa: 29.800$ (propina incluida)");
      System.out.println("3. picada mixta: 39.800$ (propina incluida)");
      System.out.println("4. sushi express: 49.800$ (propina incluida)");
      System.out.println("5. langosta al vapor: 59.800$ (propina incluida)");
      System.out.println();

      menu = DD.nextInt();
      System.out.println("OK");
      System.out.println();

      switch (menu) {
        case 1:
          System.out.println("elija porcentaje de propina a regalar, no sea asi todo bien...   ud cree en Dios??? --- que mi Dios le pague (;");
          System.out.println();
          System.out.println("1. propina del 5%");
          System.out.println("2. propina del 10%");
          System.out.println("3. prpina del 13%");
          System.out.println("4. propina del 18%");
          System.out.println("5. propina del 20%");
          System.out.println();
          propina = DD.nextInt();
          System.out.println("OK");

            switch (propina) {
              case 1:
                System.out.println();
                System.out.print("ingrese monto a pagar: ");
                monto = DD.nextInt();
                System.out.println("OK");

                  if(monto > 19800) {
                    propina1 = 0.05;
                    subtotal = monto - 19800;
                    subtotal2 = subtotal * propina1;
                    total = subtotal - subtotal2;

                    System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ... ahora si abrace!");
                    System.out.println();
                  }
                  else {
                    System.out.println("si no le alcanza pida prestado");
                  }
                  break;

              case 2:
                System.out.println();
                System.out.print("ingrese monto a pagar: ");
                monto = DD.nextInt();
                System.out.println("OK");

                  if(monto > 19800) {
                    propina2 = 0.1;
                    subtotal = monto - 19800;
                    subtotal2 = subtotal * propina2;
                    total = subtotal - subtotal2;

                    System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                    System.out.println();
                  }
                  else {
                    System.out.println("si no le alcanza pida prestado");
                  }
                  break;

              case 3:
                System.out.println();
                System.out.print("ingrese monto a pagar: ");
                monto = DD.nextInt();
                System.out.println("OK");

                  if(monto > 19800) {
                    propina3 = 0.13;
                    subtotal = monto - 19800;
                    subtotal2 = subtotal * propina3;
                    total = subtotal - subtotal2;

                    System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                    System.out.println();
                  }
                  else {
                    System.out.println("si no le alcanza pida prestado");
                  }
                  break;

              case 4:
                System.out.println();
                System.out.print("ingrese monto a pagar: ");
                monto = DD.nextInt();
                System.out.println("OK");

                  if(monto > 19800) {
                    propina4 = 0.18;
                    subtotal = monto - 19800;
                    subtotal2 = subtotal * propina4;
                    total = subtotal - subtotal2;

                    System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                    System.out.println();
                  }
                  else {
                    System.out.println("si no le alcanza pida prestado");
                  }
                  break;

              case 5:
                System.out.println();
                System.out.print("ingrese monto a pagar: ");
                monto = DD.nextInt();
                System.out.println("OK");

                  if(monto > 19800) {
                    propina5 = 0.2;
                    subtotal = monto - 19800;
                    subtotal2 = subtotal * propina5;
                    total = subtotal - subtotal2;

                    System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                    System.out.println();
                  }
                  else {
                    System.out.println("si no le alcanza pida prestado");
                  }
                  break;

              default:
                  System.out.println("escoja una de las cinco opciones de propina");
            }
        break;

        case 2:
          System.out.println("elija porcentaje de propina a regalar, no sea asi todo bien...   ud cree en Dios??? --- que mi Dios le pague (:");
          System.out.println();
          System.out.println("1. propina del 5%");
          System.out.println("2. propina del 10%");
          System.out.println("3. prpina del 13%");
          System.out.println("4. propina del 18%");
          System.out.println("5. propina del 20%");
          System.out.println();
          propina = DD.nextInt();
          System.out.println("OK");

          switch (propina) {
            case 1:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 29800) {
                  propina1 = 0.05;
                  subtotal = monto - 29800;
                  subtotal2 = subtotal * propina1;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ... ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 2:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 29800) {
                  propina2 = 0.1;
                  subtotal = monto - 29800;
                  subtotal2 = subtotal * propina2;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 3:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 29800) {
                  propina3 = 0.13;
                  subtotal = monto - 29800;
                  subtotal2 = subtotal * propina3;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 4:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 29800) {
                  propina4 = 0.18;
                  subtotal = monto - 29800;
                  subtotal2 = subtotal * propina4;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 5:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 29800) {
                  propina5 = 0.2;
                  subtotal = monto - 29800;
                  subtotal2 = subtotal * propina5;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            default:
                System.out.println("escoja una de las cinco opciones de propina");
          }
        break;

        case 3:
          System.out.println("elija porcentaje de propina a regalar, no sea asi todo bien...   ud cree en Dios??? --- que mi Dios le pague (:");
          System.out.println();
          System.out.println("1. propina del 5%");
          System.out.println("2. propina del 10%");
          System.out.println("3. prpina del 13%");
          System.out.println("4. propina del 18%");
          System.out.println("5. propina del 20%");
          System.out.println();
          propina = DD.nextInt();
          System.out.println("OK");

          switch (propina) {
            case 1:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 39800) {
                  propina1 = 0.05;
                  subtotal = monto - 39800;
                  subtotal2 = subtotal * propina1;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ... ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 2:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 39800) {
                  propina2 = 0.1;
                  subtotal = monto - 39800;
                  subtotal2 = subtotal * propina2;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 3:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 39800) {
                  propina3 = 0.13;
                  subtotal = monto - 39800;
                  subtotal2 = subtotal * propina3;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 4:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 39800) {
                  propina4 = 0.18;
                  subtotal = monto - 39800;
                  subtotal2 = subtotal * propina4;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 5:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 39800) {
                  propina5 = 0.2;
                  subtotal = monto - 39800;
                  subtotal2 = subtotal * propina5;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            default:
                System.out.println("escoja una de las cinco opciones de propina");
          }
        break;

        case 4:
          System.out.println("elija porcentaje de propina a regalar, no sea asi todo bien...   ud cree en Dios??? --- que mi Dios le pague (:");
          System.out.println();
          System.out.println("1. propina del 5%");
          System.out.println("2. propina del 10%");
          System.out.println("3. prpina del 13%");
          System.out.println("4. propina del 18%");
          System.out.println("5. propina del 20%");
          System.out.println();
          propina = DD.nextInt();
          System.out.println("OK");

          switch (propina) {
            case 1:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 49800) {
                  propina1 = 0.05;
                  subtotal = monto - 49800;
                  subtotal2 = subtotal * propina1;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ... ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 2:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 49800) {
                  propina2 = 0.1;
                  subtotal = monto - 49800;
                  subtotal2 = subtotal * propina2;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 3:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 49800) {
                  propina3 = 0.13;
                  subtotal = monto - 49800;
                  subtotal2 = subtotal * propina3;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 4:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 49800) {
                  propina4 = 0.18;
                  subtotal = monto - 49800;
                  subtotal2 = subtotal * propina4;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 5:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 49800) {
                  propina5 = 0.2;
                  subtotal = monto - 49800;
                  subtotal2 = subtotal * propina5;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            default:
                System.out.println("escoja una de las cinco opciones de propina");
          }
        break;

        case 5:
          System.out.println("elija porcentaje de propina a regalar, no sea asi todo bien...   ud cree en Dios??? --- que mi Dios le pague (:");
          System.out.println();
          System.out.println("1. propina del 5%");
          System.out.println("2. propina del 10%");
          System.out.println("3. prpina del 13%");
          System.out.println("4. propina del 18%");
          System.out.println("5. propina del 20%");
          System.out.println();
          propina = DD.nextInt();
          System.out.println("OK");

          switch (propina) {
            case 1:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 59800) {
                  propina1 = 0.05;
                  subtotal = monto - 59800;
                  subtotal2 = subtotal * propina1;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ... ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 2:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 59800) {
                  propina2 = 0.1;
                  subtotal = monto - 59800;
                  subtotal2 = subtotal * propina2;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 3:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 59800) {
                  propina3 = 0.13;
                  subtotal = monto - 59800;
                  subtotal2 = subtotal * propina3;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 4:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 59800) {
                  propina4 = 0.18;
                  subtotal = monto - 59800;
                  subtotal2 = subtotal * propina4;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

            case 5:
              System.out.println();
              System.out.print("ingrese monto a pagar: ");
              monto = DD.nextInt();
              System.out.println("OK");

                if(monto > 59800) {
                  propina5 = 0.2;
                  subtotal = monto - 59800;
                  subtotal2 = subtotal * propina5;
                  total = subtotal - subtotal2;

                  System.out.println("su total: " + total + " " + "muchas gracias por preferirnos, que tenga buen dia ...ahora si abrace!");
                  System.out.println();
                }
                else {
                  System.out.println("si no le alcanza pida prestado");
                }
                break;

          default:
              System.out.println("escoja una de las cinco opciones de propina");
        }
          break;

        default:
          System.out.println("escoja una de las cinco opciones del menú de precios");
      }

    }
}
