package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import org.jetbrains.annotations.NotNull;
import sn.p;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ColorBlueComponentSetter extends ColorComponentSetter {

    @NotNull
    public static final ColorBlueComponentSetter INSTANCE = new ColorBlueComponentSetter();

    @NotNull
    private static final String name = "setColorBlue";

    private ColorBlueComponentSetter() {
        super(new p<Color, Double, Color>() { // from class: com.yandex.div.evaluable.function.ColorBlueComponentSetter.1
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Color mo2invoke(Color color, Double d10) {
                return Color.m7444boximpl(m7409invokeGnj5c28(color.m7452unboximpl(), d10.doubleValue()));
            }

            /* JADX INFO: renamed from: invoke-Gnj5c28, reason: not valid java name */
            public final int m7409invokeGnj5c28(int i10, double d10) {
                return Color.Companion.m7453argbH0kstlE(Color.m7442alphaimpl(i10), Color.m7450redimpl(i10), Color.m7448greenimpl(i10), ColorFunctionsKt.toColorIntComponentValue(d10));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
