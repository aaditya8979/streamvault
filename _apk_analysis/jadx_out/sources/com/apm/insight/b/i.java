package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: LooperPrinterUtils.java */
/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7141a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f7142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f7143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Printer f7144d;

    /* JADX INFO: compiled from: LooperPrinterUtils.java */
    public interface a {
    }

    /* JADX INFO: compiled from: LooperPrinterUtils.java */
    public static class b implements Printer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<Printer> f7145a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<Printer> f7148d = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<Printer> f7146b = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f7149e = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7147c = false;

        @Override // android.util.Printer
        public final void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i.b();
            if (str.charAt(0) == '>' && this.f7147c) {
                for (Printer printer : this.f7146b) {
                    if (!this.f7145a.contains(printer)) {
                        this.f7145a.add(printer);
                    }
                }
                this.f7146b.clear();
                this.f7147c = false;
            }
            if (this.f7145a.size() > i.f7141a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f7145a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            i.b();
        }
    }

    public static void a() {
        if (f7143c) {
            return;
        }
        f7143c = true;
        f7142b = new b();
        Printer printerD = d();
        f7144d = printerD;
        if (printerD != null) {
            f7142b.f7145a.add(printerD);
        }
        if (com.apm.insight.e.s()) {
            Looper.getMainLooper().setMessageLogging(f7142b);
        }
    }

    public static void a(Printer printer) {
        if (printer == null || f7142b.f7146b.contains(printer)) {
            return;
        }
        f7142b.f7146b.add(printer);
        f7142b.f7147c = true;
    }

    public static /* synthetic */ a b() {
        return null;
    }

    private static Printer d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }
}
