package io.ktor.util;

import io.ktor.util.Platform;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: PlatformUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f71213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f71214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f71215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f71216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f71217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f71218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f71219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f71220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f71221i;

    static {
        a aVar = new a();
        f71213a = aVar;
        Platform platformA = b.a(aVar);
        boolean z10 = false;
        f71214b = !(platformA instanceof Platform.a) ? !((platformA instanceof Platform.d) && ((Platform.d) platformA).a() == Platform.JsPlatform.Browser) : ((Platform.a) platformA).a() != Platform.JsPlatform.Browser;
        Platform platformA2 = b.a(aVar);
        if (!(platformA2 instanceof Platform.a) ? !(!(platformA2 instanceof Platform.d) || ((Platform.d) platformA2).a() != Platform.JsPlatform.Node) : ((Platform.a) platformA2).a() == Platform.JsPlatform.Node) {
            z10 = true;
        }
        f71215c = z10;
        f71216d = b.a(aVar) instanceof Platform.a;
        f71217e = b.a(aVar) instanceof Platform.d;
        f71218f = p.f(b.a(aVar), Platform.b.f71210a);
        f71219g = p.f(b.a(aVar), Platform.c.f71211a);
        f71220h = b.b(aVar);
        f71221i = true;
    }

    public final boolean a() {
        return f71214b;
    }

    public final boolean b() {
        return f71220h;
    }
}
