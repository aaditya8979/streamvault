package com.bytedance.adsdk.vt.yu;

import androidx.multidex.MultiDexExtractor;

/* JADX INFO: loaded from: classes4.dex */
public enum lh {
    JSON(".json"),
    ZIP(MultiDexExtractor.EXTRACTED_SUFFIX);


    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final String f12203lh;

    lh(String str) {
        this.f12203lh = str;
    }

    public final String ouw() {
        return ".temp" + this.f12203lh;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12203lh;
    }
}
