package com.mbridge.msdk.config.component.mat;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class MatCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<Map<String, Object>> f36229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f36230i;

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f35756f = "920001";
        Object obj = map.get("expression");
        if (obj instanceof List) {
            this.f36229h = (ArrayList) obj;
        }
        this.f36230i = new d();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0016 A[SYNTHETIC] */
    @Override // com.mbridge.msdk.config.component.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r8 = this;
            super.d()
            java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> r0 = r8.f36229h
            if (r0 == 0) goto L8c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            goto L8c
        Lf:
            r0 = 0
            java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> r1 = r8.f36229h
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r1.next()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "condition"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "expression"
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "can_continue"
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.mbridge.msdk.config.component.common.express.d r5 = r8.f36230i
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a r6 = r8.f35754d
            java.lang.Object r3 = r5.a(r3, r6)
            boolean r5 = r3 instanceof java.lang.Integer
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L57
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != r6) goto L66
            goto L67
        L57:
            boolean r5 = r3 instanceof java.lang.String
            if (r5 == 0) goto L66
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "1"
            boolean r6 = r3.equals(r5)
            goto L67
        L66:
            r6 = r7
        L67:
            if (r6 == 0) goto L16
            com.mbridge.msdk.config.component.common.express.d r0 = r8.f36230i
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a r3 = r8.f35754d
            java.lang.Object r0 = r0.a(r4, r3)
            java.lang.String r3 = "N"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L16
        L79:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "data"
            r1.put(r2, r0)
            java.lang.String r0 = "920002"
            com.mbridge.msdk.config.component.base.b r0 = r8.a(r0, r1)
            r8.a(r0)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.mat.MatCpt.d():void");
    }
}
