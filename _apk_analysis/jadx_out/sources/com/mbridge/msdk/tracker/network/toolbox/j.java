package com.mbridge.msdk.tracker.network.toolbox;

import androidx.annotation.NonNull;
import com.mbridge.msdk.tracker.network.p;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: compiled from: MBridgeLocalDNSService.java */
/* JADX INFO: loaded from: classes8.dex */
public class j implements com.mbridge.msdk.thrid.okhttp.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f41079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f41080d;

    public j(String str, String str2, p pVar) {
        this.f41078b = str;
        this.f41079c = str2;
        this.f41080d = pVar;
    }

    private List<InetAddress> a(String str, UnknownHostException unknownHostException) throws UnknownHostException {
        p pVar = this.f41080d;
        if (pVar != null) {
            pVar.c("local");
        }
        return i.b().a(str, unknownHostException);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    @NonNull
    public List<InetAddress> a(@NonNull String str) throws UnknownHostException {
        try {
            List<InetAddress> listA = com.mbridge.msdk.thrid.okhttp.n.f40700a.a(str);
            return (listA.isEmpty() && i.b().c(this.f41078b, this.f41079c, str)) ? a(str, new UnknownHostException("DNS result is empty")) : listA;
        } catch (UnknownHostException e10) {
            if (i.b().c(this.f41078b, this.f41079c, str)) {
                return a(str, new UnknownHostException(e10.getMessage()));
            }
            throw e10;
        }
    }
}
