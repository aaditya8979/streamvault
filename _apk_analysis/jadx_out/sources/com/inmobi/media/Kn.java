package com.inmobi.media;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes9.dex */
public final class Kn implements Nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jn f25825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3286aj f25826b;

    public Kn(Jn jn2, C3286aj c3286aj) {
        tn.p.k(jn2, "visibilityConfig");
        tn.p.k(c3286aj, "simpleViewHolder");
        this.f25825a = jn2;
        this.f25826b = c3286aj;
    }

    @Override // com.inmobi.media.Nn
    public final Mn a() {
        C3452h5 c3452h5 = this.f25826b.f26803a;
        Rect rect = new Rect();
        if (!c3452h5.getGlobalVisibleRect(rect)) {
            return Mn.f25977a;
        }
        Jn jn2 = this.f25825a;
        return (Un.a(c3452h5, rect, jn2.f25764a, jn2.f25765b) && Un.a(c3452h5, rect, this.f25825a.f25764a, this.f25826b.f26804b)) ? Mn.f25978b : Mn.f25977a;
    }
}
