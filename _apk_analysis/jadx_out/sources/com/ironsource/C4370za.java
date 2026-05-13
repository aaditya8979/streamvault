package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.ironsource.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C4370za {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f34505i = "WaterfallLifeCycleHolder";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.ironsource.mediationsdk.t f34509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f34510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f34511f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap<String, CopyOnWriteArrayList<com.ironsource.mediationsdk.t>> f34506a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34507b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34508c = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Timer f34512g = new Timer();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ConcurrentHashMap<String, AdInfo> f34513h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.ironsource.za$a */
    public class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f34514a;

        public a(String str) {
            this.f34514a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f34514a + " from memory");
                C4370za.this.f34506a.remove(this.f34514a);
                ironLog.verbose("waterfall size is currently " + C4370za.this.f34506a.size());
                ironLog.verbose("removing adInfo with id " + this.f34514a + " from memory");
                C4370za.this.f34513h.remove(this.f34514a);
                ironLog.verbose("adInfo size is currently " + C4370za.this.f34513h.size());
            } finally {
                cancel();
            }
        }
    }

    public C4370za(List<String> list, int i10) {
        this.f34510e = list;
        this.f34511f = i10;
    }

    private void b() {
        for (com.ironsource.mediationsdk.t tVar : c()) {
            if (!tVar.equals(this.f34509d)) {
                tVar.q();
            }
        }
    }

    public AdInfo a(String str) {
        if (this.f34513h.containsKey(str)) {
            return this.f34513h.get(str);
        }
        return null;
    }

    public synchronized void a(com.ironsource.mediationsdk.t tVar) {
        IronLog.INTERNAL.verbose();
        com.ironsource.mediationsdk.t tVar2 = this.f34509d;
        if (tVar2 != null && !tVar2.equals(tVar)) {
            this.f34509d.q();
        }
        this.f34509d = tVar;
    }

    public void a(String str, Z8 z82, Bb bb2) {
        if (TextUtils.isEmpty(str) || z82 == null) {
            return;
        }
        this.f34513h.put(str, new AdInfo(z82, bb2));
    }

    public void a(CopyOnWriteArrayList<com.ironsource.mediationsdk.t> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        b();
        this.f34506a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f34508c)) {
            if (g()) {
                ironLog.verbose("ad from previous waterfall " + this.f34508c + " is still showing - the current waterfall " + this.f34507b + " will be deleted instead");
                String str2 = this.f34507b;
                this.f34507b = this.f34508c;
                this.f34508c = str2;
            }
            this.f34512g.schedule(new a(this.f34508c), this.f34511f);
        }
        this.f34508c = this.f34507b;
        this.f34507b = str;
    }

    public boolean a() {
        return this.f34506a.size() > 5;
    }

    public synchronized boolean b(com.ironsource.mediationsdk.t tVar) {
        boolean z10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        z10 = false;
        if (tVar == null || tVar.o() || (this.f34509d != null && ((tVar.w() == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK && this.f34509d.c().equals(tVar.c())) || ((tVar.w() == LoadWhileShowSupportState.NONE || this.f34510e.contains(tVar.j())) && this.f34509d.j().equals(tVar.j()))))) {
            z10 = true;
        }
        if (z10 && tVar != null) {
            ironLog.verbose(tVar.c() + " will not be added to the auction request");
        }
        return !z10;
    }

    public CopyOnWriteArrayList<com.ironsource.mediationsdk.t> c() {
        CopyOnWriteArrayList<com.ironsource.mediationsdk.t> copyOnWriteArrayList = this.f34506a.get(this.f34507b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public String d() {
        return this.f34507b;
    }

    public int e() {
        return this.f34506a.size();
    }

    public com.ironsource.mediationsdk.t f() {
        return this.f34509d;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean g() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ironsource.mediationsdk.t r0 = r2.f34509d     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.u()     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r2.f34508c     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            monitor-exit(r2)
            return r0
        L16:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4370za.g():boolean");
    }
}
