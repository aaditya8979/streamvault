package com.iab.omid.library.appodeal.walking.async;

import com.iab.omid.library.appodeal.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f23992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f23993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f23994c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f23995d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f23992a = linkedBlockingQueue;
        this.f23993b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f23994c.poll();
        this.f23995d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f23993b);
        }
    }

    @Override // com.iab.omid.library.appodeal.walking.async.b.a
    public void a(b bVar) {
        this.f23995d = null;
        a();
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f23994c.add(bVar);
        if (this.f23995d == null) {
            a();
        }
    }
}
