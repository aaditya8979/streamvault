package com.bytedance.sdk.component.fkw.yu.lh.ouw;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public final class vt implements com.bytedance.sdk.component.fkw.vt, Cloneable {
    private static volatile com.bytedance.sdk.component.fkw.vt bly;
    private boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private boolean f12623le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f12624lh;
    private long ouw;
    private File pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f12625ra;
    private int vt;
    private int yu;

    public vt(int i10, int i11, long j10, File file) {
        this(i10, i11, j10, i10 != 0, j10 != 0, file);
    }

    private vt(int i10, int i11, long j10, boolean z10, boolean z11, File file) {
        this.ouw = j10;
        this.vt = 0;
        this.f12624lh = i10;
        this.yu = i11;
        this.fkw = z10;
        this.f12623le = z11;
        this.pno = file;
        this.f12625ra = i11 != 0;
    }

    public static com.bytedance.sdk.component.fkw.vt bly() {
        return bly;
    }

    public static com.bytedance.sdk.component.fkw.vt ouw(File file) {
        long jOuw;
        int iLh;
        int iYu;
        file.mkdirs();
        if (bly == null) {
            iLh = 10;
            iYu = 14;
            jOuw = 20;
        } else {
            jOuw = bly.ouw();
            iLh = bly.lh();
            iYu = bly.yu();
        }
        return new vt(iLh, iYu, jOuw, file);
    }

    public static void ouw(Context context, com.bytedance.sdk.component.fkw.vt vtVar) {
        if (vtVar != null) {
            bly = vtVar;
        } else {
            bly = ouw(new File(context.getCacheDir(), "image"));
        }
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final boolean fkw() {
        return this.fkw;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final boolean le() {
        return this.f12625ra;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final int lh() {
        return this.f12624lh;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final long ouw() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final File pno() {
        return this.pno;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final boolean ra() {
        return this.f12623le;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final int vt() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final int yu() {
        return this.yu;
    }
}
