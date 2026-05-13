package y9;

import android.os.SystemClock;

/* JADX INFO: compiled from: DownloadSpeedMonitor.java */
/* JADX INFO: loaded from: classes10.dex */
public class b implements t, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f87385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f87386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f87387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f87388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f87389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f87390f = 1000;

    @Override // y9.t
    public void b(long j10) {
        this.f87388d = SystemClock.uptimeMillis();
        this.f87387c = j10;
    }

    @Override // y9.s
    public void c(int i10) {
        this.f87390f = i10;
    }

    @Override // y9.t
    public void e(long j10) {
        if (this.f87388d <= 0) {
            return;
        }
        long j11 = j10 - this.f87387c;
        this.f87385a = 0L;
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f87388d;
        if (jUptimeMillis <= 0) {
            this.f87389e = (int) j11;
        } else {
            this.f87389e = (int) (j11 / jUptimeMillis);
        }
    }

    @Override // y9.t
    public void reset() {
        this.f87389e = 0;
        this.f87385a = 0L;
    }

    @Override // y9.t
    public void update(long j10) {
        if (this.f87390f <= 0) {
            return;
        }
        boolean z10 = true;
        if (this.f87385a != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.f87385a;
            if (jUptimeMillis >= this.f87390f || (this.f87389e == 0 && jUptimeMillis > 0)) {
                int i10 = (int) ((j10 - this.f87386b) / jUptimeMillis);
                this.f87389e = i10;
                this.f87389e = Math.max(0, i10);
            } else {
                z10 = false;
            }
        }
        if (z10) {
            this.f87386b = j10;
            this.f87385a = SystemClock.uptimeMillis();
        }
    }
}
