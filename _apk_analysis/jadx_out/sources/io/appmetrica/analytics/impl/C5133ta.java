package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5133ta extends D2 {
    public C5133ta(int i10) {
        super(i10);
    }

    @Override // io.appmetrica.analytics.impl.D2, io.appmetrica.analytics.impl.InterfaceC5158ua
    @NonNull
    public final Nn a(@Nullable String str) {
        int length = 0;
        if (str != null) {
            int length2 = str.length();
            int i10 = this.f65144a;
            if (length2 > i10) {
                String strSubstring = str.substring(0, i10);
                length = str.getBytes().length - strSubstring.getBytes().length;
                str = strSubstring;
            }
        }
        return new Nn(str, new C4669b3(length));
    }
}
