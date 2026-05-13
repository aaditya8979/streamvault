package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;

/* JADX INFO: compiled from: RequestBody.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class z {

    /* JADX INFO: compiled from: RequestBody.java */
    public static class a extends z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u f40820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f40821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f40822c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f40823d;

        public a(u uVar, int i10, byte[] bArr, int i11) {
            this.f40820a = uVar;
            this.f40821b = i10;
            this.f40822c = bArr;
            this.f40823d = i11;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public long a() {
            return this.f40821b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
            dVar.write(this.f40822c, this.f40823d, this.f40821b);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public u b() {
            return this.f40820a;
        }
    }

    public static z a(u uVar, byte[] bArr) {
        return a(uVar, bArr, 0, bArr.length);
    }

    public static z a(u uVar, byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(bArr.length, i10, i11);
        return new a(uVar, i11, bArr, i10);
    }

    public abstract long a() throws IOException;

    public abstract void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException;

    public abstract u b();
}
