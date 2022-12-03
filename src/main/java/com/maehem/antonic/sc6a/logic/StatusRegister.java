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
public class StatusRegister {
    private boolean in;
    private boolean temp;
    private boolean out;

    /**
     * @return the in
     */
    public boolean isIn() {
        return in;
    }

    /**
     * @param in the in to set
     */
    public void setIn(boolean in) {
        this.in = in;
    }

    /**
     * @return the temp
     */
    public boolean isTemp() {
        return temp;
    }

    /**
     * @param temp the temp to set
     */
    public void setTemp(boolean temp) {
        this.temp = temp;
    }

    /**
     * @return the out
     */
    public boolean isOut() {
        return out;
    }

    /**
     * @param out the out to set
     */
    public void setOut(boolean out) {
        this.out = out;
    }
}
