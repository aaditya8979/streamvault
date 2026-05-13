package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes12.dex */
public final class UploadDataProviders {

    public static class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f76554a;

        public a(File file) {
            this.f76554a = file;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public FileChannel h() throws IOException {
            return new FileInputStream(this.f76554a).getChannel();
        }
    }

    public static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptor f76555a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f76555a = parcelFileDescriptor;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public FileChannel h() throws IOException {
            if (this.f76555a.getStatSize() != -1) {
                return new ParcelFileDescriptor.AutoCloseInputStream(this.f76555a).getChannel();
            }
            this.f76555a.close();
            throw new IllegalArgumentException("Not a file: " + this.f76555a);
        }
    }

    public static final class c extends UploadDataProvider {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteBuffer f76556b;

        public c(ByteBuffer byteBuffer) {
            this.f76556b = byteBuffer;
        }

        public /* synthetic */ c(ByteBuffer byteBuffer, a aVar) {
            this(byteBuffer);
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return this.f76556b.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            if (byteBuffer.remaining() >= this.f76556b.remaining()) {
                byteBuffer.put(this.f76556b);
            } else {
                int iLimit = this.f76556b.limit();
                ByteBuffer byteBuffer2 = this.f76556b;
                byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                byteBuffer.put(this.f76556b);
                this.f76556b.limit(iLimit);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            this.f76556b.position(0);
            uploadDataSink.onRewindSucceeded();
        }
    }

    public interface d {
        FileChannel h() throws IOException;
    }

    public static final class e extends UploadDataProvider {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile FileChannel f76557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f76558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f76559d;

        public e(d dVar) {
            this.f76559d = new Object();
            this.f76558c = dVar;
        }

        public /* synthetic */ e(d dVar, a aVar) {
            this(dVar);
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            FileChannel fileChannel = this.f76557b;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        public final FileChannel d() throws IOException {
            if (this.f76557b == null) {
                synchronized (this.f76559d) {
                    if (this.f76557b == null) {
                        this.f76557b = this.f76558c.h();
                    }
                }
            }
            return this.f76557b;
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() throws IOException {
            return d().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            FileChannel fileChannelD = d();
            int i10 = 0;
            while (i10 == 0) {
                int i11 = fileChannelD.read(byteBuffer);
                if (i11 == -1) {
                    break;
                } else {
                    i10 += i11;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            d().position(0L);
            uploadDataSink.onRewindSucceeded();
        }
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new e(new b(parcelFileDescriptor), null);
    }

    public static UploadDataProvider create(File file) {
        return new e(new a(file), null);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new c(byteBuffer.slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i10, int i11) {
        return new c(ByteBuffer.wrap(bArr, i10, i11).slice(), null);
    }
}
