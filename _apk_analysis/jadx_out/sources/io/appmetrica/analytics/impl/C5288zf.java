package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5288zf extends C5083ra {
    public C5288zf(int i10) {
        super(i10);
    }

    @Override // io.appmetrica.analytics.impl.C5083ra
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(@Nullable Z z10) {
        if (z10 == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(z10.f66276b) + 12;
    }
}
