package com.inmobi.media;

import java.io.IOException;
import okio.BufferedSink;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Ba extends AbstractC3788ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f25207a;

    public Ba(JSONObject jSONObject) {
        tn.p.k(jSONObject, "jsonObject");
        this.f25207a = jSONObject;
    }

    @Override // com.inmobi.media.AbstractC3788ui
    public final String a() {
        return com.ironsource.G5.L;
    }

    @Override // com.inmobi.media.AbstractC3788ui
    public final void a(BufferedSink bufferedSink) throws IOException {
        tn.p.k(bufferedSink, "bufferedSink");
        String string = this.f25207a.toString();
        tn.p.j(string, "toString(...)");
        bufferedSink.writeUtf8(string);
    }
}
