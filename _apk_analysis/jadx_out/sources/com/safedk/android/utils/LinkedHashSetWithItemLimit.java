package com.safedk.android.utils;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
public class LinkedHashSetWithItemLimit<T> extends LinkedHashSet<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f53054a = "LinkedHashSetWithItemLimit";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f53055b;

    public LinkedHashSetWithItemLimit(long j10) {
        this.f53055b = j10;
        Logger.d(f53054a, "LinkedHashSetWithItemLimit created. maxSize = " + j10);
    }

    private void a() {
        if (size() > 0) {
            Object next = iterator().next();
            remove(next);
            Logger.d(f53054a, "LinkedHashSetWithItemLimit removeFirst . item = " + next);
        }
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t10) {
        Logger.d(f53054a, "LinkedHashSetWithItemLimit add started. item = " + t10);
        if (size() >= this.f53055b) {
            a();
        }
        return super.add(t10);
    }
}
