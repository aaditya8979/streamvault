package i5;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: AdaptationSet.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<i> f63732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<d> f63733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<d> f63734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<d> f63735f;

    public a(int i10, int i11, List<i> list, List<d> list2, List<d> list3, List<d> list4) {
        this.f63730a = i10;
        this.f63731b = i11;
        this.f63732c = Collections.unmodifiableList(list);
        this.f63733d = Collections.unmodifiableList(list2);
        this.f63734e = Collections.unmodifiableList(list3);
        this.f63735f = Collections.unmodifiableList(list4);
    }
}
