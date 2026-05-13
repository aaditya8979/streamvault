package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiBanner;

/* JADX INFO: loaded from: classes9.dex */
public final class V8 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f26489a;

    public V8(InMobiBanner inMobiBanner) {
        this.f26489a = inMobiBanner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C3605n9 c3605n9;
        try {
            this.f26489a.f25087i = F3.b(r0.getMeasuredWidth() / J5.b());
            this.f26489a.f25088j = F3.b(r0.getMeasuredHeight() / J5.b());
            if (InMobiBanner.access$hasValidSize(this.f26489a)) {
                this.f26489a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e10) {
            C3372e2 mAdManager$media_release = this.f26489a.getMAdManager$media_release();
            if (mAdManager$media_release == null || (c3605n9 = mAdManager$media_release.f25338f) == null) {
                return;
            }
            String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
            tn.p.j(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            c3605n9.a(strAccess$getTAG$cp, "InMobiBanner$1.onGlobalLayout() handler threw unexpected error: ", e10);
        }
    }
}
