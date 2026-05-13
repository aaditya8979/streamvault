package yads;

import com.yandex.mobile.ads.common.AdError;

/* JADX INFO: loaded from: classes12.dex */
public final class wp3 implements AdError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96473a;

    public wp3(String str) {
        this.f96473a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wp3) && tn.p.f(this.f96473a, ((wp3) obj).f96473a);
    }

    @Override // com.yandex.mobile.ads.common.AdError
    public final String getDescription() {
        return this.f96473a;
    }

    public final int hashCode() {
        return this.f96473a.hashCode();
    }

    public final String toString() {
        return "YandexAdError(description=" + this.f96473a + ")";
    }
}
