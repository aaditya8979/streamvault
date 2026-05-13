package com.inmobi.media;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes7.dex */
public final class A7 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f25143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N7 f25144b;

    public A7(View view, N7 n72) {
        this.f25143a = view;
        this.f25144b = n72;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.f25143a.removeOnAttachStateChangeListener(this);
        InterfaceC3580m9 interfaceC3580m9 = this.f25144b.f25993b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
        }
        this.f25144b.a(C3679q8.f27952a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }
}
