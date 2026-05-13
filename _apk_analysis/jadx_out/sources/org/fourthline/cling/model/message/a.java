package org.fourthline.cling.model.message;

import java.net.InetAddress;
import lr.d;

/* JADX INFO: compiled from: OutgoingDatagramMessage.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<O extends d> extends UpnpMessage<O> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InetAddress f76845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f76846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public lr.c f76847i;

    public a(O o10, InetAddress inetAddress, int i10) {
        super(o10);
        this.f76847i = new lr.c(false);
        this.f76845g = inetAddress;
        this.f76846h = i10;
    }

    @Override // org.fourthline.cling.model.message.UpnpMessage
    public lr.c j() {
        return this.f76847i;
    }

    public InetAddress u() {
        return this.f76845g;
    }

    public int v() {
        return this.f76846h;
    }
}
