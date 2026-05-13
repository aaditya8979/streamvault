package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.IOException;
import java.util.HashMap;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes9.dex */
public final class Y6 extends AbstractC3788ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f26615a;

    public Y6(HashMap map) {
        tn.p.k(map, "payload");
        this.f26615a = map;
    }

    public Y6(HashMap map, int i10) {
        tn.p.k(map, "payload");
        this.f26615a = map;
    }

    @Override // com.inmobi.media.AbstractC3788ui
    public final String a() {
        return ShareTarget.ENCODING_TYPE_URL_ENCODED;
    }

    @Override // com.inmobi.media.AbstractC3788ui
    public final void a(BufferedSink bufferedSink) throws IOException {
        tn.p.k(bufferedSink, "bufferedSink");
        bufferedSink.writeUtf8(F3.a(this.f26615a));
    }
}
