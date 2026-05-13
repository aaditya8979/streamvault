package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.t2;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f10281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f10283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10284e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f10285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f10286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f10287h;

    public class a implements AppLovinPostbackListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f10288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AppLovinPostbackListener f10289b;

        public a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f10288a = dVar;
            this.f10289b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            o unused = b.this.f10281b;
            if (o.a()) {
                b.this.f10281b.d("PersistentPostbackManager", "Failed to submit postback: " + this.f10288a + " with error code: " + i10 + "; will retry later...");
            }
            b.this.d(this.f10288a);
            t2.a(this.f10289b, str, i10);
            if (this.f10288a.c() == 1) {
                b.this.f10280a.D().a("dispatchPostback", str, i10, (String) null);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.f10288a);
            o unused = b.this.f10281b;
            if (o.a()) {
                b.this.f10281b.a("PersistentPostbackManager", "Successfully submit postback: " + this.f10288a);
            }
            b.this.c();
            t2.a(this.f10289b, str);
        }
    }

    public b(k kVar) {
        ArrayList arrayList = new ArrayList();
        this.f10285f = arrayList;
        this.f10286g = new HashSet();
        this.f10287h = new ArrayList();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f10280a = kVar;
        this.f10281b = kVar.O();
        int iIntValue = ((Integer) kVar.a(x4.J2)).intValue();
        this.f10282c = iIntValue;
        if (!((Boolean) kVar.a(x4.M2)).booleanValue()) {
            this.f10283d = null;
            return;
        }
        c cVar = new c(this, kVar);
        this.f10283d = cVar;
        arrayList.addAll(cVar.a(iIntValue));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar) {
        synchronized (this.f10284e) {
            this.f10286g.remove(dVar);
            this.f10285f.remove(dVar);
        }
        if (o.a()) {
            this.f10281b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (o.a()) {
            this.f10281b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f10280a.E0() && !dVar.m()) {
            if (o.a()) {
                this.f10281b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f10281b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f10284e) {
            if (this.f10286g.contains(dVar)) {
                if (o.a()) {
                    this.f10281b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                }
                return;
            }
            dVar.l();
            Integer num = (Integer) this.f10280a.a(x4.I2);
            if (dVar.c() > num.intValue()) {
                if (o.a()) {
                    this.f10281b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                }
                a(dVar);
                return;
            }
            synchronized (this.f10284e) {
                this.f10286g.add(dVar);
            }
            e eVarB = e.b(this.f10280a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
            if (o.a()) {
                this.f10281b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
            }
            this.f10280a.g0().dispatchPostbackRequest(eVarB, new a(dVar, appLovinPostbackListener));
        }
    }

    private void a(Runnable runnable, boolean z10, boolean z11) {
        if (!z10) {
            runnable.run();
        } else {
            this.f10280a.q0().a((i5) new r6(this.f10280a, z11, "runPostbackTask", runnable), d6.b.OTHER);
        }
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f10284e) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f10284e) {
            Iterator it = this.f10287h.iterator();
            while (it.hasNext()) {
                b((d) it.next());
            }
            this.f10287h.clear();
        }
    }

    private void c(d dVar) {
        synchronized (this.f10284e) {
            while (this.f10285f.size() > this.f10282c) {
                this.f10285f.remove(0);
            }
            this.f10285f.add(dVar);
        }
        if (o.a()) {
            this.f10281b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        synchronized (this.f10284e) {
            this.f10286g.remove(dVar);
            this.f10287h.add(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        synchronized (this.f10284e) {
            Iterator it = new ArrayList(this.f10285f).iterator();
            while (it.hasNext()) {
                b((d) it.next());
            }
        }
    }

    public void a() {
        synchronized (this.f10284e) {
            this.f10285f.clear();
            this.f10287h.clear();
        }
        this.f10280a.q0().a((i5) this.f10283d, d6.b.OTHER);
    }

    public void a(d dVar, boolean z10) {
        a(dVar, z10, (AppLovinPostbackListener) null);
    }

    public void a(final d dVar, boolean z10, final AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f10281b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z10) {
                dVar.a();
            }
            a(new Runnable() { // from class: com.applovin.impl.sdk.network.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10325b.b(dVar, appLovinPostbackListener);
                }
            }, n7.i(), dVar.m());
        }
    }

    public void b() {
        a(new Runnable() { // from class: com.applovin.impl.sdk.network.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f10328b.e();
            }
        }, true, false);
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f10284e) {
            if (((Boolean) this.f10280a.a(x4.L2)).booleanValue()) {
                arrayList.ensureCapacity(this.f10287h.size());
                arrayList.addAll(this.f10287h);
            } else {
                arrayList.ensureCapacity(this.f10285f.size());
                arrayList.addAll(this.f10285f);
            }
        }
        return arrayList;
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f10280a.q0().a((i5) this.f10283d, d6.b.OTHER);
    }
}
