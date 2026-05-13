package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ColorStringBlueComponentGetter extends ColorStringComponentGetter {

    @NotNull
    public static final ColorStringBlueComponentGetter INSTANCE = new ColorStringBlueComponentGetter();

    @NotNull
    private static final String name = "getColorBlue";

    private ColorStringBlueComponentGetter() {
        super(ColorBlueComponentGetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
