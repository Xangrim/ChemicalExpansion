package chemicalexpansion.common;

/********************************
 Copyright (C) Xangrim, 2016
 All rights reserved

 Class: 
 Created: 11/12/2016, 19:59:03
 Project: Chemical_Expansion
 Description: 
 ********************************/

public class Element {

    public final Integer atomNumber;
    public final String symbol;
    public final String name;
    public final int group;
    public final String block;
    public final int period;
    public final String desc;
    public final String phase;
    public final String colour;
    public final double melting;
    public final double boiling;
    public final String discoverer;

    public Element (
            Integer atomNumber,
            String symbol,
            String name,
            int group,
            String block,
            int period,
            String desc,
            String phase,
            String colour,
            double melting,
            double boiling,
            String discoverer
    ) {
        this.atomNumber = atomNumber;
        this.symbol = symbol;
        this.name = name;
        this.group = group;
        this.block = block;
        this.period = period;
        this.desc = desc;
        this.phase = phase;
        this.colour = colour;
        this.melting = melting;
        this.boiling = boiling;
        this.discoverer = discoverer;
    }

}
