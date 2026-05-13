package y5;

import a6.k0;
import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.upstream.DataSourceException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: compiled from: DataSchemeDataSource.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public h f87260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public byte[] f87261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f87262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f87263h;

    public e() {
        super(false);
    }

    @Override // com.google.android.exoplayer.upstream.a
    public long a(h hVar) throws IOException {
        e(hVar);
        this.f87260e = hVar;
        this.f87263h = (int) hVar.f87275f;
        Uri uri = hVar.f87270a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            throw new ParserException("Unsupported scheme: " + scheme);
        }
        String[] strArrD0 = k0.D0(uri.getSchemeSpecificPart(), StringUtils.COMMA);
        if (strArrD0.length != 2) {
            throw new ParserException("Unexpected URI format: " + uri);
        }
        String str = strArrD0[1];
        if (strArrD0[0].contains(";base64")) {
            try {
                this.f87261f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new ParserException("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f87261f = k0.c0(URLDecoder.decode(str, C.ASCII_NAME));
        }
        long j10 = hVar.f87276g;
        int length = j10 != -1 ? ((int) j10) + this.f87263h : this.f87261f.length;
        this.f87262g = length;
        if (length > this.f87261f.length || this.f87263h > length) {
            this.f87261f = null;
            throw new DataSourceException(0);
        }
        f(hVar);
        return ((long) this.f87262g) - ((long) this.f87263h);
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void close() {
        if (this.f87261f != null) {
            this.f87261f = null;
            d();
        }
        this.f87260e = null;
    }

    @Override // com.google.android.exoplayer.upstream.a
    @Nullable
    public Uri getUri() {
        h hVar = this.f87260e;
        if (hVar != null) {
            return hVar.f87270a;
        }
        return null;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f87262g - this.f87263h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(k0.i(this.f87261f), this.f87263h, bArr, i10, iMin);
        this.f87263h += iMin;
        c(iMin);
        return iMin;
    }
}
