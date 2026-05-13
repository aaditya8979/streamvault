package yads;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes12.dex */
public final class ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll f92424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f92425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f92426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f92427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f92428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f92429f;

    public ml(AudioTrack audioTrack) {
        if (ib3.f90737a >= 19) {
            this.f92424a = new ll(audioTrack);
            a();
        } else {
            this.f92424a = null;
            a(3);
        }
    }

    public final void a() {
        if (this.f92424a != null) {
            a(0);
        }
    }

    public final void a(int i10) {
        this.f92425b = i10;
        if (i10 == 0) {
            this.f92428e = 0L;
            this.f92429f = -1L;
            this.f92426c = System.nanoTime() / 1000;
            this.f92427d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f92427d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f92427d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f92427d = 500000L;
        }
    }
}
