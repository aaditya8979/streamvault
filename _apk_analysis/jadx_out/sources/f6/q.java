package f6;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import s7.m0;

/* JADX INFO: compiled from: AudioTimestampPoller.java */
/* JADX INFO: loaded from: classes9.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final a f61524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f61526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f61527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f61528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f61529f;

    /* JADX INFO: compiled from: AudioTimestampPoller.java */
    @RequiresApi(19)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f61530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f61531b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f61532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f61533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f61534e;

        public a(AudioTrack audioTrack) {
            this.f61530a = audioTrack;
        }

        public long a() {
            return this.f61534e;
        }

        public long b() {
            return this.f61531b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f61530a.getTimestamp(this.f61531b);
            if (timestamp) {
                long j10 = this.f61531b.framePosition;
                if (this.f61533d > j10) {
                    this.f61532c++;
                }
                this.f61533d = j10;
                this.f61534e = j10 + (this.f61532c << 32);
            }
            return timestamp;
        }
    }

    public q(AudioTrack audioTrack) {
        if (m0.f79487a >= 19) {
            this.f61524a = new a(audioTrack);
            g();
        } else {
            this.f61524a = null;
            h(3);
        }
    }

    public void a() {
        if (this.f61525b == 4) {
            g();
        }
    }

    @TargetApi(19)
    public long b() {
        a aVar = this.f61524a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public long c() {
        a aVar = this.f61524a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f61525b == 2;
    }

    @TargetApi(19)
    public boolean e(long j10) {
        a aVar = this.f61524a;
        if (aVar == null || j10 - this.f61528e < this.f61527d) {
            return false;
        }
        this.f61528e = j10;
        boolean zC = aVar.c();
        int i10 = this.f61525b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zC) {
                        g();
                    }
                } else if (!zC) {
                    g();
                }
            } else if (!zC) {
                g();
            } else if (this.f61524a.a() > this.f61529f) {
                h(2);
            }
        } else if (zC) {
            if (this.f61524a.b() < this.f61526c) {
                return false;
            }
            this.f61529f = this.f61524a.a();
            h(1);
        } else if (j10 - this.f61526c > 500000) {
            h(3);
        }
        return zC;
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f61524a != null) {
            h(0);
        }
    }

    public final void h(int i10) {
        this.f61525b = i10;
        if (i10 == 0) {
            this.f61528e = 0L;
            this.f61529f = -1L;
            this.f61526c = System.nanoTime() / 1000;
            this.f61527d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f61527d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f61527d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f61527d = 500000L;
        }
    }
}
