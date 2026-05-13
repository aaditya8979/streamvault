package com.safedk.android.analytics.events;

import android.os.Bundle;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class MaxEvents extends ArrayList<MaxEvent> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52806a = "MaxEvents";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52807b;

    private MaxEvents() {
        this.f52807b = 10;
    }

    public MaxEvents(int i10) {
        this.f52807b = 10;
        this.f52807b = i10;
    }

    public ArrayList<Bundle> a() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        Iterator<MaxEvent> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        Logger.d(f52806a, "MaxEvents toBundle : " + arrayList.toString());
        return arrayList;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, MaxEvent maxEvent) {
        super.add(i10, maxEvent);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(MaxEvent maxEvent) {
        if (size() >= this.f52807b) {
            remove(0);
        }
        return super.add(maxEvent);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<MaxEvent> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString() + StringUtils.COMMA);
        }
        return sb2.toString();
    }
}
