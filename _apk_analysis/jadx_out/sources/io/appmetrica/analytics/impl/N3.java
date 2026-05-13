package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class N3 extends Q5 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashMap f65616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Ym f65617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Vm f65618s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Vm f65619t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C4643a3 f65620u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Ym f65621v;

    @VisibleForTesting
    public N3(@NonNull PublicLogger publicLogger) {
        this.f65616q = new HashMap();
        a(publicLogger);
    }

    public N3(String str, int i10, @NonNull PublicLogger publicLogger) {
        this("", str, i10, publicLogger);
    }

    public N3(String str, String str2, int i10, int i11, @NonNull PublicLogger publicLogger) {
        this.f65616q = new HashMap();
        a(publicLogger);
        this.f65789b = e(str);
        this.f65788a = d(str2);
        setType(i10);
        setCustomType(i11);
    }

    public N3(String str, String str2, int i10, @NonNull PublicLogger publicLogger) {
        this(str, str2, i10, 0, publicLogger);
    }

    public N3(byte[] bArr, @Nullable String str, int i10, @NonNull PublicLogger publicLogger) {
        this.f65616q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.f65788a = d(str);
        setType(i10);
    }

    public static N3 a(PublicLogger publicLogger, E e10) {
        N3 n32 = new N3(publicLogger);
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        n32.f65791d = 40977;
        Pair pairA = e10.a();
        n32.f65789b = n32.e(new String(Base64.encode((byte[]) pairA.getFirst(), 0)));
        n32.f65794g = ((Integer) pairA.getSecond()).intValue();
        return n32;
    }

    public static N3 a(PublicLogger publicLogger, Pi pi2) {
        int length;
        N3 n32 = new N3(publicLogger);
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        n32.f65791d = 40976;
        Ni ni2 = new Ni();
        ni2.f65662b = pi2.f65754a.currency.getCurrencyCode().getBytes();
        ni2.f65666f = pi2.f65754a.priceMicros;
        ni2.f65663c = StringUtils.stringToBytesForProtobuf(new Ym(200, "revenue productID", pi2.f65758e).a(pi2.f65754a.productID));
        ni2.f65661a = ((Integer) WrapUtils.getOrDefault(pi2.f65754a.quantity, 1)).intValue();
        Vm vm2 = pi2.f65755b;
        String str = pi2.f65754a.payload;
        vm2.getClass();
        ni2.f65664d = StringUtils.stringToBytesForProtobuf(vm2.a(str));
        if (mo.a(pi2.f65754a.receipt)) {
            Ii ii2 = new Ii();
            String str2 = (String) pi2.f65756c.a(pi2.f65754a.receipt.data);
            length = true ^ StringUtils.equalsNullSafety(pi2.f65754a.receipt.data, str2) ? pi2.f65754a.receipt.data.length() : 0;
            String str3 = (String) pi2.f65757d.a(pi2.f65754a.receipt.signature);
            ii2.f65371a = StringUtils.stringToBytesForProtobuf(str2);
            ii2.f65372b = StringUtils.stringToBytesForProtobuf(str3);
            ni2.f65665e = ii2;
        } else {
            length = 0;
        }
        android.util.Pair pair = new android.util.Pair(MessageNano.toByteArray(ni2), Integer.valueOf(length));
        n32.f65789b = n32.e(new String(Base64.encode((byte[]) pair.first, 0)));
        n32.f65794g = ((Integer) pair.second).intValue();
        return n32;
    }

    public static Q5 a(@NonNull C4896jo c4896jo) {
        Q5 q5O = o();
        q5O.setValue(new String(Base64.encode(MessageNano.toByteArray(c4896jo), 0)));
        return q5O;
    }

    public static Q5 b(String str, String str2) {
        Q5 q52 = new Q5("", 0);
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        q52.f65791d = 5376;
        q52.a(str, str2);
        return q52;
    }

    public static Q5 n() {
        Q5 q52 = new Q5("", 0);
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        q52.f65791d = 5632;
        return q52;
    }

    public static Q5 o() {
        Q5 q52 = new Q5("", 0);
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        q52.f65791d = 40961;
        return q52;
    }

    public final N3 a(@NonNull HashMap<M3, Integer> map) {
        this.f65616q = map;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.f65617r = new Ym(1000, "event name", publicLogger);
        this.f65618s = new Vm(245760, "event value", publicLogger);
        this.f65619t = new Vm(1024000, "event extended value", publicLogger);
        this.f65620u = new C4643a3(245760, "event value bytes", publicLogger);
        this.f65621v = new Ym(200, "user profile id", publicLogger);
    }

    public final void a(String str, String str2, M3 m32) {
        if (!StringUtils.equalsNullSafety(str, str2)) {
            this.f65616q.put(m32, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        } else {
            this.f65616q.remove(m32);
        }
        int iIntValue = 0;
        Iterator it = this.f65616q.values().iterator();
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f65794g = iIntValue;
    }

    public final void a(byte[] bArr) {
        C4643a3 c4643a3 = this.f65620u;
        c4643a3.getClass();
        byte[] bArrA = c4643a3.a(bArr);
        M3 m32 = M3.VALUE;
        if (bArr.length != bArrA.length) {
            this.f65616q.put(m32, Integer.valueOf(bArr.length - bArrA.length));
        } else {
            this.f65616q.remove(m32);
        }
        int iIntValue = 0;
        Iterator it = this.f65616q.values().iterator();
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f65794g = iIntValue;
        super.setValueBytes(bArrA);
    }

    @Override // io.appmetrica.analytics.impl.Q5
    @NonNull
    public final void c(@Nullable String str) {
        Ym ym2 = this.f65621v;
        ym2.getClass();
        this.f65795h = ym2.a(str);
    }

    public final String d(String str) {
        Ym ym2 = this.f65617r;
        ym2.getClass();
        String strA = ym2.a(str);
        a(str, strA, M3.NAME);
        return strA;
    }

    public final String e(String str) {
        Vm vm2 = this.f65618s;
        vm2.getClass();
        String strA = vm2.a(str);
        a(str, strA, M3.VALUE);
        return strA;
    }

    public final N3 f(@NonNull String str) {
        Vm vm2 = this.f65619t;
        vm2.getClass();
        String strA = vm2.a(str);
        a(str, strA, M3.VALUE);
        this.f65789b = strA;
        return this;
    }

    @NonNull
    public final HashMap<M3, Integer> p() {
        return this.f65616q;
    }

    @Override // io.appmetrica.analytics.impl.Q5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(@Nullable String str) {
        this.f65788a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.Q5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(@Nullable String str) {
        this.f65789b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.Q5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final void setValueBytes(@Nullable byte[] bArr) {
        a(bArr);
    }
}
