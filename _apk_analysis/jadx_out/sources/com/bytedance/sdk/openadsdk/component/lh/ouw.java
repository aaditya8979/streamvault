package com.bytedance.sdk.openadsdk.component.lh;

import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.yu.tlj;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class ouw implements com.bytedance.sdk.openadsdk.ouw.lh.vt {
    private final PAGInterstitialAdInteractionListener ouw;
    private final vpp yu;
    private final AtomicBoolean vt = new AtomicBoolean(false);

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final AtomicBoolean f13180lh = new AtomicBoolean(false);

    public ouw(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        this.ouw = pAGInterstitialAdInteractionListener;
        this.yu = ouwVar != null ? ouwVar.lh() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public final void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.ouw;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.lh.vt
    public final void ouw() {
        tlj.ouw("show_callback", this.f13180lh.get(), this.vt.get(), this.yu);
        if (this.vt.compareAndSet(false, true)) {
            qbp.ouw("BVA", "full video onAdShow");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.ouw;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.lh.vt
    public final void vt() {
        tlj.ouw("close_callback", this.f13180lh.get(), this.vt.get(), this.yu);
        if (this.f13180lh.compareAndSet(false, true)) {
            qbp.ouw("BVA", "full video onAdClose");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.ouw;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdDismissed();
            }
        }
    }
}
