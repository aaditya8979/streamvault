package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class R5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30330e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f30331a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4172o f30333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4354yb f30334d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            InterfaceC4172o interfaceC4172o = R5.this.f30333c;
            if (interfaceC4172o != null) {
                interfaceC4172o.a();
            }
        }
    }

    public R5(int i10, InterfaceC4172o interfaceC4172o) {
        this.f30333c = interfaceC4172o;
        this.f30332b = i10;
    }

    public void a() {
        if (!b() || this.f30334d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.f30334d.e();
        this.f30334d = null;
    }

    public void a(long j10) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.f30332b) - Math.max(j10, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.f30333c.a();
                return;
            }
            a();
            this.f30334d = new C4354yb(millis, this.f30331a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }

    public boolean b() {
        return this.f30332b > 0;
    }
}
