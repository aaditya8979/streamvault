package sg.bigo.ads.common.f;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f82000e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f82001a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f82002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f82003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1013a f82004d;

    /* JADX INFO: renamed from: sg.bigo.ads.common.f.a$a, reason: collision with other inner class name */
    public interface InterfaceC1013a {
        void a(long j10, long j11);

        void a(boolean z10, long j10, long j11, long j12);
    }

    private a() {
        b();
    }

    public static a a() {
        return f82000e;
    }

    public final void b() {
        this.f82002b = SystemClock.elapsedRealtime();
        this.f82003c = System.currentTimeMillis();
    }

    public final boolean c() {
        return this.f82002b > 0;
    }
}
