package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class I0 implements Eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L0 f25628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25629b;

    public I0(L0 l02, boolean z10) {
        this.f25628a = l02;
        this.f25629b = z10;
    }

    @Override // com.inmobi.media.Eg
    public final void a(Object obj) {
        ((Boolean) obj).getClass();
        this.f25628a.a("result pushed to queue");
        if (this.f25629b) {
            L0 l02 = this.f25628a;
            l02.a("session end - cleanup");
            l02.f25837g = null;
            l02.f25836f.clear();
            l02.f25833c.set(false);
            l02.f25834d.set(false);
        }
    }

    @Override // com.inmobi.media.Eg
    public final void onError(Exception exc) {
        this.f25628a.a("error in pushing to queue", exc);
    }
}
