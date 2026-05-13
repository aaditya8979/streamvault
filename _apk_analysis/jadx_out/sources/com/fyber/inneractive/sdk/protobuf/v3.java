package com.fyber.inneractive.sdk.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes11.dex */
public final class v3 extends w3 {
    public v3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte a(long j10) {
        return this.f19275a.getByte(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(long j10, byte[] bArr, long j11) {
        this.f19275a.copyMemory((Object) null, j10, bArr, x3.f19292f, j11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, byte b10) {
        this.f19275a.putByte(obj, j10, b10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, double d10) {
        this.f19275a.putDouble(obj, j10, d10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, float f10) {
        this.f19275a.putFloat(obj, j10, f10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, boolean z10) {
        this.f19275a.putBoolean(obj, j10, z10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        try {
            Class<?> cls = this.f19275a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            x3.a(th2);
            return false;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a(Object obj, long j10) {
        return this.f19275a.getBoolean(obj, j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte b(Object obj, long j10) {
        return this.f19275a.getByte(obj, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[PHI: r3
      0x003c: PHI (r3v9 java.lang.reflect.Field) = (r3v5 java.lang.reflect.Field), (r3v12 java.lang.reflect.Field) binds: [B:19:0x0050, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.w3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r11 = this;
            java.lang.String r0 = "copyMemory"
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "getLong"
            sun.misc.Unsafe r3 = r11.f19275a
            r4 = 0
            if (r3 != 0) goto Ld
            goto Lc1
        Ld:
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r5 = "objectFieldOffset"
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lbd
            java.lang.Class<java.lang.reflect.Field> r8 = java.lang.reflect.Field.class
            r7[r4] = r8     // Catch: java.lang.Throwable -> Lbd
            r3.getMethod(r5, r7)     // Catch: java.lang.Throwable -> Lbd
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> Lbd
            r7 = 2
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lbd
            r8[r4] = r1     // Catch: java.lang.Throwable -> Lbd
            r8[r6] = r5     // Catch: java.lang.Throwable -> Lbd
            r3.getMethod(r2, r8)     // Catch: java.lang.Throwable -> Lbd
            boolean r3 = com.fyber.inneractive.sdk.protobuf.d.a()     // Catch: java.lang.Throwable -> Lbd
            r8 = 0
            if (r3 == 0) goto L3e
            java.lang.String r3 = "effectiveDirectAddress"
            java.lang.Class<java.nio.Buffer> r9 = java.nio.Buffer.class
            java.lang.reflect.Field r3 = r9.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L39
            goto L3a
        L39:
            r3 = r8
        L3a:
            if (r3 == 0) goto L3e
        L3c:
            r8 = r3
            goto L53
        L3e:
            java.lang.String r3 = "address"
            java.lang.Class<java.nio.Buffer> r9 = java.nio.Buffer.class
            java.lang.reflect.Field r3 = r9.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L47
            goto L48
        L47:
            r3 = r8
        L48:
            if (r3 == 0) goto L53
            java.lang.Class r9 = r3.getType()     // Catch: java.lang.Throwable -> Lbd
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> Lbd
            if (r9 != r10) goto L53
            goto L3c
        L53:
            if (r8 != 0) goto L56
            goto Lc1
        L56:
            sun.misc.Unsafe r3 = r11.f19275a     // Catch: java.lang.Throwable -> Lb8
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r8 = "getByte"
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lb8
            r9[r4] = r5     // Catch: java.lang.Throwable -> Lb8
            r3.getMethod(r8, r9)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r8 = "putByte"
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lb8
            r9[r4] = r5     // Catch: java.lang.Throwable -> Lb8
            java.lang.Class r10 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> Lb8
            r9[r6] = r10     // Catch: java.lang.Throwable -> Lb8
            r3.getMethod(r8, r9)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r8 = "getInt"
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lb8
            r9[r4] = r5     // Catch: java.lang.Throwable -> Lb8
            r3.getMethod(r8, r9)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r8 = "putInt"
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lb8
            r9[r4] = r5     // Catch: java.lang.Throwable -> Lb8
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lb8
            r9[r6] = r10     // Catch: java.lang.Throwable -> Lb8
            r3.getMethod(r8, r9)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lb8
            r8[r4] = r5     // Catch: java.lang.Throwable -> Lb8
            r3.getMethod(r2, r8)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = "putLong"
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lb8
            r8[r4] = r5     // Catch: java.lang.Throwable -> Lb8
            r8[r6] = r5     // Catch: java.lang.Throwable -> Lb8
            r3.getMethod(r2, r8)     // Catch: java.lang.Throwable -> Lb8
            r2 = 3
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> Lb8
            r8[r4] = r5     // Catch: java.lang.Throwable -> Lb8
            r8[r6] = r5     // Catch: java.lang.Throwable -> Lb8
            r8[r7] = r5     // Catch: java.lang.Throwable -> Lb8
            r3.getMethod(r0, r8)     // Catch: java.lang.Throwable -> Lb8
            r8 = 5
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> Lb8
            r8[r4] = r1     // Catch: java.lang.Throwable -> Lb8
            r8[r6] = r5     // Catch: java.lang.Throwable -> Lb8
            r8[r7] = r1     // Catch: java.lang.Throwable -> Lb8
            r8[r2] = r5     // Catch: java.lang.Throwable -> Lb8
            r1 = 4
            r8[r1] = r5     // Catch: java.lang.Throwable -> Lb8
            r3.getMethod(r0, r8)     // Catch: java.lang.Throwable -> Lb8
            return r6
        Lb8:
            r0 = move-exception
            com.fyber.inneractive.sdk.protobuf.x3.a(r0)
            return r4
        Lbd:
            r0 = move-exception
            com.fyber.inneractive.sdk.protobuf.x3.a(r0)
        Lc1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.v3.b():boolean");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final double c(Object obj, long j10) {
        return this.f19275a.getDouble(obj, j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final float d(Object obj, long j10) {
        return this.f19275a.getFloat(obj, j10);
    }
}
