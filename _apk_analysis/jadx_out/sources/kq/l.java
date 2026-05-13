package kq;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import mq.d;
import mq.v;

/* JADX INFO: compiled from: UserAuthentication.java */
/* JADX INFO: loaded from: classes11.dex */
public class l implements d.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f73556c;

    public l(String str, v vVar) {
        this.f73555b = str;
        this.f73556c = vVar;
    }

    @Override // mq.d.h
    public String getAuthMethod() {
        return this.f73555b;
    }

    @Override // mq.d.h
    public v getUserIdentity() {
        return this.f73556c;
    }

    public String toString() {
        return "{User," + getAuthMethod() + StringUtils.COMMA + this.f73556c + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e;
    }
}
