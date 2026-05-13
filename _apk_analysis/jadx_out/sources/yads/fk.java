package yads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class fk extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f89600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f89601b = false;

    public fk(File file) {
        this.f89600a = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f89601b) {
            return;
        }
        this.f89601b = true;
        this.f89600a.flush();
        try {
            this.f89600a.getFD().sync();
        } catch (IOException e10) {
            ih1.d("AtomicFile", ih1.a("Failed to sync file descriptor:", e10));
        }
        this.f89600a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f89600a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f89600a.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f89600a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f89600a.write(bArr, i10, i11);
    }
}
