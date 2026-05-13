package com.ironsource.adqualitysdk.sdk.i;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes8.dex */
public abstract class el extends eg {
    public el(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6189(du duVar, cq cqVar) {
        Object objM6165 = m6232().m6222(duVar, cqVar).m6165();
        Object objM61652 = m6233().m6222(duVar, cqVar).m6165();
        try {
            return new dr(Boolean.valueOf(mo6240(new BigDecimal(objM6165.toString()).compareTo(new BigDecimal(objM61652.toString())))));
        } catch (Exception unused) {
            return ((objM6165 instanceof String) && (objM61652 instanceof String)) ? new dr(Boolean.valueOf(mo6242((String) objM6165, (String) objM61652))) : new dr(Boolean.valueOf(mo6241(objM6165, objM61652)));
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo6240(int i10);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo6241(Object obj, Object obj2);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo6242(String str, String str2);
}
