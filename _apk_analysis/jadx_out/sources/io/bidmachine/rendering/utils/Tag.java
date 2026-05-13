package io.bidmachine.rendering.utils;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class Tag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f70966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f70967b;

    public Tag(@NonNull String str) {
        this.f70966a = str;
    }

    @NonNull
    public String toString() {
        if (this.f70967b == null) {
            this.f70967b = this.f70966a + " @" + Integer.toHexString(hashCode());
        }
        return this.f70967b;
    }
}
