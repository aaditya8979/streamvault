package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.media.W;
import com.inmobi.media.Z;
import com.inmobi.media.core.config.models.AdConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3622o1 f26670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f26671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3647p1 f26672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdConfig f26673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3360df f26674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3666pk f26675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26676g;

    public Z(C3622o1 c3622o1, C3608nc c3608nc) {
        tn.p.k(c3622o1, "adManagerComponent");
        tn.p.k(c3608nc, "mediationSpecificConfig");
        this.f26670a = c3622o1;
        this.f26671b = new X(c3622o1.f27736d, c3622o1.f27738f);
        C3647p1 c3647p1 = c3622o1.f27733a;
        this.f26672c = c3647p1;
        AdConfig adConfig = c3647p1.f27824b;
        this.f26673d = adConfig;
        this.f26674e = new C3411ff(c3622o1.f27734b, c3622o1.f27735c).a();
        Integer num = c3608nc.f27687d;
        long jIntValue = num != null ? num.intValue() : 15000;
        Integer num2 = c3608nc.f27687d;
        this.f26675f = new C3666pk(jIntValue, num2 != null ? num2.intValue() : 15000, c3608nc.f27687d != null ? r11.intValue() : 15000);
        this.f26676g = adConfig.getApplyGzipReq();
    }

    public static final bn.r a(Z z10, W w10) {
        tn.p.k(w10, "adFetchEvent");
        C3605n9 c3605n9 = z10.f26670a.f27735c;
        if (c3605n9 != null) {
            c3605n9.a("AdFetchManager", "adFetchEvent " + w10);
        }
        z10.f26671b.a(w10);
        return bn.r.f5635a;
    }

    public final Object a(P6 p62) {
        C3605n9 c3605n9 = this.f26670a.f27735c;
        if (c3605n9 != null) {
            c3605n9.a("AdFetchManager", "fetchAd Called");
        }
        String string = UUID.randomUUID().toString();
        tn.p.j(string, "toString(...)");
        Jg jg2 = this.f26672c.f27823a;
        Map map = jg2.f25733c;
        long j10 = jg2.f25731a;
        Context context = this.f26670a.f27734b;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        String str = context instanceof Activity ? ActivityChooserModel.ATTRIBUTE_ACTIVITY : "others";
        this.f26672c.getClass();
        return new Yn(new C3646p0(this.f26673d.getUrl(), new Ak(this.f26673d.getIncludeIdParams()), new C3596n0(string, map, j10, str, "native", kotlin.collections.a.j(), this.f26672c.f27823a.f25732b, this.f26673d.getRendering().getEnablePubMuteControl() && Ji.f25752f), this.f26675f, this.f26674e, this.f26670a.f27735c, this.f26676g).a(), this.f26670a.f27735c).a(new sn.l() { // from class: n9.h5
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Z.a(this.f75399b, (W) obj);
            }
        }, p62);
    }
}
