package com.inmobi.media;

/* JADX INFO: loaded from: classes8.dex */
public final class J0 implements Eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L0 f25674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ej f25676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f25677d;

    public J0(L0 l02, boolean z10, Ej ej2, String str) {
        this.f25674a = l02;
        this.f25675b = z10;
        this.f25676c = ej2;
        this.f25677d = str;
    }

    @Override // com.inmobi.media.Eg
    public final void a(String str) {
        tn.p.k(str, "result");
        this.f25674a.a("file saved - " + str + " , isReporting - " + this.f25675b);
        this.f25674a.a(str, this.f25676c, this.f25677d, this.f25675b);
    }

    @Override // com.inmobi.media.Eg
    public final void onError(Exception exc) {
        this.f25674a.a(exc, this.f25676c);
    }
}
