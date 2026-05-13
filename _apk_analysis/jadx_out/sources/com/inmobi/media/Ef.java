package com.inmobi.media;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Ef {
    public static final int a(Df df2) {
        tn.p.k(df2, "<this>");
        int iOrdinal = df2.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 90;
        }
        if (iOrdinal == 2) {
            return BaseTransientBottomBar.ANIMATION_FADE_DURATION;
        }
        if (iOrdinal == 3) {
            return 270;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Df a(byte b10) {
        return b10 == 1 ? Df.f25324a : b10 == 2 ? Df.f25326c : b10 == 3 ? Df.f25325b : b10 == 4 ? Df.f25327d : Df.f25324a;
    }

    public static final boolean b(Df df2) {
        tn.p.k(df2, "<this>");
        return df2 == Df.f25325b || df2 == Df.f25327d;
    }
}
