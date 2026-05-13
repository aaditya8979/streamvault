package yads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class gn1 implements dn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vi1 f90041a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f90044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f90045e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f90043c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f90042b = new Object();

    public gn1(mo moVar, boolean z10) {
        this.f90041a = new vi1(moVar, z10);
    }

    @Override // yads.dn1
    public final s63 a() {
        return this.f90041a.f96111o;
    }

    @Override // yads.dn1
    public final Object getUid() {
        return this.f90042b;
    }
}
