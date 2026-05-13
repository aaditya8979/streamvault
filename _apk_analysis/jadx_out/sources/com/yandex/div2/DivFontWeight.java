package com.yandex.div2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivFontWeight.kt */
/* JADX INFO: loaded from: classes10.dex */
public enum DivFontWeight {
    LIGHT("light"),
    MEDIUM("medium"),
    REGULAR("regular"),
    BOLD("bold");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivFontWeight, String> TO_STRING = new sn.l<DivFontWeight, String>() { // from class: com.yandex.div2.DivFontWeight$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivFontWeight divFontWeight) {
            return DivFontWeight.Converter.b(divFontWeight);
        }
    };

    @NotNull
    public static final sn.l<String, DivFontWeight> FROM_STRING = new sn.l<String, DivFontWeight>() { // from class: com.yandex.div2.DivFontWeight$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivFontWeight invoke(@NotNull String str) {
            return DivFontWeight.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivFontWeight.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivFontWeight a(@NotNull String str) {
            DivFontWeight divFontWeight = DivFontWeight.LIGHT;
            if (tn.p.f(str, divFontWeight.value)) {
                return divFontWeight;
            }
            DivFontWeight divFontWeight2 = DivFontWeight.MEDIUM;
            if (tn.p.f(str, divFontWeight2.value)) {
                return divFontWeight2;
            }
            DivFontWeight divFontWeight3 = DivFontWeight.REGULAR;
            if (tn.p.f(str, divFontWeight3.value)) {
                return divFontWeight3;
            }
            DivFontWeight divFontWeight4 = DivFontWeight.BOLD;
            if (tn.p.f(str, divFontWeight4.value)) {
                return divFontWeight4;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivFontWeight divFontWeight) {
            return divFontWeight.value;
        }
    }

    DivFontWeight(String str) {
        this.value = str;
    }
}
