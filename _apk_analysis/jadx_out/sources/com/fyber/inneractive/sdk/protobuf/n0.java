package com.fyber.inneractive.sdk.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n0 f19189d = new n0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3 f19190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19192c;

    public n0() {
        int i10 = e3.f19120h;
        this.f19190a = new v2(16);
    }

    public n0(int i10) {
        int i11 = e3.f19120h;
        this.f19190a = new v2(0);
        e();
        e();
    }

    public static int a(j4 j4Var, Object obj) {
        int serializedSize;
        int iC;
        switch (m0.f19186b[j4Var.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = b0.f19100b;
                return 8;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = b0.f19100b;
                return 4;
            case 3:
                return b0.a(((Long) obj).longValue());
            case 4:
                return b0.a(((Long) obj).longValue());
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue >= 0) {
                    return b0.c(iIntValue);
                }
                Logger logger3 = b0.f19100b;
                return 10;
            case 6:
                ((Long) obj).getClass();
                Logger logger4 = b0.f19100b;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                Logger logger5 = b0.f19100b;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger6 = b0.f19100b;
                return 1;
            case 9:
                Logger logger7 = b0.f19100b;
                return ((d2) obj).getSerializedSize();
            case 10:
                Logger logger8 = b0.f19100b;
                serializedSize = ((d2) obj).getSerializedSize();
                iC = b0.c(serializedSize);
                break;
            case 11:
                return obj instanceof s ? b0.a((s) obj) : b0.a((String) obj);
            case 12:
                if (obj instanceof s) {
                    return b0.a((s) obj);
                }
                Logger logger9 = b0.f19100b;
                serializedSize = ((byte[]) obj).length;
                iC = b0.c(serializedSize);
                break;
            case 13:
                return b0.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = b0.f19100b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = b0.f19100b;
                return 8;
            case 16:
                return b0.c(b0.d(((Integer) obj).intValue()));
            case 17:
                return b0.a(b0.b(((Long) obj).longValue()));
            case 18:
                return obj instanceof d1 ? b0.a(((d1) obj).a()) : b0.a(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iC + serializedSize;
    }

    public static int a(Map.Entry entry) {
        w0 w0Var = (w0) entry.getKey();
        Object value = entry.getValue();
        if (w0Var.f19268c.a() != k4.MESSAGE || w0Var.f19269d || w0Var.f19270e) {
            return b(w0Var, value);
        }
        int i10 = ((w0) entry.getKey()).f19267b;
        int iC = b0.c(i10) + b0.b(2) + (b0.b(1) * 2);
        int iB = b0.b(3);
        int serializedSize = ((d2) value).getSerializedSize();
        return l0.a(serializedSize, serializedSize, iB, iC);
    }

    public static int b(w0 w0Var, Object obj) {
        int iB;
        int iA;
        j4 j4Var = w0Var.f19268c;
        int i10 = w0Var.f19267b;
        if (w0Var.f19269d) {
            int iA2 = 0;
            if (!w0Var.f19270e) {
                for (Object obj2 : (List) obj) {
                    int iB2 = b0.b(i10);
                    if (j4Var == j4.GROUP) {
                        iB2 *= 2;
                    }
                    iA2 += a(j4Var, obj2) + iB2;
                }
                return iA2;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iA2 += a(j4Var, it.next());
            }
            iB = b0.b(i10) + iA2;
            iA = b0.c(iA2);
        } else {
            iB = b0.b(i10);
            if (j4Var == j4.GROUP) {
                iB *= 2;
            }
            iA = a(j4Var, obj);
        }
        return iA + iB;
    }

    public static boolean b(Map.Entry entry) {
        w0 w0Var = (w0) entry.getKey();
        if (w0Var.f19268c.a() != k4.MESSAGE) {
            return true;
        }
        if (!w0Var.f19269d) {
            Object value = entry.getValue();
            if (value instanceof d2) {
                return ((d2) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((d2) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.fyber.inneractive.sdk.protobuf.w0 r5, java.lang.Object r6) {
        /*
            com.fyber.inneractive.sdk.protobuf.j4 r0 = r5.f19268c
            java.nio.charset.Charset r1 = com.fyber.inneractive.sdk.protobuf.l1.f19181a
            r6.getClass()
            int[] r1 = com.fyber.inneractive.sdk.protobuf.m0.f19185a
            com.fyber.inneractive.sdk.protobuf.k4 r0 = r0.a()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L2f;
                case 7: goto L25;
                case 8: goto L1c;
                case 9: goto L19;
                default: goto L18;
            }
        L18:
            goto L41
        L19:
            boolean r0 = r6 instanceof com.fyber.inneractive.sdk.protobuf.d2
            goto L42
        L1c:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L2d
            boolean r0 = r6 instanceof com.fyber.inneractive.sdk.protobuf.d1
            if (r0 == 0) goto L41
            goto L2d
        L25:
            boolean r0 = r6 instanceof com.fyber.inneractive.sdk.protobuf.s
            if (r0 != 0) goto L2d
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L41
        L2d:
            r0 = r1
            goto L42
        L2f:
            boolean r0 = r6 instanceof java.lang.String
            goto L42
        L32:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L42
        L35:
            boolean r0 = r6 instanceof java.lang.Double
            goto L42
        L38:
            boolean r0 = r6 instanceof java.lang.Float
            goto L42
        L3b:
            boolean r0 = r6 instanceof java.lang.Long
            goto L42
        L3e:
            boolean r0 = r6 instanceof java.lang.Integer
            goto L42
        L41:
            r0 = r2
        L42:
            if (r0 == 0) goto L45
            return
        L45:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r3 = r5.f19267b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.fyber.inneractive.sdk.protobuf.j4 r5 = r5.f19268c
            com.fyber.inneractive.sdk.protobuf.k4 r5 = r5.a()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r3
            r4[r1] = r5
            r5 = 2
            r4[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.n0.d(com.fyber.inneractive.sdk.protobuf.w0, java.lang.Object):void");
    }

    public final int a() {
        int iA = 0;
        for (int i10 = 0; i10 < this.f19190a.f19122b.size(); i10++) {
            iA += a((Map.Entry) this.f19190a.f19122b.get(i10));
        }
        Iterator it = this.f19190a.b().iterator();
        while (it.hasNext()) {
            iA += a((Map.Entry) it.next());
        }
        return iA;
    }

    public final void a(n0 n0Var) {
        for (int i10 = 0; i10 < n0Var.f19190a.f19122b.size(); i10++) {
            c((Map.Entry) n0Var.f19190a.f19122b.get(i10));
        }
        Iterator it = n0Var.f19190a.b().iterator();
        while (it.hasNext()) {
            c((Map.Entry) it.next());
        }
    }

    public final void a(w0 w0Var, Object obj) {
        List arrayList;
        if (!w0Var.f19269d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        d(w0Var, obj);
        Object obj2 = this.f19190a.get(w0Var);
        if (obj2 == null) {
            arrayList = new ArrayList();
            this.f19190a.a(w0Var, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    public final int b() {
        int iB = 0;
        for (int i10 = 0; i10 < this.f19190a.f19122b.size(); i10++) {
            Map.Entry entry = (Map.Entry) this.f19190a.f19122b.get(i10);
            iB += b((w0) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : this.f19190a.b()) {
            iB += b((w0) entry2.getKey(), entry2.getValue());
        }
        return iB;
    }

    public final void c(w0 w0Var, Object obj) {
        if (!w0Var.f19269d) {
            d(w0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d(w0Var, it.next());
            }
            obj = arrayList;
        }
        this.f19190a.a(w0Var, obj);
    }

    public final void c(Map.Entry entry) {
        w0 w0Var = (w0) entry.getKey();
        Object value = entry.getValue();
        if (w0Var.f19269d) {
            Object arrayList = this.f19190a.get(w0Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            this.f19190a.a(w0Var, arrayList);
            return;
        }
        if (w0Var.f19268c.a() != k4.MESSAGE) {
            e3 e3Var = this.f19190a;
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            e3Var.a(w0Var, value);
            return;
        }
        Object obj2 = this.f19190a.get(w0Var);
        if (obj2 != null) {
            t0 t0Var = (t0) ((d2) obj2).toBuilder();
            t0Var.c();
            t0.a(t0Var.f19235b, (z0) ((d2) value));
            this.f19190a.a(w0Var, t0Var.a());
            return;
        }
        e3 e3Var2 = this.f19190a;
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        e3Var2.a(w0Var, value);
    }

    public final boolean c() {
        for (int i10 = 0; i10 < this.f19190a.f19122b.size(); i10++) {
            if (!b((Map.Entry) this.f19190a.f19122b.get(i10))) {
                return false;
            }
        }
        Iterator it = this.f19190a.b().iterator();
        while (it.hasNext()) {
            if (!b((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final n0 m4287clone() {
        n0 n0Var = new n0();
        for (int i10 = 0; i10 < this.f19190a.f19122b.size(); i10++) {
            Map.Entry entry = (Map.Entry) this.f19190a.f19122b.get(i10);
            n0Var.c((w0) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : this.f19190a.b()) {
            n0Var.c((w0) entry2.getKey(), entry2.getValue());
        }
        n0Var.f19192c = this.f19192c;
        return n0Var;
    }

    public final Iterator d() {
        return this.f19192c ? new o1(this.f19190a.entrySet().iterator()) : this.f19190a.entrySet().iterator();
    }

    public final void e() {
        if (this.f19191b) {
            return;
        }
        v2 v2Var = (v2) this.f19190a;
        if (!v2Var.f19124d) {
            for (int i10 = 0; i10 < v2Var.f19122b.size(); i10++) {
                Map.Entry entry = (Map.Entry) v2Var.f19122b.get(i10);
                if (((w0) entry.getKey()).f19269d) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : v2Var.b()) {
                if (((w0) entry2.getKey()).f19269d) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!v2Var.f19124d) {
            v2Var.f19123c = v2Var.f19123c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(v2Var.f19123c);
            v2Var.f19126f = v2Var.f19126f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(v2Var.f19126f);
            v2Var.f19124d = true;
        }
        this.f19191b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return this.f19190a.equals(((n0) obj).f19190a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19190a.hashCode();
    }
}
