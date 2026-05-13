package com.ironsource;

import com.ironsource.O0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class Wd extends AbstractC4176o3<Xd> {
    public Wd(List<NetworkSettings> list, Zd zd2, String str, boolean z10, C4201pa c4201pa, C4002ea c4002ea) {
        super(new Ud(str, list, zd2, z10), c4201pa, c4002ea);
    }

    @Override // com.ironsource.AbstractC4158n3
    public LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.AbstractC4158n3
    public void a(IronSourceError ironSourceError) {
        O0.a aVarA = this.f33046o.h().a();
        if (aVarA == O0.a.AUTOMATIC_LOAD_AFTER_CLOSE || aVarA == O0.a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.f33051t.a(false, (AdInfo) null);
        } else {
            super.a(ironSourceError);
        }
    }

    @Override // com.ironsource.AbstractC4158n3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Xd a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, int i10, String str, C4157n2 c4157n2) {
        return new Xd(this, new C4135m0(IronSource.a.REWARDED_VIDEO, this.f33046o.o(), i10, this.f33038g, str, this.f33036e, this.f33037f, networkSettings, this.f33046o.n()), baseAdAdapter, c4157n2, this);
    }

    @Override // com.ironsource.AbstractC4158n3
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getRewardedVideoSettings();
    }

    @Override // com.ironsource.AbstractC4158n3
    public L0 g() {
        return new C3970ce();
    }

    @Override // com.ironsource.AbstractC4158n3
    public String l() {
        return IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    @Override // com.ironsource.AbstractC4158n3
    public String o() {
        return IronSourceConstants.OPW_RV_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC4158n3
    public boolean q() {
        return this.f33046o.h().a() == O0.a.MANUAL;
    }

    @Override // com.ironsource.AbstractC4158n3
    public boolean t() {
        return this.f33046o.h().a() == O0.a.AUTOMATIC_LOAD_WHILE_SHOW;
    }
}
