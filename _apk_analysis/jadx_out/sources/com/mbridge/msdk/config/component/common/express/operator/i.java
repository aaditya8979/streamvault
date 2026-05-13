package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: OperatorLogical.java */
/* JADX INFO: loaded from: classes10.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f35845a;

    public i(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f35845a = cVar;
    }

    private boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (!(obj instanceof String)) {
            return (obj instanceof Number) && ((Number) obj).intValue() == 1;
        }
        String str = (String) obj;
        return "1".equals(str) || "true".equalsIgnoreCase(str);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        boolean z10;
        boolean zA;
        boolean zA2;
        if (TextUtils.isEmpty(str) || !(str.contains("and") || str.contains("or") || str.contains("AND") || str.contains("OR"))) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        zA = (list == null || list.isEmpty()) ? false : a(list.get(0));
        zA2 = a(obj);
        switch (str) {
            case "OR":
            case "or":
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(zA2 || zA));
            case "AND":
            case "and":
                if (zA2 && zA) {
                    z10 = true;
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(z10));
            default:
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
    }
}
