package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f18760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18761b = false;

    public b(File file) {
        this.f18760a = DTExchangeFilesBridge.fileOutputStreamCtor(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f18761b) {
            return;
        }
        this.f18761b = true;
        this.f18760a.flush();
        try {
            this.f18760a.getFD().sync();
        } catch (IOException e10) {
            Log.w("AtomicFile", "Failed to sync file descriptor:", e10);
        }
        this.f18760a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f18760a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f18760a.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f18760a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f18760a.write(bArr, i10, i11);
    }
}
