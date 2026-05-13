package com.google.android.exoplayer.upstream;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.upstream.a;
import y5.q;

/* JADX INFO: compiled from: DefaultDataSourceFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements a.InterfaceC0296a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final q f21064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.InterfaceC0296a f21065c;

    public c(Context context, a.InterfaceC0296a interfaceC0296a) {
        this(context, (q) null, interfaceC0296a);
    }

    public c(Context context, String str) {
        this(context, str, (q) null);
    }

    public c(Context context, String str, @Nullable q qVar) {
        this(context, qVar, new e(str, qVar));
    }

    public c(Context context, @Nullable q qVar, a.InterfaceC0296a interfaceC0296a) {
        this.f21063a = context.getApplicationContext();
        this.f21064b = qVar;
        this.f21065c = interfaceC0296a;
    }

    @Override // com.google.android.exoplayer.upstream.a.InterfaceC0296a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b createDataSource() {
        b bVar = new b(this.f21063a, this.f21065c.createDataSource());
        q qVar = this.f21064b;
        if (qVar != null) {
            bVar.b(qVar);
        }
        return bVar;
    }
}
