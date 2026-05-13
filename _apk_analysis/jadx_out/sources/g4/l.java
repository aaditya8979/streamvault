package g4;

import a6.k0;
import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: AudioTimestampPoller.java */
/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final a f61963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f61965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f61966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f61967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f61968f;

    /* JADX INFO: compiled from: AudioTimestampPoller.java */
    @TargetApi(19)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f61969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f61970b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f61971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f61972d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f61973e;

        public a(AudioTrack audioTrack) {
            this.f61969a = audioTrack;
        }

        public long a() {
            return this.f61973e;
        }

        public long b() {
            return this.f61970b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f61969a.getTimestamp(this.f61970b);
            if (timestamp) {
                long j10 = this.f61970b.framePosition;
                if (this.f61972d > j10) {
                    this.f61971c++;
                }
                this.f61972d = j10;
                this.f61973e = j10 + (this.f61971c << 32);
            }
            return timestamp;
        }
    }

    public l(AudioTrack audioTrack) {
        if (k0.f3574a >= 19) {
            this.f61963a = new a(audioTrack);
            g();
        } else {
            this.f61963a = null;
            h(3);
        }
    }

    public void a() {
        if (this.f61964b == 4) {
            g();
        }
    }

    public long b() {
        a aVar = this.f61963a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    public long c() {
        a aVar = this.f61963a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f61964b == 2;
    }

    public boolean e(long j10) {
        a aVar = this.f61963a;
        if (aVar == null || j10 - this.f61967e < this.f61966d) {
            return false;
        }
        this.f61967e = j10;
        boolean zC = aVar.c();
        int i10 = this.f61964b;
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
            } else if (this.f61963a.a() > this.f61968f) {
                h(2);
            }
        } else if (zC) {
            if (this.f61963a.b() < this.f61965c) {
                return false;
            }
            this.f61968f = this.f61963a.a();
            h(1);
        } else if (j10 - this.f61965c > 500000) {
            h(3);
        }
        return zC;
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f61963a != null) {
            h(0);
        }
    }

    public final void h(int i10) {
        this.f61964b = i10;
        if (i10 == 0) {
            this.f61967e = 0L;
            this.f61968f = -1L;
            this.f61965c = System.nanoTime() / 1000;
            this.f61966d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f61966d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f61966d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f61966d = 500000L;
        }
    }
}
