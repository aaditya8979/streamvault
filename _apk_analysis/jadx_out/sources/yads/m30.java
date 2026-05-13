package yads;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class m30 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u30 f92233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f92234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f92235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f92236h;

    public m30() {
        super(false);
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws ob2, q30 {
        e();
        this.f92233e = u30Var;
        Uri uri = u30Var.f95522a;
        String scheme = uri.getScheme();
        ni.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i10 = ib3.f90737a;
        String[] strArrSplit = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (strArrSplit.length != 2) {
            throw new ob2("Unexpected URI format: " + uri, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f92234f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new ob2("Error while parsing Base64 encoded string: " + str, e10, true, 0);
            }
        } else {
            this.f92234f = ib3.c(URLDecoder.decode(str, bu.f88143a.name()));
        }
        long j10 = u30Var.f95527f;
        byte[] bArr = this.f92234f;
        if (j10 > bArr.length) {
            this.f92234f = null;
            throw new q30(2008);
        }
        int i11 = (int) j10;
        this.f92235g = i11;
        int length = bArr.length - i11;
        this.f92236h = length;
        long j11 = u30Var.f95528g;
        if (j11 != -1) {
            this.f92236h = (int) Math.min(length, j11);
        }
        b(u30Var);
        long j12 = u30Var.f95528g;
        return j12 != -1 ? j12 : this.f92236h;
    }

    @Override // yads.p30
    public final void close() {
        if (this.f92234f != null) {
            this.f92234f = null;
            d();
        }
        this.f92233e = null;
    }

    @Override // yads.p30
    public final Uri getUri() {
        u30 u30Var = this.f92233e;
        if (u30Var != null) {
            return u30Var.f95522a;
        }
        return null;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f92236h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f92234f;
        int i13 = ib3.f90737a;
        System.arraycopy(bArr2, this.f92235g, bArr, i10, iMin);
        this.f92235g += iMin;
        this.f92236h -= iMin;
        c(iMin);
        return iMin;
    }
}
