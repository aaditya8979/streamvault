package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: OperatorBasicArithmetic.java */
/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f35832b = Arrays.asList("+", "-", "*", "/", "%");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f35833a;

    public d(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f35833a = cVar;
    }

    private Double a(Object obj) {
        if (obj == null) {
            return Double.valueOf(0.0d);
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        try {
            return Double.valueOf(Double.parseDouble(String.valueOf(obj)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private boolean a(double d10) {
        return (Double.isNaN(d10) || Double.isInfinite(d10) || d10 != Math.floor(d10)) ? false : true;
    }

    private double b(double d10) {
        return new BigDecimal(d10).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9 A[Catch: Exception -> 0x00f7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f7, blocks: (B:13:0x001f, B:47:0x007c, B:49:0x0084, B:50:0x0092, B:51:0x0099, B:52:0x009a, B:54:0x00a2, B:55:0x00c5, B:56:0x00cc, B:57:0x00cd, B:58:0x00db, B:59:0x00e9, B:24:0x003c, B:27:0x0045, B:30:0x004f, B:33:0x0059, B:36:0x0063), top: B:76:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(java.lang.String r10, java.lang.Object r11, java.util.List<java.lang.Object> r12) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.d.b(java.lang.String, java.lang.Object, java.util.List):com.mbridge.msdk.config.component.common.express.operator.parts.a");
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f35832b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return b(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }
}
