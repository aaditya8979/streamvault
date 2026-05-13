package com.yandex.android.beacon;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.WorkerThread;
import bn.g;
import com.yandex.android.beacon.SendBeaconWorkerImpl;
import com.yandex.android.beacon.SendBeaconWorkerImpl.c;
import com.yandex.android.beacon.a;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.util.Clock;
import com.yandex.div.internal.util.SingleThreadExecutor;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.i;
import xf.e;
import xf.f;
import xf.h;

/* JADX INFO: compiled from: SendBeaconWorkerImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class SendBeaconWorkerImpl implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f53915g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f53916h = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f53917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final xf.a f53918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f53919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ImplThread f53920d = new ImplThread();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AtomicReference<b> f53921e = new AtomicReference<>(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public volatile Boolean f53922f;

    /* JADX INFO: compiled from: SendBeaconWorkerImpl.kt */
    @WorkerThread
    public final class ImplThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final g f53923a;

        public ImplThread() {
            this.f53923a = kotlin.b.b(new sn.a<c>() { // from class: com.yandex.android.beacon.SendBeaconWorkerImpl$ImplThread$workerData$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.a
                @NotNull
                public final SendBeaconWorkerImpl.c invoke() {
                    SendBeaconWorkerImpl sendBeaconWorkerImpl = sendBeaconWorkerImpl;
                    return sendBeaconWorkerImpl.new c(sendBeaconWorkerImpl.f53917a, sendBeaconWorkerImpl.f53918b.a());
                }
            });
        }

        public final void a(boolean z10, c cVar, com.yandex.android.beacon.a aVar) throws IOException {
            if (z10 && e(aVar)) {
                cVar.g();
            } else if (((b) SendBeaconWorkerImpl.this.f53921e.get()) == null) {
                SendBeaconWorkerImpl.this.l().a(SendBeaconWorkerImpl.this);
            }
        }

        public final void b(@NotNull Uri uri, @NotNull Map<String, String> map, @Nullable JSONObject jSONObject, boolean z10) throws IOException {
            a(z10, c(), c().h(uri, map, Clock.get().getCurrentTimeMs(), jSONObject));
        }

        public final c c() {
            return (c) this.f53923a.getValue();
        }

        public final boolean d(e eVar) {
            return eVar.getResponseCode() / 100 == 5;
        }

        public final boolean e(com.yandex.android.beacon.a aVar) {
            com.yandex.android.beacon.c cVarA = com.yandex.android.beacon.c.f53941e.a(aVar);
            Uri uriE = aVar.e();
            String string = cVarA.a().toString();
            SendBeaconWorkerImpl.this.k().b(string);
            try {
                e eVarA = SendBeaconWorkerImpl.this.m().a(cVarA);
                if (eVarA.isValid()) {
                    SendBeaconWorkerImpl.this.k().a(string);
                    Log.d("SendBeaconWorker", "Sent url ok " + uriE);
                } else {
                    if (!d(eVarA)) {
                        SendBeaconWorkerImpl.this.k().c(string, false);
                        Log.e("SendBeaconWorker", "Failed to send url " + uriE);
                        return false;
                    }
                    SendBeaconWorkerImpl.this.k().d(string);
                    Log.e("SendBeaconWorker", "Failed to send url " + uriE + ", but treat as sent.");
                }
                return true;
            } catch (IOException e10) {
                SendBeaconWorkerImpl.this.k().c(string, true);
                Log.e("SendBeaconWorker", "Failed to send url " + uriE, e10);
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: SendBeaconWorkerImpl.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SendBeaconWorkerImpl.kt */
    public static final class b {
    }

    /* JADX INFO: compiled from: SendBeaconWorkerImpl.kt */
    @WorkerThread
    public final class c implements Iterable<com.yandex.android.beacon.a>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final com.yandex.android.beacon.b f53925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Deque<com.yandex.android.beacon.a> f53926c;

        /* JADX INFO: compiled from: SendBeaconWorkerImpl.kt */
        public static final class a implements Iterator<com.yandex.android.beacon.a>, un.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public com.yandex.android.beacon.a f53928b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator<com.yandex.android.beacon.a> f53929c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f53930d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends com.yandex.android.beacon.a> it, c cVar) {
                this.f53929c = it;
                this.f53930d = cVar;
            }

            @Override // java.util.Iterator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.yandex.android.beacon.a next() {
                com.yandex.android.beacon.a next = this.f53929c.next();
                this.f53928b = next;
                return next;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f53929c.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() throws IOException {
                this.f53929c.remove();
                com.yandex.android.beacon.b bVar = this.f53930d.f53925b;
                com.yandex.android.beacon.a aVar = this.f53928b;
                bVar.k(aVar != null ? aVar.a() : null);
                this.f53930d.j();
            }
        }

        public c(@NotNull Context context, @NotNull String str) {
            com.yandex.android.beacon.b bVarA = com.yandex.android.beacon.b.f53939d.a(context, str);
            this.f53925b = bVarA;
            ArrayDeque arrayDeque = new ArrayDeque(bVarA.d());
            this.f53926c = arrayDeque;
            Log.e("SendBeaconWorker", "Reading from database, items count: " + arrayDeque.size());
            j();
        }

        public final void g() throws IOException {
            this.f53925b.k(this.f53926c.pop().a());
            j();
        }

        @NotNull
        public final com.yandex.android.beacon.a h(@NotNull Uri uri, @NotNull Map<String, String> map, long j10, @Nullable JSONObject jSONObject) throws IOException {
            a.C0719a c0719aA = this.f53925b.a(uri, map, j10, jSONObject);
            this.f53926c.push(c0719aA);
            j();
            return c0719aA;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<com.yandex.android.beacon.a> iterator() {
            return new a(this.f53926c.iterator(), this);
        }

        public final void j() {
            SendBeaconWorkerImpl.this.f53922f = Boolean.valueOf(!this.f53926c.isEmpty());
        }
    }

    /* JADX INFO: compiled from: SendBeaconWorkerImpl.kt */
    public static final class d extends SingleThreadExecutor {
        public d(@NotNull Executor executor) {
            super(executor, "SendBeacon");
        }

        @Override // com.yandex.div.internal.util.SingleThreadExecutor
        public void handleError(@NotNull RuntimeException runtimeException) {
        }
    }

    public SendBeaconWorkerImpl(@NotNull Context context, @NotNull xf.a aVar) {
        this.f53917a = context;
        this.f53918b = aVar;
        this.f53919c = new d(aVar.b());
        Log.d("SendBeaconWorker", "SendBeaconWorker created");
    }

    public static final void j(SendBeaconWorkerImpl sendBeaconWorkerImpl, Uri uri, Map map, JSONObject jSONObject, boolean z10) throws IOException {
        sendBeaconWorkerImpl.f53920d.b(uri, map, jSONObject, z10);
    }

    public final void i(@NotNull final Uri uri, @NotNull final Map<String, String> map, @Nullable final JSONObject jSONObject, final boolean z10) {
        Log.d("SendBeaconWorker", "Adding url " + uri);
        this.f53919c.post(new Runnable() { // from class: xf.g
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                SendBeaconWorkerImpl.j(this.f86919b, uri, map, jSONObject, z10);
            }
        });
    }

    public final xf.c k() {
        return this.f53918b.c();
    }

    public final h l() {
        return this.f53918b.e();
    }

    public final xf.d m() {
        return this.f53918b.d();
    }
}
