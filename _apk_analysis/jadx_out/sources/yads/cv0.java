package yads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes4.dex */
public final class cv0 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RandomAccessFile f88625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f88626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f88627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f88628h;

    public cv0() {
        super(false);
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws bv0 {
        Uri uri = u30Var.f95522a;
        this.f88626f = uri;
        e();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f88625e = randomAccessFile;
            try {
                randomAccessFile.seek(u30Var.f95527f);
                long length = u30Var.f95528g;
                if (length == -1) {
                    length = this.f88625e.length() - u30Var.f95527f;
                }
                this.f88627g = length;
                if (length < 0) {
                    throw new bv0(null, null, 2008);
                }
                this.f88628h = true;
                b(u30Var);
                return this.f88627g;
            } catch (IOException e10) {
                throw new bv0(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new bv0(e11, (ib3.f90737a < 21 || !zu0.a(e11.getCause())) ? 2005 : 2006);
            }
            throw new bv0("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e11, 1004);
        } catch (SecurityException e12) {
            throw new bv0(e12, 2006);
        } catch (RuntimeException e13) {
            throw new bv0(e13, 2000);
        }
    }

    @Override // yads.p30
    public final void close() {
        this.f88626f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f88625e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new bv0(e10, 2000);
            }
        } finally {
            this.f88625e = null;
            if (this.f88628h) {
                this.f88628h = false;
                d();
            }
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f88626f;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws bv0 {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f88627g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f88625e;
            int i12 = ib3.f90737a;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i13 > 0) {
                this.f88627g -= (long) i13;
                c(i13);
            }
            return i13;
        } catch (IOException e10) {
            throw new bv0(e10, 2000);
        }
    }
}
