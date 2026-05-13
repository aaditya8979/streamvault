package com.facebook.ads.redexgen.core;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2119Ry {
    public static String[] A00 = {"5dJOCi5t", "ElxVODxrKGpjZndubW1J77FnKIhSKHYN", "soy1HjiCChRoNLbRiMG0ONMXcD", "Jty4styG", "qizyqn1jZat7HSG1Q7H23Ody908", "FRg8IeQHaCBN0Pxo0", "h8pKjD8zMvQPgPuOzhwvVUtEvF", "a7oVZcxMQNrl1fZi2h6OeAZDf6QHjYYV"};

    public static Object A00(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Method A01(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            String[] strArr = A00;
            if (strArr[6].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[7] = "Wp91UfiY68my4gPNmlIjqqdWX7WJ726D";
            strArr2[1] = "UI7dA5vfWz5Ps8yQ7SrAKT8QjM9H5yDE";
            return null;
        }
    }

    public static Method A02(String str, String str2, Class<?>... clsArr) {
        try {
            return A01(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
