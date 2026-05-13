package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3192od extends Exception implements C1S {
    public final int A00;
    public final long A01;
    public static final String A03 = AbstractC15184a.A0h(0);
    public static final String A04 = AbstractC15184a.A0h(1);
    public static final String A07 = AbstractC15184a.A0h(2);
    public static final String A05 = AbstractC15184a.A0h(3);
    public static final String A06 = AbstractC15184a.A0h(4);
    public static final C1R<C3192od> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.oe
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return new C3192od(bundle);
        }
    };

    public C3192od(Bundle bundle) {
        this(bundle.getString(A07), A09(bundle), bundle.getInt(A03, 1000), bundle.getLong(A04, SystemClock.elapsedRealtime()));
    }

    public C3192od(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        this.A00 = i10;
        this.A01 = j10;
    }

    public static RemoteException A08(String str) {
        return new RemoteException(str);
    }

    public static Throwable A09(Bundle bundle) {
        String string = bundle.getString(A05);
        String string2 = bundle.getString(A06);
        Throwable thA0A = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, C3192od.class.getClassLoader());
            if (Throwable.class.isAssignableFrom(cls)) {
                thA0A = A0A(cls, string2);
            }
        } catch (Throwable unused) {
            if (thA0A != null) {
                return thA0A;
            }
        }
        return thA0A == null ? A08(string2) : thA0A;
    }

    public static Throwable A0A(Class<?> cls, String str) throws Exception {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }
}
