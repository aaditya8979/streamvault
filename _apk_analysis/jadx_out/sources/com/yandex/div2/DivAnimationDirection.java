package com.yandex.div2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivAnimationDirection.kt */
/* JADX INFO: loaded from: classes7.dex */
public enum DivAnimationDirection {
    NORMAL("normal"),
    REVERSE("reverse"),
    ALTERNATE("alternate"),
    ALTERNATE_REVERSE("alternate_reverse");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivAnimationDirection, String> TO_STRING = new sn.l<DivAnimationDirection, String>() { // from class: com.yandex.div2.DivAnimationDirection$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivAnimationDirection divAnimationDirection) {
            return DivAnimationDirection.Converter.b(divAnimationDirection);
        }
    };

    @NotNull
    public static final sn.l<String, DivAnimationDirection> FROM_STRING = new sn.l<String, DivAnimationDirection>() { // from class: com.yandex.div2.DivAnimationDirection$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivAnimationDirection invoke(@NotNull String str) {
            return DivAnimationDirection.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivAnimationDirection.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivAnimationDirection a(@NotNull String str) {
            DivAnimationDirection divAnimationDirection = DivAnimationDirection.NORMAL;
            if (tn.p.f(str, divAnimationDirection.value)) {
                return divAnimationDirection;
            }
            DivAnimationDirection divAnimationDirection2 = DivAnimationDirection.REVERSE;
            if (tn.p.f(str, divAnimationDirection2.value)) {
                return divAnimationDirection2;
            }
            DivAnimationDirection divAnimationDirection3 = DivAnimationDirection.ALTERNATE;
            if (tn.p.f(str, divAnimationDirection3.value)) {
                return divAnimationDirection3;
            }
            DivAnimationDirection divAnimationDirection4 = DivAnimationDirection.ALTERNATE_REVERSE;
            if (tn.p.f(str, divAnimationDirection4.value)) {
                return divAnimationDirection4;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivAnimationDirection divAnimationDirection) {
            return divAnimationDirection.value;
        }
    }

    DivAnimationDirection(String str) {
        this.value = str;
    }
}
