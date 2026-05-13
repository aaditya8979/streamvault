package com.bytedance.sdk.component.fkw.fkw;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class le extends ouw {
    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "disk_cache";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        byte[] bArrOuw;
        String str = lhVar.f12540lh;
        lhVar.jqy.vt(lhVar.f12545tc);
        Collection<com.bytedance.sdk.component.fkw.lh> collectionOuw = lhVar.jqy.ouw();
        if (collectionOuw != null) {
            Iterator<com.bytedance.sdk.component.fkw.lh> it = collectionOuw.iterator();
            while (it.hasNext()) {
                bArrOuw = it.next().ouw(str);
                if (bArrOuw != null) {
                    break;
                }
            }
            bArrOuw = null;
        } else {
            bArrOuw = null;
        }
        if (bArrOuw == null) {
            lhVar.ouw(new cf());
        } else {
            lhVar.ouw(new vt(bArrOuw, null));
            lhVar.jqy.ouw(lhVar.f12545tc).ouw(str, bArrOuw);
        }
    }
}
