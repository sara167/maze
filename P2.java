package p2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class P2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("maze"));
        PrintWriter outFile = new PrintWriter("maze.out");
        char[][] list = new char[100][100];
        int enterI = 0, enterJ = 0, goalI = 0, goalJ = 0;
        int i = 0, j = 0;
        while (inFile.hasNext()) {
            String s = inFile.nextLine();
            for (j = 0; j < s.length(); j++) {
                list[i][j] = s.charAt(j);
                if (s.charAt(j) == 'E') {
                    enterI = i;
                    enterJ = j;
                } else if (s.charAt(j) == 'G') {
                    goalI = i;
                    goalJ = j;
                }
            }
            i++;
        }
        Stack s = new Stack();
        s.push(enterI);
        s.push(enterJ);
        boolean found = false;
        while (!s.isEmpty()&& !found) {
            int k = (int)s.pop();
            int m = (int)s.pop();
            if (k != goalJ || m != goalI) {
                move (list,s,k,m-1,i,j);
                move(list,s,k,m+1,i,j);
                move(list,s,k+1,m,i,j);
                move(list,s,k-1,m,i,j);
            } else {
                if (k==goalJ && m==goalI){
                found = true;
            }}
        }
        if (found) {
            System.out.println("we found the goal");
        } else {
            System.out.println("Cannot find it");
        }
        print(list, i, j);
    }

    
    public static void move(char[][]list , Stack s , int k , int m , int EI , int EJ  ){
        if (m>=0 && m<EI && k>=0 && k<EJ){
             if (list[m][k] != 'H' && list[m][k] != 'E' && list[m][k] != '.' ) {
                if (list[m][k] != 'G')
                    list[m][k] = '.';
                s.push(m);
                s.push(k);
        }}
    }
    public static void print(char[][] list, int r, int c) throws FileNotFoundException {
        PrintWriter outFile = new PrintWriter("maze.out");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                outFile.print(list[i][j]);
            }
            outFile.println("");
        }
        outFile.close();
    }

}
