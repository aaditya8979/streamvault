package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4958m9 extends Gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4991nh f67283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5041ph f67284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4683bh f67285c;

    public C4958m9(Y4 y42) {
        this.f67283a = new C4991nh(y42);
        this.f67284b = new C5041ph(y42);
        this.f67285c = new C4683bh(y42);
    }

    @Override // io.appmetrica.analytics.impl.Gf
    public final X8 a(int i10) {
        LinkedList linkedList = new LinkedList();
        int iOrdinal = EnumC4703cb.a(i10).ordinal();
        if (iOrdinal == 1) {
            linkedList.add(this.f67283a);
        } else if (iOrdinal == 3) {
            linkedList.add(this.f67285c);
        } else if (iOrdinal == 27) {
            linkedList.add(this.f67284b);
            linkedList.add(this.f67283a);
        }
        return new W8(linkedList);
    }
}
