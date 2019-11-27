/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 992005923
 */
public class Population {
    private int population, numDays, result;
    private double growth;
    
    public Population(int p, int d, double g) {
        population = p;
        numDays = d;
        growth = g;
    }
    
    public Population() {
        population = 0;
        numDays = 0;
        growth = 0.0;
    }
    
    public int calcPopulation(int p, int d, double g) {
        result = (int) (p *(g/100)* d + p);
        return result;
    }
}
