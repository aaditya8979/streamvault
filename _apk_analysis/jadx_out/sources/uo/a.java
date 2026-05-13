package uo;

import cn.w;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f85731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public List<? extends Annotation> f85732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<String> f85733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Set<String> f85734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<SerialDescriptor> f85735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<List<Annotation>> f85736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<Boolean> f85737g;

    public a(@NotNull String str) {
        p.k(str, "serialName");
        this.f85731a = str;
        this.f85732b = w.m();
        this.f85733c = new ArrayList();
        this.f85734d = new HashSet();
        this.f85735e = new ArrayList();
        this.f85736f = new ArrayList();
        this.f85737g = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(a aVar, String str, SerialDescriptor serialDescriptor, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = w.m();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.a(str, serialDescriptor, list, z10);
    }

    public final void a(@NotNull String str, @NotNull SerialDescriptor serialDescriptor, @NotNull List<? extends Annotation> list, boolean z10) {
        p.k(str, "elementName");
        p.k(serialDescriptor, "descriptor");
        p.k(list, "annotations");
        if (this.f85734d.add(str)) {
            this.f85733c.add(str);
            this.f85735e.add(serialDescriptor);
            this.f85736f.add(list);
            this.f85737g.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + this.f85731a).toString());
    }

    @NotNull
    public final List<Annotation> c() {
        return this.f85732b;
    }

    @NotNull
    public final List<List<Annotation>> d() {
        return this.f85736f;
    }

    @NotNull
    public final List<SerialDescriptor> e() {
        return this.f85735e;
    }

    @NotNull
    public final List<String> f() {
        return this.f85733c;
    }

    @NotNull
    public final List<Boolean> g() {
        return this.f85737g;
    }

    public final void h(@NotNull List<? extends Annotation> list) {
        p.k(list, "<set-?>");
        this.f85732b = list;
    }
}
