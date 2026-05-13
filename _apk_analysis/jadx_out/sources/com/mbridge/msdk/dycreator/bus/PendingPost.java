package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class PendingPost {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f37164d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f37165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Subscription f37166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PendingPost f37167c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f37165a = obj;
        this.f37166b = subscription;
    }

    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f37164d;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new PendingPost(obj, subscription);
            }
            PendingPost pendingPostRemove = list.remove(size - 1);
            pendingPostRemove.f37165a = obj;
            pendingPostRemove.f37166b = subscription;
            pendingPostRemove.f37167c = null;
            return pendingPostRemove;
        }
    }

    public static void a(PendingPost pendingPost) {
        pendingPost.f37165a = null;
        pendingPost.f37166b = null;
        pendingPost.f37167c = null;
        List<PendingPost> list = f37164d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(pendingPost);
            }
        }
    }
}
