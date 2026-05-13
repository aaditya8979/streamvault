package io.appmetrica.analytics.coreutils.internal.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationDataCacheUpdateScheduler f64741a;

    public b(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f64741a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f64741a.f64737c.shouldUpdate()) {
            this.f64741a.f64738d.f64740a.f64736b.updateLastKnown();
        }
    }
}
