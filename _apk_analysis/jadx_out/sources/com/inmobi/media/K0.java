package com.inmobi.media;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes8.dex */
public final class K0 implements Eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L0 f25767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3747t2 f25768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Qh f25770d;

    public K0(L0 l02, AbstractC3747t2 abstractC3747t2, boolean z10, Qh qh2) {
        this.f25767a = l02;
        this.f25768b = abstractC3747t2;
        this.f25769c = z10;
        this.f25770d = qh2;
    }

    @Override // com.inmobi.media.Eg
    public final void a(Object obj) {
        this.f25767a.a((Bitmap) obj, this.f25768b, this.f25769c, this.f25770d);
    }

    @Override // com.inmobi.media.Eg
    public final void onError(Exception exc) {
        this.f25767a.a(exc, this.f25768b);
    }
}
