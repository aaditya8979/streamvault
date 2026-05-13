package f;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements OnPaidEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f61372a;

    public d0(z zVar) {
        this.f61372a = zVar;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        this.f61372a.f(adValue.getValueMicros() / 1000000.0d);
        this.f61372a.f71977z = "admob_" + this.f61372a.E.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName();
        this.f61372a.G = new AdInfo();
        this.f61372a.G.setRevenue(((double) adValue.getValueMicros()) / 1000000.0d);
        int precisionType = adValue.getPrecisionType();
        this.f61372a.G.setRevenuePrecision(precisionType != 0 ? precisionType != 1 ? precisionType != 3 ? "PUBLISHER_PROVIDED" : "PRECISE" : "ESTIMATED" : "UNKNOWN");
        z zVar = this.f61372a;
        zVar.G.setNetworkName(zVar.E.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName());
        z zVar2 = this.f61372a;
        zVar2.r(zVar2.G);
    }
}
