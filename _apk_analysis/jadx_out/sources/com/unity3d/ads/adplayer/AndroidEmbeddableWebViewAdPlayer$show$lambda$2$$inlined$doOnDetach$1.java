package com.unity3d.ads.adplayer;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import org.jetbrains.annotations.NotNull;
import p000do.i;
import tn.p;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View $this_doOnDetach;
    public final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    public AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(View view, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer) {
        this.$this_doOnDetach = view;
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View view) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View view) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.$this_doOnDetach.removeOnAttachStateChangeListener(this);
        i.d(this.this$0.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this.this$0, null), 3, null);
    }
}
