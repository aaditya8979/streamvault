package com.yandex.div2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivTextAlignmentVertical.kt */
/* JADX INFO: loaded from: classes8.dex */
public enum DivTextAlignmentVertical {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivTextAlignmentVertical, String> TO_STRING = new sn.l<DivTextAlignmentVertical, String>() { // from class: com.yandex.div2.DivTextAlignmentVertical$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivTextAlignmentVertical divTextAlignmentVertical) {
            return DivTextAlignmentVertical.Converter.b(divTextAlignmentVertical);
        }
    };

    @NotNull
    public static final sn.l<String, DivTextAlignmentVertical> FROM_STRING = new sn.l<String, DivTextAlignmentVertical>() { // from class: com.yandex.div2.DivTextAlignmentVertical$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivTextAlignmentVertical invoke(@NotNull String str) {
            return DivTextAlignmentVertical.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivTextAlignmentVertical.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivTextAlignmentVertical a(@NotNull String str) {
            DivTextAlignmentVertical divTextAlignmentVertical = DivTextAlignmentVertical.TOP;
            if (tn.p.f(str, divTextAlignmentVertical.value)) {
                return divTextAlignmentVertical;
            }
            DivTextAlignmentVertical divTextAlignmentVertical2 = DivTextAlignmentVertical.CENTER;
            if (tn.p.f(str, divTextAlignmentVertical2.value)) {
                return divTextAlignmentVertical2;
            }
            DivTextAlignmentVertical divTextAlignmentVertical3 = DivTextAlignmentVertical.BOTTOM;
            if (tn.p.f(str, divTextAlignmentVertical3.value)) {
                return divTextAlignmentVertical3;
            }
            DivTextAlignmentVertical divTextAlignmentVertical4 = DivTextAlignmentVertical.BASELINE;
            if (tn.p.f(str, divTextAlignmentVertical4.value)) {
                return divTextAlignmentVertical4;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivTextAlignmentVertical divTextAlignmentVertical) {
            return divTextAlignmentVertical.value;
        }
    }

    DivTextAlignmentVertical(String str) {
        this.value = str;
    }
}
