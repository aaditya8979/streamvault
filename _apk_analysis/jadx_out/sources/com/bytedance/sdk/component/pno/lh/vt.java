package com.bytedance.sdk.component.pno.lh;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vt implements Comparable<vt>, Runnable {
    public long fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public long f12760le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12761lh;
    private Runnable ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public long f12762ra;
    public String yu;

    public vt(int i10, String str) {
        this.f12761lh = i10;
        this.yu = str;
    }

    public vt(String str) {
        this.f12761lh = 5;
        this.yu = str;
    }

    public vt(String str, Runnable runnable) {
        this.f12761lh = 5;
        this.yu = str;
        this.ouw = runnable;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(vt vtVar) {
        int i10 = this.f12761lh;
        int i11 = vtVar.f12761lh;
        if (i10 < i11) {
            return 1;
        }
        return i10 >= i11 ? -1 : 0;
    }

    public final Runnable ouw() {
        return this.ouw;
    }
}
