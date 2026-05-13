package com.fyber.inneractive.sdk.cache;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15887b;

    public l(String str) {
        this.f15886a = str;
        this.f15887b = String.format("template_%d.html", Integer.valueOf(str.hashCode()));
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        return str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        return this.f15886a;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return this.f15887b;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return this.f15887b;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }
}
