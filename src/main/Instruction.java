package main;

/**
 * Created by Pep on 4/20/2017.
 */
public class Instruction {

    private int p;
    private char a;
    private char b;
    private Direction m;
    private int q;

    public enum Direction {L, R}

    /**
     * Creates a new instruction of the form: p, a -> b, m, q
     * @param p start state
     * @param a start symbol
     * @param b ending symbol (what "a" is changed to)
     * @param m direction to move the read/write head
     * @param q ending state
     */
    public Instruction(int p, char a, char b, Direction m, int q) {
        this.p = p;
        this.a = a;
        this.b = b;
        this.m = m;
        this.q = q;
    }

    public String toString(){
        String ret = p + ", " + a + " -> " + b + ", ";
        switch (m) {
            case L: ret += "L, ";
            break;
            case R: ret += "R, ";
            break;
        }
        ret += q;
        return ret;
     }
}