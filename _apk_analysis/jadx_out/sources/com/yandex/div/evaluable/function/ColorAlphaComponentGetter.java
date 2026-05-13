package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ColorAlphaComponentGetter extends ColorComponentGetter {

    @NotNull
    public static final ColorAlphaComponentGetter INSTANCE = new ColorAlphaComponentGetter();

    @NotNull
    private static final String name = "getColorAlpha";

    private ColorAlphaComponentGetter() {
        super(new l<Color, Integer>() { // from class: com.yandex.div.evaluable.function.ColorAlphaComponentGetter.1
            @Override // sn.l
            public /* bridge */ /* synthetic */ Integer invoke(Color color) {
                return m7406invokecIhhviA(color.m7452unboximpl());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-cIhhviA, reason: not valid java name */
            public final Integer m7406invokecIhhviA(int i10) {
                return Integer.valueOf(Color.m7442alphaimpl(i10));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
