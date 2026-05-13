package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes8.dex */
public final class ey extends ed {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ek f2035;

    public ey(ek ekVar, dm dmVar) {
        super(dmVar);
        this.f2035 = ekVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6189(du duVar, cq cqVar) {
        dr drVarM6222 = this.f2035.m6222(duVar, cqVar);
        duVar.m6185(this.f2035.m6239(), Integer.valueOf(drVarM6222.m6166().intValue() + 1));
        return drVarM6222;
    }
}
