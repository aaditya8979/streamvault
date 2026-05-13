package com.applovin.impl;

import android.os.Process;
import androidx.core.util.Consumer;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f7822a = new PriorityBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7823b;

    public static class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BlockingQueue f7824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f7825b;

        private b(BlockingQueue blockingQueue, int i10, com.applovin.impl.sdk.k kVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f7824a = blockingQueue;
            this.f7825b = kVar;
            setPriority(((Integer) kVar.a(x4.S)).intValue());
        }

        private HttpURLConnection a(c cVar) throws ProtocolException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f7827a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f7828b);
            httpURLConnection.setConnectTimeout(cVar.f7831e);
            httpURLConnection.setReadTimeout(cVar.f7831e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f7829c.isEmpty()) {
                for (Map.Entry entry : cVar.f7829c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        private void a() {
            b((c) this.f7824a.take());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f7832f.accept(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x00ed A[Catch: all -> 0x018e, TRY_LEAVE, TryCatch #8 {all -> 0x018e, blocks: (B:57:0x00d5, B:59:0x00ed, B:83:0x012a), top: B:105:0x00d5 }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b(final com.applovin.impl.b4.c r20) {
            /*
                Method dump skipped, instruction units count: 405
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b4.b.b(com.applovin.impl.b4$c):void");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static class c implements Comparable {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final AtomicInteger f7826i = new AtomicInteger();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f7828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f7829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f7830d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f7831e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Consumer f7832f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Executor f7833g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f7834h;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f7835a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f7836b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Map f7837c = new HashMap();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private byte[] f7838d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f7839e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Consumer f7840f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Executor f7841g;

            public a a(int i10) {
                this.f7839e = i10;
                return this;
            }

            public a a(Consumer consumer) {
                this.f7840f = consumer;
                return this;
            }

            public a a(String str) {
                this.f7835a = str;
                return this;
            }

            public a a(String str, String str2) {
                this.f7837c.put(str, str2);
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f7837c = map;
                return this;
            }

            public a a(Executor executor) {
                this.f7841g = executor;
                return this;
            }

            public a a(byte[] bArr) {
                this.f7838d = bArr;
                return this;
            }

            public c a() {
                return new c(this);
            }

            public a b(String str) {
                this.f7836b = str;
                return this;
            }
        }

        private c(a aVar) {
            this.f7827a = aVar.f7835a;
            this.f7828b = aVar.f7836b;
            this.f7829c = aVar.f7837c != null ? aVar.f7837c : Collections.emptyMap();
            this.f7830d = aVar.f7838d;
            this.f7831e = aVar.f7839e;
            this.f7832f = aVar.f7840f;
            this.f7833g = aVar.f7841g;
            this.f7834h = f7826i.incrementAndGet();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f7834h - cVar.f7834h;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f7843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f7844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f7845d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Throwable f7846e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f7847a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private byte[] f7848b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private byte[] f7849c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private long f7850d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Throwable f7851e;

            public a a(int i10) {
                this.f7847a = i10;
                return this;
            }

            public a a(long j10) {
                this.f7850d = j10;
                return this;
            }

            public a a(Throwable th2) {
                this.f7851e = th2;
                return this;
            }

            public a a(byte[] bArr) {
                this.f7848b = bArr;
                return this;
            }

            public d a() {
                return new d(this);
            }

            public a b(byte[] bArr) {
                this.f7849c = bArr;
                return this;
            }
        }

        private d(a aVar) {
            this.f7842a = aVar.f7847a;
            this.f7843b = aVar.f7848b;
            this.f7844c = aVar.f7849c;
            this.f7845d = aVar.f7850d;
            this.f7846e = aVar.f7851e;
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.f7842a;
        }

        public int c() throws Throwable {
            Throwable th2 = this.f7846e;
            if (th2 == null) {
                return this.f7842a;
            }
            throw th2;
        }

        public byte[] d() throws Throwable {
            Throwable th2 = this.f7846e;
            if (th2 == null) {
                return this.f7843b;
            }
            throw th2;
        }

        public long e() {
            return this.f7845d;
        }

        public byte[] f() {
            return this.f7844c;
        }
    }

    public b4(com.applovin.impl.sdk.k kVar) {
        this.f7823b = kVar;
    }

    public void a() {
        for (int i10 = 0; i10 < ((Integer) this.f7823b.a(x4.R)).intValue(); i10++) {
            new b(this.f7822a, i10, this.f7823b).start();
        }
    }

    public void a(c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f7822a.add(cVar);
    }
}
