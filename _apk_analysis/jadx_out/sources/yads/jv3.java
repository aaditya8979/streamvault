package yads;

import com.yandex.mobile.ads.common.VideoEventListener;

/* JADX INFO: loaded from: classes10.dex */
public final class jv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VideoEventListener f91395a;

    public jv3(VideoEventListener videoEventListener) {
        this.f91395a = videoEventListener;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jv3) && tn.p.f(((jv3) obj).f91395a, this.f91395a);
    }

    public final int hashCode() {
        return this.f91395a.hashCode();
    }
}
