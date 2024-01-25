package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	 Declare one dimension table with int values
	 Create methode to find max value in this table
	 Create methode to find min value in this table
	 Create methode to return table with sorted values
	 */
        int[] table = {546, 8798, 946, 7965};

        System.out.println("Max is " + max(table));
        System.out.println("Min is " + min(table));

        System.out.println("Special max is " + specialMax(table, 7965));

        System.out.print("Sorted table");
        int[] sort = sort(table);
        for (int value : sort) {
            System.out.print(" " + value);
        }

    }

    static int max(int[] table) {
        int max = 0;
        for (int value : table) {
            max = value > max ? value : max;
        }
        return max;
    }

    static int specialMax(int[] table, int lowerThan) {
        int max = 0;
        for (int value : table) {
            max = value > max && value < lowerThan ? value : max;
        }
        return max;
    }

    static int min(int[] table) {
        int min = table[0];
        for (int value : table) {
            min = value < min ? value : min;
        }
        return min;
    }

    static int[] sort(int[] table) {
        int[] sorted = new int[table.length];
        int max = max(table);

        sorted[0] = max;
        for (int i = 1; i < sorted.length; i++) {
            sorted[i] = specialMax(table, sorted[i - 1]);
        }

        return sorted;
    }

}
