package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import com.ironsource.C3978d4;

/* JADX INFO: loaded from: classes6.dex */
public final class Hc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f65312c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65314b;

    static {
        SparseArray sparseArray = new SparseArray();
        f65312c = sparseArray;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new Hc("jvm", "binder"));
        sparseArray.put(5890, new Hc("jvm", C3978d4.i.f31327b));
        sparseArray.put(5889, new Hc("jvm", C3978d4.i.f31327b));
        sparseArray.put(5897, new Hc("jni_native", C3978d4.i.f31327b));
        sparseArray.put(5898, new Hc("jni_native", C3978d4.i.f31327b));
    }

    public Hc(String str, String str2) {
        this.f65313a = str;
        this.f65314b = str2;
    }
}
