package com.ironsource.mediationsdk;

import com.ironsource.C4054h8;
import com.ironsource.C4277u2;
import com.ironsource.Dd;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final n f32710f = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f32711a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Boolean> f32712b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32715e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IronSource.a f32716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f32717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f32718c;

        public a(IronSource.a aVar, IronSourceError ironSourceError, String str) {
            this.f32716a = aVar;
            this.f32717b = ironSourceError;
            this.f32718c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            n.this.a(this.f32716a, this.f32717b);
            n.this.f32712b.put(this.f32718c, Boolean.FALSE);
        }
    }

    private n() {
    }

    private int a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return this.f32714d;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return this.f32713c;
        }
        if (aVar == IronSource.a.BANNER) {
            return this.f32715e;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 0;
    }

    public static synchronized n a() {
        return f32710f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSource.a aVar, IronSourceError ironSourceError) {
        this.f32711a.put(aVar.toString(), Long.valueOf(System.currentTimeMillis()));
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            Dd.a().a(ironSourceError);
            return;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            C4054h8.a().a(ironSourceError);
            return;
        }
        if (aVar == IronSource.a.BANNER) {
            C4277u2.a().a(ironSourceError);
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
    }

    public void a(IronSource.a aVar, int i10) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            this.f32714d = i10;
            return;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            this.f32713c = i10;
            return;
        }
        if (aVar == IronSource.a.BANNER) {
            this.f32715e = i10;
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
    }

    public synchronized void b(IronSource.a aVar, IronSourceError ironSourceError) {
        if (b(aVar)) {
            return;
        }
        String string = aVar.toString();
        if (!this.f32711a.containsKey(string)) {
            a(aVar, ironSourceError);
            return;
        }
        long jA = ((long) a(aVar)) * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f32711a.get(string).longValue();
        if (jCurrentTimeMillis > jA) {
            a(aVar, ironSourceError);
            return;
        }
        this.f32712b.put(string, Boolean.TRUE);
        long j10 = jA - jCurrentTimeMillis;
        IronLog.INTERNAL.verbose("delaying callback by " + j10);
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(aVar, ironSourceError, string), j10);
    }

    public synchronized boolean b(IronSource.a aVar) {
        if (!this.f32712b.containsKey(aVar.toString())) {
            return false;
        }
        return this.f32712b.get(aVar.toString()).booleanValue();
    }
}
