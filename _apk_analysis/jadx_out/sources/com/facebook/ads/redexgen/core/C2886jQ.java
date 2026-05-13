package com.facebook.ads.redexgen.core;

import java.io.File;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2886jQ implements InterfaceC1935Ks<File> {
    @Override // com.facebook.ads.redexgen.core.InterfaceC1935Ks
    public final C1934Kr<File> A3p(File file, LA la2) {
        return file.exists() ? new C1934Kr<>(true, file) : new C1934Kr<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1935Ks
    public final void A55(File file, LA la2) {
    }
}
