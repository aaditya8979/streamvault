package com.yandex.div2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivTransitionSelector.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum DivTransitionSelector {
    NONE("none"),
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    ANY_CHANGE("any_change");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivTransitionSelector, String> TO_STRING = new sn.l<DivTransitionSelector, String>() { // from class: com.yandex.div2.DivTransitionSelector$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivTransitionSelector divTransitionSelector) {
            return DivTransitionSelector.Converter.b(divTransitionSelector);
        }
    };

    @NotNull
    public static final sn.l<String, DivTransitionSelector> FROM_STRING = new sn.l<String, DivTransitionSelector>() { // from class: com.yandex.div2.DivTransitionSelector$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivTransitionSelector invoke(@NotNull String str) {
            return DivTransitionSelector.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivTransitionSelector.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivTransitionSelector a(@NotNull String str) {
            DivTransitionSelector divTransitionSelector = DivTransitionSelector.NONE;
            if (tn.p.f(str, divTransitionSelector.value)) {
                return divTransitionSelector;
            }
            DivTransitionSelector divTransitionSelector2 = DivTransitionSelector.DATA_CHANGE;
            if (tn.p.f(str, divTransitionSelector2.value)) {
                return divTransitionSelector2;
            }
            DivTransitionSelector divTransitionSelector3 = DivTransitionSelector.STATE_CHANGE;
            if (tn.p.f(str, divTransitionSelector3.value)) {
                return divTransitionSelector3;
            }
            DivTransitionSelector divTransitionSelector4 = DivTransitionSelector.ANY_CHANGE;
            if (tn.p.f(str, divTransitionSelector4.value)) {
                return divTransitionSelector4;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivTransitionSelector divTransitionSelector) {
            return divTransitionSelector.value;
        }
    }

    DivTransitionSelector(String str) {
        this.value = str;
    }
}
