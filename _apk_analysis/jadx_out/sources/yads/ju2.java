package yads;

import androidx.media3.datasource.HttpDataSource;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes12.dex */
public final class ju2 extends sd0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SSLSocketFactory f91376q;

    public ju2(String str, int i10, int i11, boolean z10, HttpDataSource.RequestProperties requestProperties, SSLSocketFactory sSLSocketFactory) {
        super(str, i10, i11, z10, !z10, requestProperties);
        this.f91376q = sSLSocketFactory;
    }
}
