package com.applovin.impl;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f7815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f7816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f7817c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f7818d = new AtomicInteger();

    public interface b {
        void a();

        boolean b();
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f7820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f7821c;

        private c(String str, long j10, b bVar) {
            this.f7819a = str;
            this.f7821c = j10;
            this.f7820b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b a() {
            return this.f7820b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f7821c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.f7819a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f7819a;
            String str2 = ((c) obj).f7819a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f7819a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f7819a + "', countdownStepMillis=" + this.f7821c + '}';
        }
    }

    public b1(Handler handler, com.applovin.impl.sdk.k kVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f7816b = handler;
        this.f7815a = kVar.O();
    }

    private void a(final c cVar, final int i10) {
        this.f7816b.postDelayed(new Runnable() { // from class: com.applovin.impl.e9
            @Override // java.lang.Runnable
            public final void run() {
                this.f8242b.b(cVar, i10);
            }
        }, cVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar, int i10) {
        b bVarA = cVar.a();
        if (!bVarA.b()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7815a.a("CountdownManager", "Ending countdown for " + cVar.c());
                return;
            }
            return;
        }
        if (this.f7818d.get() != i10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7815a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        try {
            bVarA.a();
            a(cVar, i10);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7815a.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th2);
            }
            a();
        }
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7815a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f7817c.clear();
    }

    public void a(String str, long j10, b bVar) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("Invalid step specified.");
        }
        if (this.f7816b == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7815a.a("CountdownManager", "Adding countdown: " + str);
        }
        this.f7817c.add(new c(str, j10, bVar));
    }

    public void b() {
        HashSet<c> hashSet = new HashSet(this.f7817c);
        if (com.applovin.impl.sdk.o.a()) {
            this.f7815a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.f7818d.incrementAndGet();
        for (c cVar : hashSet) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7815a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + iIncrementAndGet + "...");
            }
            a(cVar, iIncrementAndGet);
        }
    }

    public void c() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7815a.a("CountdownManager", "Stopping countdowns...");
        }
        this.f7818d.incrementAndGet();
        this.f7816b.removeCallbacksAndMessages(null);
    }
}
