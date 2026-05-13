package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes4.dex */
final class Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SubscriberMethod f37177b;

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f37176a = obj;
        this.f37177b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return this.f37176a == subscription.f37176a && this.f37177b.equals(subscription.f37177b);
    }

    public int hashCode() {
        return this.f37176a.hashCode() + this.f37177b.f37173d.hashCode();
    }
}
