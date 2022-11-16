import java.util.Scanner;

public class RetoCCCF {
    public static void main(String[] args) {
        // Main variables
        int minuto;
        int hora = 0;
        int cola = 0, caja1 = 0, caja2 = 0, caja3 = 0, caja4 = 0;
        int nuevo;

        // Control
        float porcentajeNuevo = 0.4f;
        int ultimaHora = 12;

        // Estadisticas
        int clientesAt = 0, productosVendidos = 0;

        int minutosSinCola = 0;

        // Caja Auxiliar
        int caja5 = 0, contadorCaja5 = 0;
        boolean caja5Abierta = false;

        // SuperAdmin
        boolean caja1Estado, caja2Estado, caja3Estado, caja4Estado;
        boolean superAbierto = true;

        Scanner s = new Scanner(System.in);

        System.out.println("Bienvenido Super Administrador");
        System.out.println("Desea abrir la caja 1 (1 = Si, Otro = No)");
        if (s.nextInt() == 1) {
            caja1Estado = true;
        } else
            caja1Estado = false;
        System.out.println("Desea abrir la caja 2 (1 = Si, Otro = No)");
        if (s.nextInt() == 1) {
            caja2Estado = true;
        } else
            caja2Estado = false;
        System.out.println("Desea abrir la caja 3 (1 = Si, Otro = No)");
        if (s.nextInt() == 1) {
            caja3Estado = true;
        } else
            caja3Estado = false;
        System.out.println("Desea abrir la caja 4 (1 = Si, Otro = No)");
        if (s.nextInt() == 1) {
            caja4Estado = true;
        } else
            caja4Estado = false;

        if (!caja1Estado && !caja2Estado && !caja3Estado && !caja4Estado) {
            System.out.println("Señor Super Administrador no hay ninguna caja abierta");
            System.out.println("¿Desea cerrar el Supermercado? (1 = Si, Otro = No)");
            if (s.nextInt() == 1) {
                superAbierto = false;
            } else {
                superAbierto = true;
                System.out.println("Se procede a abrir la Caja1");
                caja1Estado = true;
            }
        }

        if (superAbierto) {

            // Bucle Horas
            for (hora = 0; hora <= ultimaHora; hora++) {
                // Texto Hora
                System.out.println("-----------------------------------------------------------------------------");
                if (hora == 0) {
                    System.out.println("Hora 09:00 - Apertura de tienda");
                } else if (hora == 1) {
                    System.out.println("Hora 10:00");
                } else if (hora == 2) {
                    System.out.println("Hora 11:00");
                } else if (hora == 3) {
                    System.out.println("Hora 12:00");
                } else if (hora == 4) {
                    System.out.println("Hora 13:00");
                } else if (hora == 5) {
                    System.out.println("Hora 14:00");
                } else if (hora == 6) {
                    System.out.println("Hora 15:00");
                } else if (hora == 7) {
                    System.out.println("Hora 16:00");
                } else if (hora == 8) {
                    System.out.println("Hora 17:00");
                } else if (hora == 9) {
                    System.out.println("Hora 18:00");
                } else if (hora == 10) {
                    System.out.println("Hora 19:00");
                } else if (hora == 11) {
                    System.out.println("Hora 20:00");
                } else if (hora == 12) {
                    System.out.println("Hora 21:00 - Ultima Hora");
                }
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("");
                // Bucle Minutos
                for (minuto = 1; minuto <= 60; minuto++) {
                    // Actualizar colas
                    if (caja1Estado && caja1 > 0) {
                        caja1--;
                        productosVendidos++;
                        if (caja1 <= 0) {
                            caja1 = 0;
                            clientesAt++;
                        }
                    }
                    if (caja2Estado && caja2 > 0) {
                        caja2--;
                        productosVendidos++;
                        if (caja2 <= 0) {
                            caja2 = 0;
                            clientesAt++;
                        }
                    }
                    if (caja3Estado && caja3 > 0) {
                        caja3--;
                        productosVendidos++;
                        if (caja3 <= 0) {
                            caja3 = 0;
                            clientesAt++;
                        }
                    }
                    if (caja4Estado && caja4 > 0) {
                        caja4--;
                        productosVendidos++;
                        if (caja4 <= 0) {
                            caja4 = 0;
                            clientesAt++;
                        }
                    }
                    if (caja5 > 0) {
                        caja5--;
                        productosVendidos++;
                        if (caja5 <= 0) {
                            caja5 = 0;
                            clientesAt++;
                        }
                    }
                    // Cliente Entrante %
                    nuevo = 0;
                    if (Math.random() <= porcentajeNuevo) {
                        cola++;
                        nuevo = 1;
                    }
                    // Añadir clientes a cajas
                    if (cola >= 1 && caja1 <= 0) {
                        int art = (int) (Math.random() * 10) + 5;
                        caja1 += art;
                        cola--;
                    }
                    if (cola >= 1 && caja2 <= 0) {
                        int art = (int) (Math.random() * 10) + 5;
                        caja2 += art;
                        cola--;
                    }
                    if (cola >= 1 && caja3 <= 0) {
                        int art = (int) (Math.random() * 10) + 5;
                        caja3 += art;
                        cola--;
                    }
                    if (cola >= 1 && caja4 <= 0) {
                        int art = (int) (Math.random() * 10) + 5;
                        caja4 += art;
                        cola--;
                    }
                    // Abrir Caja Auxiliar
                    if (cola > 15) {
                        caja5Abierta = true;
                    }
                    if (caja5Abierta && contadorCaja5 >= 5 && cola < 15 && caja5 <= 0) {
                        caja5Abierta = false;
                        contadorCaja5 = 0;
                    }
                    // Añadir clientes a Caja Auxiliar
                    if (caja5Abierta) {
                        if (caja5 <= 0) {
                            contadorCaja5++;
                            int art = (int) (Math.random() * 10) + 5;
                            caja5 += art;
                            cola--;
                        }
                    }

                    // Print cajas
                    System.out.print("MINUTO " + minuto);
                    if (nuevo != 0) {
                        System.out.print(" - Llega " + nuevo + " cliente");
                    } else {
                        System.out.print(" - No llega ningun cliente nuevo");
                    }
                    System.out.println(" - Hay  " + cola + " clientes en la cola");
                    if (caja1Estado) {
                        System.out.print("Caja 1: " + caja1);
                    } else System.out.print("Caja 1: Cerrada");
                    if (caja2Estado) {
                        System.out.print("Caja 2: " + caja1);
                    } else System.out.print("Caja 2: Cerrada");
                    if (caja3Estado) {
                        System.out.print("Caja 3: " + caja1);
                    } else System.out.print("Caja 3: Cerrada");
                    if (caja4Estado) {
                        System.out.print("Caja 4: " + caja1);
                    } else System.out.print("Caja 4: Cerrada");
                    if (caja5Abierta) {
                        System.out.println(" - Caja Auxiliar (Cliente " + contadorCaja5 + "): " + caja5);
                    } else
                        System.out.println(" - Caja Auxiliar: Cerrada");
                    System.out.println("-----------------------------------------------------------------------------");

                    if (cola == 0) {
                        minutosSinCola++;
                    }
                }

                // Print Resumen
                if (hora == ultimaHora) {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("Resumen cierre de tienda");
                    System.out.println("Clientes atendidos: " + clientesAt);
                    System.out.println("Productos vendidos: " + productosVendidos);
                    System.out.println("Clientes sin atender en la cola: " + cola);
                    System.out.println("Minutos sin cola: " + minutosSinCola);
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("CIERRE DE TIENDA");
                    System.out.println("-----------------------------------------------------------------------------");
                }

            }
        } else {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("EL SUPERMERCADO HA PERMANECIDO CERRADO");
            System.out.println("-----------------------------------------------------------------------------");
        }
        s.close();
    }
}