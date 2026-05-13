package com.ironsource;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3976d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private List<String> f31173a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private List<String> f31174b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private List<String> f31175c = new ArrayList();

    @Nullable
    public final List<String> a() {
        return this.f31175c;
    }

    public final void a(@Nullable List<String> list) {
        this.f31175c = list;
    }

    @Nullable
    public final List<String> b() {
        return this.f31174b;
    }

    public final void b(@Nullable List<String> list) {
        this.f31174b = list;
    }

    @Nullable
    public final List<String> c() {
        return this.f31173a;
    }

    public final void c(@Nullable List<String> list) {
        this.f31173a = list;
    }
}
