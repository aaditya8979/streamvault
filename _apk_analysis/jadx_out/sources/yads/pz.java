package yads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes12.dex */
public final class pz extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f93834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f93835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f93836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f93837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f93838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f93839j;

    public pz(Context context) {
        super(false);
        this.f93834e = context.getContentResolver();
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws oz {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = u30Var.f95522a;
            this.f93835f = uri;
            e();
            if ("content".equals(u30Var.f95522a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f93834e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f93834e.openAssetFileDescriptor(uri, "r");
            }
            this.f93836g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new oz(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f93837h = fileInputStream;
            if (length != -1 && u30Var.f95527f > length) {
                throw new oz(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(u30Var.f95527f + startOffset) - startOffset;
            if (jSkip != u30Var.f95527f) {
                throw new oz(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f93838i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f93838i = jPosition;
                    if (jPosition < 0) {
                        throw new oz(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f93838i = j10;
                if (j10 < 0) {
                    throw new oz(null, 2008);
                }
            }
            long jMin = u30Var.f95528g;
            if (jMin != -1) {
                long j11 = this.f93838i;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f93838i = jMin;
            }
            this.f93839j = true;
            b(u30Var);
            long j12 = u30Var.f95528g;
            return j12 != -1 ? j12 : this.f93838i;
        } catch (oz e10) {
            throw e10;
        } catch (IOException e11) {
            throw new oz(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // yads.p30
    public final void close() {
        this.f93835f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f93837h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f93837h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f93836g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f93836g = null;
                        if (this.f93839j) {
                            this.f93839j = false;
                            d();
                        }
                    }
                } catch (IOException e10) {
                    throw new oz(e10, 2000);
                }
            } catch (IOException e11) {
                throw new oz(e11, 2000);
            }
        } catch (Throwable th2) {
            this.f93837h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f93836g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f93836g = null;
                    if (this.f93839j) {
                        this.f93839j = false;
                        d();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new oz(e12, 2000);
                }
            } finally {
                this.f93836g = null;
                if (this.f93839j) {
                    this.f93839j = false;
                    d();
                }
            }
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f93835f;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws oz {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f93838i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new oz(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f93837h;
        int i12 = ib3.f90737a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f93838i;
        if (j11 != -1) {
            this.f93838i = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }
}
