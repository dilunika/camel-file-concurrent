package org.jkd.camel.concurrent;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

public class InventoryFileGenerator {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		File file = new File("src/data/inventory/inv.csv");
        if (file.exists()) {
            file.delete();
        }

        int lines = 100;
        if (args.length == 1) {
            lines = Integer.parseInt(args[0]);
        }

        System.out.println("Creating src/data/inventory/inv.csv with " + lines + " lines");
        createOrderFile(file, lines);
        System.out.println("Creating src/data/inventory/inv.csv done");

	}

	private static void createOrderFile(final File file, final int lines) throws Exception {
		
		FileOutputStream fos = new FileOutputStream(file);
		Random r = new Random();
		
        for (int i = 0; i < lines; i++) {
            String line = i + ",ITM-" + i + "," + r.nextInt(1000) + "\n";
            fos.write(line.getBytes());
        }
        fos.close();
		
	}

}
