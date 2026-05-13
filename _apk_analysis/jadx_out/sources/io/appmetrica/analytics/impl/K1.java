package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.impl.K1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5059qa f65457a = new C5059qa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f65458b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f65459c = new LinkedHashMap();

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data != null && tn.p.f(data.getPath(), "/client")) {
            try {
                String queryParameter = data.getQueryParameter("pid");
                tn.p.h(queryParameter);
                return Integer.parseInt(queryParameter);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public static final boolean a(K1 k12, Intent intent) {
        Collection collection;
        k12.getClass();
        return tn.p.f("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && ((collection = (Collection) k12.f65457a.f67572a.get("io.appmetrica.analytics.IAppMetricaService")) == null || collection.size() == 0);
    }

    public static final boolean b(K1 k12, Intent intent) {
        Collection collection;
        k12.getClass();
        return tn.p.f("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && (collection = (Collection) k12.f65457a.f67572a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    public static final boolean c(K1 k12, Intent intent) {
        k12.getClass();
        return tn.p.f("io.appmetrica.analytics.IAppMetricaService", intent.getAction());
    }

    public final void a() {
    }

    public final void a(@NotNull Intent intent, int i10) {
    }

    public final void a(@NotNull Intent intent, int i10, int i11) {
    }

    public final void a(@NotNull Configuration configuration) {
    }

    public final void a(@NotNull J1 j12) {
        this.f65459c.put(j12, new I1() { // from class: mh.i
            @Override // io.appmetrica.analytics.impl.I1
            public final boolean a(Intent intent) {
                return K1.a(this.f74267a, intent);
            }
        });
    }

    public final void b() {
    }

    public final void b(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f65457a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f65458b.entrySet()) {
                J1 j12 = (J1) entry.getKey();
                if (((I1) entry.getValue()).a(intent)) {
                    j12.a(intent);
                }
            }
        }
    }

    public final void b(@NotNull J1 j12) {
        this.f65458b.put(j12, new I1() { // from class: mh.g
            @Override // io.appmetrica.analytics.impl.I1
            public final boolean a(Intent intent) {
                return K1.b(this.f74263a, intent);
            }
        });
    }

    public final void c(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f65457a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f65458b.entrySet()) {
                J1 j12 = (J1) entry.getKey();
                if (((I1) entry.getValue()).a(intent)) {
                    j12.a(intent);
                }
            }
        }
    }

    public final void c(@NotNull J1 j12) {
        this.f65458b.put(j12, new I1() { // from class: mh.h
            @Override // io.appmetrica.analytics.impl.I1
            public final boolean a(Intent intent) {
                return K1.c(this.f74264a, intent);
            }
        });
    }

    public final void d(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                C5059qa c5059qa = this.f65457a;
                Integer numValueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) c5059qa.f67572a.get(action);
                if (collection != null && collection.remove(numValueOf)) {
                    if (collection.isEmpty() && c5059qa.f67573b) {
                        c5059qa.f67572a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f65459c.entrySet()) {
                J1 j12 = (J1) entry.getKey();
                if (((I1) entry.getValue()).a(intent)) {
                    j12.a(intent);
                }
            }
        }
    }
}
