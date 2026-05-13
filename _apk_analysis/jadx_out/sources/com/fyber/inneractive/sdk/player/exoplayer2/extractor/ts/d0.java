package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f18107c;

    public d0(int i10, String str, ArrayList arrayList, byte[] bArr) {
        this.f18105a = str;
        this.f18106b = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.f18107c = bArr;
    }
}
