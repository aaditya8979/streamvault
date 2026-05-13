package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;

/* JADX INFO: loaded from: classes6.dex */
public class Xd extends C4194p3<V0> implements RewardedVideoAdListener {
    public Xd(InterfaceC4204pd interfaceC4204pd, C4135m0 c4135m0, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C4157n2 c4157n2, V0 v02) {
        super(interfaceC4204pd, c4135m0, baseAdAdapter, new C3957c1(c4135m0.g(), c4135m0.g().getRewardedVideoSettings(), IronSource.a.REWARDED_VIDEO), c4157n2, v02);
    }
}
