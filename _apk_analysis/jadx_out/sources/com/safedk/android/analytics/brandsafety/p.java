package com.safedk.android.analytics.brandsafety;

import com.ironsource.Z7;
import com.safedk.android.analytics.events.MaxEvent;
import com.safedk.android.analytics.events.MaxEvents;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f52708a = 50;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f52709b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f52710c = 30000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f52711d = "MaxEventsManager";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f52712e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static p f52713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxEvents f52714g = new MaxEvents(50);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxEvents f52715h = new MaxEvents(5);

    private p() {
    }

    public static p a() {
        p pVar;
        synchronized (f52712e) {
            if (f52713f == null) {
                f52713f = new p();
            }
            pVar = f52713f;
        }
        return pVar;
    }

    private synchronized MaxEvents d() {
        MaxEvents maxEvents;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.d(f52711d, "");
        maxEvents = new MaxEvents(50);
        for (MaxEvent maxEvent : this.f52714g) {
            if (jCurrentTimeMillis - (maxEvent.c() * 1000) < 30000) {
                Logger.d(f52711d, "getEventFromLastInterval Adding max event ts = " + jCurrentTimeMillis + ", " + maxEvent.toString());
                maxEvents.add(maxEvent);
            }
        }
        return maxEvents;
    }

    public synchronized MaxEvents a(int i10) {
        MaxEvents maxEvents;
        maxEvents = new MaxEvents(i10);
        for (int size = this.f52714g.size() < 10 ? 0 : this.f52714g.size() - 10; size < this.f52714g.size(); size++) {
            Logger.d(f52711d, "getLastXEvents adding max event index " + size + Z7.f30794r + this.f52714g.get(size).toString());
            maxEvents.add(new MaxEvent(this.f52714g.get(size).b(), this.f52714g.get(size).c(), this.f52714g.get(size).d(), this.f52714g.get(size).e(), this.f52714g.get(size).a(), this.f52714g.get(size).f()));
        }
        return maxEvents;
    }

    public synchronized void a(MaxEvent maxEvent) {
        this.f52714g.add(maxEvent);
    }

    public MaxEvents b() {
        MaxEvents maxEventsD = d();
        return maxEventsD.size() >= 10 ? maxEventsD : a(10);
    }

    public void b(MaxEvent maxEvent) {
        Logger.d(f52711d, "Adding MAX Will display event. #event is " + this.f52715h.size() + ",  maxEvent=" + maxEvent.toString());
        this.f52715h.add(maxEvent);
    }

    public MaxEvents c() {
        return this.f52715h;
    }
}
