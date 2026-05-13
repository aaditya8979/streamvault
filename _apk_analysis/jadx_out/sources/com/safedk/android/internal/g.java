package com.safedk.android.internal;

import android.support.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes12.dex */
public class g extends OutputStream implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f53006a = "SafeDKOutputStream";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OutputStream f53008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f53009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteArrayOutputStream f53010e = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f53011f = this;

    public g(String str, String str2, OutputStream outputStream) {
        this.f53007b = str;
        this.f53009d = str2;
        this.f53008c = outputStream;
    }

    private void a(byte[] bArr, int i10, int i11) {
        if (i11 > 0) {
            try {
                this.f53010e.write(bArr, i10, i11);
            } catch (Throwable th2) {
                try {
                    Logger.e(f53006a, th2.getMessage());
                } catch (Throwable th3) {
                }
            }
        }
    }

    public void a(c cVar) {
        this.f53011f = cVar;
    }

    @Override // com.safedk.android.internal.c
    public void a(String str, String str2, String str3) {
        Logger.d(f53006a, "onStreamClose " + this + " sdkPackageName: " + str);
        CreativeInfoManager.c(str, str2, str3);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f53008c.close();
        String string = this.f53010e.toString();
        Logger.d(f53006a, "closing output stream");
        this.f53011f.a(this.f53007b, this.f53009d, string);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f53008c.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f53008c.write(i10);
        if (i10 >= 0) {
            try {
                this.f53010e.write(i10);
            } catch (Throwable th2) {
                try {
                    Logger.e(f53006a, th2.getMessage());
                } catch (Throwable th3) {
                }
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        this.f53008c.write(bArr);
        a(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        this.f53008c.write(bArr, i10, i11);
        a(bArr, i10, i11);
    }
}
