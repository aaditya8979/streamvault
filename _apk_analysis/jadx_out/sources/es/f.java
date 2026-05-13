package es;

import org.fourthline.cling.support.model.TransportState;
import org.fourthline.cling.support.model.TransportStatus;

/* JADX INFO: compiled from: TransportInfo.java */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TransportState f61358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TransportStatus f61359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f61360c;

    public f() {
        this.f61358a = TransportState.NO_MEDIA_PRESENT;
        this.f61359b = TransportStatus.OK;
        this.f61360c = "1";
    }

    public f(TransportState transportState, TransportStatus transportStatus, String str) {
        this.f61358a = TransportState.NO_MEDIA_PRESENT;
        TransportStatus transportStatus2 = TransportStatus.OK;
        this.f61358a = transportState;
        this.f61359b = transportStatus;
        this.f61360c = str;
    }

    public String a() {
        return this.f61360c;
    }

    public TransportState b() {
        return this.f61358a;
    }

    public TransportStatus c() {
        return this.f61359b;
    }
}
