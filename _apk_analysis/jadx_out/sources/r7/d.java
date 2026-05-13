package r7;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;
import r7.d;

/* JADX INFO: compiled from: BandwidthMeter.java */
/* JADX INFO: loaded from: classes5.dex */
public interface d {

    /* JADX INFO: compiled from: BandwidthMeter.java */
    public interface a {

        /* JADX INFO: renamed from: r7.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BandwidthMeter.java */
        public static final class C0945a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList<C0946a> f78737a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: r7.d$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BandwidthMeter.java */
            public static final class C0946a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Handler f78738a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final a f78739b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f78740c;

                public C0946a(Handler handler, a aVar) {
                    this.f78738a = handler;
                    this.f78739b = aVar;
                }

                public void d() {
                    this.f78740c = true;
                }
            }

            public static /* synthetic */ void d(C0946a c0946a, int i10, long j10, long j11) {
                c0946a.f78739b.onBandwidthSample(i10, j10, j11);
            }

            public void b(Handler handler, a aVar) {
                s7.a.e(handler);
                s7.a.e(aVar);
                e(aVar);
                this.f78737a.add(new C0946a(handler, aVar));
            }

            public void c(final int i10, final long j10, final long j11) {
                for (final C0946a c0946a : this.f78737a) {
                    if (!c0946a.f78740c) {
                        c0946a.f78738a.post(new Runnable() { // from class: r7.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.a.C0945a.d(c0946a, i10, j10, j11);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                for (C0946a c0946a : this.f78737a) {
                    if (c0946a.f78739b == aVar) {
                        c0946a.d();
                        this.f78737a.remove(c0946a);
                    }
                }
            }
        }

        void onBandwidthSample(int i10, long j10, long j11);
    }

    void b(Handler handler, a aVar);

    void d(a aVar);

    @Nullable
    y getTransferListener();
}
