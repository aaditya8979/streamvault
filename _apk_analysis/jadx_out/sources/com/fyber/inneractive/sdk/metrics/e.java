package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f16802a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f16803b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f16804c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f16805d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f16806e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f16807f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f16808g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f16809h = null;

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long b() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f16808g = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long c() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f16802a = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long d() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f16805d = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long e() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f16807f = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long f() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f16803b = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long g() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f16804c = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long h() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f16809h = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long i() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f16806e = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final HashMap j() {
        HashMap map = new HashMap();
        Long l10 = this.f16803b;
        if (l10 != null && this.f16802a != null) {
            map.put("sdk_init_network_req", Long.valueOf(l10.longValue() - this.f16802a.longValue()));
        }
        Long l11 = this.f16809h;
        if (l11 != null && this.f16803b != null) {
            map.put("sdk_got_response_from_markup_url", Long.valueOf(l11.longValue() - this.f16803b.longValue()));
        }
        Long l12 = this.f16805d;
        if (l12 != null && this.f16809h != null) {
            map.put("sdk_parsed_res", Long.valueOf(l12.longValue() - this.f16809h.longValue()));
        }
        Long l13 = this.f16804c;
        if (l13 != null && this.f16803b != null) {
            map.put("sdk_got_server_res", Long.valueOf(l13.longValue() - this.f16803b.longValue()));
        }
        Long l14 = this.f16805d;
        if (l14 != null && this.f16804c != null) {
            map.put("sdk_parsed_res", Long.valueOf(l14.longValue() - this.f16804c.longValue()));
        }
        Long l15 = this.f16806e;
        if (l15 != null && this.f16805d != null) {
            map.put("ad_loaded_result", Long.valueOf(l15.longValue() - this.f16805d.longValue()));
        }
        Long l16 = this.f16807f;
        if (l16 != null && this.f16806e != null) {
            map.put("publisher_notified", Long.valueOf(l16.longValue() - this.f16806e.longValue()));
        }
        Long l17 = this.f16808g;
        if (l17 != null && this.f16802a != null) {
            map.put("roundtrip", Long.valueOf(l17.longValue() - this.f16802a.longValue()));
        }
        return map;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricsCollectorData{");
        if (this.f16802a != null && this.f16803b != null) {
            sb2.append(" sdk_init_network_req=");
            sb2.append(this.f16803b.longValue() - this.f16802a.longValue());
        }
        if (this.f16809h != null && this.f16803b != null) {
            sb2.append(", sdk_got_response_from_markup_url=");
            sb2.append(this.f16809h.longValue() - this.f16803b.longValue());
        }
        if (this.f16804c != null && this.f16803b != null) {
            sb2.append(", sdk_got_server_res=");
            sb2.append(this.f16804c.longValue() - this.f16803b.longValue());
        }
        if (this.f16805d != null && this.f16804c != null) {
            sb2.append(", sdk_parsed_res=");
            sb2.append(this.f16805d.longValue() - this.f16804c.longValue());
        }
        if (this.f16806e != null && this.f16805d != null) {
            sb2.append(", ad_loaded_result=");
            sb2.append(this.f16806e.longValue() - this.f16805d.longValue());
        }
        if (this.f16807f != null && this.f16806e != null) {
            sb2.append(", publisher_notified=");
            sb2.append(this.f16807f.longValue() - this.f16806e.longValue());
        }
        if (this.f16808g != null && this.f16802a != null) {
            sb2.append(", roundtrip=");
            sb2.append(this.f16808g.longValue() - this.f16802a.longValue());
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
