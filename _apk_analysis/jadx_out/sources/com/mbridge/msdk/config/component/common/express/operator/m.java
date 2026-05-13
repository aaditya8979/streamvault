package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: OperatorSQL.java */
/* JADX INFO: loaded from: classes9.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f35852b = Arrays.asList("sqlNew", "select", TypedValues.TransitionType.S_FROM, "where", "sqlAnd", "sqlOr", "orderBy", "groupBy", "delete", "update", "insert", "limit");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f35853a;

    public m(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f35853a = cVar;
    }

    private Object a() {
        return new StringBuilder(" delete ");
    }

    private Object a(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" and (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f30794r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        sb2.append(" )");
        return sb2.toString();
    }

    private String a(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("'", "''");
    }

    private Object b() {
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new String());
    }

    private Object b(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" from");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f30794r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    private Object c(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" group by");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f30794r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[PHI: r6
      0x0030: PHI (r6v3 java.lang.String) = (r6v2 java.lang.String), (r6v7 java.lang.String) binds: [B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object d(java.lang.String r5, java.lang.Object r6, java.util.List<java.lang.Object> r7) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.m.d(java.lang.String, java.lang.Object, java.util.List):java.lang.Object");
    }

    private Object e(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" limit");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f30794r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    private Object f(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" or (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f30794r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        sb2.append(" )");
        return sb2.toString();
    }

    private Object g(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" order by");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f30794r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a h(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        try {
            switch (str) {
                case "sqlNew":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b());
                case "select":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(j(str, obj, list));
                case "from":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b(str, obj, list));
                case "where":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(l(str, obj, list));
                case "sqlAnd":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(str, obj, list));
                case "sqlOr":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(f(str, obj, list));
                case "orderBy":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(g(str, obj, list));
                case "groupBy":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(c(str, obj, list));
                case "delete":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a());
                case "update":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(k(str, obj, list));
                case "insert":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(d(str, obj, list));
                case "limit":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(e(str, obj, list));
                default:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
        } catch (Exception e10) {
            q0.b("SQLOperator", e10.getMessage(), e10);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private Object j(String str, Object obj, List<Object> list) {
        if (list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder("select");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f30794r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[PHI: r5
      0x0030: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v11 java.lang.String) binds: [B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object k(java.lang.String r4, java.lang.Object r5, java.util.List<java.lang.Object> r6) {
        /*
            r3 = this;
            r4 = 0
            if (r5 == 0) goto L85
            if (r6 != 0) goto L7
            goto L85
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.<init>(r5)
            java.lang.String r5 = ""
            int r1 = r6.size()
            r2 = 2
            if (r1 != r2) goto L30
            r1 = 0
            java.lang.Object r1 = r6.get(r1)
            if (r1 == 0) goto L24
            java.lang.String r5 = java.lang.String.valueOf(r1)
        L24:
            r1 = 1
            java.lang.Object r6 = r6.get(r1)
            boolean r1 = r6 instanceof java.util.Map
            if (r1 == 0) goto L30
            java.util.Map r6 = (java.util.Map) r6
            goto L31
        L30:
            r6 = r4
        L31:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L80
            if (r6 != 0) goto L3a
            goto L80
        L3a:
            java.lang.String r4 = "update "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = " set"
            r0.append(r4)
            java.util.Set r4 = r6.keySet()
            java.util.Iterator r4 = r4.iterator()
        L4f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7b
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r1 = " "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r5 = r6.get(r5)
            r0.append(r5)
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.String r5 = ","
            r0.append(r5)
            goto L4f
        L7b:
            java.lang.String r4 = r0.toString()
            return r4
        L80:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r4 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r4)
            return r4
        L85:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r4 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.m.k(java.lang.String, java.lang.Object, java.util.List):java.lang.Object");
    }

    private Object l(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" where");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f30794r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a i(String str, Object obj, List<Object> list) {
        Iterator<String> it = f35852b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return h(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }
}
