package com.yandex.div2;

import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivVideoScale.kt */
/* JADX INFO: loaded from: classes9.dex */
public enum DivVideoScale {
    FILL(VastAttributes.FILL_COLOR),
    NO_SCALE("no_scale"),
    FIT("fit");


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivVideoScale, String> TO_STRING = new sn.l<DivVideoScale, String>() { // from class: com.yandex.div2.DivVideoScale$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivVideoScale divVideoScale) {
            return DivVideoScale.Converter.b(divVideoScale);
        }
    };

    @NotNull
    public static final sn.l<String, DivVideoScale> FROM_STRING = new sn.l<String, DivVideoScale>() { // from class: com.yandex.div2.DivVideoScale$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivVideoScale invoke(@NotNull String str) {
            return DivVideoScale.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivVideoScale.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivVideoScale a(@NotNull String str) {
            DivVideoScale divVideoScale = DivVideoScale.FILL;
            if (tn.p.f(str, divVideoScale.value)) {
                return divVideoScale;
            }
            DivVideoScale divVideoScale2 = DivVideoScale.NO_SCALE;
            if (tn.p.f(str, divVideoScale2.value)) {
                return divVideoScale2;
            }
            DivVideoScale divVideoScale3 = DivVideoScale.FIT;
            if (tn.p.f(str, divVideoScale3.value)) {
                return divVideoScale3;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivVideoScale divVideoScale) {
            return divVideoScale.value;
        }
    }

    DivVideoScale(String str) {
        this.value = str;
    }
}
