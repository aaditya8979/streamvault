package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import r7.y;
import s7.a0;

/* JADX INFO: compiled from: IcyDataSource.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements r7.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.h f22289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f22291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f22292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22293e;

    /* JADX INFO: compiled from: IcyDataSource.java */
    public interface a {
        void a(a0 a0Var);
    }

    public e(r7.h hVar, int i10, a aVar) {
        s7.a.a(i10 > 0);
        this.f22289a = hVar;
        this.f22290b = i10;
        this.f22291c = aVar;
        this.f22292d = new byte[1];
        this.f22293e = i10;
    }

    @Override // r7.h
    public long a(r7.k kVar) {
        throw new UnsupportedOperationException();
    }

    @Override // r7.h
    public void b(y yVar) {
        s7.a.e(yVar);
        this.f22289a.b(yVar);
    }

    public final boolean c() throws IOException {
        if (this.f22289a.read(this.f22292d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f22292d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f22289a.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f22291c.a(new a0(bArr, i10));
        }
        return true;
    }

    @Override // r7.h
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // r7.h
    public Map<String, List<String>> getResponseHeaders() {
        return this.f22289a.getResponseHeaders();
    }

    @Override // r7.h
    @Nullable
    public Uri getUri() {
        return this.f22289a.getUri();
    }

    @Override // r7.f
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f22293e == 0) {
            if (!c()) {
                return -1;
            }
            this.f22293e = this.f22290b;
        }
        int i12 = this.f22289a.read(bArr, i10, Math.min(this.f22293e, i11));
        if (i12 != -1) {
            this.f22293e -= i12;
        }
        return i12;
    }
}
