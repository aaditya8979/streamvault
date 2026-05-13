package com.inmobi.media;

import android.os.Bundle;
import androidx.browser.customtabs.EngagementSignalsCallback;

/* JADX INFO: loaded from: classes8.dex */
public final class Q2 implements EngagementSignalsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R2 f26161a;

    public Q2(R2 r22) {
        this.f26161a = r22;
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) {
        tn.p.k(bundle, "extras");
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onSessionEnded(boolean z10, Bundle bundle) {
        Rh rh2;
        tn.p.k(bundle, "extras");
        if (z10 && (rh2 = (Rh) this.f26161a.f26225i.get()) != null) {
            GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
            rh2.a(Mh.a("IN_NATIVE_BROWSER", "onInteraction"));
        }
        Rh rh3 = (Rh) this.f26161a.f26225i.get();
        if (rh3 != null) {
            GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
            rh3.a(Mh.a("IN_NATIVE_BROWSER", "onClose"));
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onVerticalScrollEvent(boolean z10, Bundle bundle) {
        tn.p.k(bundle, "extras");
        R2 r22 = this.f26161a;
        if (r22.f26224h) {
            return;
        }
        r22.f26224h = true;
        Rh rh2 = (Rh) r22.f26225i.get();
        if (rh2 != null) {
            GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
            rh2.a(Mh.a("IN_NATIVE_BROWSER", "onScroll"));
        }
    }
}
