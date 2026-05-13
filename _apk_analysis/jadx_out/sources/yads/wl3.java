package yads;

import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public final class wl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bb2 f96442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yl3 f96443b;

    public wl3(bb2 bb2Var, yl3 yl3Var) {
        this.f96442a = bb2Var;
        this.f96443b = yl3Var;
    }

    public static String b(View view) {
        int visibility = view.getVisibility();
        return "view is not shown: visibility=" + (visibility != 0 ? visibility != 4 ? visibility != 8 ? "UNKNOWN" : "GONE" : "INVISIBLE" : "VISIBLE") + ", attached=" + view.isAttachedToWindow();
    }

    public static String c(View view) {
        return "view rect is null: " + (!view.isAttachedToWindow() ? "not attached" : (view.getWidth() <= 0 || view.getHeight() <= 0) ? "zero size" : "scrolled off");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.xl3 a(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wl3.a(android.view.View):yads.xl3");
    }
}
