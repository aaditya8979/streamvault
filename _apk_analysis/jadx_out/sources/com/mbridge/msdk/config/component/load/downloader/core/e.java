package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DownloadRequestBuilder.java */
/* JADX INFO: loaded from: classes11.dex */
public class e<T> implements p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f36093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.mbridge.msdk.config.component.load.downloader.b<T> f36094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.mbridge.msdk.config.component.load.downloader.c f36095c = com.mbridge.msdk.config.component.load.downloader.c.MEDIUM;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.mbridge.msdk.config.component.load.downloader.h f36096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, String> f36097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap<String, List<String>> f36098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f36099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f36101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f36102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f36103k;

    public e(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        this.f36094b = bVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e<T> withHttpRetryCounter(int i10) {
        this.f36100h = i10;
        return this;
    }

    public e<T> a(long j10) {
        this.f36093a = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p<T> a(com.mbridge.msdk.config.component.load.downloader.c cVar) {
        this.f36095c = cVar;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p<T> a(com.mbridge.msdk.config.component.load.downloader.h hVar) {
        this.f36096d = hVar;
        return this;
    }

    public e<T> b(long j10) {
        this.f36099g = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public d<T> build() {
        return d.a(this);
    }

    public p<T> c(long j10) {
        this.f36103k = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p<T> withTimeout(long j10) {
        this.f36101i = j10;
        return this;
    }
}
