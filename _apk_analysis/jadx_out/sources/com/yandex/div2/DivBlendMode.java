package com.yandex.div2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivBlendMode.kt */
/* JADX INFO: loaded from: classes6.dex */
public enum DivBlendMode {
    SOURCE_IN("source_in"),
    SOURCE_ATOP("source_atop"),
    DARKEN("darken"),
    LIGHTEN("lighten"),
    MULTIPLY("multiply"),
    SCREEN("screen");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivBlendMode, String> TO_STRING = new sn.l<DivBlendMode, String>() { // from class: com.yandex.div2.DivBlendMode$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivBlendMode divBlendMode) {
            return DivBlendMode.Converter.b(divBlendMode);
        }
    };

    @NotNull
    public static final sn.l<String, DivBlendMode> FROM_STRING = new sn.l<String, DivBlendMode>() { // from class: com.yandex.div2.DivBlendMode$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivBlendMode invoke(@NotNull String str) {
            return DivBlendMode.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivBlendMode.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivBlendMode a(@NotNull String str) {
            DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
            if (tn.p.f(str, divBlendMode.value)) {
                return divBlendMode;
            }
            DivBlendMode divBlendMode2 = DivBlendMode.SOURCE_ATOP;
            if (tn.p.f(str, divBlendMode2.value)) {
                return divBlendMode2;
            }
            DivBlendMode divBlendMode3 = DivBlendMode.DARKEN;
            if (tn.p.f(str, divBlendMode3.value)) {
                return divBlendMode3;
            }
            DivBlendMode divBlendMode4 = DivBlendMode.LIGHTEN;
            if (tn.p.f(str, divBlendMode4.value)) {
                return divBlendMode4;
            }
            DivBlendMode divBlendMode5 = DivBlendMode.MULTIPLY;
            if (tn.p.f(str, divBlendMode5.value)) {
                return divBlendMode5;
            }
            DivBlendMode divBlendMode6 = DivBlendMode.SCREEN;
            if (tn.p.f(str, divBlendMode6.value)) {
                return divBlendMode6;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivBlendMode divBlendMode) {
            return divBlendMode.value;
        }
    }

    DivBlendMode(String str) {
        this.value = str;
    }
}
