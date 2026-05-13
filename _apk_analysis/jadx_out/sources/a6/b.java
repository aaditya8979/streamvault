package a6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: AtomicFile.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f3508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f3509b;

    /* JADX INFO: compiled from: AtomicFile.java */
    public static final class a extends OutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FileOutputStream f3510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3511c = false;

        public a(File file) throws FileNotFoundException {
            this.f3510b = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f3511c) {
                return;
            }
            this.f3511c = true;
            flush();
            try {
                this.f3510b.getFD().sync();
            } catch (IOException e10) {
                m.i("AtomicFile", "Failed to sync file descriptor:", e10);
            }
            this.f3510b.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f3510b.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.f3510b.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f3510b.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f3510b.write(bArr, i10, i11);
        }
    }

    public b(File file) {
        this.f3508a = file;
        this.f3509b = new File(file.getPath() + ".bak");
    }

    public void a(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f3509b.delete();
    }

    public boolean b() {
        return this.f3508a.exists() || this.f3509b.exists();
    }

    public InputStream c() throws FileNotFoundException {
        d();
        return new FileInputStream(this.f3508a);
    }

    public final void d() {
        if (this.f3509b.exists()) {
            this.f3508a.delete();
            this.f3509b.renameTo(this.f3508a);
        }
    }

    public void delete() {
        this.f3508a.delete();
        this.f3509b.delete();
    }

    public OutputStream e() throws IOException {
        if (this.f3508a.exists()) {
            if (this.f3509b.exists()) {
                this.f3508a.delete();
            } else if (!this.f3508a.renameTo(this.f3509b)) {
                m.h("AtomicFile", "Couldn't rename file " + this.f3508a + " to backup file " + this.f3509b);
            }
        }
        try {
            return new a(this.f3508a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f3508a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f3508a, e10);
            }
            try {
                return new a(this.f3508a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f3508a, e11);
            }
        }
    }
}
