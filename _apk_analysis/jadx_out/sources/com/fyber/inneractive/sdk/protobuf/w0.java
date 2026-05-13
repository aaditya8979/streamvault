package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes11.dex */
public final class w0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f19266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j4 f19268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19270e;

    public w0(e1 e1Var, int i10, j4 j4Var, boolean z10, boolean z11) {
        this.f19266a = e1Var;
        this.f19267b = i10;
        this.f19268c = j4Var;
        this.f19269d = z10;
        this.f19270e = z11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f19267b - ((w0) obj).f19267b;
    }
}
