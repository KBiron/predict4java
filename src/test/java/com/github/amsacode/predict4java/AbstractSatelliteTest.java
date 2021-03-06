/**
 predict4java: An SDP4 / SGP4 library for satellite orbit predictions

 Copyright (C)  2004-2010  David A. B. Johnson, G4DPZ.

 Author: David A. B. Johnson, G4DPZ <dave@g4dpz.me.uk>

 Comments, questions and bug reports should be submitted via
 http://sourceforge.net/projects/websat/
 More details can be found at the project home page:

 http://websat.sourceforge.net

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, visit http://www.fsf.org/
 */
package com.github.amsacode.predict4java;

import org.assertj.core.data.Offset;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class AbstractSatelliteTest {

    private static final Offset<Double> PRECISION = Offset.offset(0.00001);

    @Test
    public void testJulianDateFromEpochConversionGivenYearIn20thCentury() {
        assertThat(AbstractSatellite.juliandDateOfEpoch(90000)).isEqualTo(AbstractSatellite.julianDateOfYear(1990), PRECISION);
    }

    @Test
    public void testModulusGivenNegativeFirstArg() {
        assertThat(AbstractSatellite.modulus(-10.6, 10)).isEqualTo(9.4, PRECISION);
    }

    @Test
    public void testModulusGivenNegativeSecondArg() {
        // weird behaviour for modulus if you ask me
        assertThat(AbstractSatellite.modulus(23, -10)).isEqualTo(-17.0, PRECISION);
    }
}
