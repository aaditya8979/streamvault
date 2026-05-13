package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class bly implements com.bytedance.sdk.openadsdk.ouw.fkw.ouw {
    private final AtomicBoolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final vpp f13194le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final AtomicBoolean f13195lh;
    private final PAGRewardedAdInteractionListener ouw;
    private final PAGRewardedAdInteractionCallback vt;
    private final AtomicBoolean yu;

    public bly(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        this.f13195lh = new AtomicBoolean(false);
        this.yu = new AtomicBoolean(false);
        this.fkw = new AtomicBoolean(false);
        this.vt = pAGRewardedAdInteractionCallback;
        this.ouw = null;
        this.f13194le = ouwVar != null ? ouwVar.lh() : null;
    }

    public bly(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        this.f13195lh = new AtomicBoolean(false);
        this.yu = new AtomicBoolean(false);
        this.fkw = new AtomicBoolean(false);
        this.ouw = pAGRewardedAdInteractionListener;
        this.vt = null;
        this.f13194le = ouwVar != null ? ouwVar.lh() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public final void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ouw;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.vt;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.fkw.ouw
    public final void ouw() {
        ko.vt("BVA", "onAdShow  mAdShowInvoked = " + this.f13195lh.get());
        com.bytedance.sdk.openadsdk.yu.tlj.ouw("show_callback", this.yu.get(), this.f13195lh.get(), this.f13194le);
        if (this.f13195lh.compareAndSet(false, true)) {
            qbp.ouw("BVA", "reward video onAdShow");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ouw;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdShowed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.vt;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.fkw.ouw
    public final void ouw(boolean z10, int i10, String str, int i11, String str2) {
        if (this.fkw.compareAndSet(false, true)) {
            qbp.ouw("BVA", "reward video onRewardVerify");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ouw;
            if (pAGRewardedAdInteractionListener != null) {
                if (z10) {
                    pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i10, str));
                    return;
                } else {
                    pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i11, str2);
                    return;
                }
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.vt;
            if (pAGRewardedAdInteractionCallback != null) {
                if (z10) {
                    pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i10, str));
                } else {
                    pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i11, str2));
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.fkw.ouw
    public final void vt() {
        ko.vt("BVA", "onAdClose  mAdCloseInvoked = " + this.yu.get());
        com.bytedance.sdk.openadsdk.yu.tlj.ouw("close_callback", this.yu.get(), this.f13195lh.get(), this.f13194le);
        if (this.yu.compareAndSet(false, true)) {
            qbp.ouw("BVA", "reward video onAdClose");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ouw;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdDismissed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.vt;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdDismissed();
            }
        }
    }
}
