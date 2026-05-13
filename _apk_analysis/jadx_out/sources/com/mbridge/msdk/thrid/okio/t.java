package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Timeout.java */
/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f40881d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f40883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f40884c;

    /* JADX INFO: compiled from: Timeout.java */
    public static class a extends t {
        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10, TimeUnit timeUnit) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public void e() throws IOException {
        }
    }

    public t a() {
        this.f40882a = false;
        return this;
    }

    public t a(long j10) {
        this.f40882a = true;
        this.f40883b = j10;
        return this;
    }

    public t a(long j10, TimeUnit timeUnit) {
        if (j10 >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.f40884c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j10);
    }

    public t b() {
        this.f40884c = 0L;
        return this;
    }

    public long c() {
        if (this.f40882a) {
            return this.f40883b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.f40882a;
    }

    public void e() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f40882a && this.f40883b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long f() {
        return this.f40884c;
    }
}
