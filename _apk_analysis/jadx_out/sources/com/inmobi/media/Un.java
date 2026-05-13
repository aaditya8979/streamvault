package com.inmobi.media;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Un {
    public static final boolean a(View view, Rect rect, int i10, C3900z5 c3900z5) {
        tn.p.k(view, "adView");
        tn.p.k(rect, "adViewRect");
        tn.p.k(c3900z5, "minDimension");
        if (a(view, c3900z5)) {
            return ((long) 100) * (((long) rect.height()) * ((long) rect.width())) >= ((long) (i10 * (view.getHeight() * view.getWidth())));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(android.view.View r9, android.graphics.Rect r10, int r11, java.util.List r12) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Un.a(android.view.View, android.graphics.Rect, int, java.util.List):boolean");
    }

    public static final boolean a(View view, C3900z5 c3900z5) {
        tn.p.k(view, "adView");
        tn.p.k(c3900z5, "minDimension");
        if (view.getVisibility() == 0 && view.getParent() != null && view.isShown() && view.getWidth() >= c3900z5.f28623a && view.getHeight() >= c3900z5.f28624b) {
            if (view.getHeight() * view.getWidth() > 0) {
                return true;
            }
        }
        return false;
    }
}
