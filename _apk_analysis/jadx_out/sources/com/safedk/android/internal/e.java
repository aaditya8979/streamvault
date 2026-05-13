package com.safedk.android.internal;

import android.support.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class e extends FileOutputStream implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f52993a = "SafeDKFileOutputStream";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f52994b;

    public e(String str, String str2, FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(str2);
        this.f52994b = new g(str, str2, fileOutputStream);
        this.f52994b.a(this);
    }

    @Override // com.safedk.android.internal.c
    public void a(String str, String str2, String str3) {
        Logger.d(f52993a, "onStreamClose " + this + " sdkPackageName: " + str + ", url: " + str2);
        CreativeInfoManager.b(str, str2, str3);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f52994b.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f52994b.flush();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f52994b.write(i10);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        this.f52994b.write(bArr);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        this.f52994b.write(bArr, i10, i11);
    }
}
