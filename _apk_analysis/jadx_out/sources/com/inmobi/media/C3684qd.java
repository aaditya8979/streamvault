package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.AppMetrics;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.Sponsored;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3684qd extends AbstractC3869y implements InterfaceC3338cj, InterfaceC3712rh, InterfaceC3395f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaView f27970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f27971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3371e1 f27972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Nc f27973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ec f27974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Jc f27975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D4 f27976h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3684qd(MediaView mediaView, View view, AbstractC3371e1 abstractC3371e1, Nc nc2, Ec ec2, Jc jc2) {
        tn.p.k(abstractC3371e1, "adSessionManager");
        tn.p.k(nc2, "nativeBeaconProcessor");
        tn.p.k(ec2, "nativeAdUnitComponent");
        tn.p.k(jc2, "stateMachine");
        C3844x c3844x = ec2.f25379a;
        super(c3844x);
        this.f27970b = mediaView;
        this.f27971c = view;
        this.f27972d = abstractC3371e1;
        this.f27973e = nc2;
        this.f27974f = ec2;
        this.f27975g = jc2;
        G g10 = c3844x.f28473b;
        this.f27976h = new D4(g10.f25495h, g10.f25488a.f27823a.f25731a);
    }

    @Override // com.inmobi.media.InterfaceC3395f
    public final Object a(hn.c cVar) {
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("NativeLoadedState", "onDestroy");
        }
        Object objA = this.f27975g.a(new Vc(), this, (ContinuationImpl) cVar);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() throws JSONException {
        NativeMedia media;
        AppMetrics appMetrics;
        Sponsored sponsored;
        CTA cta;
        Description description;
        Title title;
        Icon icon;
        AppMetrics appMetrics2;
        AppMetrics appMetrics3;
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("NativeLoadedState", "Initialize Called");
        }
        Dc dc2 = (Dc) this.f27974f.f25384f.getValue();
        Map mapA = AbstractC3491ik.a(dc2.f25313a);
        long j10 = dc2.f25314b.f26898a;
        p000do.l0 l0Var = AbstractC3492il.f27361a;
        mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        Wj wj2 = Wj.f26549a;
        Wj.b("AdLoadSuccessful", mapA, EnumC3287ak.f26805a);
        this.f27973e.f26034b.f25868b.a(Te.f26356a);
        JsonAssetObject assetsObject = this.f27974f.f25380b.getAssetsObject();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InMobiNative.APP_INSTALLS, (assetsObject == null || (appMetrics3 = assetsObject.getAppMetrics()) == null) ? null : appMetrics3.getDownloads());
        jSONObject.put(InMobiNative.LIKES, (assetsObject == null || (appMetrics2 = assetsObject.getAppMetrics()) == null) ? null : appMetrics2.getLikes());
        C3307be c3307be = new C3307be((assetsObject == null || (title = assetsObject.getTitle()) == null) ? null : title.getText(), (assetsObject == null || (description = assetsObject.getDescription()) == null) ? null : description.getText(), new InMobiNativeImage((assetsObject == null || (icon = assetsObject.getIcon()) == null) ? null : icon.getUrl()), (assetsObject == null || (cta = assetsObject.getCta()) == null) ? null : cta.getText(), jSONObject, (assetsObject == null || (sponsored = assetsObject.getSponsored()) == null) ? null : sponsored.getText(), (assetsObject == null || (appMetrics = assetsObject.getAppMetrics()) == null) ? null : appMetrics.getRating(), tn.p.f((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), "video"), this.f27970b, this.f27971c);
        Ac ac2 = this.f27974f.f25381c;
        ac2.getClass();
        tn.p.k(c3307be, "pubData");
        InterfaceC3338cj interfaceC3338cj = ac2.f25156c;
        Cd cd2 = interfaceC3338cj instanceof Cd ? (Cd) interfaceC3338cj : null;
        if (cd2 != null) {
            cd2.a(c3307be);
        }
    }

    @Override // com.inmobi.media.InterfaceC3712rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        tn.p.k(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3580m9 interfaceC3580m9L = l();
        if (interfaceC3580m9L != null) {
            ((C3605n9) interfaceC3580m9L).a("NativeLoadedState", "registerViewForTracking - parentView: " + inMobiNativeViewData.getParentView$media_release() + ", isAttachedToWindow: " + inMobiNativeViewData.getParentView$media_release().isAttachedToWindow());
        }
        G g10 = this.f28550a.f28473b;
        tn.p.k(g10, "<this>");
        long timeToLive = g10.f25488a.f27824b.getCacheConfig("native").getTimeToLive();
        long millis = g10.f25498k;
        if (millis == -1) {
            millis = g10.f25497j + TimeUnit.SECONDS.toMillis(timeToLive);
        }
        if (millis - System.currentTimeMillis() < 0) {
            InterfaceC3580m9 interfaceC3580m9L2 = l();
            if (interfaceC3580m9L2 != null) {
                ((C3605n9) interfaceC3580m9L2).a("NativeLoadedState", "Ad-Expired");
            }
            Map mapA = AbstractC3491ik.a(((Dc) this.f27974f.f25384f.getValue()).f25313a);
            Wj wj2 = Wj.f26549a;
            Wj.b("AdExpired", mapA, EnumC3287ak.f26805a);
        }
        this.f27976h.a();
        C3319c0 c3319c0 = this.f28550a.f28472a.f27736d;
        c3319c0.getClass();
        c3319c0.f26901d = SystemClock.elapsedRealtime();
        this.f27973e.f26034b.f25870d.a(Te.f26356a);
        Map mapA2 = AbstractC3491ik.a(((Dc) this.f27974f.f25384f.getValue()).f25313a);
        Wj wj3 = Wj.f26549a;
        Wj.b("StartTracking", mapA2, EnumC3287ak.f26805a);
        this.f27975g.a(new C3759te(new C3784ue(new C3738si(), new Sg(inMobiNativeViewData, this.f27970b, this.f27971c), this.f27976h, this.f27972d, this.f27973e, this.f27974f), this.f27975g), this);
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void c() {
    }
}
