package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes5.dex */
public final class O8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f65689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f65690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f65691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f65692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f65693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4879j7 f65694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EnumC4703cb f65695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f65696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f65697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f65698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f65699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f65700m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f65701n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J8 f65702o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EnumC4753ea f65703p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final EnumC4983n9 f65704q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f65705r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f65706s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f65707t;

    /* JADX WARN: Multi-variable type inference failed */
    public O8(ContentValues contentValues) {
        C4776f7 model = new C4802g7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f65688a = model.a().j();
        this.f65689b = model.a().p();
        this.f65690c = model.c();
        this.f65691d = model.b();
        this.f65692e = model.a().k();
        this.f65693f = model.d();
        this.f65694g = model.a().i();
        this.f65695h = model.e();
        this.f65696i = model.a().d();
        this.f65697j = model.a().f();
        this.f65698k = model.a().o();
        this.f65699l = model.a().c();
        this.f65700m = model.a().b();
        this.f65701n = model.a().m();
        J8 j8E = model.a().e();
        this.f65702o = j8E == null ? J8.a(null) : j8E;
        EnumC4753ea enumC4753eaH = model.a().h();
        this.f65703p = enumC4753eaH == null ? EnumC4753ea.a(null) : enumC4753eaH;
        this.f65704q = model.a().n();
        this.f65705r = model.a().a();
        this.f65706s = model.a().l();
        this.f65707t = model.a().g();
    }
}
