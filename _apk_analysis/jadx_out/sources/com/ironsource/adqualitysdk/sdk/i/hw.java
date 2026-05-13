package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class hw<T> {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private hy f2429;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f2431;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ht f2432 = new ht();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Set<Object> f2433 = new HashSet();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Set<T> f2430 = new HashSet();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Set<hv> f2428 = new HashSet();

    public hw(hy hyVar) {
        this.f2429 = hyVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Set<hv> m6431() {
        return this.f2428;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final Set<T> m6432() {
        return this.f2430;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final hw m6433() {
        this.f2431 = true;
        return this;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6434(hv hvVar) {
        this.f2428.add(hvVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6435(T t10) {
        this.f2430.add(t10);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final ht m6436() {
        return this.f2432;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m6437() {
        return this.f2431;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Set<Object> m6438() {
        return this.f2433;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final hy m6439() {
        return this.f2429;
    }
}
