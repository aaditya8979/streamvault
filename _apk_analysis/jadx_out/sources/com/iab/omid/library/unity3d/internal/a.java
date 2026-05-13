package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.unity3d.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f24829f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.unity3d.utils.f f24830a = new com.iab.omid.library.unity3d.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f24831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f24833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24834e;

    private a(d dVar) {
        this.f24833d = dVar;
    }

    public static a a() {
        return f24829f;
    }

    private void c() {
        if (!this.f24832c || this.f24831b == null) {
            return;
        }
        Iterator<com.iab.omid.library.unity3d.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.f24832c) {
            return;
        }
        this.f24833d.a(context);
        this.f24833d.a(this);
        this.f24833d.e();
        this.f24834e = this.f24833d.c();
        this.f24832c = true;
    }

    @Override // com.iab.omid.library.unity3d.internal.d.a
    public void a(boolean z10) {
        if (!this.f24834e && z10) {
            d();
        }
        this.f24834e = z10;
    }

    public Date b() {
        Date date = this.f24831b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f24830a.a();
        Date date = this.f24831b;
        if (date == null || dateA.after(date)) {
            this.f24831b = dateA;
            c();
        }
    }
}
