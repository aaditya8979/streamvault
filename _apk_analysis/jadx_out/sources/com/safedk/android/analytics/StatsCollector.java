package com.safedk.android.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.t;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public class StatsCollector implements com.safedk.android.internal.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f51555a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f51556c = "StatsCollector";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f51557d = "SafeDKEvents.";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static StatsCollector f51558e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f51559m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f51560o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f51561p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object f51562q = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SharedPreferences f51566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile AtomicBoolean f51567i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private StatsReporter f51569k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f51571n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PersistentConcurrentHashMap<String, StatsEvent> f51564f = new PersistentConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, t> f51565g = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicLong f51563b = new AtomicLong(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AtomicBoolean f51568j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ExecutorService f51570l = Executors.newSingleThreadExecutor();

    public enum EventType {
        Network,
        Launch,
        Thread,
        Location,
        CaughtException,
        UserDataAccess,
        ActiveUser,
        BrandSafety,
        AdIntelligenceFill,
        ANR,
        UserSession,
        crash,
        redirect
    }

    private StatsCollector(int i10, boolean z10, int i11, StatsReporter statsReporter, String str) {
        this.f51571n = null;
        if (f51559m) {
            Logger.d(f51556c, "Initializing Stats collector");
            a(i10, z10, statsReporter);
            this.f51571n = f51557d + str;
            com.safedk.android.internal.b.getInstance().registerBackgroundForegroundListener(this);
        }
    }

    private void a(int i10, boolean z10, StatsReporter statsReporter) {
        f51555a = i10;
        this.f51563b.set(k.b(System.currentTimeMillis()));
        this.f51567i = new AtomicBoolean(z10);
        this.f51569k = statsReporter;
    }

    private void a(Context context, String str) {
        this.f51566h = context.getSharedPreferences(str, 0);
        this.f51566h.edit().clear().commit();
        Logger.d(f51556c, "Old StatsRepository data cleared");
    }

    public static void a(boolean z10) {
        f51560o = z10;
    }

    public static boolean a() {
        return f51560o;
    }

    private void b(final List<StatsEvent> list) {
        if (f51559m) {
            this.f51570l.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        k.b(StatsCollector.f51556c, "received stats safety event " + list + ", isOnUiThread = " + k.c());
                        if (!StatsCollector.this.f51567i.get()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                StatsCollector.this.b((StatsEvent) it.next());
                            }
                            StatsCollector.this.d(false);
                            return;
                        }
                        for (StatsEvent statsEvent : list) {
                            if (!statsEvent.a_() || statsEvent.i().equals(SafeDK.f51475a)) {
                                Logger.d(StatsCollector.f51556c, "Saving bundle to disk : " + statsEvent.toString());
                                StatsCollector.this.b(statsEvent);
                            } else {
                                StatsCollector.this.b(statsEvent);
                                StatsCollector.this.d(true);
                            }
                        }
                    } catch (Throwable th2) {
                        Logger.e(StatsCollector.f51556c, th2.getMessage(), th2);
                        new CrashReporter().caughtException(th2);
                    }
                }
            });
        }
    }

    public static void b(boolean z10) {
        synchronized (f51562q) {
            Logger.d(f51556c, "setActiveMode to " + z10);
            f51559m = z10;
            f51558e = null;
        }
    }

    public static boolean b() {
        return f51561p;
    }

    public static StatsCollector c() {
        StatsCollector statsCollector = null;
        if (f51560o || SafeDK.b()) {
            synchronized (f51562q) {
                if (f51558e == null) {
                    f51558e = new StatsCollector(300, com.safedk.android.internal.b.getInstance().isInBackground(), 5000, null, k.a(SafeDK.getInstance().l()));
                }
                statsCollector = f51558e;
            }
        } else {
            Logger.d(f51556c, "Reporter thread has not been initialized yet");
        }
        return statsCollector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z10) {
        try {
            Logger.d(f51556c, "sendEvents started, persistImmatureEvents=" + z10 + ", isOnUiThread = " + k.c());
            synchronized (f51562q) {
                if (this.f51564f == null || this.f51564f.size() == 0) {
                    Logger.d(f51556c, "sendEvents no events to report, skipping");
                } else {
                    HashSet<StatsEvent> hashSet = new HashSet(this.f51564f.values());
                    HashSet hashSet2 = new HashSet();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        StatsEvent statsEvent = (StatsEvent) it.next();
                        k.b(f51556c, "event " + statsEvent.c() + ", mature=" + statsEvent.a_() + ", event details " + statsEvent.toString());
                        if (!statsEvent.a_()) {
                            hashSet2.add(statsEvent);
                            it.remove();
                        }
                    }
                    Logger.d(f51556c, "sendEvents " + (hashSet != null ? hashSet.toString() : ""));
                    k();
                    boolean zIsInBackground = com.safedk.android.internal.b.getInstance().isInBackground();
                    boolean zI = i();
                    Logger.d(f51556c, "foregroundActivity is null? " + zIsInBackground + ", is background? " + this.f51567i.get());
                    ArrayList<Bundle> arrayListA = this.f51569k.a(hashSet);
                    if (arrayListA.size() > 0 && !zI) {
                        Logger.d(f51556c, "sendEvents sending the following events (" + arrayListA.size() + ") : " + arrayListA.toString());
                        synchronized (arrayListA) {
                            this.f51569k.a(arrayListA);
                            for (Bundle bundle : arrayListA) {
                                if (SafeDK.getInstance().z() != null && SafeDK.getInstance().z().e() != null) {
                                    Logger.d(f51556c, "eventIds removed " + bundle.getString("event_id") + " found = " + SafeDK.getInstance().z().e().remove(bundle.getString("event_id")));
                                }
                                if (bundle.containsKey(StatsEvent.f52830z) && bundle.getString(StatsEvent.f52830z).equals("impression")) {
                                    Logger.d(f51556c, "sendEvents removing brand safety event  " + bundle.getString("impression_id"));
                                    this.f51564f.remove(bundle.getString("impression_id"));
                                } else if (bundle.containsKey(StatsEvent.f52830z) && bundle.getString(StatsEvent.f52830z).equals(RedirectEvent.f52809b)) {
                                    Logger.d(f51556c, "sendEvents removing redirect event for key  " + RedirectEvent.a(bundle) + ", exists ? " + this.f51564f.containsKey(RedirectEvent.a(bundle)));
                                    this.f51564f.remove(RedirectEvent.a(bundle));
                                } else {
                                    Logger.d(f51556c, "sendEvents Cannot remove event from stats repository " + bundle.toString());
                                }
                            }
                            if (SafeDK.getInstance().z() != null) {
                                Logger.d(f51556c, "eventIds remaining : " + SafeDK.getInstance().z().e());
                            }
                        }
                        CreativeInfoManager.h();
                    } else if (zI) {
                        Logger.d(f51556c, "sendEvents will not report because the app is in the background");
                    }
                    if (z10) {
                        Logger.d(f51556c, "sendEvents persisting immature events");
                        if (hashSet2.size() > 0) {
                            Logger.d(f51556c, hashSet2.size() + " sendEvents events to save");
                            Iterator it2 = hashSet2.iterator();
                            while (it2.hasNext()) {
                                b((StatsEvent) it2.next());
                            }
                        }
                    } else if (this.f51564f == null || hashSet == null || this.f51564f.size() <= 0 || hashSet.size() <= 0) {
                        Logger.d(f51556c, "No events to remove from events repository");
                    } else {
                        Logger.d(f51556c, "Before removing stats. repository size = " + this.f51564f.size() + " repository keys = " + this.f51564f.keySet().toString() + ", events (" + hashSet.size() + ") :" + hashSet.toString());
                        for (StatsEvent statsEvent2 : hashSet) {
                            Logger.d(f51556c, "event key is " + statsEvent2.c());
                            this.f51564f.remove(statsEvent2.c(), statsEvent2);
                        }
                        Logger.d(f51556c, "After removing stats events (" + this.f51564f.size() + ") :" + this.f51564f);
                    }
                }
            }
        } catch (Exception e10) {
            Logger.d(f51556c, e10.getMessage(), e10);
            new CrashReporter().caughtException(e10);
        }
    }

    private void k() {
        if (this.f51569k == null) {
            Logger.d(f51556c, "statsReporter is null, initializing");
            StatsReporter.a();
            this.f51569k = StatsReporter.b();
        }
    }

    public ConcurrentHashMap<String, StatsEvent> a(EventType eventType) {
        ConcurrentHashMap<String, StatsEvent> concurrentHashMap = new ConcurrentHashMap<>();
        for (String str : this.f51564f.keySet()) {
            StatsEvent statsEvent = this.f51564f.get(str);
            if (statsEvent != null && statsEvent.b().equals(eventType)) {
                Logger.d(f51556c, "Get events by type adding event with key " + str);
                concurrentHashMap.put(statsEvent.c(), statsEvent);
            }
        }
        return concurrentHashMap;
    }

    public void a(int i10, boolean z10, int i11, StatsReporter statsReporter) {
        a(i10, z10, statsReporter);
        this.f51568j.set(true);
    }

    public void a(StatsEvent statsEvent) {
        b(Collections.singletonList(statsEvent));
    }

    public synchronized void a(String str) {
        k();
        if (str == null) {
            Logger.d(f51556c, "Event key is null, cannot remove from events repository.");
        } else if (this.f51564f.remove(str) != null) {
            Logger.d(f51556c, "Event successfully removed from events repository, key=" + str);
        } else {
            Logger.d(f51556c, "Event to remove wasn't found in events repository, key=" + str);
        }
    }

    public void a(List<StatsEvent> list) {
        b(list);
    }

    public boolean a(String str, String str2) {
        return this.f51565g != null && this.f51565g.containsKey(str) && this.f51565g.get(str).c().equals(str2);
    }

    synchronized void b(StatsEvent statsEvent) {
        String strC = statsEvent.c();
        k();
        if (strC == null) {
            Logger.d(f51556c, "Event key is null, cannot add to events repository.");
        } else if (this.f51564f.containsKey(strC)) {
            StatsEvent statsEvent2 = this.f51564f.get(strC);
            statsEvent2.b(statsEvent);
            this.f51564f.put(strC, statsEvent2);
            Logger.d(f51556c, "Event " + strC + " found. Aggregating. event = " + statsEvent2.e().toString() + ", isOnUiThread = " + k.c());
        } else {
            this.f51564f.put(strC, statsEvent);
            Logger.d(f51556c, "Event " + strC + " found. Adding. event = " + statsEvent.e().toString() + ", isOnUiThread = " + k.c());
        }
    }

    public void d() {
        this.f51570l.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.1
            @Override // java.lang.Runnable
            public void run() {
                PersistentConcurrentHashMap persistentConcurrentHashMap;
                try {
                    Logger.d(StatsCollector.f51556c, "Attempting to load Stats events from storage.");
                    try {
                        persistentConcurrentHashMap = new PersistentConcurrentHashMap(StatsCollector.this.f51571n);
                    } catch (Throwable th2) {
                        Logger.d(StatsCollector.f51556c, "Error loading events from storage file " + StatsCollector.this.f51571n + " : " + th2.getMessage(), th2);
                        persistentConcurrentHashMap = new PersistentConcurrentHashMap();
                    }
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    if (StatsCollector.this.f51564f == null || StatsCollector.this.f51564f.size() <= 0) {
                        Logger.d(StatsCollector.f51556c, "Stats repository does not contain previously accumulated events.");
                    } else {
                        concurrentHashMap.putAll(StatsCollector.this.f51564f);
                        Logger.d(StatsCollector.f51556c, "Stats repository contains " + concurrentHashMap.size() + " items. they will be added to the stored ones.");
                    }
                    synchronized (StatsCollector.f51562q) {
                        StatsCollector.this.f51564f = persistentConcurrentHashMap;
                    }
                    Logger.d(StatsCollector.f51556c, StatsCollector.this.f51564f.size() + " events loaded from storage");
                    for (V v10 : StatsCollector.this.f51564f.values()) {
                        Logger.d(StatsCollector.f51556c, "Setting event maturity, next_session, first_session (" + SafeDK.getInstance().e() + ") for stored event. key " + (v10.c() != null ? v10.c() : null));
                        v10.b(true);
                        v10.c(true);
                        v10.a(SafeDK.getInstance().e());
                        if (!TextUtils.isEmpty(StatsCollector.this.f51564f.a())) {
                            Logger.d(StatsCollector.f51556c, "sdk_null_check sc added value" + StatsCollector.this.f51564f.a());
                        }
                    }
                    if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                        StatsCollector.this.f51564f.a(false);
                        for (StatsEvent statsEvent : concurrentHashMap.values()) {
                            Logger.d(StatsCollector.f51556c, "adding previously accumulated event to the stats repository : " + statsEvent.toString());
                            StatsCollector.this.b(statsEvent);
                        }
                        StatsCollector.this.f51564f.a(true);
                    }
                    Logger.d(StatsCollector.f51556c, "Completed Loading events from storage. " + StatsCollector.this.f51564f.size() + " items loaded");
                    boolean unused = StatsCollector.f51561p = true;
                    if (StatsCollector.this.f51564f.size() > 0) {
                        Logger.d(StatsCollector.f51556c, StatsCollector.this.f51564f.size() + " event(s) will be reported");
                        StatsCollector.this.d(true);
                    }
                    SafeDK.getInstance().j();
                } catch (Throwable th3) {
                    Logger.d(StatsCollector.f51556c, "Error loading events from storage : " + th3.getMessage(), th3);
                }
            }
        });
    }

    public PersistentConcurrentHashMap<String, StatsEvent> e() {
        return this.f51564f;
    }

    public Map<String, t> f() {
        return this.f51565g;
    }

    @Override // com.safedk.android.internal.a
    public synchronized void g() {
        if (f51559m) {
            Logger.d(f51556c, "onBackground started");
            this.f51567i.set(true);
            this.f51570l.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.3
                @Override // java.lang.Runnable
                public void run() {
                    StatsCollector.this.d(true);
                }
            });
        }
    }

    @Override // com.safedk.android.internal.a
    public synchronized void h() {
        if (f51559m) {
            Logger.d(f51556c, "onForeground started");
            this.f51567i.set(false);
            this.f51570l.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.4
                @Override // java.lang.Runnable
                public void run() {
                    StatsCollector.this.d(true);
                }
            });
        }
    }

    public boolean i() {
        return com.safedk.android.internal.b.getInstance().getForegroundActivity() == null || this.f51567i.get();
    }
}
