package com.liulishuo.filedownloader.event;

import ca.b;

/* JADX INFO: loaded from: classes11.dex */
public class DownloadServiceConnectChangedEvent extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConnectStatus f34665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<?> f34666d;

    public enum ConnectStatus {
        connected,
        disconnected,
        lost
    }

    public DownloadServiceConnectChangedEvent(ConnectStatus connectStatus, Class<?> cls) {
        super("event.service.connect.changed");
        this.f34665c = connectStatus;
        this.f34666d = cls;
    }

    public ConnectStatus b() {
        return this.f34665c;
    }
}
