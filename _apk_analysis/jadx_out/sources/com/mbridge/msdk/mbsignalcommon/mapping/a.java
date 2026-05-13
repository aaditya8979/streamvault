package com.mbridge.msdk.mbsignalcommon.mapping;

/* JADX INFO: compiled from: Mapping.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<?> f38871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38872b;

    public a(Exception exc) {
        super(exc);
    }

    public a(String str) {
        super(str);
    }

    public void a(Class<?> cls) {
        this.f38871a = cls;
    }

    public void a(String str) {
        this.f38872b = str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (getCause() == null) {
            return super.toString();
        }
        return getClass().getName() + ": " + getCause();
    }
}
