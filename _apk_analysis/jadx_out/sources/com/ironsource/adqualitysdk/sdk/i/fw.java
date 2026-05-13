package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class fw extends fr {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ek f2130;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private fk f2131;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private fk f2132;

    public fw(fk fkVar, fk fkVar2, ek ekVar) {
        this.f2132 = fkVar;
        this.f2131 = fkVar2;
        this.f2130 = ekVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fw.class == obj.getClass()) {
            fw fwVar = (fw) obj;
            fk fkVar = this.f2132;
            if (fkVar == null ? fwVar.f2132 != null : !fkVar.equals(fwVar.f2132)) {
                return false;
            }
            fk fkVar2 = this.f2131;
            if (fkVar2 == null ? fwVar.f2131 != null : !fkVar2.equals(fwVar.f2131)) {
                return false;
            }
            ek ekVar = this.f2130;
            ek ekVar2 = fwVar.f2130;
            if (ekVar != null) {
                return ekVar.equals(ekVar2);
            }
            if (ekVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        fk fkVar = this.f2132;
        int iHashCode = (fkVar != null ? fkVar.hashCode() : 0) * 31;
        fk fkVar2 = this.f2131;
        int iHashCode2 = (iHashCode + (fkVar2 != null ? fkVar2.hashCode() : 0)) * 31;
        ek ekVar = this.f2130;
        return iHashCode2 + (ekVar != null ? ekVar.hashCode() : 0);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ */
    public final dr mo6263(du duVar, cq cqVar) {
        try {
            fk fkVar = this.f2132;
            if (fkVar != null) {
                return fkVar.mo6263(new du(duVar), cqVar);
            }
        } catch (Throwable th2) {
            if (this.f2131 != null) {
                HashMap map = new HashMap();
                ek ekVar = this.f2130;
                if (ekVar != null) {
                    map.put(dz.m6209(ekVar.m6239()), th2);
                }
                return this.f2131.mo6263(new du(map, duVar), cqVar);
            }
        }
        return new dr(null);
    }
}
