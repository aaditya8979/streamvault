package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.e0;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes8.dex */
public class d0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f7971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f7972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f7973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private StringBuffer f7974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f7975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ExecutorService f7976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f7977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f7978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f7979o;

    public class a implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7980a;

        public a(String str) {
            this.f7980a = str;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f7903a.a(x4.T0)).booleanValue()) {
                    synchronized (d0.this.f7975k) {
                        StringUtils.replaceAll(d0.this.f7974j, this.f7980a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f7974j, this.f7980a, uri.toString());
                }
                d0.this.f7971g.a(uri.toString(), this.f7980a);
                return;
            }
            com.applovin.impl.sdk.o oVar = d0.this.f7905c;
            if (com.applovin.impl.sdk.o.a()) {
                d0 d0Var = d0.this;
                d0Var.f7905c.a(d0Var.f7904b, "Failed to cache JavaScript resource " + this.f7980a);
            }
            if (d0.this.f7973i != null) {
                d0.this.f7973i.a(d0.this.f7970f, true);
            }
        }
    }

    public class b implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f7983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f7984c;

        public b(String str, String str2, String str3) {
            this.f7982a = str;
            this.f7983b = str2;
            this.f7984c = str3;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f7903a.a(x4.T0)).booleanValue()) {
                    synchronized (d0.this.f7975k) {
                        StringUtils.replaceAll(d0.this.f7974j, this.f7982a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f7974j, this.f7982a, uri.toString());
                }
                d0.this.f7971g.a(uri.toString(), this.f7982a);
                return;
            }
            if (!d0.this.f7971g.Q().contains(this.f7983b + this.f7984c) || d0.this.f7973i == null) {
                return;
            }
            d0.this.f7973i.a(d0.this.f7970f, true);
        }
    }

    public interface c {
        void a(String str, boolean z10);
    }

    public d0(String str, com.applovin.impl.sdk.ad.b bVar, List list, ExecutorService executorService, String str2, com.applovin.impl.sdk.k kVar, c cVar) {
        super("AsyncTaskCacheHTMLResources", kVar);
        this.f7970f = str;
        this.f7971g = bVar;
        this.f7972h = list;
        this.f7976l = executorService;
        this.f7977m = str2;
        this.f7973i = cVar;
        this.f7974j = new StringBuffer(str);
        this.f7975k = new Object();
    }

    private void a(String str) {
        c cVar;
        if (this.f7907e.get() || (cVar = this.f7973i) == null) {
            return;
        }
        cVar.a(str, false);
    }

    private void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f7976l.submit((e0) it.next()));
        }
        this.f7979o = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((Future) it2.next()).get();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0017, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.HashSet d() {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d0.d():java.util.HashSet");
    }

    private HashSet e() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f7970f, (String) this.f7903a.a(x4.f10742h5)), 1)) {
            if (this.f7907e.get()) {
                return null;
            }
            if (StringUtils.isValidString(str)) {
                hashSet.add(new e0(str, this.f7971g, Collections.emptyList(), false, this.f7977m, this.f7903a, new a(str)));
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f7905c.a(this.f7904b, "Skip caching of non-resource " + str);
            }
        }
        return hashSet;
    }

    private Collection f() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f7903a.a(x4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws InterruptedException {
        HashSet hashSetE;
        if (this.f7907e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f7970f)) {
            a(this.f7970f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f7903a.a(x4.E0)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7905c.a(this.f7904b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f7970f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSetD = d();
        if (hashSetD != null) {
            hashSet.addAll(hashSetD);
        }
        if (((Boolean) this.f7903a.a(x4.f10733g5)).booleanValue() && (hashSetE = e()) != null) {
            hashSet.addAll(hashSetE);
        }
        this.f7978n = new ArrayList(hashSet);
        if (this.f7907e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f7978n;
        if (list == null || list.isEmpty()) {
            a(this.f7970f);
            return Boolean.FALSE;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7905c.a(this.f7904b, "Executing " + this.f7978n.size() + " caching operations...");
        }
        if (this.f7903a.q0().e()) {
            a(this.f7978n);
        } else {
            this.f7976l.invokeAll(this.f7978n);
        }
        if (((Boolean) this.f7903a.a(x4.T0)).booleanValue()) {
            synchronized (this.f7975k) {
                a(this.f7974j.toString());
            }
        } else {
            a(this.f7974j.toString());
        }
        return Boolean.TRUE;
    }

    public void c() {
        List list = this.f7978n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e0) it.next()).a(true);
            }
        }
        List<Future> list2 = this.f7979o;
        if (list2 != null) {
            for (Future future : list2) {
                if (!future.isDone()) {
                    future.cancel(true);
                }
            }
        }
    }
}
