package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ColorBlueComponentGetter extends ColorComponentGetter {

    @NotNull
    public static final ColorBlueComponentGetter INSTANCE = new ColorBlueComponentGetter();

    @NotNull
    private static final String name = "getColorBlue";

    private ColorBlueComponentGetter() {
        super(new l<Color, Integer>() { // from class: com.yandex.div.evaluable.function.ColorBlueComponentGetter.1
            @Override // sn.l
            public /* bridge */ /* synthetic */ Integer invoke(Color color) {
                return m7408invokecIhhviA(color.m7452unboximpl());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-cIhhviA, reason: not valid java name */
            public final Integer m7408invokecIhhviA(int i10) {
                return Integer.valueOf(Color.m7443blueimpl(i10));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
