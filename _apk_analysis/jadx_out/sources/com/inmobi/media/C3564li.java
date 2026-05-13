package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3564li {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27575a;

    public C3564li(int i10) {
        this.f27575a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3564li) && this.f27575a == ((C3564li) obj).f27575a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27575a);
    }

    public final String toString() {
        return "RenderViewTelemetryData(maxTemplateEvents=" + this.f27575a + ")";
    }
}
