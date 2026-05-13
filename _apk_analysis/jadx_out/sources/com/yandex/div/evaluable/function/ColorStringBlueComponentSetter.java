package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ColorStringBlueComponentSetter extends ColorStringComponentSetter {

    @NotNull
    public static final ColorStringBlueComponentSetter INSTANCE = new ColorStringBlueComponentSetter();

    @NotNull
    private static final String name = "setColorBlue";

    private ColorStringBlueComponentSetter() {
        super(ColorBlueComponentSetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
