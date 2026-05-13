package com.yandex.div2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivAnimationInterpolator.kt */
/* JADX INFO: loaded from: classes6.dex */
public enum DivAnimationInterpolator {
    LINEAR("linear"),
    EASE("ease"),
    EASE_IN("ease_in"),
    EASE_OUT("ease_out"),
    EASE_IN_OUT("ease_in_out"),
    SPRING("spring");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivAnimationInterpolator, String> TO_STRING = new sn.l<DivAnimationInterpolator, String>() { // from class: com.yandex.div2.DivAnimationInterpolator$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivAnimationInterpolator divAnimationInterpolator) {
            return DivAnimationInterpolator.Converter.b(divAnimationInterpolator);
        }
    };

    @NotNull
    public static final sn.l<String, DivAnimationInterpolator> FROM_STRING = new sn.l<String, DivAnimationInterpolator>() { // from class: com.yandex.div2.DivAnimationInterpolator$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivAnimationInterpolator invoke(@NotNull String str) {
            return DivAnimationInterpolator.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivAnimationInterpolator.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivAnimationInterpolator a(@NotNull String str) {
            DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
            if (tn.p.f(str, divAnimationInterpolator.value)) {
                return divAnimationInterpolator;
            }
            DivAnimationInterpolator divAnimationInterpolator2 = DivAnimationInterpolator.EASE;
            if (tn.p.f(str, divAnimationInterpolator2.value)) {
                return divAnimationInterpolator2;
            }
            DivAnimationInterpolator divAnimationInterpolator3 = DivAnimationInterpolator.EASE_IN;
            if (tn.p.f(str, divAnimationInterpolator3.value)) {
                return divAnimationInterpolator3;
            }
            DivAnimationInterpolator divAnimationInterpolator4 = DivAnimationInterpolator.EASE_OUT;
            if (tn.p.f(str, divAnimationInterpolator4.value)) {
                return divAnimationInterpolator4;
            }
            DivAnimationInterpolator divAnimationInterpolator5 = DivAnimationInterpolator.EASE_IN_OUT;
            if (tn.p.f(str, divAnimationInterpolator5.value)) {
                return divAnimationInterpolator5;
            }
            DivAnimationInterpolator divAnimationInterpolator6 = DivAnimationInterpolator.SPRING;
            if (tn.p.f(str, divAnimationInterpolator6.value)) {
                return divAnimationInterpolator6;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivAnimationInterpolator divAnimationInterpolator) {
            return divAnimationInterpolator.value;
        }
    }

    DivAnimationInterpolator(String str) {
        this.value = str;
    }
}
