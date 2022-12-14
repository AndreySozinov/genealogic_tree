package gen_tree;

import java.io.FileWriter;
import java.util.List;

public class Output {    
        public static void outputData(Tree data, Aim aim) {
            List<Relationship> links = data.getLinks();
            /**
             * Вывод в консоль
             */
            if (aim == Aim.CONSOLE) {
                for (Relationship el : links) {
                    System.out.println(el);
                }
            }
    
            /**
             * Вывод в файл
             */
            if (aim == Aim.FILE) {
                try(FileWriter writer = new java.io.FileWriter("Output.txt", false)) {
                    for (Relationship el : links) {
                        writer.write(el.toString());
                        writer.write("\n");
                        writer.flush();
                    }
                }
                catch(java.io.IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
