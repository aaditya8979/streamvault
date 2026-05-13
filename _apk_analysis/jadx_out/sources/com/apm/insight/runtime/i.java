package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: LooperMessageManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static i f7520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f7521b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Printer> f7522c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Printer> f7523d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7524e = false;

    static {
        new Printer() { // from class: com.apm.insight.runtime.i.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (str == null) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    i.a().a(str);
                } else if (str.charAt(0) == '<') {
                    i.a().b(str);
                }
                i.c();
            }
        };
    }

    private i() {
    }

    public static i a() {
        if (f7520a == null) {
            synchronized (i.class) {
                if (f7520a == null) {
                    f7520a = new i();
                }
            }
        }
        return f7520a;
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Printer printer = list.get(i10);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th2) {
            com.apm.insight.a.a(th2);
        }
    }

    public static /* synthetic */ Printer c() {
        return null;
    }

    public final void a(String str) {
        this.f7521b = -1L;
        try {
            a(this.f7522c, str);
        } catch (Exception e10) {
            com.apm.insight.a.a((Throwable) e10);
        }
    }

    public final void b(String str) {
        this.f7521b = SystemClock.uptimeMillis();
        try {
            a(this.f7523d, str);
        } catch (Exception e10) {
            com.apm.insight.a.b((Throwable) e10);
        }
    }

    public final boolean b() {
        return this.f7521b != -1 && SystemClock.uptimeMillis() - this.f7521b > 5000;
    }
}
