package f;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements NativeAd.OnNativeAdLoadedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f61387b;

    public r(t tVar) {
        this.f61387b = tVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        int i10;
        int i11;
        z zVar = this.f61387b.f61389b;
        zVar.E = nativeAd;
        zVar.H = System.currentTimeMillis();
        z zVar2 = this.f61387b.f61389b;
        zVar2.E.setOnPaidEventListener(zVar2.J);
        t tVar = this.f61387b;
        z zVar3 = tVar.f61389b;
        i.e eVar = zVar3.f71962k;
        if (eVar == null || (i10 = eVar.f63662d) == 0) {
            i10 = 1000;
        }
        int i12 = i10;
        if (eVar == null || (i11 = eVar.f63663e) == 0) {
            i11 = 570;
        }
        zVar3.F = new d.b(tVar.f61388a, nativeAd);
        t tVar2 = this.f61387b;
        z zVar4 = tVar2.f61389b;
        zVar4.F.a(tVar2.f61388a, i12, i11, zVar4.B, zVar4.C);
    }
}
