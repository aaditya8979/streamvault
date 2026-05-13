package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ColorStringGreenComponentSetter extends ColorStringComponentSetter {

    @NotNull
    public static final ColorStringGreenComponentSetter INSTANCE = new ColorStringGreenComponentSetter();

    @NotNull
    private static final String name = "setColorGreen";

    private ColorStringGreenComponentSetter() {
        super(ColorGreenComponentSetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
