package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivEvaluableType.kt */
/* JADX INFO: loaded from: classes6.dex */
public enum DivEvaluableType {
    STRING(TypedValues.Custom.S_STRING),
    INTEGER(TypedValues.Custom.S_INT),
    NUMBER("number"),
    BOOLEAN(TypedValues.Custom.S_BOOLEAN),
    DATETIME("datetime"),
    COLOR("color"),
    URL("url"),
    DICT("dict"),
    ARRAY("array");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivEvaluableType, String> TO_STRING = new sn.l<DivEvaluableType, String>() { // from class: com.yandex.div2.DivEvaluableType$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivEvaluableType divEvaluableType) {
            return DivEvaluableType.Converter.b(divEvaluableType);
        }
    };

    @NotNull
    public static final sn.l<String, DivEvaluableType> FROM_STRING = new sn.l<String, DivEvaluableType>() { // from class: com.yandex.div2.DivEvaluableType$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivEvaluableType invoke(@NotNull String str) {
            return DivEvaluableType.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivEvaluableType.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivEvaluableType a(@NotNull String str) {
            DivEvaluableType divEvaluableType = DivEvaluableType.STRING;
            if (tn.p.f(str, divEvaluableType.value)) {
                return divEvaluableType;
            }
            DivEvaluableType divEvaluableType2 = DivEvaluableType.INTEGER;
            if (tn.p.f(str, divEvaluableType2.value)) {
                return divEvaluableType2;
            }
            DivEvaluableType divEvaluableType3 = DivEvaluableType.NUMBER;
            if (tn.p.f(str, divEvaluableType3.value)) {
                return divEvaluableType3;
            }
            DivEvaluableType divEvaluableType4 = DivEvaluableType.BOOLEAN;
            if (tn.p.f(str, divEvaluableType4.value)) {
                return divEvaluableType4;
            }
            DivEvaluableType divEvaluableType5 = DivEvaluableType.DATETIME;
            if (tn.p.f(str, divEvaluableType5.value)) {
                return divEvaluableType5;
            }
            DivEvaluableType divEvaluableType6 = DivEvaluableType.COLOR;
            if (tn.p.f(str, divEvaluableType6.value)) {
                return divEvaluableType6;
            }
            DivEvaluableType divEvaluableType7 = DivEvaluableType.URL;
            if (tn.p.f(str, divEvaluableType7.value)) {
                return divEvaluableType7;
            }
            DivEvaluableType divEvaluableType8 = DivEvaluableType.DICT;
            if (tn.p.f(str, divEvaluableType8.value)) {
                return divEvaluableType8;
            }
            DivEvaluableType divEvaluableType9 = DivEvaluableType.ARRAY;
            if (tn.p.f(str, divEvaluableType9.value)) {
                return divEvaluableType9;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivEvaluableType divEvaluableType) {
            return divEvaluableType.value;
        }
    }

    DivEvaluableType(String str) {
        this.value = str;
    }
}
