package com.yandex.div2;

import com.ironsource.C4254sd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivLineStyle.kt */
/* JADX INFO: loaded from: classes6.dex */
public enum DivLineStyle {
    NONE("none"),
    SINGLE(C4254sd.f33526d);


    @NotNull
    private final String value;

    @NotNull
    public static final a Converter = new a(null);

    @NotNull
    public static final sn.l<DivLineStyle, String> TO_STRING = new sn.l<DivLineStyle, String>() { // from class: com.yandex.div2.DivLineStyle$Converter$TO_STRING$1
        @Override // sn.l
        @NotNull
        public final String invoke(@NotNull DivLineStyle divLineStyle) {
            return DivLineStyle.Converter.b(divLineStyle);
        }
    };

    @NotNull
    public static final sn.l<String, DivLineStyle> FROM_STRING = new sn.l<String, DivLineStyle>() { // from class: com.yandex.div2.DivLineStyle$Converter$FROM_STRING$1
        @Override // sn.l
        @Nullable
        public final DivLineStyle invoke(@NotNull String str) {
            return DivLineStyle.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivLineStyle.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final DivLineStyle a(@NotNull String str) {
            DivLineStyle divLineStyle = DivLineStyle.NONE;
            if (tn.p.f(str, divLineStyle.value)) {
                return divLineStyle;
            }
            DivLineStyle divLineStyle2 = DivLineStyle.SINGLE;
            if (tn.p.f(str, divLineStyle2.value)) {
                return divLineStyle2;
            }
            return null;
        }

        @NotNull
        public final String b(@NotNull DivLineStyle divLineStyle) {
            return divLineStyle.value;
        }
    }

    DivLineStyle(String str) {
        this.value = str;
    }
}
