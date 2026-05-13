package com.bytedance.adsdk.vt.fkw;

import android.graphics.Rect;
import com.bytedance.adsdk.vt.lh.lh.fkw;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public final class qbp {

    /* JADX INFO: renamed from: com.bytedance.adsdk.vt.fkw.qbp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[fkw.vt.values().length];
            ouw = iArr;
            try {
                iArr[fkw.vt.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[fkw.vt.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.adsdk.vt.lh.lh.fkw ouw(android.util.JsonReader r40, com.bytedance.adsdk.vt.ra r41) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.fkw.qbp.ouw(android.util.JsonReader, com.bytedance.adsdk.vt.ra):com.bytedance.adsdk.vt.lh.lh.fkw");
    }

    public static com.bytedance.adsdk.vt.lh.lh.fkw ouw(com.bytedance.adsdk.vt.ra raVar) {
        Rect rect = raVar.bly;
        return new com.bytedance.adsdk.vt.lh.lh.fkw(Collections.emptyList(), raVar, "__container", -1L, fkw.ouw.PRE_COMP, -1L, null, Collections.emptyList(), new com.bytedance.adsdk.vt.lh.ouw.ryl(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), fkw.vt.NONE, null, false, null, null);
    }
}
