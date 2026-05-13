package com.inmobi.ads;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3531ka;
import com.inmobi.media.C3556la;
import com.inmobi.media.Jg;
import com.inmobi.media.Kb;
import org.json.JSONException;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements PreloadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3531ka f25111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiInterstitial f25112b;

    public e(InMobiInterstitial inMobiInterstitial) {
        this.f25112b = inMobiInterstitial;
        this.f25111a = new C3531ka(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() throws JSONException {
        try {
            this.f25112b.getMAdManager$media_release().i();
        } catch (IllegalStateException e10) {
            String strAccess$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
            p.j(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            Kb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
            this.f25112b.getMPubListener$media_release().a(this.f25112b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.f25112b.f25095b = true;
        Jg jg2 = this.f25112b.f25097d;
        jg2.getClass();
        p.k("Preload", "<set-?>");
        jg2.f25737g = "Preload";
        C3556la mAdManager$media_release = this.f25112b.getMAdManager$media_release();
        Jg jg3 = this.f25112b.f25097d;
        Context context = this.f25112b.f25094a;
        if (context == null) {
            p.C("mContext");
            context = null;
        }
        mAdManager$media_release.a(jg3, context, true, "intHtml");
        this.f25112b.getMAdManager$media_release().b(this.f25111a);
    }
}
