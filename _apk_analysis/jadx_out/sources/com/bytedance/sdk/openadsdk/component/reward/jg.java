package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: loaded from: classes4.dex */
final class jg implements TTClientBidding {
    public final pno ouw;

    public jg(Context context, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, AdSlot adSlot) {
        this.ouw = new pno(context, ouwVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public final void loss(Double d10, String str, String str2) {
        this.ouw.loss(d10, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public final void win(Double d10) {
        this.ouw.win(d10);
    }
}
