package eq;

import dq.i;
import hq.h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;

/* JADX INFO: compiled from: BasicAuthentication.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hq.d f61306a;

    public b(d dVar) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Basic ");
        sb2.append(sq.d.d(dVar.a() + StringUtils.PROCESS_POSTFIX_DELIMITER + dVar.getCredentials(), "ISO-8859-1"));
        this.f61306a = new h(sb2.toString());
    }

    @Override // eq.a
    public void a(i iVar) throws IOException {
        iVar.S(gq.i.C, this.f61306a);
    }
}
