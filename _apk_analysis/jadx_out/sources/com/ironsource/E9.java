package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;

/* JADX INFO: loaded from: classes9.dex */
public class E9 extends AbstractC4138m3<J0> implements InterstitialAdListener {
    public E9(InterfaceC4204pd interfaceC4204pd, C4135m0 c4135m0, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, C4157n2 c4157n2, J0 j02) {
        super(interfaceC4204pd, c4135m0, baseAdAdapter, new C3957c1(c4135m0.g(), c4135m0.g().getInterstitialSettings(), IronSource.a.INTERSTITIAL), c4157n2, j02);
    }
}
