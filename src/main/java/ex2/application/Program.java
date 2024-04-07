/*
 * Copyright (C) 2024 Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ex2.application;

import ex2.entities.Rent;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 05/04/2024
 * @brief Class Program
 */
public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[9];

        System.out.print("How many will be rentend: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Rent #" + (i + 1));
            System.out.print("Informe o nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Informe o email: ");
            String email = sc.nextLine();
            System.out.print("Informe o quarto (1 a 10): ");
            int room = sc.nextInt();

            if (vect[room] != null) {
                System.out.println("Quarto ocupado. Informe outro número.");
            } else {
                vect[room] = new Rent(name, email, room);
            }

        }
        System.out.println();
        System.out.println("Busy rooms: ");

        for (int i = 0; i < vect.length; i++) {

            if (vect[i] != null) {
                System.out.println(vect[i].getRoom() + ": "
                        + vect[i].getName() + ", "
                        + vect[i].getEmail());
            }

        }

    }
}
