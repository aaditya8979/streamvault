package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.activities.FyberReportAdActivity;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierFactory;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierRemote;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements IFyberAdIdentifier.ClickListener, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InneractiveAdRequest f16394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f16395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IFyberAdIdentifier f16396d;

    public g(Context context, boolean z10, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f16393a = context;
        this.f16394b = inneractiveAdRequest;
        this.f16395c = eVar;
        new FyberAdIdentifierFactory();
        IFyberAdIdentifier fyberAdIdentifierRemote = z10 ? new FyberAdIdentifierRemote(rVar) : new FyberAdIdentifierLocal(rVar);
        this.f16396d = fyberAdIdentifierRemote;
        fyberAdIdentifierRemote.f19475a = this;
    }

    @Override // com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.ClickListener
    public final void a() {
        Long demandId;
        String demandSource;
        com.fyber.inneractive.sdk.response.e eVar = this.f16395c;
        String str = null;
        if (eVar != null) {
            ImpressionData impressionData = eVar.f19400t;
            String advertiserDomain = impressionData != null ? impressionData.getAdvertiserDomain() : null;
            ImpressionData impressionData2 = this.f16395c.f19400t;
            demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
            ImpressionData impressionData3 = this.f16395c.f19400t;
            str = advertiserDomain;
            demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
        } else {
            demandId = null;
            demandSource = null;
        }
        FyberReportAdActivity.start(this.f16393a, this, str, demandSource, demandId);
    }
}
