package com.fyber.inneractive.sdk.flow.storepromo.model;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f16614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16616c;

    public a(String str, b bVar) {
        this.f16615b = str;
        this.f16614a = bVar;
        this.f16616c = -1;
    }

    public a(String str, b bVar, int i10) {
        this.f16615b = str;
        this.f16614a = bVar;
        this.f16616c = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f16616c - ((a) obj).f16616c;
    }
}
