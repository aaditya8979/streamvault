package io.appmetrica.analytics.network.impl;

import bn.r;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e {
    public static final Map a(Map map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static byte[] a(int i10, sn.a aVar) {
        try {
            InputStream inputStream = (InputStream) aVar.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            int i11 = 0;
                            while (true) {
                                int i12 = inputStream.read(bArr);
                                if (-1 == i12 || i11 > i10) {
                                    break;
                                }
                                if (i12 > 0) {
                                    byteArrayOutputStream.write(bArr, 0, i12);
                                    i11 += i12;
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            on.b.a(byteArrayOutputStream, null);
                            on.b.a(inputStream, null);
                            return byteArray;
                        } catch (Throwable unused) {
                            r rVar = r.f5635a;
                            on.b.a(byteArrayOutputStream, null);
                            on.b.a(inputStream, null);
                            return new byte[0];
                        }
                    } finally {
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }
}
