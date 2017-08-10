package com.example.dell.spectrum.Graphs;

import com.github.mikephil.charting.components.AxisBase;

/**
 * Created by Rise on 29/05/2017.
 */

interface IAxisValueFormatter {
    String getFormattedValue(float value, AxisBase axis);
}
