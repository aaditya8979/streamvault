package s;

import a6.k0;
import android.content.Context;
import com.google.android.exoplayer.upstream.a;
import com.google.android.exoplayer.upstream.c;

/* JADX INFO: compiled from: JDefaultDataSourceFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements a.InterfaceC0296a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.InterfaceC0296a f78944b;

    public a(Context context) {
        String strB0 = k0.b0(context, context.getPackageName());
        this.f78943a = context.getApplicationContext();
        this.f78944b = new c(context, strB0);
    }

    @Override // com.google.android.exoplayer.upstream.a.InterfaceC0296a
    public com.google.android.exoplayer.upstream.a createDataSource() {
        return new com.google.android.exoplayer.upstream.b(this.f78943a, this.f78944b.createDataSource());
    }
}
