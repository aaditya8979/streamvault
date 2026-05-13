package com.mbridge.msdk.foundation.same.net.exception;

/* JADX INFO: compiled from: CommonError.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f37793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.toolbox.a f37794c;

    public a(int i10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.f37792a = i10;
        this.f37794c = aVar;
    }

    public a(int i10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar, String str) {
        this.f37792a = i10;
        this.f37794c = aVar;
        this.f37793b = str;
    }
}
