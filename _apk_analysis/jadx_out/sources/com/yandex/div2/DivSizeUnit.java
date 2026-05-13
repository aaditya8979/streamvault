package com.yandex.div2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivSizeUnit.kt */
/* JADX INFO: loaded from: classes8.dex */
public enum DivSizeUnit {
    DP("dp"),
    SP("sp"),
    PX("px");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivSizeUnit, String> TO_STRING = new sn.l<DivSizeUnit, String>() { // from class: com.yandex.div2.DivSizeUnit$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivSizeUnit divSizeUnit) {
            return DivSizeUnit.Converter.b(divSizeUnit);
        }
    };

    @NotNull
    public static final sn.l<String, DivSizeUnit> FROM_STRING = new sn.l<String, DivSizeUnit>() { // from class: com.yandex.div2.DivSizeUnit$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivSizeUnit invoke(@NotNull String str) {
            return DivSizeUnit.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivSizeUnit.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivSizeUnit a(@NotNull String str) {
            DivSizeUnit divSizeUnit = DivSizeUnit.DP;
            if (tn.p.f(str, divSizeUnit.value)) {
                return divSizeUnit;
            }
            DivSizeUnit divSizeUnit2 = DivSizeUnit.SP;
            if (tn.p.f(str, divSizeUnit2.value)) {
                return divSizeUnit2;
            }
            DivSizeUnit divSizeUnit3 = DivSizeUnit.PX;
            if (tn.p.f(str, divSizeUnit3.value)) {
                return divSizeUnit3;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivSizeUnit divSizeUnit) {
            return divSizeUnit.value;
        }
    }

    DivSizeUnit(String str) {
        this.value = str;
    }
}
