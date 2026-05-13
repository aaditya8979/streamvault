package com.inmobi.media;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* JADX INFO: renamed from: com.inmobi.media.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3774u4 extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3788ui f28224a;

    public C3774u4(AbstractC3788ui abstractC3788ui) {
        this.f28224a = abstractC3788ui;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return MediaType.parse(this.f28224a.a());
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) {
        tn.p.k(bufferedSink, "sink");
        this.f28224a.a(bufferedSink);
    }
}
