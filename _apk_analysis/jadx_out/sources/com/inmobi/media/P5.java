package com.inmobi.media;

import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class P5 extends uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RelativeLayout.LayoutParams f26108a;

    public P5(RelativeLayout.LayoutParams layoutParams) {
        this.f26108a = layoutParams;
    }

    @Override // com.inmobi.media.uo
    public final void a(Df df2, wo woVar) {
        tn.p.k(df2, "orientation");
        tn.p.k(woVar, "finalInsets");
        F3.a(woVar, this.f26108a, df2);
    }
}
