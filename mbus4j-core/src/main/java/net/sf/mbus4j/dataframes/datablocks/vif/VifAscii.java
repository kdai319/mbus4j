/*
 * mbus4j - Open source drivers for mbus protocol see <http://www.m-bus.com/ > - http://mbus4j.sourceforge.net/
 * Copyright (C) 2009  Arne Plöse
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/ >.
 */
package net.sf.mbus4j.dataframes.datablocks.vif;

/**
 *
 * @author arnep@users.sourceforge.net
 * @version $Id$
 */
public class VifAscii implements Vif {

    private String value;

    public VifAscii() {
    }

    public VifAscii(String value) {
        this.value = value;
    }

    @Override
    public Integer getExponent() {
        return null;
    }

    @Override
    public String getLabel() {
        return value;
    }

    @Override
    public SiPrefix getSiPrefix() {
        return null;
    }

    @Override
    public UnitOfMeasurement getUnitOfMeasurement() {
        return null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof VifAscii) {
            return value.equals(((VifAscii)o).value);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.value != null ? this.value.hashCode() : 0);
        return hash;
    }

    @Override
    public VifTypes getVifType() {
         return VifTypes.ASCII;
   }
}