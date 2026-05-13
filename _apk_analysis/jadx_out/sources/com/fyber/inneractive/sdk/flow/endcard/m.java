package com.fyber.inneractive.sdk.flow.endcard;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16360a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16361b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16362c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f16363d = new g();

    public final b a() {
        int i10 = this.f16362c;
        if (i10 >= 0) {
            return (b) this.f16360a.get(i10);
        }
        return null;
    }

    public final b a(com.fyber.inneractive.sdk.model.vast.i iVar) {
        for (b bVar : this.f16361b) {
            if (bVar.i() == iVar) {
                return bVar;
            }
        }
        return null;
    }

    public final void a(b bVar) {
        if (((bVar instanceof o) || (bVar instanceof d)) && this.f16360a.contains(bVar)) {
            return;
        }
        this.f16360a.add(bVar);
        this.f16360a.sort(this.f16363d);
    }
}
