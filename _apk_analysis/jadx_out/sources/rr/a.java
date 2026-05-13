package rr;

import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: ClientInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr.c f78933a;

    public a(lr.c cVar) {
        this.f78933a = cVar;
    }

    public lr.c a() {
        return this.f78933a;
    }

    public String b() {
        return a().t(UpnpHeader.Type.USER_AGENT);
    }
}
