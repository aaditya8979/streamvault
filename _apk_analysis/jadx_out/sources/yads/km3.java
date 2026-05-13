package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class km3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f91658c = lm3.f92036a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f91659a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f91660b = false;

    public final synchronized void a() {
        long j10;
        this.f91660b = true;
        if (this.f91659a.size() == 0) {
            j10 = 0;
        } else {
            long j11 = ((jm3) this.f91659a.get(0)).f91309a;
            ArrayList arrayList = this.f91659a;
            j10 = ((jm3) arrayList.get(arrayList.size() - 1)).f91309a - j11;
        }
        if (j10 <= 0) {
            return;
        }
        long j12 = ((jm3) this.f91659a.get(0)).f91309a;
        boolean z10 = ad1.f87661a;
        Iterator it = this.f91659a.iterator();
        while (it.hasNext()) {
            long j13 = ((jm3) it.next()).f91309a;
            boolean z11 = ad1.f87661a;
        }
    }

    public final synchronized void a(String str, long j10) {
        if (this.f91660b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f91659a.add(new jm3(str, j10, SystemClock.elapsedRealtime()));
    }

    public final void finalize() {
        if (this.f91660b) {
            return;
        }
        a();
        boolean z10 = ad1.f87661a;
    }
}
