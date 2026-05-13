package sg.bigo.ads.core.player.a;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f84279b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f84281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sg.bigo.ads.common.h.a f84282e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f84278a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f84280c = new Object();

    public final int a(byte[] bArr, long j10) throws j {
        if (j10 < 0) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "buffer or offset or length is wrong");
            return 0;
        }
        int i10 = 0;
        while (!this.f84279b.c() && this.f84279b.a() < PlaybackStateCompat.ACTION_PLAY_FROM_URI + j10 && !this.f84281d) {
            i10++;
            synchronized (this.f84278a) {
                try {
                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "wait for downloading. thread=" + Thread.currentThread().getName() + ",url=" + this.f84282e.f82144b + ",count=" + i10);
                    this.f84278a.wait(1000L);
                } catch (InterruptedException e10) {
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Waiting source data is interrupted!" + e10.toString());
                }
            }
            if (i10 >= 15) {
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "wait for downloading more than 15s.");
                throw new j("Error reading source " + i10 + " times");
            }
        }
        int iA = this.f84279b.a(bArr, j10);
        if (iA <= 0) {
            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "read end, size = ".concat(String.valueOf(iA)));
        }
        return iA;
    }
}
