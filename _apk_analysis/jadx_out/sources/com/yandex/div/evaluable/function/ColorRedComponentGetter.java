package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ColorRedComponentGetter extends ColorComponentGetter {

    @NotNull
    public static final ColorRedComponentGetter INSTANCE = new ColorRedComponentGetter();

    @NotNull
    private static final String name = "getColorRed";

    private ColorRedComponentGetter() {
        super(new l<Color, Integer>() { // from class: com.yandex.div.evaluable.function.ColorRedComponentGetter.1
            @Override // sn.l
            public /* bridge */ /* synthetic */ Integer invoke(Color color) {
                return m7412invokecIhhviA(color.m7452unboximpl());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-cIhhviA, reason: not valid java name */
            public final Integer m7412invokecIhhviA(int i10) {
                return Integer.valueOf(Color.m7450redimpl(i10));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
