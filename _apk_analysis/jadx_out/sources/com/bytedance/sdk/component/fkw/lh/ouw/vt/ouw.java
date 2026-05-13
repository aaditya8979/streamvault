package com.bytedance.sdk.component.fkw.lh.ouw.vt;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.fkw.zih;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw implements zih {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.fkw.lh.ouw.lh<String, Bitmap> f12578lh;
    private int ouw = Integer.MAX_VALUE;
    private int vt;

    public ouw(int i10) {
        this.vt = i10;
        this.f12578lh = new com.bytedance.sdk.component.fkw.lh.ouw.lh<String, Bitmap>(i10) { // from class: com.bytedance.sdk.component.fkw.lh.ouw.vt.ouw.1
            @Override // com.bytedance.sdk.component.fkw.lh.ouw.lh
            public final /* synthetic */ int vt(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                if (bitmap2 == null) {
                    return 0;
                }
                return bitmap2.getAllocationByteCount();
            }
        };
    }

    @Override // com.bytedance.sdk.component.fkw.ouw
    public final /* bridge */ /* synthetic */ Bitmap ouw(String str) {
        return this.f12578lh.ouw(str);
    }

    @Override // com.bytedance.sdk.component.fkw.ouw
    public final /* bridge */ /* synthetic */ boolean ouw(String str, Bitmap bitmap) {
        String str2 = str;
        Bitmap bitmap2 = bitmap;
        if (str2 == null || bitmap2 == null) {
            return false;
        }
        this.f12578lh.ouw(str2, bitmap2);
        return true;
    }

    @Override // com.bytedance.sdk.component.fkw.ouw
    public final /* synthetic */ boolean vt(String str) {
        return this.f12578lh.ouw(str) != null;
    }
}
