package com.yandex.div2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivAlignmentVertical.kt */
/* JADX INFO: loaded from: classes8.dex */
public enum DivAlignmentVertical {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivAlignmentVertical, String> TO_STRING = new sn.l<DivAlignmentVertical, String>() { // from class: com.yandex.div2.DivAlignmentVertical$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivAlignmentVertical divAlignmentVertical) {
            return DivAlignmentVertical.Converter.b(divAlignmentVertical);
        }
    };

    @NotNull
    public static final sn.l<String, DivAlignmentVertical> FROM_STRING = new sn.l<String, DivAlignmentVertical>() { // from class: com.yandex.div2.DivAlignmentVertical$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivAlignmentVertical invoke(@NotNull String str) {
            return DivAlignmentVertical.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivAlignmentVertical.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivAlignmentVertical a(@NotNull String str) {
            DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
            if (tn.p.f(str, divAlignmentVertical.value)) {
                return divAlignmentVertical;
            }
            DivAlignmentVertical divAlignmentVertical2 = DivAlignmentVertical.CENTER;
            if (tn.p.f(str, divAlignmentVertical2.value)) {
                return divAlignmentVertical2;
            }
            DivAlignmentVertical divAlignmentVertical3 = DivAlignmentVertical.BOTTOM;
            if (tn.p.f(str, divAlignmentVertical3.value)) {
                return divAlignmentVertical3;
            }
            DivAlignmentVertical divAlignmentVertical4 = DivAlignmentVertical.BASELINE;
            if (tn.p.f(str, divAlignmentVertical4.value)) {
                return divAlignmentVertical4;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivAlignmentVertical divAlignmentVertical) {
            return divAlignmentVertical.value;
        }
    }

    DivAlignmentVertical(String str) {
        this.value = str;
    }
}
