/*
 * Copyright 2022 Mark J. Koch
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.maehem.antonic.sc6a.logic;

/**
 * Four bit accumulator logic.
 * 
 * @author mark
 */
public class Accumulator {
    private final boolean input[] = {
        false,   false,    false,    false
    };
    
    private final boolean temp[][] = { 
        {false,false}, {false,false}, {false,false}, {false,false}
    };
    
    private final boolean output[] = {
        false,   false,    false,    false
    };
    
    private boolean clkLevel = false;
    
    public void setIn( int bit, boolean val) {
        input[bit] = val;
        //updateState(); // only clock endge can change state.
    }
    
    public boolean getIn( int bit) {
        return input[bit];
    }
    
    public boolean getTemp( int bit) {
        return temp[bit][0];
    }
    
    public boolean getOut( int bit ) {
        return output[bit];
    }
    
    public void setClock( boolean level ) {
        this.clkLevel = level;
        updateState();
    }
    
    private void updateState() {
        // Update each bit of accumulator
        for ( int i=0; i<4; i++ ) {
            // Move previous state of temp to out
            boolean tpta = nand( !clkLevel, temp[i][0]);
            boolean tptb = nand( !clkLevel, temp[i][1]);
            output[i] = srFlipFlop(tpta, tptb)[0];
            
            // Take input state and process to temp
            boolean tpia = nand(clkLevel, input[i]);
            boolean tpib = nand(  clkLevel, tpia );
            // input to tmp
            temp[i] = srFlipFlop(tpia, tpib);
        }
        
    }
    
    private static boolean nand( boolean a, boolean b ) {
        return !(a && b );
    }
    
    /**
     * SR Flip Flop
     * 
     *  S   R    Y    Y'
     * -----------------
     *  0   0    0    1
     *  0   1    0    1
     *  1   0    1    0
     *  1   1    0    0
     * 
     * @param s
     * @param r
     * @return 
     */
    private static boolean[] srFlipFlop( boolean s, boolean r) {
        if ( !s ) {
            return new boolean[]{ false, true };
        }
        if ( !r ) {
            return new boolean[]{ true, false };
        }
        
        // TODO: log warning if this state reached.
        return new boolean []{ true, true}; // Indeterminate
    }
}
