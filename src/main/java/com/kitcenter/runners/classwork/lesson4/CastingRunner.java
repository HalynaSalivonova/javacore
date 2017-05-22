package com.kitcenter.runners.classwork.lesson4;

import com.kitcenter.app.classwork.lesson4.NarrowingCasting;
import com.kitcenter.app.classwork.lesson4.WideningCasting;

public class CastingRunner {
    public static void main(String[] args) {
        WideningCasting wideningCasting = new WideningCasting();
        wideningCasting.widening();

        NarrowingCasting narrowingCasting = new NarrowingCasting();
        narrowingCasting.narrowing();
    }
}
