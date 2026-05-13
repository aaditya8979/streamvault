package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: OperatorCompoundAssignment.java */
/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f35836b = Arrays.asList("+=", "-=", "*=", "/=", "%=");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f35837a;

    public f(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f35837a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str, String str2, Object obj, Object obj2) {
        Double dA = a(obj);
        Double dA2 = a(obj2);
        if (dA == null || dA2 == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        try {
            Object objA = a(dA, dA2, str2);
            if (objA instanceof Double) {
                double dDoubleValue = ((Double) objA).doubleValue();
                Object objValueOf = a(dDoubleValue) ? Integer.valueOf(((Double) objA).intValue()) : Double.valueOf(b(dDoubleValue));
                if (aVar != null) {
                    aVar.a(str, objValueOf);
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objValueOf);
            }
        } catch (Exception e10) {
            q0.b("CompoundAssignOp", e10.getMessage(), e10);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(List list, int i10, String str, Object obj, Object obj2) {
        Double dA = a(obj);
        Double dA2 = a(obj2);
        if (dA == null || dA2 == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        try {
            Object objA = a(dA, dA2, str);
            if (objA instanceof Double) {
                double dDoubleValue = ((Double) objA).doubleValue();
                Object objValueOf = a(dDoubleValue) ? Integer.valueOf(((Double) objA).intValue()) : Double.valueOf(b(dDoubleValue));
                if (list != null) {
                    list.set(i10, objValueOf);
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objValueOf);
            }
        } catch (Exception e10) {
            q0.b("CompoundAssignOp", e10.getMessage(), e10);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Map map, String str, String str2, Object obj, Object obj2) {
        Double dA = a(obj);
        Double dA2 = a(obj2);
        if (dA == null || dA2 == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        try {
            Object objA = a(dA, dA2, str2);
            if (objA instanceof Double) {
                double dDoubleValue = ((Double) objA).doubleValue();
                Object objValueOf = a(dDoubleValue) ? Integer.valueOf(((Double) objA).intValue()) : Double.valueOf(b(dDoubleValue));
                if (map != null) {
                    map.put(str, objValueOf);
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objValueOf);
            }
        } catch (Exception e10) {
            q0.b("CompoundAssignOp", e10.getMessage(), e10);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private Double a(Object obj) {
        if (obj == null) {
            return null;
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

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb A[Catch: Exception -> 0x00d9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d9, blocks: (B:2:0x0000, B:36:0x005e, B:38:0x0066, B:39:0x0074, B:40:0x007b, B:41:0x007c, B:43:0x0084, B:44:0x00a7, B:45:0x00ae, B:46:0x00af, B:47:0x00bd, B:48:0x00cb, B:13:0x001d, B:16:0x0027, B:19:0x0031, B:22:0x003b, B:25:0x0045), top: B:54:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object a(java.lang.Double r7, java.lang.Double r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.f.a(java.lang.Double, java.lang.Double, java.lang.String):java.lang.Object");
    }

    private Object a(List<Object> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private boolean a(double d10) {
        return (Double.isNaN(d10) || Double.isInfinite(d10) || d10 != Math.floor(d10)) ? false : true;
    }

    private double b(double d10) {
        return new BigDecimal(d10).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        String strA;
        Object objB;
        Object objA = a(list);
        if (obj instanceof com.mbridge.msdk.config.component.common.express.entities.a) {
            com.mbridge.msdk.config.component.common.express.entities.a aVar = (com.mbridge.msdk.config.component.common.express.entities.a) obj;
            strA = aVar.a();
            objB = aVar.b();
        } else {
            strA = "";
            objB = null;
        }
        if (TextUtils.isEmpty(strA)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (objB instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB;
            return a(aVar2, strA, str, aVar2.b(strA), objA);
        }
        if (objB instanceof Map) {
            Map map = (Map) objB;
            return a(map, strA, str, map.get(strA), objA);
        }
        if (objB instanceof List) {
            try {
                int i10 = Integer.parseInt(strA);
                if (i10 >= 0 && i10 < ((List) objB).size()) {
                    return a((List) objB, i10, str, ((List) objB).get(i10), objA);
                }
                q0.b("CompoundAssignOp", "List index out of bounds: " + strA + ", list size: " + ((List) objB).size());
            } catch (NumberFormatException unused) {
                q0.b("CompoundAssignOp", "Invalid list index: " + strA);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        String strTrim = str.trim();
        Iterator<String> it = f35836b.iterator();
        while (it.hasNext()) {
            if (strTrim.equals(it.next())) {
                return b(strTrim, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }
}
