package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v0;

/* JADX INFO: loaded from: classes7.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f10399a = new StringBuilder();

    private String a(v0 v0Var) {
        v0.b bVarD = v0Var.d();
        return bVarD == v0.b.EVENT ? ((y0) v0Var).g() : bVarD == v0.b.DECISION ? StringUtils.emptyIfNull(v0Var.b()) : StringUtils.emptyIfNull(v0Var.e());
    }

    private void a(String str) {
        StringBuilder sb2 = this.f10399a;
        sb2.append(str);
        sb2.append("\n");
    }

    private void a(String str, long j10) {
        a(str + " after " + j10 + "ms");
    }

    public void a() {
        this.f10399a.setLength(0);
    }

    public void a(v0 v0Var, long j10) {
        if (v0Var.d() == v0.b.DECISION) {
            return;
        }
        a(a(v0Var), j10);
    }

    public void a(v0 v0Var, boolean z10, long j10) {
        a(a(v0Var) + ": " + z10, j10);
    }

    public void b() {
        a("Invalid Activity");
    }

    public void b(String str) {
        a("Invalid state: " + str);
    }

    public String toString() {
        return this.f10399a.toString();
    }
}
