package com.yandex.div2;

import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivVisibility.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum DivVisibility {
    VISIBLE(VastAttributes.VISIBLE),
    INVISIBLE("invisible"),
    GONE("gone");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivVisibility, String> TO_STRING = new sn.l<DivVisibility, String>() { // from class: com.yandex.div2.DivVisibility$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivVisibility divVisibility) {
            return DivVisibility.Converter.b(divVisibility);
        }
    };

    @NotNull
    public static final sn.l<String, DivVisibility> FROM_STRING = new sn.l<String, DivVisibility>() { // from class: com.yandex.div2.DivVisibility$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivVisibility invoke(@NotNull String str) {
            return DivVisibility.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivVisibility.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivVisibility a(@NotNull String str) {
            DivVisibility divVisibility = DivVisibility.VISIBLE;
            if (tn.p.f(str, divVisibility.value)) {
                return divVisibility;
            }
            DivVisibility divVisibility2 = DivVisibility.INVISIBLE;
            if (tn.p.f(str, divVisibility2.value)) {
                return divVisibility2;
            }
            DivVisibility divVisibility3 = DivVisibility.GONE;
            if (tn.p.f(str, divVisibility3.value)) {
                return divVisibility3;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivVisibility divVisibility) {
            return divVisibility.value;
        }
    }

    DivVisibility(String str) {
        this.value = str;
    }
}
