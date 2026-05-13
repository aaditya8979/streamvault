package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.t1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class a implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f9922e = TimeUnit.SECONDS.toMillis(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f9923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f9924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet f9925c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f9926d = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0152a {
        void onAdExpired(t1 t1Var);
    }

    public a(k kVar) {
        this.f9923a = kVar;
        this.f9924b = kVar.O();
    }

    private void a() {
        synchronized (this.f9926d) {
            Iterator it = this.f9925c.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
        }
    }

    private b b(t1 t1Var) {
        synchronized (this.f9926d) {
            if (t1Var == null) {
                return null;
            }
            for (b bVar : this.f9925c) {
                if (t1Var == bVar.b()) {
                    return bVar;
                }
            }
            return null;
        }
    }

    private void b() {
        HashSet<b> hashSet = new HashSet();
        synchronized (this.f9926d) {
            for (b bVar : this.f9925c) {
                t1 t1VarB = bVar.b();
                if (t1VarB == null) {
                    hashSet.add(bVar);
                } else {
                    long timeToLiveMillis = t1VarB.getTimeToLiveMillis();
                    if (timeToLiveMillis <= 0) {
                        if (o.a()) {
                            this.f9924b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + t1VarB);
                        }
                        hashSet.add(bVar);
                    } else {
                        if (o.a()) {
                            this.f9924b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + t1VarB);
                        }
                        bVar.a(timeToLiveMillis);
                    }
                }
            }
        }
        for (b bVar2 : hashSet) {
            a(bVar2);
            bVar2.d();
        }
    }

    public void a(b bVar) {
        synchronized (this.f9926d) {
            this.f9925c.remove(bVar);
            if (this.f9925c.isEmpty()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    public void a(t1 t1Var) {
        synchronized (this.f9926d) {
            b bVarB = b(t1Var);
            if (bVarB != null) {
                if (o.a()) {
                    this.f9924b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + t1Var);
                }
                bVarB.a();
                a(bVarB);
            }
        }
    }

    public boolean a(t1 t1Var, InterfaceC0152a interfaceC0152a) {
        synchronized (this.f9926d) {
            if (b(t1Var) != null) {
                if (o.a()) {
                    this.f9924b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + t1Var);
                }
                return true;
            }
            if (t1Var.getTimeToLiveMillis() <= f9922e) {
                if (o.a()) {
                    this.f9924b.a("AdExpirationManager", "Ad has already expired: " + t1Var);
                }
                t1Var.setExpired();
                return false;
            }
            if (o.a()) {
                this.f9924b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(t1Var.getTimeToLiveMillis()) + " seconds from now for " + t1Var + "...");
            }
            if (this.f9925c.isEmpty()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            this.f9925c.add(b.a(t1Var, interfaceC0152a, this.f9923a));
            return true;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }
}
