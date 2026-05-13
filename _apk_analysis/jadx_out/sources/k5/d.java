package k5;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HlsPlaylist.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d implements b5.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f72959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f72960c;

    public d(String str, List<String> list, boolean z10) {
        this.f72958a = str;
        this.f72959b = Collections.unmodifiableList(list);
        this.f72960c = z10;
    }
}
