package com.yandex.div.evaluable.function;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ColorStringAlphaComponentGetter extends ColorStringComponentGetter {

    @NotNull
    public static final ColorStringAlphaComponentGetter INSTANCE = new ColorStringAlphaComponentGetter();

    @NotNull
    private static final String name = "getColorAlpha";

    private ColorStringAlphaComponentGetter() {
        super(ColorAlphaComponentGetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
