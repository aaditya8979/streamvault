package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ColorGreenComponentGetter extends ColorComponentGetter {

    @NotNull
    public static final ColorGreenComponentGetter INSTANCE = new ColorGreenComponentGetter();

    @NotNull
    private static final String name = "getColorGreen";

    private ColorGreenComponentGetter() {
        super(new l<Color, Integer>() { // from class: com.yandex.div.evaluable.function.ColorGreenComponentGetter.1
            @Override // sn.l
            public /* bridge */ /* synthetic */ Integer invoke(Color color) {
                return m7410invokecIhhviA(color.m7452unboximpl());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-cIhhviA, reason: not valid java name */
            public final Integer m7410invokecIhhviA(int i10) {
                return Integer.valueOf(Color.m7448greenimpl(i10));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
