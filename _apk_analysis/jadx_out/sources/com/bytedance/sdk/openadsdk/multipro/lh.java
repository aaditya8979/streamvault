package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.component.utils.qbp;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class lh {
    private static boolean ouw = true;
    private static final AtomicBoolean vt = new AtomicBoolean(false);

    public static void ouw() {
        ouw = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[Catch: all -> 0x018e, SYNTHETIC, TryCatch #8 {all -> 0x018e, blocks: (B:11:0x0019, B:13:0x001f, B:15:0x0026, B:19:0x003d, B:38:0x0099, B:34:0x0081, B:67:0x0120, B:66:0x010d, B:61:0x00f3, B:54:0x00d7, B:49:0x00bd, B:18:0x0033, B:69:0x0122, B:70:0x0126, B:72:0x012c, B:73:0x0144, B:31:0x007c, B:63:0x0108, B:58:0x00ee, B:51:0x00d2, B:35:0x0094, B:46:0x00b8), top: B:93:0x0019, inners: #0, #3, #10, #11, #12, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.io.RandomAccessFile] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ouw(android.content.Context r8) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.lh.ouw(android.content.Context):void");
    }

    private static void ouw(File file) {
        ouw(file, file.exists() ? file.delete() : false);
    }

    private static void ouw(File file, boolean z10) {
        if (!z10 || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e10) {
            qbp.lh("TTAD.TTMultiInitHelper", e10.getMessage());
        }
    }

    private static String vt() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (String) ((Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }
}
