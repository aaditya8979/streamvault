package com.bytedance.sdk.component.fkw.yu.vt;

/* JADX INFO: loaded from: classes8.dex */
public final class lh implements le {
    private static void ouw(com.bytedance.sdk.component.fkw.vt vtVar, com.bytedance.sdk.component.fkw.yu.lh.le leVar, String str, byte[] bArr) {
        if (vtVar == null || !vtVar.le()) {
            return;
        }
        leVar.vt(vtVar).ouw(str, bArr);
    }

    private byte[] ouw(final com.bytedance.sdk.component.fkw.yu.lh.le leVar, com.bytedance.sdk.component.fkw.yu.lh.lh lhVar, com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar) {
        if (leVar.yu == null) {
            com.bytedance.sdk.component.fkw.yu yuVarYu = leVar.vt.yu();
            if (yuVarYu == null) {
                yuVarYu = new com.bytedance.sdk.component.fkw.vt.ouw();
            }
            leVar.yu = yuVarYu;
        }
        com.bytedance.sdk.component.fkw.yu yuVar = leVar.yu;
        lhVar.zih = false;
        try {
            com.bytedance.sdk.component.fkw.le leVarOuw = yuVar.ouw(new com.bytedance.sdk.component.fkw.vt.vt(lhVar.ouw, false, false, lhVar.ex));
            if (leVarOuw == null) {
                ouwVar.ouw(1004, "call is empty", new Exception("call is empty"));
                return null;
            }
            int iVt = leVarOuw.vt();
            if (iVt != 200) {
                Object objLh = leVarOuw.lh();
                ouwVar.ouw(iVt, leVarOuw.yu(), objLh instanceof Throwable ? (Throwable) objLh : null);
                return null;
            }
            final byte[] bArr = (byte[]) leVarOuw.lh();
            if (bArr == null) {
                ouwVar.ouw(iVt, leVarOuw.yu(), new Exception("net data is empty"));
                return null;
            }
            ouw(lhVar.zin, leVar, lhVar.f12604lh, bArr);
            final com.bytedance.sdk.component.fkw.vt vtVar = lhVar.zin;
            final String str = lhVar.f12604lh;
            if (vtVar != null && vtVar.ra()) {
                leVar.vt().submit(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.vt.lh.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        leVar.lh(vtVar).ouw(str, bArr);
                    }
                });
            }
            return bArr;
        } catch (Throwable th2) {
            ouwVar.ouw(1004, "net request failed!", th2);
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final String ouw() {
        return "data_intercept";
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ouw(com.bytedance.sdk.component.fkw.yu.lh.lh r19, com.bytedance.sdk.component.fkw.th r20, com.bytedance.sdk.component.fkw.yu.lh.ouw r21) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.fkw.yu.vt.lh.ouw(com.bytedance.sdk.component.fkw.yu.lh.lh, com.bytedance.sdk.component.fkw.th, com.bytedance.sdk.component.fkw.yu.lh.ouw):boolean");
    }
}
