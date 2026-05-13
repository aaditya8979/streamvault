package yads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class bm2 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f88077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f88078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f88079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AssetFileDescriptor f88080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FileInputStream f88081i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f88082j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f88083k;

    public bm2(Context context) {
        super(false);
        this.f88077e = context.getResources();
        this.f88078f = context.getPackageName();
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // yads.p30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(yads.u30 r16) throws yads.am2 {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.bm2.a(yads.u30):long");
    }

    @Override // yads.p30
    public final void close() {
        this.f88079g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f88081i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f88081i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f88080h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f88080h = null;
                        if (this.f88083k) {
                            this.f88083k = false;
                            d();
                        }
                    }
                } catch (IOException e10) {
                    throw new am2(null, e10, 2000);
                }
            } catch (IOException e11) {
                throw new am2(null, e11, 2000);
            }
        } catch (Throwable th2) {
            this.f88081i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f88080h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f88080h = null;
                    if (this.f88083k) {
                        this.f88083k = false;
                        d();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new am2(null, e12, 2000);
                }
            } finally {
                this.f88080h = null;
                if (this.f88083k) {
                    this.f88083k = false;
                    d();
                }
            }
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f88079g;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws am2 {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f88082j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new am2(null, e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f88081i;
        int i12 = ib3.f90737a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            if (this.f88082j == -1) {
                return -1;
            }
            throw new am2("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f88082j;
        if (j11 != -1) {
            this.f88082j = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }
}
