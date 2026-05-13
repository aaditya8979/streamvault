package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: DownloadFutureTask.java */
/* JADX INFO: loaded from: classes11.dex */
public class c extends FutureTask<h> implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f36060a;

    public c(h hVar) {
        super(hVar, null);
        this.f36060a = hVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        h hVar = this.f36060a;
        com.mbridge.msdk.config.component.load.downloader.c cVar2 = hVar.f36116a;
        h hVar2 = cVar.f36060a;
        com.mbridge.msdk.config.component.load.downloader.c cVar3 = hVar2.f36116a;
        return cVar2 == cVar3 ? hVar.f36117b - hVar2.f36117b : cVar3.ordinal() - cVar2.ordinal();
    }
}
