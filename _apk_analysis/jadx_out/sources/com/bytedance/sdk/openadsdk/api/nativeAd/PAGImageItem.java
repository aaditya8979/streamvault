package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: loaded from: classes2.dex */
public class PAGImageItem {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final String f13079lh;
    private final int ouw;
    private final int vt;
    private float yu;

    public PAGImageItem(int i10, int i11, String str) {
        this(i10, i11, str, 0.0f);
    }

    public PAGImageItem(int i10, int i11, String str, float f10) {
        this.ouw = i10;
        this.vt = i11;
        this.f13079lh = str;
        this.yu = f10;
    }

    public float getDuration() {
        return this.yu;
    }

    public int getHeight() {
        return this.ouw;
    }

    public String getImageUrl() {
        return this.f13079lh;
    }

    public int getWidth() {
        return this.vt;
    }
}
