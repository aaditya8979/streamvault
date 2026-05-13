package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ColorStringRedComponentSetter extends ColorStringComponentSetter {

    @NotNull
    public static final ColorStringRedComponentSetter INSTANCE = new ColorStringRedComponentSetter();

    @NotNull
    private static final String name = "setColorRed";

    private ColorStringRedComponentSetter() {
        super(ColorRedComponentSetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
