package ap;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements OnPaidEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f5238a;

    public a(g gVar) {
        this.f5238a = gVar;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        this.f5238a.f5245c.f(adValue.getValueMicros() / 1000000.0d);
        n nVar = this.f5238a.f5245c;
        StringBuilder sb2 = new StringBuilder("admob_");
        n nVar2 = this.f5238a.f5245c;
        sb2.append(n.E(nVar2, nVar2.G));
        nVar.f71977z = sb2.toString();
        this.f5238a.f5245c.r(adValue);
        this.f5238a.f5245c.I.setRevenue(adValue.getValueMicros() / 1000000.0d);
        int precisionType = adValue.getPrecisionType();
        this.f5238a.f5245c.I.setRevenuePrecision(precisionType != 0 ? precisionType != 1 ? precisionType != 3 ? "PUBLISHER_PROVIDED" : "PRECISE" : "ESTIMATED" : "UNKNOWN");
        n nVar3 = this.f5238a.f5245c;
        nVar3.I.setNetworkName(n.E(nVar3, nVar3.G));
    }
}
