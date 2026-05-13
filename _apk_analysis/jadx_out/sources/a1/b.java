package a1;

import com.danikula.videocache.ProxyCacheException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: FileCache.java */
/* JADX INFO: loaded from: classes11.dex */
public class b implements z0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f3472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f3473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RandomAccessFile f3474c;

    public b(File file, a aVar) throws ProxyCacheException {
        File file2;
        try {
            if (aVar == null) {
                throw new NullPointerException();
            }
            this.f3472a = aVar;
            d.b(file.getParentFile());
            boolean zExists = file.exists();
            if (zExists) {
                file2 = file;
            } else {
                file2 = new File(file.getParentFile(), file.getName() + ".download");
            }
            this.f3473b = file2;
            this.f3474c = new RandomAccessFile(this.f3473b, zExists ? "r" : "rw");
        } catch (IOException e10) {
            throw new ProxyCacheException("Error using file " + file + " as disc cache", e10);
        }
    }

    @Override // z0.a
    public synchronized void a(byte[] bArr, int i10) throws ProxyCacheException {
        try {
            if (d()) {
                throw new ProxyCacheException("Error append cache: cache file " + this.f3473b + " is completed!");
            }
            this.f3474c.seek(available());
            this.f3474c.write(bArr, 0, i10);
        } catch (IOException e10) {
            throw new ProxyCacheException(String.format("Error writing %d bytes to %s from buffer with size %d", Integer.valueOf(i10), this.f3474c, Integer.valueOf(bArr.length)), e10);
        }
    }

    @Override // z0.a
    public synchronized long available() throws ProxyCacheException {
        try {
        } catch (IOException e10) {
            throw new ProxyCacheException("Error reading length of file " + this.f3473b, e10);
        }
        return (int) this.f3474c.length();
    }

    @Override // z0.a
    public synchronized int b(byte[] bArr, long j10, int i10) throws ProxyCacheException {
        try {
            this.f3474c.seek(j10);
        } catch (IOException e10) {
            throw new ProxyCacheException(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i10), Long.valueOf(j10), Long.valueOf(available()), Integer.valueOf(bArr.length)), e10);
        }
        return this.f3474c.read(bArr, 0, i10);
    }

    public final boolean c(File file) {
        return file.getName().endsWith(".download");
    }

    @Override // z0.a
    public synchronized void close() throws ProxyCacheException {
        try {
            this.f3474c.close();
            this.f3472a.a(this.f3473b);
        } catch (IOException e10) {
            throw new ProxyCacheException("Error closing file " + this.f3473b, e10);
        }
    }

    @Override // z0.a
    public synchronized void complete() throws ProxyCacheException {
        if (d()) {
            return;
        }
        close();
        File file = new File(this.f3473b.getParentFile(), this.f3473b.getName().substring(0, this.f3473b.getName().length() - 9));
        if (!this.f3473b.renameTo(file)) {
            throw new ProxyCacheException("Error renaming file " + this.f3473b + " to " + file + " for completion!");
        }
        this.f3473b = file;
        try {
            this.f3474c = new RandomAccessFile(this.f3473b, "r");
            this.f3472a.a(this.f3473b);
        } catch (IOException e10) {
            throw new ProxyCacheException("Error opening " + this.f3473b + " as disc cache", e10);
        }
    }

    @Override // z0.a
    public synchronized boolean d() {
        return !c(this.f3473b);
    }
}
