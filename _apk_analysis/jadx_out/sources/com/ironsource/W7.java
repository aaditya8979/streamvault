package com.ironsource;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public enum W7 {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f30623b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30628a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final W7 a(@Nullable Integer num) {
            W7 w72;
            W7[] w7ArrValues = W7.values();
            int length = w7ArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    w72 = null;
                    break;
                }
                w72 = w7ArrValues[i10];
                int iB = w72.b();
                if (num != null && iB == num.intValue()) {
                    break;
                }
                i10++;
            }
            return w72 == null ? W7.UnknownProvider : w72;
        }

        @NotNull
        public final W7 a(@NotNull String str) {
            tn.p.k(str, "dynamicDemandSourceId");
            List listU0 = bo.d0.U0(str, new String[]{"_"}, false, 0, 6, null);
            return listU0.size() < 2 ? W7.UnknownProvider : a(bo.z.r((String) listU0.get(1)));
        }
    }

    W7(int i10) {
        this.f30628a = i10;
    }

    public final int b() {
        return this.f30628a;
    }
}
