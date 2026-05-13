package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4935lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4797g2 f67207a = new C4797g2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4930l6 f67208b = new C4930l6();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public An f67209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f67210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f67211e;

    public final synchronized void a() {
        this.f67208b.f67190a.clear();
        this.f67210d = false;
        this.f67211e = false;
    }

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, Ua ua2) {
        if (this.f67211e) {
            return;
        }
        cn.b0.G(this.f67208b.f67190a, new Ga[]{this.f67207a.a(context, appMetricaConfig, ua2)});
        this.f67211e = true;
    }

    public final synchronized void b() {
        if (this.f67210d) {
            return;
        }
        C4930l6 c4930l6 = this.f67208b;
        ArrayList arrayList = C4696c4.l().f66459i.f67384a;
        ArrayList arrayList2 = new ArrayList(cn.x.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c4930l6.f67190a.addAll(arrayList2);
        this.f67210d = true;
    }

    public final synchronized void c() {
        if (this.f67209c != null) {
            return;
        }
        P1 p12 = new P1(this.f67208b);
        this.f67209c = new An(p12);
        C5296zn c5296zn = new C5296zn();
        c5296zn.f68091a.add(p12);
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            c5296zn.f68091a.add(defaultUncaughtExceptionHandler);
        }
        Thread.setDefaultUncaughtExceptionHandler(c5296zn);
    }
}
