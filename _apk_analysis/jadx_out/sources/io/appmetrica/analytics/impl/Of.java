package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes.dex */
public final class Of implements uo {
    @Override // io.appmetrica.analytics.impl.uo
    public final byte[] a(O8 o82, C4941lh c4941lh) {
        if (!TextUtils.isEmpty(o82.f65689b)) {
            try {
                byte[] bArrDecode = Base64.decode(o82.f65689b, 0);
                C5015og c5015og = (bArrDecode == null || bArrDecode.length == 0) ? null : new C5015og(bArrDecode);
                Wf wf2 = new Wf();
                String str = c5015og.f67460a;
                wf2.f66129a = str == null ? new byte[0] : str.getBytes();
                wf2.f66131c = c5015og.f67461b;
                wf2.f66130b = c5015og.f67462c;
                int iOrdinal = c5015og.f67463d.ordinal();
                int i10 = 2;
                if (iOrdinal == 1) {
                    i10 = 1;
                } else if (iOrdinal != 2) {
                    i10 = 0;
                }
                wf2.f66132d = i10;
                return MessageNano.toByteArray(wf2);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
