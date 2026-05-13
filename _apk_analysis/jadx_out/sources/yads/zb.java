package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f97448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f97449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f97450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f97451f;

    public zb(int i10, int i11, ArrayList arrayList, List list, List list2, List list3) {
        this.f97446a = i10;
        this.f97447b = i11;
        this.f97448c = Collections.unmodifiableList(arrayList);
        this.f97449d = Collections.unmodifiableList(list);
        this.f97450e = Collections.unmodifiableList(list2);
        this.f97451f = Collections.unmodifiableList(list3);
    }
}
