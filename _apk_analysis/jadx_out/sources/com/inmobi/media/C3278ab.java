package com.inmobi.media;

import java.io.IOException;

/* JADX INFO: renamed from: com.inmobi.media.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3278ab extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3278ab(String str) {
        super(str);
        tn.p.k(str, "message");
    }
}
