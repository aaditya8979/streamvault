package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class C9 extends AbstractC4120l3<E9, AdapterAdInteractionListener> {
    public C9(L7 l72, K7 k72, List<NetworkSettings> list, H9 h92, String str, C4201pa c4201pa, C4002ea c4002ea) {
        super(l72, k72, new D9(str, list, h92), c4201pa, c4002ea);
    }

    public C9(List<NetworkSettings> list, H9 h92, String str, C4201pa c4201pa, C4002ea c4002ea) {
        super(new D9(str, list, h92), c4201pa, c4002ea);
    }

    @Override // com.ironsource.AbstractC4158n3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public E9 a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, int i10, String str, C4157n2 c4157n2) {
        return new E9(this, new C4135m0(IronSource.a.INTERSTITIAL, this.f33046o.o(), i10, this.f33038g, str, this.f33036e, this.f33037f, networkSettings, this.f33046o.n()), baseAdAdapter, c4157n2, this);
    }

    @Override // com.ironsource.AbstractC4158n3
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getInterstitialSettings();
    }

    @Override // com.ironsource.AbstractC4158n3
    public L0 g() {
        return new L9();
    }

    @Override // com.ironsource.AbstractC4158n3
    public String l() {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    @Override // com.ironsource.AbstractC4158n3
    public String o() {
        return IronSourceConstants.OPW_IS_MANAGER_NAME;
    }
}
