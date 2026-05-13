package com.yandex.div2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivContentAlignmentVertical.kt */
/* JADX INFO: loaded from: classes9.dex */
public enum DivContentAlignmentVertical {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivContentAlignmentVertical, String> TO_STRING = new sn.l<DivContentAlignmentVertical, String>() { // from class: com.yandex.div2.DivContentAlignmentVertical$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivContentAlignmentVertical divContentAlignmentVertical) {
            return DivContentAlignmentVertical.Converter.b(divContentAlignmentVertical);
        }
    };

    @NotNull
    public static final sn.l<String, DivContentAlignmentVertical> FROM_STRING = new sn.l<String, DivContentAlignmentVertical>() { // from class: com.yandex.div2.DivContentAlignmentVertical$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivContentAlignmentVertical invoke(@NotNull String str) {
            return DivContentAlignmentVertical.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivContentAlignmentVertical.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivContentAlignmentVertical a(@NotNull String str) {
            DivContentAlignmentVertical divContentAlignmentVertical = DivContentAlignmentVertical.TOP;
            if (tn.p.f(str, divContentAlignmentVertical.value)) {
                return divContentAlignmentVertical;
            }
            DivContentAlignmentVertical divContentAlignmentVertical2 = DivContentAlignmentVertical.CENTER;
            if (tn.p.f(str, divContentAlignmentVertical2.value)) {
                return divContentAlignmentVertical2;
            }
            DivContentAlignmentVertical divContentAlignmentVertical3 = DivContentAlignmentVertical.BOTTOM;
            if (tn.p.f(str, divContentAlignmentVertical3.value)) {
                return divContentAlignmentVertical3;
            }
            DivContentAlignmentVertical divContentAlignmentVertical4 = DivContentAlignmentVertical.BASELINE;
            if (tn.p.f(str, divContentAlignmentVertical4.value)) {
                return divContentAlignmentVertical4;
            }
            DivContentAlignmentVertical divContentAlignmentVertical5 = DivContentAlignmentVertical.SPACE_BETWEEN;
            if (tn.p.f(str, divContentAlignmentVertical5.value)) {
                return divContentAlignmentVertical5;
            }
            DivContentAlignmentVertical divContentAlignmentVertical6 = DivContentAlignmentVertical.SPACE_AROUND;
            if (tn.p.f(str, divContentAlignmentVertical6.value)) {
                return divContentAlignmentVertical6;
            }
            DivContentAlignmentVertical divContentAlignmentVertical7 = DivContentAlignmentVertical.SPACE_EVENLY;
            if (tn.p.f(str, divContentAlignmentVertical7.value)) {
                return divContentAlignmentVertical7;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivContentAlignmentVertical divContentAlignmentVertical) {
            return divContentAlignmentVertical.value;
        }
    }

    DivContentAlignmentVertical(String str) {
        this.value = str;
    }
}
