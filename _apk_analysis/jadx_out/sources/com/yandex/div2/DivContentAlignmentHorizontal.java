package com.yandex.div2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivContentAlignmentHorizontal.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum DivContentAlignmentHorizontal {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivContentAlignmentHorizontal, String> TO_STRING = new sn.l<DivContentAlignmentHorizontal, String>() { // from class: com.yandex.div2.DivContentAlignmentHorizontal$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivContentAlignmentHorizontal divContentAlignmentHorizontal) {
            return DivContentAlignmentHorizontal.Converter.b(divContentAlignmentHorizontal);
        }
    };

    @NotNull
    public static final sn.l<String, DivContentAlignmentHorizontal> FROM_STRING = new sn.l<String, DivContentAlignmentHorizontal>() { // from class: com.yandex.div2.DivContentAlignmentHorizontal$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivContentAlignmentHorizontal invoke(@NotNull String str) {
            return DivContentAlignmentHorizontal.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivContentAlignmentHorizontal.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivContentAlignmentHorizontal a(@NotNull String str) {
            DivContentAlignmentHorizontal divContentAlignmentHorizontal = DivContentAlignmentHorizontal.LEFT;
            if (tn.p.f(str, divContentAlignmentHorizontal.value)) {
                return divContentAlignmentHorizontal;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal2 = DivContentAlignmentHorizontal.CENTER;
            if (tn.p.f(str, divContentAlignmentHorizontal2.value)) {
                return divContentAlignmentHorizontal2;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal3 = DivContentAlignmentHorizontal.RIGHT;
            if (tn.p.f(str, divContentAlignmentHorizontal3.value)) {
                return divContentAlignmentHorizontal3;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal4 = DivContentAlignmentHorizontal.START;
            if (tn.p.f(str, divContentAlignmentHorizontal4.value)) {
                return divContentAlignmentHorizontal4;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal5 = DivContentAlignmentHorizontal.END;
            if (tn.p.f(str, divContentAlignmentHorizontal5.value)) {
                return divContentAlignmentHorizontal5;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal6 = DivContentAlignmentHorizontal.SPACE_BETWEEN;
            if (tn.p.f(str, divContentAlignmentHorizontal6.value)) {
                return divContentAlignmentHorizontal6;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal7 = DivContentAlignmentHorizontal.SPACE_AROUND;
            if (tn.p.f(str, divContentAlignmentHorizontal7.value)) {
                return divContentAlignmentHorizontal7;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal8 = DivContentAlignmentHorizontal.SPACE_EVENLY;
            if (tn.p.f(str, divContentAlignmentHorizontal8.value)) {
                return divContentAlignmentHorizontal8;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivContentAlignmentHorizontal divContentAlignmentHorizontal) {
            return divContentAlignmentHorizontal.value;
        }
    }

    DivContentAlignmentHorizontal(String str) {
        this.value = str;
    }
}
