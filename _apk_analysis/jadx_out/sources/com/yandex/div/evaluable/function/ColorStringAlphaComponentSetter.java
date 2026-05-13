package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ColorStringAlphaComponentSetter extends ColorStringComponentSetter {

    @NotNull
    public static final ColorStringAlphaComponentSetter INSTANCE = new ColorStringAlphaComponentSetter();

    @NotNull
    private static final String name = "setColorAlpha";

    private ColorStringAlphaComponentSetter() {
        super(ColorAlphaComponentSetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
