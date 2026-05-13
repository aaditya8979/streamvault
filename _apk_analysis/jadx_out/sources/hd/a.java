package hd;

import android.content.Context;
import com.google.android.exoplayer.upstream.a;
import com.google.android.exoplayer.upstream.e;
import t.b;

/* JADX INFO: compiled from: Data2Source.java */
/* JADX INFO: loaded from: classes10.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f63485a;

    public a(Context context) {
        this.f63485a = context;
    }

    @Override // t.b
    public a.InterfaceC0296a a() {
        return new e(this.f63485a.getPackageName(), null, 8000, 8000, true);
    }
}
