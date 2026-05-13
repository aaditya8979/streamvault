package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4211q3;
import com.ironsource.O0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class zg<Smash extends AbstractC4211q3<?>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC4211q3<?> f34553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f34554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f34555f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Ag f34557h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f34550a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34551b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34552c = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Timer f34556g = new Timer();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f34558i = 5;

    public class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f34559a;

        public a(String str) {
            this.f34559a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f34559a + " from memory");
                zg.this.f34550a.remove(this.f34559a);
                ironLog.verbose("waterfall size is currently " + zg.this.f34550a.size());
            } finally {
                cancel();
            }
        }
    }

    public zg(List<String> list, int i10, Ag ag2) {
        this.f34554e = list;
        this.f34555f = i10;
        this.f34557h = ag2;
    }

    private void a() {
        for (Smash smash : b()) {
            if (!smash.equals(this.f34553d)) {
                smash.M();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean e() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ironsource.q3<?> r0 = r2.f34553d     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1b
            boolean r0 = r0.C()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1b
            com.ironsource.q3<?> r0 = r2.f34553d     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = r0.h()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r2.f34552c     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            monitor-exit(r2)
            return r0
        L1e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.zg.e():boolean");
    }

    public void a(O0.a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        a();
        if (aVar == O0.a.AUTOMATIC_LOAD_WHILE_SHOW || aVar == O0.a.MANUAL_WITH_LOAD_ON_SHOW) {
            this.f34550a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f34552c)) {
                if (e()) {
                    ironLog.verbose("ad from previous waterfall " + this.f34552c + " is still showing - the current waterfall " + this.f34551b + " will be deleted instead");
                    String str2 = this.f34551b;
                    this.f34551b = this.f34552c;
                    this.f34552c = str2;
                }
                this.f34556g.schedule(new a(this.f34552c), this.f34555f);
            }
        } else {
            this.f34550a.clear();
            this.f34550a.put(str, copyOnWriteArrayList);
        }
        this.f34552c = this.f34551b;
        this.f34551b = str;
        if (this.f34550a.size() > 5) {
            this.f34557h.a(this.f34550a.size());
        }
    }

    public synchronized void a(AbstractC4211q3<?> abstractC4211q3) {
        IronLog.INTERNAL.verbose();
        AbstractC4211q3<?> abstractC4211q32 = this.f34553d;
        if (abstractC4211q32 != null && !abstractC4211q32.equals(abstractC4211q3)) {
            this.f34553d.M();
        }
    }

    public synchronized boolean a(O0.a aVar, String str, String str2, LoadWhileShowSupportState loadWhileShowSupportState, AdapterBaseInterface adapterBaseInterface, IronSource.a aVar2) {
        boolean z10;
        AbstractC4211q3<?> abstractC4211q3;
        boolean zA = a(adapterBaseInterface, aVar2, str);
        z10 = true;
        if (zA || ((aVar == O0.a.AUTOMATIC_LOAD_WHILE_SHOW || aVar == O0.a.MANUAL_WITH_LOAD_ON_SHOW) && (abstractC4211q3 = this.f34553d) != null && abstractC4211q3.C() && ((loadWhileShowSupportState == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK && this.f34553d.c().equals(str)) || ((loadWhileShowSupportState == LoadWhileShowSupportState.NONE || this.f34554e.contains(str2)) && this.f34553d.n().equals(str2))))) {
            z10 = false;
        }
        if (!z10) {
            IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
        }
        return z10;
    }

    public boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(C4324wf.a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public List<Smash> b() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f34550a.get(this.f34551b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    public synchronized void b(AbstractC4211q3<?> abstractC4211q3) {
        IronLog.INTERNAL.verbose();
        this.f34553d = abstractC4211q3;
    }

    public String c() {
        return this.f34551b;
    }

    public AbstractC4211q3<?> d() {
        return this.f34553d;
    }
}
