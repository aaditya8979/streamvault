package com.yandex.div2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivTransitionTrigger.kt */
/* JADX INFO: loaded from: classes10.dex */
public enum DivTransitionTrigger {
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    VISIBILITY_CHANGE("visibility_change");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivTransitionTrigger, String> TO_STRING = new sn.l<DivTransitionTrigger, String>() { // from class: com.yandex.div2.DivTransitionTrigger$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivTransitionTrigger divTransitionTrigger) {
            return DivTransitionTrigger.Converter.b(divTransitionTrigger);
        }
    };

    @NotNull
    public static final sn.l<String, DivTransitionTrigger> FROM_STRING = new sn.l<String, DivTransitionTrigger>() { // from class: com.yandex.div2.DivTransitionTrigger$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivTransitionTrigger invoke(@NotNull String str) {
            return DivTransitionTrigger.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivTransitionTrigger.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivTransitionTrigger a(@NotNull String str) {
            DivTransitionTrigger divTransitionTrigger = DivTransitionTrigger.DATA_CHANGE;
            if (tn.p.f(str, divTransitionTrigger.value)) {
                return divTransitionTrigger;
            }
            DivTransitionTrigger divTransitionTrigger2 = DivTransitionTrigger.STATE_CHANGE;
            if (tn.p.f(str, divTransitionTrigger2.value)) {
                return divTransitionTrigger2;
            }
            DivTransitionTrigger divTransitionTrigger3 = DivTransitionTrigger.VISIBILITY_CHANGE;
            if (tn.p.f(str, divTransitionTrigger3.value)) {
                return divTransitionTrigger3;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivTransitionTrigger divTransitionTrigger) {
            return divTransitionTrigger.value;
        }
    }

    DivTransitionTrigger(String str) {
        this.value = str;
    }
}
