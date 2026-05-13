package com.google.android.exoplayer2;

import android.os.Bundle;

/* JADX INFO: compiled from: Bundleable.java */
/* JADX INFO: loaded from: classes2.dex */
public interface f {

    /* JADX INFO: compiled from: Bundleable.java */
    public interface a<T extends f> {
        T fromBundle(Bundle bundle);
    }

    Bundle toBundle();
}
