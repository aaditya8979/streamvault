package com.fyber.inneractive.sdk.metrics;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f16789g = String.valueOf(24);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f16790h = String.valueOf(3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f16791i = String.valueOf(24);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f16792j = String.valueOf(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UnitDisplayType f16794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f16795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InneractiveAdRequest f16796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONArray f16797f;

    public c(com.fyber.inneractive.sdk.response.e eVar, InneractiveAdRequest inneractiveAdRequest, String str, UnitDisplayType unitDisplayType, JSONArray jSONArray) {
        super("send_metric_report");
        this.f16795d = eVar;
        this.f16796e = inneractiveAdRequest;
        this.f16793b = str;
        this.f16794c = unitDisplayType;
        this.f16797f = jSONArray;
    }

    public final void a() {
        d dVar = d.f16798d;
        g gVarA = dVar.a(this.f16793b);
        HashMap mapJ = gVarA.j();
        if (!gVarA.a()) {
            IAlog.a("MetricCreativeReporter: Metric data not valid, data: %s", dVar.a(this.f16793b).toString());
        } else {
            dVar.f16799a.remove(this.f16793b);
            r.f19555a.execute(new b(this, gVarA, mapJ));
        }
    }
}
