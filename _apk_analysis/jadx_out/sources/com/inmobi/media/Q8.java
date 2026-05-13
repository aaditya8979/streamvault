package com.inmobi.media;

import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class Q8 extends uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RelativeLayout.LayoutParams f26173a;

    public Q8(RelativeLayout.LayoutParams layoutParams) {
        this.f26173a = layoutParams;
    }

    @Override // com.inmobi.media.uo
    public final void a(Df df2, wo woVar) {
        tn.p.k(df2, "orientation");
        tn.p.k(woVar, "finalInsets");
        F3.a(woVar, this.f26173a, df2);
    }
}
