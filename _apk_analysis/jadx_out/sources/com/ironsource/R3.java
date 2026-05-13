package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class R3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f30323a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f30324b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30325c;

    public enum a {
        NOT_READY,
        READY
    }

    public R3(String str) {
        this.f30325c = str;
    }

    public synchronized void a() {
        Object[] array = this.f30324b.toArray();
        for (int i10 = 0; i10 < array.length; i10++) {
            ((Runnable) array[i10]).run();
            array[i10] = null;
        }
        this.f30324b.clear();
    }

    public synchronized void a(Runnable runnable) {
        if (this.f30323a != a.READY) {
            this.f30324b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public synchronized void b() {
        this.f30323a = a.NOT_READY;
    }

    public synchronized void c() {
        this.f30323a = a.READY;
    }
}
