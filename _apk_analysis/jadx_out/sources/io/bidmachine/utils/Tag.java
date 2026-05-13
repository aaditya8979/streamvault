package io.bidmachine.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class Tag {

    @NonNull
    private final String name;

    @Nullable
    private String tag;

    public Tag(@NonNull String str) {
        this.name = str;
    }

    @NonNull
    public String toString() {
        if (this.tag == null) {
            this.tag = this.name + " @" + Integer.toHexString(hashCode());
        }
        return this.tag;
    }
}
