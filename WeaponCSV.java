/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamshue_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonny
 */
public class WeaponCSV {

    public List<Weapon> readFile() throws IOException {
        int count = 0;
        String file = "weapons.csv";
        String split = ",";
        List<Weapon> content = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                line = br.readLine();
                content = line.split(",");
            }
        } catch (FileNotFoundException e) {

        }
        return content;
    }
}
