package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f91133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f91134c;

    public j93(int i10, String str, ArrayList arrayList, byte[] bArr) {
        this.f91132a = str;
        this.f91133b = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.f91134c = bArr;
    }
}
