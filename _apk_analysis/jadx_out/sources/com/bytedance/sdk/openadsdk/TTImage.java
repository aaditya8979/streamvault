package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes3.dex */
public class TTImage {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final String f12860lh;
    private final int ouw;
    private final int vt;
    private double yu;

    public TTImage(int i10, int i11, String str) {
        this(i10, i11, str, 0.0d);
    }

    public TTImage(int i10, int i11, String str, double d10) {
        this.ouw = i10;
        this.vt = i11;
        this.f12860lh = str;
        this.yu = d10;
    }

    public double getDuration() {
        return this.yu;
    }

    public int getHeight() {
        return this.ouw;
    }

    public String getImageUrl() {
        return this.f12860lh;
    }

    public int getWidth() {
        return this.vt;
    }

    public boolean isValid() {
        String str;
        return this.ouw > 0 && this.vt > 0 && (str = this.f12860lh) != null && str.length() > 0;
    }
}
