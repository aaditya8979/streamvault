package com.bytedance.adsdk.ouw.vt.lh.ouw;

import com.bytedance.adsdk.ouw.vt.vt.ouw.ko;
import java.util.Deque;

/* JADX INFO: loaded from: classes3.dex */
public final class ra extends le {
    @Override // com.bytedance.adsdk.ouw.vt.lh.ouw.le
    public final int ouw(String str, int i10, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar) {
        boolean zVt;
        char cOuw;
        boolean z10 = false;
        if ('-' != le.ouw(i10, str)) {
            zVt = com.bytedance.adsdk.ouw.vt.fkw.ouw.vt(le.ouw(i10, str));
        } else if (deque.peek() != null && !com.bytedance.adsdk.ouw.vt.yu.lh.ouw(deque.peek().ouw())) {
            zVt = false;
        } else {
            if (!com.bytedance.adsdk.ouw.vt.fkw.ouw.vt(le.ouw(i10 + 1, str))) {
                throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i10));
            }
            zVt = true;
        }
        if (!zVt) {
            return ouwVar.ouw(str, i10, deque);
        }
        int i11 = le.ouw(i10, str) == '-' ? i10 + 1 : i10;
        while (true) {
            cOuw = le.ouw(i11, str);
            if (!com.bytedance.adsdk.ouw.vt.fkw.ouw.vt(cOuw) && (z10 || cOuw != '.')) {
                break;
            }
            i11++;
            if (cOuw == '.') {
                z10 = true;
            }
        }
        if (cOuw != '.') {
            deque.push(new ko(str.substring(i10, i11)));
            return i11;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i10, i11));
    }
}
