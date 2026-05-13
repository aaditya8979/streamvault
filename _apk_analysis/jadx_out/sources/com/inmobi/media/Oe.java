package com.inmobi.media;

import okio.ByteString;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Oe implements Ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteString f26081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ie f26082c;

    public Oe(String str, int i10, ByteString byteString, Ie ie2) {
        tn.p.k(str, "resolvedUrl");
        tn.p.k(byteString, "bodyBytes");
        tn.p.k(ie2, "responseMetaData");
        this.f26080a = i10;
        this.f26081b = byteString;
        this.f26082c = ie2;
    }

    @Override // com.inmobi.media.Ne
    public final Object a() {
        tn.p.k(C3600n4.class, "clazz");
        tn.p.k(C3600n4.class, "type");
        JSONObject jSONObject = new JSONObject(this.f26081b.string(bo.c.f5639b));
        tn.p.k(jSONObject, "jsonObject");
        tn.p.k(C3600n4.class, "type");
        return C3600n4.class.cast(AbstractC3581ma.a(jSONObject, C3600n4.class, null, null));
    }

    @Override // com.inmobi.media.Ne
    public final Ie b() {
        return this.f26082c;
    }

    @Override // com.inmobi.media.Ne
    public final int c() {
        return this.f26080a;
    }

    @Override // com.inmobi.media.Ne
    public final ByteString d() {
        return this.f26081b;
    }

    @Override // com.inmobi.media.Ne
    public final String e() {
        return null;
    }
}
