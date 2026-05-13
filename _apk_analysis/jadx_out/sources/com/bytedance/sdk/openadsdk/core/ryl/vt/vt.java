package com.bytedance.sdk.openadsdk.core.ryl.vt;

import com.bytedance.sdk.openadsdk.core.ryl.vt.lh;

/* JADX INFO: loaded from: classes6.dex */
public final class vt extends lh implements Comparable<vt> {
    public final float ouw;

    public static class ouw {
        private final String ouw;
        private final float vt;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private lh.EnumC0242lh f13967lh = lh.EnumC0242lh.TRACKING_URL;
        private boolean yu = false;

        public ouw(String str, float f10) {
            this.ouw = str;
            this.vt = f10;
        }

        public final vt ouw() {
            return new vt(this.vt, this.ouw, this.f13967lh, Boolean.valueOf(this.yu), (byte) 0);
        }
    }

    private vt(float f10, String str, lh.EnumC0242lh enumC0242lh, Boolean bool) {
        super(str, enumC0242lh, bool);
        this.ouw = f10;
    }

    public /* synthetic */ vt(float f10, String str, lh.EnumC0242lh enumC0242lh, Boolean bool, byte b10) {
        this(f10, str, enumC0242lh, bool);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(vt vtVar) {
        vt vtVar2 = vtVar;
        if (vtVar2 == null) {
            return 1;
        }
        float f10 = this.ouw;
        float f11 = vtVar2.ouw;
        if (f10 > f11) {
            return 1;
        }
        return f10 < f11 ? -1 : 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ryl.vt.lh
    public final void ouw() {
        super.ouw();
    }

    public final String toString() {
        return super.toString();
    }
}
