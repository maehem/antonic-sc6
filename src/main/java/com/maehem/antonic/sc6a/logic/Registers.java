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
 *
 * @author mark
 */
public class Registers {
    public final Register R0 = new Register();
    public final Register R1 = new Register();
    public final Register R2 = new Register();
    public final Register R3 = new Register();
    public final Register R4 = new Register();
    public final Register R5 = new Register();
    public final Register R6 = new Register();
    public final Register R7 = new Register();
    public final Register R8 = new Register();
    public final Register R9 = new Register();
    
    public final Register OUT = new Register();
    public final Register IN  = new Register();
    public final Register JSR = new Register();

    public final Register PCL = new Register();
    public final Register PCM = new Register();
    public final Register PCH = new Register();
    
}
