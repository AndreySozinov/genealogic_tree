package gen_tree;

import java.io.FileWriter;
import java.io.IOException;

public class Output {
    public enum Aim {
        CONSOLE,
        FILE
    }
    private String data;
    private Aim aim;

    public Output(String data, Aim aim) {
        this.data = data;
        this.aim = aim;

        /**
         * Вывод в консоль
         */
        if (this.aim == Aim.CONSOLE) {
            System.out.println(this.data);
        }

        /**
         * Вывод в файл
         */
        if (this.aim == Aim.FILE) {
            try(FileWriter writer = new FileWriter("output.txt", false)) {
                writer.write(this.data);
                writer.flush();
            }
            catch(IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }


}
