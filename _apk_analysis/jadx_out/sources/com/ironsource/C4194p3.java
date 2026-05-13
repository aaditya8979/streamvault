package com.ironsource;

import com.ironsource.V0;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4194p3<Listener extends V0> extends AbstractC4138m3<Listener> implements AdapterAdRewardListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C4122l5 f33207r;

    /* JADX INFO: renamed from: com.ironsource.p3$a */
    public class a extends AbstractRunnableC4078ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            C4194p3.this.U();
        }
    }

    public C4194p3(InterfaceC4204pd interfaceC4204pd, C4135m0 c4135m0, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C3957c1 c3957c1, C4157n2 c4157n2, Listener listener) {
        super(interfaceC4204pd, c4135m0, baseAdAdapter, c3957c1, c4157n2, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.f33304g == null) {
            IronLog.INTERNAL.verbose(a("placement is null "));
            E0 e02 = this.f33301d;
            if (e02 != null) {
                e02.f29209j.g("mCurrentPlacement is null state = " + this.f33302e);
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose(a("placement name = " + j()));
        if (this.f33301d != null) {
            HashMap map = new HashMap();
            if (com.ironsource.mediationsdk.r.m().r() != null) {
                for (String str : com.ironsource.mediationsdk.r.m().r().keySet()) {
                    map.put("custom_" + str, com.ironsource.mediationsdk.r.m().r().get(str));
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f33301d.f29208i.a(j(), this.f33304g.f(), this.f33304g.e(), jCurrentTimeMillis, IronSourceUtils.a(jCurrentTimeMillis, c()), C4122l5.a(this.f33207r), map, com.ironsource.mediationsdk.r.m().l());
        }
        ((V0) this.f33299b).a((C4194p3<?>) this, this.f33304g);
    }

    @Override // com.ironsource.AbstractC4138m3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.f33207r = new C4122l5();
        super.onAdClosed();
    }

    @Override // com.ironsource.AbstractC4211q3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        this.f33207r = null;
        super.onAdOpened();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (u().e()) {
            u().a(new a());
        } else {
            U();
        }
    }
}
