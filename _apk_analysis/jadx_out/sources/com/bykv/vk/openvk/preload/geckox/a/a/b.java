package com.bykv.vk.openvk.preload.geckox.a.a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: CachePolicy.java */
/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"CI_StaticFieldLeak"})
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f11386a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f11387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f11388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public File f11389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<String> f11390e;

    static {
        new f();
        f11387b = new e();
    }

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.f11388c = aVar;
        this.f11389d = file;
        this.f11390e = list;
    }
}
