package com.inmobi.media;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: renamed from: com.inmobi.media.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3631oa implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f27767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3580m9 f27768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p000do.t f27771e;

    public ViewTreeObserverOnGlobalLayoutListenerC3631oa(FrameLayout frameLayout, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(frameLayout, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.f27767a = frameLayout;
        this.f27768b = interfaceC3580m9;
        this.f27771e = p000do.v.a(bn.r.f5635a);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            InterfaceC3580m9 interfaceC3580m9 = this.f27768b;
            if (interfaceC3580m9 != null) {
                String str = AbstractC3830wa.f28425a;
                tn.p.j(str, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).a(str, "close called");
            }
            this.f27769c = F3.b(this.f27767a.getWidth() / J5.b());
            this.f27770d = F3.b(this.f27767a.getHeight() / J5.b());
            this.f27767a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            p000do.i.d(A9.f25147c, null, null, new C3606na(this, null), 3, null);
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m92 = this.f27768b;
            if (interfaceC3580m92 != null) {
                String str2 = AbstractC3830wa.f28425a;
                tn.p.j(str2, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str2, "SDK encountered unexpected error in JavaScriptBridge$1.onGlobalLayout(); " + e10.getMessage());
            }
        }
    }
}
