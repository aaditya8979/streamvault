package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3901z6 extends C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f28625a;

    public C3901z6(short s10) {
        this.f28625a = s10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3901z6) && this.f28625a == ((C3901z6) obj).f28625a;
    }

    public final int hashCode() {
        return Short.hashCode(this.f28625a);
    }

    public final String toString() {
        return "Failure(errorCode=" + ((int) this.f28625a) + ")";
    }
}
