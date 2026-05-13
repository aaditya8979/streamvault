package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ht {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f2423;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<List<Field>> f2424;

    public ht() {
        ArrayList arrayList = new ArrayList();
        this.f2424 = arrayList;
        int i10 = (-1) + 1;
        this.f2423 = i10;
        arrayList.add(i10, new ArrayList());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<List<Field>> m6420() {
        return this.f2424;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6421(Field field) {
        this.f2424.get(this.f2423).remove(field);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6422() {
        int i10 = this.f2423 + 1;
        this.f2423 = i10;
        this.f2424.add(i10, new ArrayList());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m6423(Field field) {
        this.f2424.get(this.f2423).add(field);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m6424() {
        this.f2424.remove(this.f2423);
        this.f2423--;
    }
}
