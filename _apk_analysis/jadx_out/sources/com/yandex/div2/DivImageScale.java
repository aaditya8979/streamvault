package com.yandex.div2;

import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivImageScale.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum DivImageScale {
    FILL(VastAttributes.FILL_COLOR),
    NO_SCALE("no_scale"),
    FIT("fit"),
    STRETCH("stretch");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivImageScale, String> TO_STRING = new sn.l<DivImageScale, String>() { // from class: com.yandex.div2.DivImageScale$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivImageScale divImageScale) {
            return DivImageScale.Converter.b(divImageScale);
        }
    };

    @NotNull
    public static final sn.l<String, DivImageScale> FROM_STRING = new sn.l<String, DivImageScale>() { // from class: com.yandex.div2.DivImageScale$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivImageScale invoke(@NotNull String str) {
            return DivImageScale.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivImageScale.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivImageScale a(@NotNull String str) {
            DivImageScale divImageScale = DivImageScale.FILL;
            if (tn.p.f(str, divImageScale.value)) {
                return divImageScale;
            }
            DivImageScale divImageScale2 = DivImageScale.NO_SCALE;
            if (tn.p.f(str, divImageScale2.value)) {
                return divImageScale2;
            }
            DivImageScale divImageScale3 = DivImageScale.FIT;
            if (tn.p.f(str, divImageScale3.value)) {
                return divImageScale3;
            }
            DivImageScale divImageScale4 = DivImageScale.STRETCH;
            if (tn.p.f(str, divImageScale4.value)) {
                return divImageScale4;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivImageScale divImageScale) {
            return divImageScale.value;
        }
    }

    DivImageScale(String str) {
        this.value = str;
    }
}
