package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3647p1 f25488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f25489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MetaInfo f25491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f25493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f25494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ContextData f25495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f25496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f25497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f25498k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final JSONObject f25499l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F f25500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final E f25501n;

    public G(D d10, String str, MetaInfo metaInfo, String str2, String str3, List list, List list2, ContextData contextData, String str4, long j10, long j11, JSONObject jSONObject, F f10, E e10, C3647p1 c3647p1) {
        tn.p.k(d10, "adSetContext");
        tn.p.k(str, "markupType");
        tn.p.k(str2, "creativeId");
        tn.p.k(str3, "tracking");
        tn.p.k(list, "trackers");
        tn.p.k(list2, "trackingInfo");
        tn.p.k(jSONObject, "transactionInfo");
        tn.p.k(f10, "viewability");
        tn.p.k(e10, "mrc50");
        tn.p.k(c3647p1, "adManagerContext");
        this.f25488a = c3647p1;
        this.f25489b = d10;
        this.f25490c = str;
        this.f25491d = metaInfo;
        this.f25492e = str2;
        this.f25493f = list;
        this.f25494g = list2;
        this.f25495h = contextData;
        this.f25496i = str4;
        this.f25497j = j10;
        this.f25498k = j11;
        this.f25499l = jSONObject;
        this.f25500m = f10;
        this.f25501n = e10;
    }
}
