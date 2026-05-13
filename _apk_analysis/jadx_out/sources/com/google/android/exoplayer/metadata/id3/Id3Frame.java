package com.google.android.exoplayer.metadata.id3;

import com.google.android.exoplayer.metadata.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20279b;

    public Id3Frame(String str) {
        this.f20279b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f20279b;
    }
}
