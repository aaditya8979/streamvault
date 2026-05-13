package yads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zi extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f97578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f97579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f97580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f97581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f97582i;

    public zi(Context context) {
        super(false);
        this.f97578e = context.getAssets();
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws yi {
        try {
            Uri uri = u30Var.f95522a;
            this.f97579f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            e();
            InputStream inputStreamOpen = this.f97578e.open(path, 1);
            this.f97580g = inputStreamOpen;
            if (inputStreamOpen.skip(u30Var.f95527f) < u30Var.f95527f) {
                throw new yi(null, 2008);
            }
            long j10 = u30Var.f95528g;
            if (j10 != -1) {
                this.f97581h = j10;
            } else {
                long jAvailable = this.f97580g.available();
                this.f97581h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f97581h = -1L;
                }
            }
            this.f97582i = true;
            b(u30Var);
            return this.f97581h;
        } catch (yi e10) {
            throw e10;
        } catch (IOException e11) {
            throw new yi(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // yads.p30
    public final void close() {
        this.f97579f = null;
        try {
            try {
                InputStream inputStream = this.f97580g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new yi(e10, 2000);
            }
        } finally {
            this.f97580g = null;
            if (this.f97582i) {
                this.f97582i = false;
                d();
            }
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f97579f;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws yi {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f97581h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new yi(e10, 2000);
            }
        }
        InputStream inputStream = this.f97580g;
        int i12 = ib3.f90737a;
        int i13 = inputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f97581h;
        if (j11 != -1) {
            this.f97581h = j11 - ((long) i13);
        }
        c(i13);
        return i13;
    }
}
