package com.mbridge.msdk.foundation.entity;

import java.io.Serializable;

/* JADX INFO: compiled from: LoopEntity.java */
/* JADX INFO: loaded from: classes6.dex */
public class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37574c;

    public i(String str, String str2, int i10) {
        this.f37573b = str;
        this.f37574c = str2;
        this.f37572a = i10;
    }

    public String d() {
        return this.f37573b;
    }

    public String g() {
        return this.f37574c;
    }
}
