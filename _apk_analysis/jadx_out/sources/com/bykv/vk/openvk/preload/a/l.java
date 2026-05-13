package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: SubBranchInterceptor.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, a> f11351d;

    /* JADX INFO: compiled from: SubBranchInterceptor.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<h> f11352a = new ArrayList();

        public final a a(h hVar) {
            this.f11352a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.f11352a.addAll(list);
            return this;
        }
    }

    /* JADX INFO: compiled from: SubBranchInterceptor.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, a> f11353a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f11354b;

        public final h a(Class<? extends l> cls) {
            return h.a.a().a(cls).a(this.f11353a).a(this.f11354b).b();
        }

        public final a a(String str) {
            if (this.f11353a.containsKey(str)) {
                throw new IllegalArgumentException("duplicated branch name");
            }
            a aVar = new a();
            this.f11353a.put(str, aVar);
            return aVar;
        }
    }

    public static boolean a(List<h> list) {
        return !list.isEmpty() && list.get(list.size() - 1).f11339a == f.class;
    }

    public final Map<String, a> a() {
        return this.f11351d;
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr == null || objArr.length != 1 || (obj = objArr[0]) == null) {
            throw new IllegalStateException("args error");
        }
        try {
            this.f11351d = (Map) obj;
        } catch (ClassCastException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
