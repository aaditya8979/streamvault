package com.mbridge.msdk.dycreator.error;

/* JADX INFO: compiled from: DyError.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37235b;

    public a(int i10, String str) {
        this.f37234a = i10;
        this.f37235b = str;
    }

    public a(b bVar) {
        if (bVar != null) {
            this.f37234a = bVar.d();
            this.f37235b = bVar.g();
        }
    }

    public String toString() {
        return "DyError{errorCode=" + this.f37234a + '}';
    }
}
