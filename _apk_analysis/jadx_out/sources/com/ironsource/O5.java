package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes8.dex */
public class O5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30038e = "EventsTracker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4215q7 f30039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private I5 f30040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private J7 f30041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f30042d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30043a;

        public a(String str) {
            this.f30043a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Gd gd2 = new Gd();
                ArrayList<Pair<String, String>> arrayListD = O5.this.f30040b.d();
                if ("POST".equals(O5.this.f30040b.e())) {
                    gd2 = C4036g8.b(O5.this.f30040b.b(), this.f30043a, arrayListD);
                } else if ("GET".equals(O5.this.f30040b.e())) {
                    gd2 = C4036g8.a(O5.this.f30040b.b(), this.f30043a, arrayListD);
                }
                O5.this.a("response status code: " + gd2.f29471a);
            } catch (Exception e10) {
                C4228r4.d().a(e10);
            }
        }
    }

    public O5(I5 i52, InterfaceC4215q7 interfaceC4215q7) {
        if (i52 == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (i52.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.f30040b = i52;
        this.f30039a = interfaceC4215q7;
        this.f30041c = i52.c();
        this.f30042d = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f30040b.f()) {
            Log.d(f30038e, str);
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
        }
    }

    private void b(String str) {
        this.f30042d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.f30040b.a() && !str.isEmpty()) {
            HashMap map2 = new HashMap();
            map2.put(com.safedk.android.analytics.brandsafety.creatives.discoveries.f.C, str);
            a(map2, this.f30039a.a());
            a(map2, map);
            b(this.f30041c.a(map2));
        }
    }
}
