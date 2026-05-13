package com.yandex.div2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivAlignmentHorizontal.kt */
/* JADX INFO: loaded from: classes8.dex */
public enum DivAlignmentHorizontal {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivAlignmentHorizontal, String> TO_STRING = new sn.l<DivAlignmentHorizontal, String>() { // from class: com.yandex.div2.DivAlignmentHorizontal$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivAlignmentHorizontal divAlignmentHorizontal) {
            return DivAlignmentHorizontal.Converter.b(divAlignmentHorizontal);
        }
    };

    @NotNull
    public static final sn.l<String, DivAlignmentHorizontal> FROM_STRING = new sn.l<String, DivAlignmentHorizontal>() { // from class: com.yandex.div2.DivAlignmentHorizontal$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivAlignmentHorizontal invoke(@NotNull String str) {
            return DivAlignmentHorizontal.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivAlignmentHorizontal.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivAlignmentHorizontal a(@NotNull String str) {
            DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.LEFT;
            if (tn.p.f(str, divAlignmentHorizontal.value)) {
                return divAlignmentHorizontal;
            }
            DivAlignmentHorizontal divAlignmentHorizontal2 = DivAlignmentHorizontal.CENTER;
            if (tn.p.f(str, divAlignmentHorizontal2.value)) {
                return divAlignmentHorizontal2;
            }
            DivAlignmentHorizontal divAlignmentHorizontal3 = DivAlignmentHorizontal.RIGHT;
            if (tn.p.f(str, divAlignmentHorizontal3.value)) {
                return divAlignmentHorizontal3;
            }
            DivAlignmentHorizontal divAlignmentHorizontal4 = DivAlignmentHorizontal.START;
            if (tn.p.f(str, divAlignmentHorizontal4.value)) {
                return divAlignmentHorizontal4;
            }
            DivAlignmentHorizontal divAlignmentHorizontal5 = DivAlignmentHorizontal.END;
            if (tn.p.f(str, divAlignmentHorizontal5.value)) {
                return divAlignmentHorizontal5;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivAlignmentHorizontal divAlignmentHorizontal) {
            return divAlignmentHorizontal.value;
        }
    }

    DivAlignmentHorizontal(String str) {
        this.value = str;
    }
}
