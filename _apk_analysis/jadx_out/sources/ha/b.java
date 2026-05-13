package ha;

import ia.c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: FileDownloadRandomAccessFile.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements ha.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedOutputStream f63116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDescriptor f63117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RandomAccessFile f63118c;

    /* JADX INFO: compiled from: FileDownloadRandomAccessFile.java */
    public static class a implements c.e {
        @Override // ia.c.e
        public boolean a() {
            return true;
        }

        @Override // ia.c.e
        public ha.a b(File file) throws IOException {
            return new b(file);
        }
    }

    public b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f63118c = randomAccessFile;
        this.f63117b = randomAccessFile.getFD();
        this.f63116a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    @Override // ha.a
    public void close() throws IOException {
        this.f63116a.close();
        this.f63118c.close();
    }

    @Override // ha.a
    public void flushAndSync() throws IOException {
        this.f63116a.flush();
        this.f63117b.sync();
    }

    @Override // ha.a
    public void seek(long j10) throws IOException {
        this.f63118c.seek(j10);
    }

    @Override // ha.a
    public void setLength(long j10) throws IOException {
        this.f63118c.setLength(j10);
    }

    @Override // ha.a
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f63116a.write(bArr, i10, i11);
    }
}
