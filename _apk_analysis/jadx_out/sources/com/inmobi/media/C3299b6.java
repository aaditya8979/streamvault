package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import okio.ByteString;

/* JADX INFO: renamed from: com.inmobi.media.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3299b6 implements Ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC3273a6 f26835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteString f26836b;

    public C3299b6(String str, EnumC3273a6 enumC3273a6) {
        tn.p.k(str, "url");
        tn.p.k(enumC3273a6, IronSourceConstants.EVENTS_ERROR_CODE);
        this.f26835a = enumC3273a6;
        this.f26836b = ByteString.EMPTY;
    }

    @Override // com.inmobi.media.Ne
    public final Object a() {
        return null;
    }

    @Override // com.inmobi.media.Ne
    public final Ie b() {
        return new Ie(0L, kotlin.collections.a.j(), 0, "");
    }

    @Override // com.inmobi.media.Ne
    public final int c() {
        return this.f26835a.f26759a;
    }

    @Override // com.inmobi.media.Ne
    public final ByteString d() {
        return this.f26836b;
    }

    @Override // com.inmobi.media.Ne
    public final String e() {
        return this.f26835a.name();
    }
}
