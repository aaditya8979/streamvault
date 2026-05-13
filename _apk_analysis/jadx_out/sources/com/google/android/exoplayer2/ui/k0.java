package com.google.android.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import g7.b;

/* JADX INFO: compiled from: SubtitleViewUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k0 {
    public static /* synthetic */ boolean c(Object obj) {
        return !(obj instanceof k7.b);
    }

    public static /* synthetic */ boolean d(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void e(b.C0768b c0768b) {
        c0768b.b();
        if (c0768b.e() instanceof Spanned) {
            if (!(c0768b.e() instanceof Spannable)) {
                c0768b.o(SpannableString.valueOf(c0768b.e()));
            }
            g((Spannable) s7.a.e(c0768b.e()), new y7.m() { // from class: com.google.android.exoplayer2.ui.j0
                @Override // y7.m
                public final boolean apply(Object obj) {
                    return k0.c(obj);
                }
            });
        }
        f(c0768b);
    }

    public static void f(b.C0768b c0768b) {
        c0768b.q(-3.4028235E38f, Integer.MIN_VALUE);
        if (c0768b.e() instanceof Spanned) {
            if (!(c0768b.e() instanceof Spannable)) {
                c0768b.o(SpannableString.valueOf(c0768b.e()));
            }
            g((Spannable) s7.a.e(c0768b.e()), new y7.m() { // from class: com.google.android.exoplayer2.ui.i0
                @Override // y7.m
                public final boolean apply(Object obj) {
                    return k0.d(obj);
                }
            });
        }
    }

    public static void g(Spannable spannable, y7.m<Object> mVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (mVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float h(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }
}
