package r7;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.URLDecoder;
import s7.m0;

/* JADX INFO: compiled from: DataSchemeDataSource.java */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public k f78745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public byte[] f78746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f78747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f78748h;

    public g() {
        super(false);
    }

    @Override // r7.h
    public long a(k kVar) throws IOException {
        e(kVar);
        this.f78745e = kVar;
        Uri uri = kVar.f78755a;
        String scheme = uri.getScheme();
        s7.a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrH0 = m0.H0(uri.getSchemeSpecificPart(), StringUtils.COMMA);
        if (strArrH0.length != 2) {
            throw ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: " + uri, null);
        }
        String str = strArrH0[1];
        if (strArrH0[0].contains(";base64")) {
            try {
                this.f78746f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f78746f = m0.h0(URLDecoder.decode(str, y7.c.f87335a.name()));
        }
        long j10 = kVar.f78761g;
        byte[] bArr = this.f78746f;
        if (j10 > bArr.length) {
            this.f78746f = null;
            throw new DataSourceException(2008);
        }
        int i10 = (int) j10;
        this.f78747g = i10;
        int length = bArr.length - i10;
        this.f78748h = length;
        long j11 = kVar.f78762h;
        if (j11 != -1) {
            this.f78748h = (int) Math.min(length, j11);
        }
        f(kVar);
        long j12 = kVar.f78762h;
        return j12 != -1 ? j12 : this.f78748h;
    }

    @Override // r7.h
    public void close() {
        if (this.f78746f != null) {
            this.f78746f = null;
            d();
        }
        this.f78745e = null;
    }

    @Override // r7.h
    @Nullable
    public Uri getUri() {
        k kVar = this.f78745e;
        if (kVar != null) {
            return kVar.f78755a;
        }
        return null;
    }

    @Override // r7.f
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f78748h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(m0.j(this.f78746f), this.f78747g, bArr, i10, iMin);
        this.f78747g += iMin;
        this.f78748h -= iMin;
        c(iMin);
        return iMin;
    }
}
