package com.maehem.antonic.sc6a.logic;

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


/**
 *
 * @author mark
 */
public class Register {
    public static final int MAX_VALUE = 0xFF;
    public static final int MIN_VALUE = 0x00;
    
    private int value;
    
    public int getValue() {
        return value;
    }
    
    public void setValue( int value ) {
        
    }
    
    public void clear() {
        this.value = 0;
    }
}