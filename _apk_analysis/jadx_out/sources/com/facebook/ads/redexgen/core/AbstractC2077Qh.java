package com.facebook.ads.redexgen.core;

import android.view.View;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2077Qh {
    public static String[] A00 = {"X094Ff6hX91n4UOeNZ5q6xBODyRF", "3SZuvdCuB3BE6lfK5qku2XxobaMEdUie", "GC5CoEiK4nrbG2wHW0FtwppW4DiO", "wga3z1tjiA3hov6SpIvZwMukezgQNZlv", "3xUgR2JHsSdawQ9thG1dfHrpvR", "GYcoMrIBN4ZdBxcuGgG7c5lcAAiSjlKe", "4bECUaOSHZBdJ", ""};

    public static int A00(@Nullable C2073Qd c2073Qd, @Nullable Q8 q82, View view, View view2, QO qo2, boolean z10) {
        if (qo2.A0Y() == 0) {
            return 0;
        }
        int iA03 = c2073Qd.A03();
        if (A00[0].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[1] = "A1oAKfZoAPhZUsftVBl6ZIJw4txQWtbe";
        strArr[5] = "SaLVqq6GZrXjANh28rEV2dsKSTV0teZe";
        if (iA03 == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(qo2.A0r(view) - qo2.A0r(view2)) + 1;
        }
        return Math.min(q82.A0B(), q82.A0C(view2) - q82.A0F(view));
    }

    public static int A01(@Nullable C2073Qd c2073Qd, @Nullable Q8 q82, View view, View view2, QO qo2, boolean z10) {
        if (qo2.A0Y() == 0 || c2073Qd.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return c2073Qd.A03();
        }
        return (int) (((q82.A0C(view2) - q82.A0F(view)) / (Math.abs(qo2.A0r(view) - qo2.A0r(view2)) + 1)) * c2073Qd.A03());
    }

    public static int A02(@Nullable C2073Qd c2073Qd, @Nullable Q8 q82, View view, View view2, QO qo2, boolean z10, boolean z11) {
        if (qo2.A0Y() == 0 || c2073Qd.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (c2073Qd.A03() - Math.max(qo2.A0r(view), qo2.A0r(view2))) - 1) : Math.max(0, Math.min(qo2.A0r(view), qo2.A0r(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(q82.A0C(view2) - q82.A0F(view)) / (Math.abs(qo2.A0r(view) - qo2.A0r(view2)) + 1))) + (q82.A0A() - q82.A0F(view)));
        }
        return iMax;
    }
}
