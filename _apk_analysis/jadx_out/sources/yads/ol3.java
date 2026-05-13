package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ol3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f93280a;

    public ol3(ArrayList arrayList) {
        this.f93280a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ol3) && tn.p.f(this.f93280a, ((ol3) obj).f93280a);
    }

    public final int hashCode() {
        return this.f93280a.hashCode();
    }

    public final String toString() {
        return "ViewableImpression(viewableUrls=" + this.f93280a + ")";
    }
}
