package com.safedk.android.analytics.events;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Comparator<MaxEvent> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(MaxEvent maxEvent, MaxEvent maxEvent2) {
        if (maxEvent.c() > maxEvent2.c()) {
            return 1;
        }
        return maxEvent.c() < maxEvent2.c() ? -1 : 0;
    }
}
