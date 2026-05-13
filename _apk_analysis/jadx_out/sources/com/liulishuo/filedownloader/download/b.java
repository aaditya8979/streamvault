package com.liulishuo.filedownloader.download;

import com.mbridge.msdk.foundation.download.Command;
import ia.e;
import ia.f;
import java.net.ProtocolException;

/* JADX INFO: compiled from: ConnectionProfile.java */
/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f34623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f34624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f34625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f34626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f34627f;

    /* JADX INFO: renamed from: com.liulishuo.filedownloader.download.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConnectionProfile.java */
    public static class C0411b {
        public static b a(long j10) {
            return new b(0L, 0L, -1L, j10);
        }

        public static b b(long j10, long j11, long j12, long j13) {
            return new b(j10, j11, j12, j13);
        }

        public static b c(long j10, long j11, long j12) {
            return new b(j10, j11, -1L, j12);
        }

        public static b d() {
            return new b();
        }

        public static b e() {
            return new b(0L, 0L, 0L, 0L, true);
        }
    }

    public b() {
        this.f34622a = 0L;
        this.f34623b = 0L;
        this.f34624c = 0L;
        this.f34625d = 0L;
        this.f34626e = false;
        this.f34627f = true;
    }

    public b(long j10, long j11, long j12, long j13) {
        this(j10, j11, j12, j13, false);
    }

    public b(long j10, long j11, long j12, long j13, boolean z10) {
        if (!(j10 == 0 && j12 == 0) && z10) {
            throw new IllegalArgumentException();
        }
        this.f34622a = j10;
        this.f34623b = j11;
        this.f34624c = j12;
        this.f34625d = j13;
        this.f34626e = z10;
        this.f34627f = false;
    }

    public void a(z9.b bVar) throws ProtocolException {
        if (this.f34626e) {
            return;
        }
        if (this.f34627f && e.a().f64041h) {
            bVar.h("HEAD");
        }
        bVar.a(Command.HTTP_HEADER_RANGE, this.f34624c == -1 ? f.o("bytes=%d-", Long.valueOf(this.f34623b)) : f.o("bytes=%d-%d", Long.valueOf(this.f34623b), Long.valueOf(this.f34624c)));
    }

    public String toString() {
        return f.o("range[%d, %d) current offset[%d]", Long.valueOf(this.f34622a), Long.valueOf(this.f34624c), Long.valueOf(this.f34623b));
    }
}
