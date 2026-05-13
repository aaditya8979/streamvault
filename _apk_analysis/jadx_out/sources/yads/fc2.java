package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class fc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f89531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f89532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f89533d;

    public fc2(String str, long j10, ArrayList arrayList, List list) {
        this.f89530a = str;
        this.f89531b = j10;
        this.f89532c = Collections.unmodifiableList(arrayList);
        this.f89533d = Collections.unmodifiableList(list);
    }
}
