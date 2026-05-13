package ub;

import ec.b;

/* JADX INFO: compiled from: ExceptionUtils.java */
/* JADX INFO: loaded from: classes12.dex */
public class a {
    public static void a(Class<?> cls, String str) {
        try {
            throw new IllegalArgumentException("classs name:" + cls.getName() + ":--->" + str);
        } catch (Exception e10) {
            e10.printStackTrace();
            b.c(e10.toString());
        }
    }
}
